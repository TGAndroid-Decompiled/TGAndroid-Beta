package org.telegram.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.util.Consumer;
import androidx.core.util.Pair;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.QueryPurchasesParams;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.utils.BillingUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PremiumPreviewFragment;

public class BillingController implements PurchasesUpdatedListener, BillingClientStateListener {
    public static final QueryProductDetailsParams.Product PREMIUM_PRODUCT = QueryProductDetailsParams.Product.newBuilder().setProductType("subs").setProductId("telegram_premium").build();
    public static ProductDetails PREMIUM_PRODUCT_DETAILS = null;
    public static final String PREMIUM_PRODUCT_ID = "telegram_premium";
    public static boolean billingClientEmpty;
    private static NumberFormat currencyInstance;
    private static NumberFormat currencyInstanceRounded;
    private static BillingController instance;
    private final BillingClient billingClient;
    private boolean isDisconnected;
    private String lastPremiumToken;
    private String lastPremiumTransaction;
    private Runnable onCanceled;
    private final Map<String, Consumer> resultListeners = new HashMap();
    private final Set<String> requestingTokens = Collections.newSetFromMap(new ConcurrentHashMap());
    private final Map<String, Integer> currencyExpMap = new HashMap();
    private ArrayList<Runnable> setupListeners = new ArrayList<>();
    private int triesLeft = 0;

    public interface ProductDetailsResponseListenerLegacy {
        void onProductDetailsResponse(BillingResult billingResult, List<ProductDetails> list);
    }

    public static BillingController getInstance() {
        if (instance == null) {
            instance = new BillingController(ApplicationLoader.applicationContext);
        }
        return instance;
    }

    private BillingController(Context context) {
        this.billingClient = BillingClient.newBuilder(context).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(this).build();
    }

    public void setOnCanceled(Runnable runnable) {
        this.onCanceled = runnable;
    }

    public String getLastPremiumTransaction() {
        return this.lastPremiumTransaction;
    }

    public String getLastPremiumToken() {
        return this.lastPremiumToken;
    }

    public String formatCurrency(long j, String str) {
        return formatCurrency(j, str, getCurrencyExp(str));
    }

    public String formatCurrency(long j, String str, int i) {
        return formatCurrency(j, str, i, false);
    }

    public String formatCurrency(long j, String str, int i, boolean z) {
        if (str == null || str.isEmpty()) {
            return String.valueOf(j);
        }
        if ("TON".equalsIgnoreCase(str)) {
            return "TON " + (j / 1.0E9d);
        }
        if ("XTR".equalsIgnoreCase(str)) {
            return "XTR " + LocaleController.formatNumber(j, ',');
        }
        Currency currency = Currency.getInstance(str);
        if (currency != null) {
            if (currencyInstance == null) {
                currencyInstance = NumberFormat.getCurrencyInstance();
            }
            currencyInstance.setCurrency(currency);
            if (z) {
                currencyInstance.setMaximumFractionDigits(0);
                currencyInstance.setMinimumFractionDigits(0);
                return currencyInstance.format(Math.round(j / Math.pow(10.0d, i)));
            }
            int defaultFractionDigits = currency.getDefaultFractionDigits();
            currencyInstance.setMinimumFractionDigits(defaultFractionDigits);
            currencyInstance.setMaximumFractionDigits(defaultFractionDigits);
            return currencyInstance.format(j / Math.pow(10.0d, i));
        }
        return j + " " + str;
    }

    public int getCurrencyExp(String str) {
        BillingUtilities.extractCurrencyExp(this.currencyExpMap);
        return ((Integer) j$.util.Map.EL.getOrDefault(this.currencyExpMap, str, 0)).intValue();
    }

    public void startConnection() {
        if (isReady()) {
            return;
        }
        try {
            BillingUtilities.extractCurrencyExp(this.currencyExpMap);
            if (BuildVars.useInvoiceBilling()) {
                return;
            }
            this.billingClient.startConnection(this);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void switchToInvoice() {
        if (billingClientEmpty) {
            return;
        }
        billingClientEmpty = true;
        NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
    }

    private void switchBackFromInvoice() {
        if (billingClientEmpty) {
            billingClientEmpty = false;
            NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
        }
    }

    public boolean isReady() {
        return this.billingClient.isReady();
    }

    public void queryProductDetails(List<QueryProductDetailsParams.Product> list, final ProductDetailsResponseListenerLegacy productDetailsResponseListenerLegacy) {
        if (!isReady()) {
            throw new IllegalStateException("Billing: Controller should be ready for this call!");
        }
        this.billingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(list).build(), new ProductDetailsResponseListener() {
            @Override
            public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
                productDetailsResponseListenerLegacy.onProductDetailsResponse(billingResult, queryProductDetailsResult.getProductDetailsList());
            }
        });
    }

