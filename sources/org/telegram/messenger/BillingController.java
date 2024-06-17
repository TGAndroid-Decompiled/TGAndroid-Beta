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
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import j$.util.Map;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.BillingUtilities;
import org.telegram.messenger.voip.VoIPController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputStorePaymentPurpose;
import org.telegram.tgnet.TLRPC$TL_dataJSON;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputStorePaymentGiftPremium;
import org.telegram.tgnet.TLRPC$TL_inputStorePaymentPremiumGiftCode;
import org.telegram.tgnet.TLRPC$TL_inputStorePaymentPremiumGiveaway;
import org.telegram.tgnet.TLRPC$TL_inputStorePaymentStars;
import org.telegram.tgnet.TLRPC$TL_payments_assignPlayMarketTransaction;
import org.telegram.tgnet.TLRPC$TL_payments_getStarsTopupOptions;
import org.telegram.tgnet.TLRPC$TL_starsTopupOption;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stars.StarsController;

public class BillingController implements PurchasesUpdatedListener, BillingClientStateListener {
    public static ProductDetails PREMIUM_PRODUCT_DETAILS = null;
    public static boolean billingClientEmpty;
    private static NumberFormat currencyInstance;
    private static BillingController instance;
    private final BillingClient billingClient;
    private boolean isDisconnected;
    private String lastPremiumToken;
    private String lastPremiumTransaction;
    private Runnable onCanceled;
    public static final String PREMIUM_PRODUCT_ID = "telegram_premium";
    public static final QueryProductDetailsParams.Product PREMIUM_PRODUCT = QueryProductDetailsParams.Product.newBuilder().setProductType("subs").setProductId(PREMIUM_PRODUCT_ID).build();
    private final Map<String, Consumer<BillingResult>> resultListeners = new HashMap();
    private final List<String> requestingTokens = Collections.synchronizedList(new ArrayList());
    private final Map<String, Integer> currencyExpMap = new HashMap();
    private ArrayList<Runnable> setupListeners = new ArrayList<>();
    private int triesLeft = 0;

    public static String getResponseCodeString(int i) {
        switch (i) {
            case VoIPController.ERROR_LOCALIZED:
                return "SERVICE_TIMEOUT";
            case VoIPController.ERROR_PRIVACY:
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
                return null;
        }
    }

    public static void lambda$consumeGiftPurchase$8(BillingResult billingResult, String str) {
    }

    public static BillingController getInstance() {
        if (instance == null) {
            instance = new BillingController(ApplicationLoader.applicationContext);
        }
        return instance;
    }

