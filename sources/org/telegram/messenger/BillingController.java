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
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.utils.BillingUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputStorePaymentPurpose;
import org.telegram.tgnet.TLRPC$TL_dataJSON;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputStorePaymentGiftPremium;
import org.telegram.tgnet.TLRPC$TL_payments_assignPlayMarketTransaction;
import org.telegram.tgnet.TLRPC$Updates;
import org.telegram.ui.PremiumPreviewFragment;
public class BillingController implements PurchasesUpdatedListener, BillingClientStateListener {
    public static ProductDetails PREMIUM_PRODUCT_DETAILS = null;
    public static boolean billingClientEmpty;
    private static BillingController instance;
    private final BillingClient billingClient;
    private boolean isDisconnected;
    private String lastPremiumToken;
    private String lastPremiumTransaction;
    public static final String PREMIUM_PRODUCT_ID = "telegram_premium";
    public static final QueryProductDetailsParams.Product PREMIUM_PRODUCT = QueryProductDetailsParams.Product.newBuilder().setProductType("subs").setProductId(PREMIUM_PRODUCT_ID).build();
    private final Map<String, Consumer<BillingResult>> resultListeners = new HashMap();
    private final List<String> requestingTokens = Collections.synchronizedList(new ArrayList());
    private final Map<String, Integer> currencyExpMap = new HashMap();

    public static void lambda$consumeGiftPurchase$4(BillingResult billingResult, String str) {
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
        if (str.isEmpty()) {
            return String.valueOf(j);
        }
        Currency currency = Currency.getInstance(str);
        if (currency != null) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
            currencyInstance.setCurrency(currency);
            double d = j;
            double pow = Math.pow(10.0d, i);
            Double.isNaN(d);
            return currencyInstance.format(d / pow);
        }
        return j + " " + str;
    }

    public int getCurrencyExp(String str) {
        return ((Integer) Map.EL.getOrDefault(this.currencyExpMap, str, 0)).intValue();
    }

    public void lambda$onBillingServiceDisconnected$5() {
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
        if ((tLRPC$InputStorePaymentPurpose instanceof TLRPC$TL_inputStorePaymentGiftPremium) && !z) {
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
        } else if (list != null && !list.isEmpty()) {
            this.lastPremiumTransaction = null;
            for (final Purchase purchase : list) {
                if (purchase.getProducts().contains(PREMIUM_PRODUCT_ID)) {
                    this.lastPremiumTransaction = purchase.getOrderId();
                    this.lastPremiumToken = purchase.getPurchaseToken();
                }
                if (!this.requestingTokens.contains(purchase.getPurchaseToken()) && purchase.getPurchaseState() == 1 && (extractDeveloperPayload = BillingUtilities.extractDeveloperPayload(purchase)) != null) {
                    if (!purchase.isAcknowledged()) {
                        this.requestingTokens.add(purchase.getPurchaseToken());
                        final TLRPC$TL_payments_assignPlayMarketTransaction tLRPC$TL_payments_assignPlayMarketTransaction = new TLRPC$TL_payments_assignPlayMarketTransaction();
                        TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
                        tLRPC$TL_payments_assignPlayMarketTransaction.receipt = tLRPC$TL_dataJSON;
                        tLRPC$TL_dataJSON.data = purchase.getOriginalJson();
                        tLRPC$TL_payments_assignPlayMarketTransaction.purpose = extractDeveloperPayload.second;
                        final AccountInstance accountInstance = extractDeveloperPayload.first;
                        accountInstance.getConnectionsManager().sendRequest(tLRPC$TL_payments_assignPlayMarketTransaction, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                BillingController.this.lambda$onPurchasesUpdated$3(purchase, accountInstance, billingResult, tLRPC$TL_payments_assignPlayMarketTransaction, tLObject, tLRPC$TL_error);
                            }
                        }, 66);
                    } else {
                        consumeGiftPurchase(purchase, extractDeveloperPayload.second);
                    }
                }
            }
        }
    }

    public void lambda$onPurchasesUpdated$3(Purchase purchase, AccountInstance accountInstance, BillingResult billingResult, TLRPC$TL_payments_assignPlayMarketTransaction tLRPC$TL_payments_assignPlayMarketTransaction, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.requestingTokens.remove(purchase.getPurchaseToken());
        if (tLObject instanceof TLRPC$Updates) {
            accountInstance.getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            for (String str : purchase.getProducts()) {
                Consumer<BillingResult> remove = this.resultListeners.remove(str);
                if (remove != null) {
                    remove.accept(billingResult);
                }
            }
            consumeGiftPurchase(purchase, tLRPC$TL_payments_assignPlayMarketTransaction.purpose);
        } else if (tLRPC$TL_error != null) {
            FileLog.d("Billing: Confirmation Error: " + tLRPC$TL_error.code + " " + tLRPC$TL_error.text);
            NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingConfirmPurchaseError, tLRPC$TL_payments_assignPlayMarketTransaction, tLRPC$TL_error);
        }
    }

    private void consumeGiftPurchase(Purchase purchase, TLRPC$InputStorePaymentPurpose tLRPC$InputStorePaymentPurpose) {
        if (tLRPC$InputStorePaymentPurpose instanceof TLRPC$TL_inputStorePaymentGiftPremium) {
            this.billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), new ConsumeResponseListener() {
                @Override
                public final void onConsumeResponse(BillingResult billingResult, String str) {
                    BillingController.lambda$consumeGiftPurchase$4(billingResult, str);
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
                BillingController.this.lambda$onBillingServiceDisconnected$5();
            }
        }, i);
    }

    @Override
    public void onBillingSetupFinished(BillingResult billingResult) {
        FileLog.d("Billing: Setup finished with result " + billingResult);
        if (billingResult.getResponseCode() == 0) {
            this.isDisconnected = false;
            queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new ProductDetailsResponseListener() {
                @Override
                public final void onProductDetailsResponse(BillingResult billingResult2, List list) {
                    BillingController.this.lambda$onBillingSetupFinished$6(billingResult2, list);
                }
            });
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
        } else if (this.isDisconnected) {
        } else {
            switchToInvoice();
        }
    }

    public void lambda$onBillingSetupFinished$6(BillingResult billingResult, List list) {
        FileLog.d("Billing: Query product details finished " + billingResult + ", " + list);
        if (billingResult.getResponseCode() == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProductDetails productDetails = (ProductDetails) it.next();
                if (productDetails.getProductId().equals(PREMIUM_PRODUCT_ID)) {
                    PREMIUM_PRODUCT_DETAILS = productDetails;
                }
            }
            if (PREMIUM_PRODUCT_DETAILS == null) {
                switchToInvoice();
                return;
            } else {
                NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
                return;
            }
        }
        switchToInvoice();
    }
}