    public void queryPurchases(String str, PurchasesResponseListener purchasesResponseListener) {
        this.billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(str).build(), purchasesResponseListener);
    }

    public boolean startManageSubscription(Context context, String str) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format("https://play.google.com/store/account/subscriptions?sku=%s&package=%s", str, context.getPackageName()))));
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public void addResultListener(String str, Consumer consumer) {
        this.resultListeners.put(str, consumer);
    }

    public void launchBillingFlow(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List<BillingFlowParams.ProductDetailsParams> list) {
        launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, null, false);
    }

    public void launchBillingFlow(final Activity activity, final AccountInstance accountInstance, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final List<BillingFlowParams.ProductDetailsParams> list, final BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams, boolean z) {
        if (!isReady() || activity == null) {
            return;
        }
        if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z) {
            FileLog.d("BillingController.launchBillingFlow, checking consumables");
            queryPurchases("inapp", new PurchasesResponseListener() {
                @Override
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list2) {
                    BillingController.m368$r8$lambda$aiQxT5cwHGZxAQfQ4EZWqHXkOs(this.f$0, activity, accountInstance, inputStorePaymentPurpose, list, subscriptionUpdateParams, billingResult, list2);
                }
            });
            return;
        }
        if (z) {
            FileLog.d("BillingController.launchBillingFlow, consumables checked, launching flow...");
        }
        Pair pairCreateDeveloperPayload = BillingUtilities.createDeveloperPayload(inputStorePaymentPurpose, accountInstance);
        String str = (String) pairCreateDeveloperPayload.first;
        String str2 = (String) pairCreateDeveloperPayload.second;
        BillingFlowParams.Builder productDetailsParamsList = BillingFlowParams.newBuilder().setObfuscatedAccountId(str).setObfuscatedProfileId(str2).setProductDetailsParamsList(list);
        if (subscriptionUpdateParams != null) {
            productDetailsParamsList.setSubscriptionUpdateParams(subscriptionUpdateParams);
        }
        int responseCode = this.billingClient.launchBillingFlow(activity, productDetailsParamsList.build()).getResponseCode();
        if (responseCode != 0) {
            FileLog.d("Billing: Launch Error: " + responseCode + ", " + str + ", " + str2);
        }
    }

    public static void m368$r8$lambda$aiQxT5cwHGZxAQfQ4EZWqHXkOs(final BillingController billingController, final Activity activity, final AccountInstance accountInstance, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final List list, final BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams, BillingResult billingResult, List list2) {
        billingController.getClass();
        if (billingResult.getResponseCode() == 0) {
            FileLog.d("BillingController.launchBillingFlow, checked consumables: OK");
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, subscriptionUpdateParams, true);
                }
            };
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            final ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                final Purchase purchase = (Purchase) it.next();
                if (purchase.isAcknowledged()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        final String productId = ((BillingFlowParams.ProductDetailsParams) it2.next()).zza().getProductId();
                        if (purchase.getProducts().contains(productId)) {
                            atomicInteger.incrementAndGet();
                            FileLog.d("BillingController.launchBillingFlow, consuming " + purchase.getPurchaseToken());
                            billingController.billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new ConsumeResponseListener() {
                                @Override
                                public final void onConsumeResponse(BillingResult billingResult2, String str) {
                                    BillingController.m367$r8$lambda$Kl1L3qkMizzBY16StFyINnCgbs(purchase, arrayList, productId, atomicInteger, runnable, billingResult2, str);
                                }
                            });
                            break;
                        }
                    }
                } else {
                    atomicInteger.incrementAndGet();
                    billingController.onPurchasesUpdatedInternal(BillingResult.newBuilder().setResponseCode(0).build(), Collections.singletonList(purchase), new Runnable() {
                        @Override
                        public final void run() {
                            BillingController.$r8$lambda$i9PNm2BOVtiQAF5keu4Vb9ToLiM(arrayList, atomicInteger, runnable);
                        }
                    });
                }
            }
            if (atomicInteger.get() == 0) {
                runnable.run();
                return;
            }
            return;
        }
        FileLog.d("BillingController.launchBillingFlow, checked consumables: " + billingResult.getResponseCode() + " " + billingResult.getDebugMessage());
        billingController.launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, subscriptionUpdateParams, false);
    }

    public static void m367$r8$lambda$Kl1L3qkMizzBY16StFyINnCgbs(Purchase purchase, List list, String str, AtomicInteger atomicInteger, Runnable runnable, BillingResult billingResult, String str2) {
        if (billingResult.getResponseCode() == 0) {
            FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.getPurchaseToken() + ": OK");
            list.add(str);
            if (atomicInteger.get() == list.size()) {
                runnable.run();
                return;
            }
            return;
        }
        FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.getPurchaseToken() + ": " + billingResult.getResponseCode() + " " + billingResult.getDebugMessage());
        list.add(null);
        if (atomicInteger.get() == list.size()) {
            runnable.run();
        }
    }

    public static void $r8$lambda$i9PNm2BOVtiQAF5keu4Vb9ToLiM(List list, AtomicInteger atomicInteger, Runnable runnable) {
        list.add(null);
        if (atomicInteger.get() == list.size()) {
            runnable.run();
        }
    }

    @Override
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        onPurchasesUpdatedInternal(billingResult, list, null);
    }

    public void onPurchasesUpdatedInternal(final BillingResult billingResult, List<Purchase> list, final Runnable runnable) {
        FileLog.d("Billing: Purchases updated: " + billingResult + ", " + list);
        if (billingResult.getResponseCode() != 0) {
            if (billingResult.getResponseCode() == 1) {
                PremiumPreviewFragment.sentPremiumBuyCanceled();
            }
            Runnable runnable2 = this.onCanceled;
            if (runnable2 != null) {
                runnable2.run();
                this.onCanceled = null;
            }
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (list == null || list.isEmpty()) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        this.lastPremiumTransaction = null;
        for (final Purchase purchase : list) {
            if (purchase.getProducts().contains("telegram_premium")) {
                this.lastPremiumTransaction = purchase.getOrderId();
                this.lastPremiumToken = purchase.getPurchaseToken();
            }
            if (this.requestingTokens.contains(purchase.getPurchaseToken())) {
                FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.getOrderId() + " purchase is already requesting...");
            } else if (purchase.getPurchaseState() == 1) {
                Pair pairExtractDeveloperPayload = BillingUtilities.extractDeveloperPayload(purchase);
                if (pairExtractDeveloperPayload == null || pairExtractDeveloperPayload.first == null || pairExtractDeveloperPayload.second == null) {
                    FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.getOrderId() + " purchase is purchased, but failed to extract saved payload");
                } else if (!purchase.isAcknowledged()) {
                    FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.getOrderId() + " purchase is purchased and not acknowledged: assigning (accountId=" + ((AccountInstance) pairExtractDeveloperPayload.first).getCurrentAccount() + ") (purpose=" + pairExtractDeveloperPayload.second + ")");
                    this.requestingTokens.add(purchase.getPurchaseToken());
                    final TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                    tL_dataJSON.data = purchase.getOriginalJson();
                    tL_payments_assignPlayMarketTransaction.purpose = (TLRPC.InputStorePaymentPurpose) pairExtractDeveloperPayload.second;
                    final AlertDialog[] alertDialogArr = new AlertDialog[1];
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            BillingController.$r8$lambda$LcArUVCCjPStygpFblSlQgCkLBc(alertDialogArr);
                        }
                    });
                    atomicInteger.incrementAndGet();
                    final AccountInstance accountInstance = (AccountInstance) pairExtractDeveloperPayload.first;
                    accountInstance.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            BillingController.m370$r8$lambda$mYG3opgzZD0bxmSaWt6oFD3bVk(this.f$0, alertDialogArr, purchase, tL_payments_assignPlayMarketTransaction, accountInstance, billingResult, atomicInteger2, atomicInteger, runnable, tLObject, tL_error);
                        }
                    }, tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode ? 65608 : 65600);
                } else {
                    FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.getOrderId() + " purchase is purchased and acknowledged: consuming");
                    atomicInteger.incrementAndGet();
                    consumeGiftPurchase(purchase, (TLRPC.InputStorePaymentPurpose) pairExtractDeveloperPayload.second, new Runnable() {
                        @Override
                        public final void run() {
                            BillingController.$r8$lambda$3XF6orYyv05MdAHAkRCyN7aUoAc(atomicInteger2, atomicInteger, runnable);
                        }
                    });
                }
            } else {
                FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.getOrderId() + " purchase is (state=" + purchase.getPurchaseState() + "), (isAcknowledged=" + purchase.isAcknowledged() + ")");
            }
        }
        if (atomicInteger.get() != 0 || runnable == null) {
            return;
        }
        runnable.run();
    }

    public static void $r8$lambda$LcArUVCCjPStygpFblSlQgCkLBc(AlertDialog[] alertDialogArr) {
        AlertDialog alertDialog = new AlertDialog(ApplicationLoader.applicationContext, 3);
        alertDialogArr[0] = alertDialog;
        alertDialog.showDelayed(500L);
    }

    public static void m370$r8$lambda$mYG3opgzZD0bxmSaWt6oFD3bVk(BillingController billingController, final AlertDialog[] alertDialogArr, Purchase purchase, final TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, final AccountInstance accountInstance, BillingResult billingResult, final AtomicInteger atomicInteger, final AtomicInteger atomicInteger2, final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        billingController.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BillingController.m365$r8$lambda$9yXG5IivqqZDCK_WwEGFs3rLdM(alertDialogArr);
            }
        });
        billingController.requestingTokens.remove(purchase.getPurchaseToken());
        if (tLObject instanceof TLRPC.Updates) {
            FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.getOrderId() + " purchase is purchased and now assigned");
            if (tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode) {
                ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove((TLRPC.Updates) tLObject, TL_update.TL_updateSentPhoneCode.class);
                int size = arrayListFindUpdatesAndRemove.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListFindUpdatesAndRemove.get(i);
                    i++;
                    final TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) obj;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            BillingController.m362$r8$lambda$5TXidx5jCxPGUeApezhyTjxJI(accountInstance, tL_payments_assignPlayMarketTransaction, tL_updateSentPhoneCode);
                        }
                    });
                }
            }
            accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            Iterator it = purchase.getProducts().iterator();
            while (it.hasNext()) {
                Consumer consumerRemove = billingController.resultListeners.remove((String) it.next());
                if (consumerRemove != null) {
                    consumerRemove.accept(billingResult);
                }
            }
            billingController.consumeGiftPurchase(purchase, tL_payments_assignPlayMarketTransaction.purpose, new Runnable() {
                @Override
                public final void run() {
                    BillingController.$r8$lambda$JS41Ah8eXuKqqpqtE0li5QYxAs0(atomicInteger, atomicInteger2, runnable);
                }
            });
            BillingUtilities.cleanupPurchase(purchase);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("BillingController.onPurchasesUpdatedInternal: ");
        sb.append(purchase.getOrderId());
        sb.append(" purchase is purchased and failed to assign: ");
        sb.append(tL_error == null ? null : tL_error.text);
        FileLog.d(sb.toString());
        Runnable runnable2 = billingController.onCanceled;
        if (runnable2 != null) {
            runnable2.run();
            billingController.onCanceled = null;
        }
        if (tL_error != null) {
            NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingConfirmPurchaseError, tL_payments_assignPlayMarketTransaction, tL_error);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BillingController.m364$r8$lambda$7S7m2ajqkQMNXDgmVT1OONva18(atomicInteger, atomicInteger2, runnable);
            }
        });
    }

    public static void m365$r8$lambda$9yXG5IivqqZDCK_WwEGFs3rLdM(AlertDialog[] alertDialogArr) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public static void m362$r8$lambda$5TXidx5jCxPGUeApezhyTjxJI(AccountInstance accountInstance, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode) {
        LoginActivity loginActivity = (LoginActivity) LaunchActivity.findFragment(LoginActivity.class);
        if (loginActivity == null) {
            loginActivity = new LoginActivity(accountInstance.getCurrentAccount());
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                safeLastFragment.presentFragment(loginActivity);
            }
        }
        loginActivity.open(((TLRPC.TL_inputStorePaymentAuthCode) tL_payments_assignPlayMarketTransaction.purpose).phone_number, tL_updateSentPhoneCode.sent_code);
    }

    public static void $r8$lambda$JS41Ah8eXuKqqpqtE0li5QYxAs0(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable) {
        if (atomicInteger.incrementAndGet() != atomicInteger2.get() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public static void m364$r8$lambda$7S7m2ajqkQMNXDgmVT1OONva18(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable) {
        if (atomicInteger.incrementAndGet() != atomicInteger2.get() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public static void $r8$lambda$3XF6orYyv05MdAHAkRCyN7aUoAc(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable) {
        if (atomicInteger.incrementAndGet() != atomicInteger2.get() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void consumeGiftPurchase(final Purchase purchase, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final Runnable runnable) {
        if ((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            FileLog.d("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.getOrderId() + " " + purchase.getPurchaseToken());
            this.billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new ConsumeResponseListener() {
                @Override
                public final void onConsumeResponse(BillingResult billingResult, String str) {
                    BillingController.$r8$lambda$fm6vzwhgSd8IHdkNWkSenXxj2L8(inputStorePaymentPurpose, purchase, runnable, billingResult, str);
                }
            });
        }
    }

    public static void $r8$lambda$fm6vzwhgSd8IHdkNWkSenXxj2L8(TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Purchase purchase, Runnable runnable, BillingResult billingResult, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("BillingController consumeGiftPurchase ");
        sb.append(inputStorePaymentPurpose);
        sb.append(" ");
        sb.append(purchase.getOrderId());
        sb.append(" ");
        sb.append(purchase.getPurchaseToken());
        sb.append(" done: ");
        sb.append(billingResult.getResponseCode() == 0 ? "OK" : Integer.valueOf(billingResult.getResponseCode()));
        sb.append(" ");
        sb.append(billingResult.getDebugMessage());
        FileLog.d(sb.toString());
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onBillingServiceDisconnected() {
        FileLog.d("Billing: Service disconnected");
        int i = this.isDisconnected ? 15000 : 5000;
        this.isDisconnected = true;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.startConnection();
            }
        }, i);
    }

    public void whenSetuped(Runnable runnable) {
        this.setupListeners.add(runnable);
    }

    @Override
    public void onBillingSetupFinished(BillingResult billingResult) {
        FileLog.d("Billing: Setup finished with result " + billingResult);
        if (billingResult.getResponseCode() == 0) {
            this.isDisconnected = false;
            this.triesLeft = 3;
            try {
                queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new BillingController$$ExternalSyntheticLambda1(this));
            } catch (Exception e) {
                FileLog.e(e);
            }
            queryPurchases("inapp", new PurchasesResponseListener() {
                @Override
                public final void onQueryPurchasesResponse(BillingResult billingResult2, List list) {
                    this.f$0.onPurchasesUpdated(billingResult2, list);
                }
            });
            queryPurchases("subs", new PurchasesResponseListener() {
                @Override
                public final void onQueryPurchasesResponse(BillingResult billingResult2, List list) {
                    this.f$0.onPurchasesUpdated(billingResult2, list);
                }
            });
            if (this.setupListeners.isEmpty()) {
                return;
            }
            for (int i = 0; i < this.setupListeners.size(); i++) {
                AndroidUtilities.runOnUIThread(this.setupListeners.get(i));
            }
            this.setupListeners.clear();
            return;
        }
        if (this.isDisconnected) {
            return;
        }
        switchToInvoice();
    }

    public void onQueriedPremiumProductDetails(BillingResult billingResult, List<ProductDetails> list) {
        FileLog.d("Billing: Query product details finished " + billingResult + ", " + list);
        if (billingResult.getResponseCode() == 0) {
            for (ProductDetails productDetails : list) {
                if (productDetails.getProductId().equals("telegram_premium")) {
                    PREMIUM_PRODUCT_DETAILS = productDetails;
                }
            }
            if (PREMIUM_PRODUCT_DETAILS == null) {
                switchToInvoice();
                return;
            } else {
                switchBackFromInvoice();
                NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
                return;
            }
        }
        switchToInvoice();
        int i = this.triesLeft - 1;
        this.triesLeft = i;
        if (i > 0) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BillingController.$r8$lambda$vu_bydxpO2m3k1DK5kRWh7EEYxs(this.f$0);
                }
            }, i == 2 ? 1000L : 10000L);
        }
    }

    public static void $r8$lambda$vu_bydxpO2m3k1DK5kRWh7EEYxs(BillingController billingController) {
        billingController.getClass();
        try {
            billingController.queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new BillingController$$ExternalSyntheticLambda1(billingController));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static String getResponseCodeString(int i) {
        if (i != 12) {
            switch (i) {
                case -3:
                    return "SERVICE_TIMEOUT";
                case -2:
                    return "FEATURE_NOT_SUPPORTED";
                case -1:
                    return "SERVICE_DISCONNECTED";
                case 0:
                    return "OK";
                case 1:
                    return "USER_CANCELED";
                case 2:
                    return "SERVICE_UNAVAILABLE";
                case 3:
                    return "BILLING_UNAVAILABLE";
                case 4:
                    return "ITEM_UNAVAILABLE";
                case 5:
                    return "DEVELOPER_ERROR";
                case 6:
                    return "ERROR";
                case 7:
                    return "ITEM_ALREADY_OWNED";
                case 8:
                    return "ITEM_NOT_OWNED";
                default:
                    return "BILLING_UNKNOWN_ERROR";
            }
        }
        return "NETWORK_ERROR";
    }
}