    private BillingController(Context context) {
        this.billingClient = BillingClient.newBuilder(context).enablePendingPurchases().setListener(this).build();
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
            StringBuilder sb = new StringBuilder();
            sb.append("TON ");
            double d = j;
            Double.isNaN(d);
            sb.append(d / 1.0E9d);
            return sb.toString();
        }
        Currency currency = Currency.getInstance(str);
        if (currency != null) {
            if (currencyInstance == null) {
                currencyInstance = NumberFormat.getCurrencyInstance();
            }
            currencyInstance.setCurrency(currency);
            if (z) {
                NumberFormat numberFormat = currencyInstance;
                double d2 = j;
                double pow = Math.pow(10.0d, i);
                Double.isNaN(d2);
                return numberFormat.format(Math.round(d2 / pow));
            }
            NumberFormat numberFormat2 = currencyInstance;
            double d3 = j;
            double pow2 = Math.pow(10.0d, i);
            Double.isNaN(d3);
            return numberFormat2.format(d3 / pow2);
        }
        return j + " " + str;
    }

    public int getCurrencyExp(String str) {
        BillingUtilities.extractCurrencyExp(this.currencyExpMap);
        return ((Integer) Map.EL.getOrDefault(this.currencyExpMap, str, 0)).intValue();
    }

    public void lambda$onBillingServiceDisconnected$9() {
        if (isReady()) {
            return;
        }
        BillingUtilities.extractCurrencyExp(this.currencyExpMap);
        if (BuildVars.useInvoiceBilling()) {
            return;
        }
        this.billingClient.startConnection(this);
    }

    private void switchToInvoice() {
        if (billingClientEmpty) {
            return;
        }
        billingClientEmpty = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
    }

    private void switchBackFromInvoice() {
        if (billingClientEmpty) {
            billingClientEmpty = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
        }
    }

    public boolean isReady() {
        return this.billingClient.isReady();
    }

    public void queryProductDetails(List<QueryProductDetailsParams.Product> list, ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            throw new IllegalStateException("Billing: Controller should be ready for this call!");
        }
        this.billingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(list).build(), productDetailsResponseListener);
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

    public void addResultListener(String str, Consumer<BillingResult> consumer) {
        this.resultListeners.put(str, consumer);
    }

    public void launchBillingFlow(Activity activity, AccountInstance accountInstance, TLRPC$InputStorePaymentPurpose tLRPC$InputStorePaymentPurpose, List<BillingFlowParams.ProductDetailsParams> list) {
        launchBillingFlow(activity, accountInstance, tLRPC$InputStorePaymentPurpose, list, null, false);
    }

    public void launchBillingFlow(final Activity activity, final AccountInstance accountInstance, final TLRPC$InputStorePaymentPurpose tLRPC$InputStorePaymentPurpose, final List<BillingFlowParams.ProductDetailsParams> list, final BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams, boolean z) {
        if (!isReady() || activity == null) {
            return;
        }
        if (((tLRPC$InputStorePaymentPurpose instanceof TLRPC$TL_inputStorePaymentGiftPremium) || (tLRPC$InputStorePaymentPurpose instanceof TLRPC$TL_inputStorePaymentStars)) && !z) {
            queryPurchases("inapp", new PurchasesResponseListener() {
                @Override
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list2) {
                    BillingController.this.lambda$launchBillingFlow$2(activity, accountInstance, tLRPC$InputStorePaymentPurpose, list, subscriptionUpdateParams, billingResult, list2);
                }
            });
            return;
        }
        Pair<String, String> createDeveloperPayload = BillingUtilities.createDeveloperPayload(tLRPC$InputStorePaymentPurpose, accountInstance);
        String str = createDeveloperPayload.first;
        String str2 = createDeveloperPayload.second;
        BillingFlowParams.Builder productDetailsParamsList = BillingFlowParams.newBuilder().setObfuscatedAccountId(str).setObfuscatedProfileId(str2).setProductDetailsParamsList(list);
        if (subscriptionUpdateParams != null) {
            productDetailsParamsList.setSubscriptionUpdateParams(subscriptionUpdateParams);
        }
        int responseCode = this.billingClient.launchBillingFlow(activity, productDetailsParamsList.build()).getResponseCode();
        if (responseCode != 0) {
            FileLog.d("Billing: Launch Error: " + responseCode + ", " + str + ", " + str2);
        }
    }

    public void lambda$launchBillingFlow$2(final Activity activity, final AccountInstance accountInstance, final TLRPC$InputStorePaymentPurpose tLRPC$InputStorePaymentPurpose, final List list, final BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams, BillingResult billingResult, List list2) {
        if (billingResult.getResponseCode() == 0) {
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    BillingController.this.lambda$launchBillingFlow$0(activity, accountInstance, tLRPC$InputStorePaymentPurpose, list, subscriptionUpdateParams);
                }
            };
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            final ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                if (purchase.isAcknowledged()) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            final String productId = ((BillingFlowParams.ProductDetailsParams) it2.next()).zza().getProductId();
                            if (purchase.getProducts().contains(productId)) {
                                atomicInteger.incrementAndGet();
                                this.billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new ConsumeResponseListener() {
                                    @Override
                                    public final void onConsumeResponse(BillingResult billingResult2, String str) {
                                        BillingController.lambda$launchBillingFlow$1(arrayList, productId, atomicInteger, runnable, billingResult2, str);
                                    }
                                });
                                break;
                            }
                        }
                    }
                } else {
                    onPurchasesUpdated(BillingResult.newBuilder().setResponseCode(0).build(), Collections.singletonList(purchase));
                    return;
                }
            }
            if (atomicInteger.get() == 0) {
                runnable.run();
            }
        }
    }

    public void lambda$launchBillingFlow$0(Activity activity, AccountInstance accountInstance, TLRPC$InputStorePaymentPurpose tLRPC$InputStorePaymentPurpose, List list, BillingFlowParams.SubscriptionUpdateParams subscriptionUpdateParams) {
        launchBillingFlow(activity, accountInstance, tLRPC$InputStorePaymentPurpose, list, subscriptionUpdateParams, true);
    }

    public static void lambda$launchBillingFlow$1(List list, String str, AtomicInteger atomicInteger, Runnable runnable, BillingResult billingResult, String str2) {
        if (billingResult.getResponseCode() == 0) {
            list.add(str);
            if (atomicInteger.get() == list.size()) {
                runnable.run();
            }
        }
    }

    @Override
    public void onPurchasesUpdated(final BillingResult billingResult, List<Purchase> list) {
        Pair<AccountInstance, TLRPC$InputStorePaymentPurpose> extractDeveloperPayload;
        FileLog.d("Billing: Purchases updated: " + billingResult + ", " + list);
        if (billingResult.getResponseCode() != 0) {
            if (billingResult.getResponseCode() == 1) {
                PremiumPreviewFragment.sentPremiumBuyCanceled();
            }
            Runnable runnable = this.onCanceled;
            if (runnable != null) {
                runnable.run();
                this.onCanceled = null;
                return;
            }
            return;
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        this.lastPremiumTransaction = null;
        for (final Purchase purchase : list) {
            if (purchase.getProducts().contains(PREMIUM_PRODUCT_ID)) {
                this.lastPremiumTransaction = purchase.getOrderId();
                this.lastPremiumToken = purchase.getPurchaseToken();
            }
            if (!this.requestingTokens.contains(purchase.getPurchaseToken()) && purchase.getPurchaseState() == 1 && (extractDeveloperPayload = BillingUtilities.extractDeveloperPayload(purchase)) != null && extractDeveloperPayload.first != null) {
                if (!purchase.isAcknowledged()) {
                    this.requestingTokens.add(purchase.getPurchaseToken());
                    retrievePurpose(purchase, extractDeveloperPayload, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            BillingController.this.lambda$onPurchasesUpdated$5(purchase, billingResult, (Pair) obj);
                        }
                    });
                } else {
                    consumeGiftPurchase(purchase, extractDeveloperPayload.second);
                }
            }
        }
    }

    public void lambda$onPurchasesUpdated$5(final Purchase purchase, final BillingResult billingResult, Pair pair) {
        final TLRPC$TL_payments_assignPlayMarketTransaction tLRPC$TL_payments_assignPlayMarketTransaction = new TLRPC$TL_payments_assignPlayMarketTransaction();
        TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
        tLRPC$TL_payments_assignPlayMarketTransaction.receipt = tLRPC$TL_dataJSON;
        tLRPC$TL_dataJSON.data = purchase.getOriginalJson();
        tLRPC$TL_payments_assignPlayMarketTransaction.purpose = (TLRPC$InputStorePaymentPurpose) pair.second;
        final AlertDialog alertDialog = new AlertDialog(ApplicationLoader.applicationContext, 3);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                AlertDialog.this.showDelayed(500L);
            }
        });
        final AccountInstance accountInstance = (AccountInstance) pair.first;
        accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_payments_assignPlayMarketTransaction, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                BillingController.this.lambda$onPurchasesUpdated$4(alertDialog, purchase, accountInstance, billingResult, tLRPC$TL_payments_assignPlayMarketTransaction, tLObject, tLRPC$TL_error);
            }
        }, 65602);
    }

    public void lambda$onPurchasesUpdated$4(AlertDialog alertDialog, Purchase purchase, AccountInstance accountInstance, BillingResult billingResult, TLRPC$TL_payments_assignPlayMarketTransaction tLRPC$TL_payments_assignPlayMarketTransaction, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        Objects.requireNonNull(alertDialog);
        AndroidUtilities.runOnUIThread(new BillingController$$ExternalSyntheticLambda9(alertDialog));
        this.requestingTokens.remove(purchase.getPurchaseToken());
        if (tLObject instanceof TLRPC$Updates) {
            accountInstance.getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            Iterator<String> it = purchase.getProducts().iterator();
            while (it.hasNext()) {
                Consumer<BillingResult> remove = this.resultListeners.remove(it.next());
                if (remove != null) {
                    remove.accept(billingResult);
                }
            }
            consumeGiftPurchase(purchase, tLRPC$TL_payments_assignPlayMarketTransaction.purpose);
            return;
        }
        if (tLRPC$TL_error != null) {
            Runnable runnable = this.onCanceled;
            if (runnable != null) {
                runnable.run();
                this.onCanceled = null;
            }
            NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingConfirmPurchaseError, tLRPC$TL_payments_assignPlayMarketTransaction, tLRPC$TL_error);
        }
    }

    private boolean retrievePurpose(Purchase purchase, final Pair<AccountInstance, TLRPC$InputStorePaymentPurpose> pair, final Utilities.Callback<Pair<AccountInstance, TLRPC$InputStorePaymentPurpose>> callback) {
        if (pair == null || pair.first == null) {
            FileLog.d("retrievePurpose: payload or account is null");
            return false;
        }
        if (pair.second != null) {
            FileLog.d("retrievePurpose: already has purpose");
            callback.run(pair);
            return true;
        }
        if (purchase == null || purchase.getProducts().isEmpty()) {
            FileLog.d("retrievePurpose: no products found for purpose!");
            callback.run(pair);
            return false;
        }
        int currentAccount = pair.first.getCurrentAccount();
        final String str = purchase.getProducts().get(0);
        if (str == null) {
            FileLog.d("retrievePurpose: first product is null!");
            callback.run(pair);
            return false;
        }
        ArrayList<TLRPC$TL_starsTopupOption> optionsCached = StarsController.getInstance(currentAccount).getOptionsCached();
        if (optionsCached == null) {
            ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC$TL_payments_getStarsTopupOptions(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    BillingController.lambda$retrievePurpose$7(str, callback, pair, tLObject, tLRPC$TL_error);
                }
            });
            return true;
        }
        TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption = null;
        int i = 0;
        while (true) {
            if (i >= optionsCached.size()) {
                break;
            }
            if (str.equals(optionsCached.get(i).store_product)) {
                tLRPC$TL_starsTopupOption = optionsCached.get(i);
                break;
            }
            i++;
        }
        if (tLRPC$TL_starsTopupOption != null) {
            TLRPC$TL_inputStorePaymentStars tLRPC$TL_inputStorePaymentStars = new TLRPC$TL_inputStorePaymentStars();
            tLRPC$TL_inputStorePaymentStars.amount = tLRPC$TL_starsTopupOption.amount;
            tLRPC$TL_inputStorePaymentStars.currency = tLRPC$TL_starsTopupOption.currency;
            tLRPC$TL_inputStorePaymentStars.stars = tLRPC$TL_starsTopupOption.stars;
            FileLog.d("retrievePurpose: found stars option of " + str + " from stars options!");
            callback.run(new Pair<>(pair.first, tLRPC$TL_inputStorePaymentStars));
            return true;
        }
        FileLog.d("retrievePurpose: failed to find option of " + str + " from stars options");
        callback.run(pair);
        return false;
    }

    public static void lambda$retrievePurpose$7(final String str, final Utilities.Callback callback, final Pair pair, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BillingController.lambda$retrievePurpose$6(TLObject.this, tLRPC$TL_error, str, callback, pair);
            }
        });
    }

    public static void lambda$retrievePurpose$6(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error, String str, Utilities.Callback callback, Pair pair) {
        ArrayList arrayList = new ArrayList();
        if (tLObject instanceof TLRPC$Vector) {
            Iterator<Object> it = ((TLRPC$Vector) tLObject).objects.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof TLRPC$TL_starsTopupOption) {
                    arrayList.add((TLRPC$TL_starsTopupOption) next);
                }
            }
        } else if (tLRPC$TL_error != null) {
            FileLog.d("retrievePopup: getStarsTopupOptions gives error! " + tLRPC$TL_error.code + ": " + tLRPC$TL_error.text);
        }
        TLRPC$TL_starsTopupOption tLRPC$TL_starsTopupOption = null;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                break;
            }
            if (str.equals(((TLRPC$TL_starsTopupOption) arrayList.get(i)).store_product)) {
                tLRPC$TL_starsTopupOption = (TLRPC$TL_starsTopupOption) arrayList.get(i);
                break;
            }
            i++;
        }
        if (tLRPC$TL_starsTopupOption != null) {
            TLRPC$TL_inputStorePaymentStars tLRPC$TL_inputStorePaymentStars = new TLRPC$TL_inputStorePaymentStars();
            tLRPC$TL_inputStorePaymentStars.amount = tLRPC$TL_starsTopupOption.amount;
            tLRPC$TL_inputStorePaymentStars.currency = tLRPC$TL_starsTopupOption.currency;
            tLRPC$TL_inputStorePaymentStars.stars = tLRPC$TL_starsTopupOption.stars;
            FileLog.d("retrievePurpose: found stars option of " + str + " from stars loaded options!");
            callback.run(new Pair((AccountInstance) pair.first, tLRPC$TL_inputStorePaymentStars));
            return;
        }
        FileLog.d("retrievePurpose: failed to find option of " + str + " from stars loaded options");
        callback.run(pair);
    }

    private void consumeGiftPurchase(Purchase purchase, TLRPC$InputStorePaymentPurpose tLRPC$InputStorePaymentPurpose) {
        if ((tLRPC$InputStorePaymentPurpose instanceof TLRPC$TL_inputStorePaymentGiftPremium) || (tLRPC$InputStorePaymentPurpose instanceof TLRPC$TL_inputStorePaymentPremiumGiftCode) || (tLRPC$InputStorePaymentPurpose instanceof TLRPC$TL_inputStorePaymentStars) || (tLRPC$InputStorePaymentPurpose instanceof TLRPC$TL_inputStorePaymentPremiumGiveaway)) {
            this.billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new ConsumeResponseListener() {
                @Override
                public final void onConsumeResponse(BillingResult billingResult, String str) {
                    BillingController.lambda$consumeGiftPurchase$8(billingResult, str);
                }
            });
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
                BillingController.this.lambda$onBillingServiceDisconnected$9();
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
                queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new BillingController$$ExternalSyntheticLambda2(this));
            } catch (Exception e) {
                FileLog.e(e);
            }
            queryPurchases("inapp", new PurchasesResponseListener() {
                @Override
                public final void onQueryPurchasesResponse(BillingResult billingResult2, List list) {
                    BillingController.this.onPurchasesUpdated(billingResult2, list);
                }
            });
            queryPurchases("subs", new PurchasesResponseListener() {
                @Override
                public final void onQueryPurchasesResponse(BillingResult billingResult2, List list) {
                    BillingController.this.onPurchasesUpdated(billingResult2, list);
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
                if (productDetails.getProductId().equals(PREMIUM_PRODUCT_ID)) {
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
                    BillingController.this.lambda$onQueriedPremiumProductDetails$10();
                }
            }, i == 2 ? 1000L : 10000L);
        }
    }

    public void lambda$onQueriedPremiumProductDetails$10() {
        try {
            queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new BillingController$$ExternalSyntheticLambda2(this));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
