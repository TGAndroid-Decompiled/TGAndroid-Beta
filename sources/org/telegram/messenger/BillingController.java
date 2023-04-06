package org.telegram.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.util.Consumer;
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
import com.google.android.exoplayer2.util.Util;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
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
    private static BillingController instance;
    private BillingClient billingClient;
    private String lastPremiumToken;
    private String lastPremiumTransaction;
    public static final String PREMIUM_PRODUCT_ID = "telegram_premium";
    public static final QueryProductDetailsParams.Product PREMIUM_PRODUCT = QueryProductDetailsParams.Product.newBuilder().setProductType("subs").setProductId(PREMIUM_PRODUCT_ID).build();
    private Map<String, Consumer<BillingResult>> resultListeners = new HashMap();
    private List<String> requestingTokens = new ArrayList();
    private Map<String, Integer> currencyExpMap = new HashMap();

    public static void lambda$onPurchasesUpdated$3(BillingResult billingResult, String str) {
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
        Integer num = this.currencyExpMap.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public void startConnection() {
        if (isReady()) {
            return;
        }
        try {
            InputStream open = ApplicationLoader.applicationContext.getAssets().open("currencies.json");
            parseCurrencies(new JSONObject(new String(Util.toByteArray(open), "UTF-8")));
            open.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (BuildVars.useInvoiceBilling()) {
            return;
        }
        this.billingClient.startConnection(this);
    }

    private void parseCurrencies(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.currencyExpMap.put(next, Integer.valueOf(jSONObject.optJSONObject(next).optInt("exp")));
        }
    }

    public boolean isReady() {
        return this.billingClient.isReady();
    }

    public void queryProductDetails(List<QueryProductDetailsParams.Product> list, ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            throw new IllegalStateException("Billing controller should be ready for this call!");
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
        BillingFlowParams.Builder productDetailsParamsList = BillingFlowParams.newBuilder().setProductDetailsParamsList(list);
        if (subscriptionUpdateParams != null) {
            productDetailsParamsList.setSubscriptionUpdateParams(subscriptionUpdateParams);
        }
        if (this.billingClient.launchBillingFlow(activity, productDetailsParamsList.build()).getResponseCode() == 0) {
            for (BillingFlowParams.ProductDetailsParams productDetailsParams : list) {
                accountInstance.getUserConfig().billingPaymentPurpose = tLRPC$InputStorePaymentPurpose;
                accountInstance.getUserConfig().awaitBillingProductIds.add(productDetailsParams.zza().getProductId());
            }
            accountInstance.getUserConfig().saveConfig(false);
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
        FileLog.d("Billing purchases updated: " + billingResult + ", " + list);
        int i = 4;
        if (billingResult.getResponseCode() != 0) {
            if (billingResult.getResponseCode() == 1) {
                PremiumPreviewFragment.sentPremiumBuyCanceled();
            }
            for (int i2 = 0; i2 < 4; i2++) {
                AccountInstance accountInstance = AccountInstance.getInstance(i2);
                if (!accountInstance.getUserConfig().awaitBillingProductIds.isEmpty()) {
                    accountInstance.getUserConfig().awaitBillingProductIds.clear();
                    accountInstance.getUserConfig().billingPaymentPurpose = null;
                    accountInstance.getUserConfig().saveConfig(false);
                }
            }
        } else if (list != null) {
            this.lastPremiumTransaction = null;
            for (final Purchase purchase : list) {
                if (purchase.getProducts().contains(PREMIUM_PRODUCT_ID)) {
                    this.lastPremiumTransaction = purchase.getOrderId();
                    this.lastPremiumToken = purchase.getPurchaseToken();
                }
                if (!this.requestingTokens.contains(purchase.getPurchaseToken())) {
                    int i3 = 0;
                    while (i3 < i) {
                        final AccountInstance accountInstance2 = AccountInstance.getInstance(i3);
                        if (accountInstance2.getUserConfig().awaitBillingProductIds.containsAll(purchase.getProducts()) && purchase.getPurchaseState() != 2) {
                            if (purchase.getPurchaseState() == 1) {
                                if (!purchase.isAcknowledged()) {
                                    this.requestingTokens.add(purchase.getPurchaseToken());
                                    final TLRPC$TL_payments_assignPlayMarketTransaction tLRPC$TL_payments_assignPlayMarketTransaction = new TLRPC$TL_payments_assignPlayMarketTransaction();
                                    TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
                                    tLRPC$TL_payments_assignPlayMarketTransaction.receipt = tLRPC$TL_dataJSON;
                                    tLRPC$TL_dataJSON.data = purchase.getOriginalJson();
                                    tLRPC$TL_payments_assignPlayMarketTransaction.purpose = accountInstance2.getUserConfig().billingPaymentPurpose;
                                    accountInstance2.getConnectionsManager().sendRequest(tLRPC$TL_payments_assignPlayMarketTransaction, new RequestDelegate() {
                                        @Override
                                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                            BillingController.this.lambda$onPurchasesUpdated$4(accountInstance2, purchase, billingResult, tLRPC$TL_payments_assignPlayMarketTransaction, tLObject, tLRPC$TL_error);
                                        }
                                    }, 66);
                                } else {
                                    accountInstance2.getUserConfig().awaitBillingProductIds.removeAll(purchase.getProducts());
                                    accountInstance2.getUserConfig().saveConfig(false);
                                }
                            } else {
                                accountInstance2.getUserConfig().awaitBillingProductIds.removeAll(purchase.getProducts());
                                accountInstance2.getUserConfig().saveConfig(false);
                            }
                        }
                        i3++;
                        i = 4;
                    }
                }
                i = 4;
            }
        }
    }

    public void lambda$onPurchasesUpdated$4(AccountInstance accountInstance, Purchase purchase, BillingResult billingResult, TLRPC$TL_payments_assignPlayMarketTransaction tLRPC$TL_payments_assignPlayMarketTransaction, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$Updates) {
            accountInstance.getMessagesController().processUpdates((TLRPC$Updates) tLObject, false);
            this.requestingTokens.remove(purchase.getPurchaseToken());
            for (String str : purchase.getProducts()) {
                Consumer<BillingResult> remove = this.resultListeners.remove(str);
                if (remove != null) {
                    remove.accept(billingResult);
                }
            }
            if (tLRPC$TL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC$TL_inputStorePaymentGiftPremium) {
                this.billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(purchase.getPurchaseToken()).build(), BillingController$$ExternalSyntheticLambda1.INSTANCE);
            }
        }
        if (tLObject == null && (!ApplicationLoader.isNetworkOnline() || tLRPC$TL_error == null || tLRPC$TL_error.code == -1000)) {
            return;
        }
        accountInstance.getUserConfig().awaitBillingProductIds.removeAll(purchase.getProducts());
        accountInstance.getUserConfig().saveConfig(false);
    }

    @Override
    public void onBillingServiceDisconnected() {
        FileLog.d("Billing service disconnected");
    }

    @Override
    public void onBillingSetupFinished(BillingResult billingResult) {
        FileLog.d("Billing setup finished with result " + billingResult);
        if (billingResult.getResponseCode() == 0) {
            queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), BillingController$$ExternalSyntheticLambda2.INSTANCE);
            queryPurchases("subs", new PurchasesResponseListener() {
                @Override
                public final void onQueryPurchasesResponse(BillingResult billingResult2, List list) {
                    BillingController.this.onPurchasesUpdated(billingResult2, list);
                }
            });
        }
    }

    public static void lambda$onBillingSetupFinished$6(BillingResult billingResult, List list) {
        if (billingResult.getResponseCode() == 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProductDetails productDetails = (ProductDetails) it.next();
                if (productDetails.getProductId().equals(PREMIUM_PRODUCT_ID)) {
                    PREMIUM_PRODUCT_DETAILS = productDetails;
                }
            }
            AndroidUtilities.runOnUIThread(BillingController$$ExternalSyntheticLambda6.INSTANCE);
        }
    }

    public static void lambda$onBillingSetupFinished$5() {
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
    }
}
