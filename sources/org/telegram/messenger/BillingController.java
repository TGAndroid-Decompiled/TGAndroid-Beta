package org.telegram.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.util.Consumer;
import androidx.core.util.Pair;
import androidx.emoji2.text.EmojiCompat;
import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientImpl;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams$ProductDetailsParams;
import com.android.billingclient.api.BillingFlowParams$SubscriptionUpdateParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryProductDetailsParams$Product;
import com.android.billingclient.api.QueryProductDetailsResult;
import com.android.billingclient.api.zzce;
import com.android.billingclient.api.zzcv;
import com.android.billingclient.api.zzs;
import com.android.billingclient.api.zzx;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.gms.cast.zzbe;
import com.google.android.gms.cast.zzbl;
import com.google.android.gms.internal.fido.zzfz;
import com.google.android.gms.internal.play_billing.zzbr;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.common.base.Charsets;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.internal.Symbol;
import org.json.JSONObject;
import org.telegram.SQLite.SQLitePreparedStatement$$ExternalSyntheticOutline0;
import org.telegram.messenger.utils.BillingUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda1;

public class BillingController implements PurchasesUpdatedListener, BillingClientStateListener {
    public static final QueryProductDetailsParams$Product PREMIUM_PRODUCT;
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

    static {
        AccountIdentifiers accountIdentifiers = new AccountIdentifiers();
        accountIdentifiers.zzb = "subs";
        accountIdentifiers.zza = "telegram_premium";
        PREMIUM_PRODUCT = accountIdentifiers.build();
    }

    private BillingController(Context context) {
        BillingClient zzceVar;
        EmojiCompat.CompatInternal19 compatInternal19 = new EmojiCompat.CompatInternal19(context);
        compatInternal19.mProcessor = new ChatActivity.AnonymousClass40(6);
        compatInternal19.mMetadataRepo = this;
        if (context == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (((BillingController) compatInternal19.mMetadataRepo) == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (((ChatActivity.AnonymousClass40) compatInternal19.mProcessor) == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        ((ChatActivity.AnonymousClass40) compatInternal19.mProcessor).getClass();
        if (((BillingController) compatInternal19.mMetadataRepo) != null) {
            ChatActivity.AnonymousClass40 anonymousClass40 = (ChatActivity.AnonymousClass40) compatInternal19.mProcessor;
            BillingController billingController = (BillingController) compatInternal19.mMetadataRepo;
            zzceVar = compatInternal19.zza() ? new zzce(anonymousClass40, context, billingController, compatInternal19) : new BillingClientImpl(anonymousClass40, context, billingController, compatInternal19);
        } else {
            ChatActivity.AnonymousClass40 anonymousClass41 = (ChatActivity.AnonymousClass40) compatInternal19.mProcessor;
            zzceVar = compatInternal19.zza() ? new zzce(anonymousClass41, context, compatInternal19) : new BillingClientImpl(anonymousClass41, context, compatInternal19);
        }
        this.billingClient = zzceVar;
    }

    public static BillingController getInstance() {
        if (instance == null) {
            instance = new BillingController(ApplicationLoader.applicationContext);
        }
        return instance;
    }

    public static String getResponseCodeString(int i) {
        if (i == 12) {
            return "NETWORK_ERROR";
        }
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

    public static void lambda$consumeGiftPurchase$12(TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Purchase purchase, Runnable runnable, BillingResult billingResult, String str) {
        StringBuilder sb = new StringBuilder("BillingController consumeGiftPurchase ");
        sb.append(inputStorePaymentPurpose);
        sb.append(" ");
        sb.append(purchase.getOrderId());
        sb.append(" ");
        sb.append(purchase.getPurchaseToken());
        sb.append(" done: ");
        int i = billingResult.zza;
        sb.append(i == 0 ? "OK" : Integer.valueOf(i));
        sb.append(" ");
        sb.append(billingResult.zzc);
        FileLog.d(sb.toString());
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$launchBillingFlow$1(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams) {
        launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, billingFlowParams$SubscriptionUpdateParams, true);
    }

    public static void lambda$launchBillingFlow$2(Purchase purchase, List list, String str, AtomicInteger atomicInteger, Runnable runnable, BillingResult billingResult, String str2) {
        if (billingResult.zza == 0) {
            FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.getPurchaseToken() + ": OK");
            list.add(str);
            if (atomicInteger.get() == list.size()) {
                runnable.run();
                return;
            }
            return;
        }
        FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.getPurchaseToken() + ": " + billingResult.zza + " " + billingResult.zzc);
        list.add(null);
        if (atomicInteger.get() == list.size()) {
            runnable.run();
        }
    }

    public static void lambda$launchBillingFlow$3(List list, AtomicInteger atomicInteger, Runnable runnable) {
        list.add(null);
        if (atomicInteger.get() == list.size()) {
            runnable.run();
        }
    }

    public void lambda$launchBillingFlow$4(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams, BillingResult billingResult, List list2) {
        if (billingResult.zza != 0) {
            FileLog.d("BillingController.launchBillingFlow, checked consumables: " + billingResult.zza + " " + billingResult.zzc);
            launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, billingFlowParams$SubscriptionUpdateParams, false);
            return;
        }
        FileLog.d("BillingController.launchBillingFlow, checked consumables: OK");
        MediaController$$ExternalSyntheticLambda44 mediaController$$ExternalSyntheticLambda44 = new MediaController$$ExternalSyntheticLambda44(this, activity, accountInstance, inputStorePaymentPurpose, list, billingFlowParams$SubscriptionUpdateParams, 1);
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            final Purchase purchase = (Purchase) it.next();
            if (purchase.zzc.optBoolean("acknowledged", true)) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    final String str = ((BillingFlowParams$ProductDetailsParams) it2.next()).zza.zzc;
                    if (purchase.getProducts().contains(str)) {
                        atomicInteger.incrementAndGet();
                        FileLog.d("BillingController.launchBillingFlow, consuming " + purchase.getPurchaseToken());
                        BillingClient billingClient = this.billingClient;
                        String purchaseToken = purchase.getPurchaseToken();
                        if (purchaseToken == null) {
                            throw new IllegalArgumentException("Purchase token must be set");
                        }
                        Symbol symbol = new Symbol();
                        symbol.symbol = purchaseToken;
                        final MediaController$$ExternalSyntheticLambda44 mediaController$$ExternalSyntheticLambda45 = mediaController$$ExternalSyntheticLambda44;
                        mediaController$$ExternalSyntheticLambda44 = mediaController$$ExternalSyntheticLambda45;
                        billingClient.consumeAsync(new ConsumeResponseListener() {
                            @Override
                            public final void onConsumeResponse(BillingResult billingResult2, String str2) {
                                BillingController.lambda$launchBillingFlow$2(purchase, arrayList, str, atomicInteger, mediaController$$ExternalSyntheticLambda45, billingResult2, str2);
                            }
                        }, symbol);
                        break;
                    }
                }
            } else {
                atomicInteger.incrementAndGet();
                AacUtil.Config configNewBuilder = BillingResult.newBuilder();
                configNewBuilder.sampleRateHz = 0;
                onPurchasesUpdatedInternal(configNewBuilder.build(), Collections.singletonList(purchase), new FileLoader$$ExternalSyntheticLambda0(arrayList, atomicInteger, mediaController$$ExternalSyntheticLambda44, 8));
            }
        }
        if (atomicInteger.get() == 0) {
            mediaController$$ExternalSyntheticLambda44.run();
        }
    }

    public void lambda$onPurchasesUpdatedInternal$10(AlertDialog[] alertDialogArr, Purchase purchase, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, AccountInstance accountInstance, BillingResult billingResult, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        BillingUtilities.TL_savedPurpose tL_savedPurpose;
        int i = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        AndroidUtilities.runOnUIThread(new BillingController$$ExternalSyntheticLambda4(alertDialogArr, 0));
        this.requestingTokens.remove(purchase.getPurchaseToken());
        if (!(tLObject instanceof TLRPC.Updates)) {
            StringBuilder sb = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
            sb.append(purchase.getOrderId());
            sb.append(" purchase is purchased and failed to assign: ");
            SQLitePreparedStatement$$ExternalSyntheticOutline0.m(tL_error == null ? null : tL_error.text, sb);
            Runnable runnable2 = this.onCanceled;
            if (runnable2 != null) {
                runnable2.run();
                this.onCanceled = null;
            }
            if (tL_error != null) {
                NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingConfirmPurchaseError, tL_payments_assignPlayMarketTransaction, tL_error);
            }
            AndroidUtilities.runOnUIThread(new BillingController$$ExternalSyntheticLambda6(atomicInteger, atomicInteger2, runnable, i));
            return;
        }
        FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.getOrderId() + " purchase is purchased and now assigned");
        if (tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode) {
            ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove((TLRPC.Updates) tLObject, TL_update.TL_updateSentPhoneCode.class);
            int size = arrayListFindUpdatesAndRemove.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListFindUpdatesAndRemove.get(i2);
                i2++;
                AndroidUtilities.runOnUIThread(new FileLoader$$ExternalSyntheticLambda0(accountInstance, tL_payments_assignPlayMarketTransaction, (TL_update.TL_updateSentPhoneCode) obj, 9));
            }
        }
        accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        ArrayList products = purchase.getProducts();
        int size2 = products.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = products.get(i3);
            i3++;
            Consumer consumerRemove = this.resultListeners.remove((String) obj2);
            if (consumerRemove != null) {
                consumerRemove.accept(billingResult);
            }
        }
        consumeGiftPurchase(purchase, tL_payments_assignPlayMarketTransaction.purpose, new BillingController$$ExternalSyntheticLambda6(atomicInteger, atomicInteger2, runnable, objArr3 == true ? 1 : 0));
        JSONObject jSONObject = purchase.zzc;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        String str = ((strOptString == null && strOptString2 == null) ? null : new AccountIdentifiers(objArr2 == true ? 1 : 0, strOptString, strOptString2, objArr == true ? 1 : 0)).zzb;
        try {
            FileLog.d("BillingUtilities.clearPurpose: got {" + str + "}");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
            int int32 = serializedData.readInt32(true);
            if (int32 != 495638674) {
                int i4 = BillingUtilities.TL_savedPurpose.$r8$clinit;
                tL_savedPurpose = null;
            } else {
                tL_savedPurpose = new BillingUtilities.TL_savedPurpose();
            }
            BillingUtilities.TL_savedPurpose tL_savedPurpose2 = (BillingUtilities.TL_savedPurpose) TLObject.TLdeserialize(BillingUtilities.TL_savedPurpose.class, tL_savedPurpose, serializedData, int32, true);
            SerializedData serializedData2 = new SerializedData(8);
            serializedData2.writeInt64(tL_savedPurpose2.id);
            String strBytesToHex = Utilities.bytesToHex(serializedData2.toByteArray());
            serializedData2.cleanup();
            FileLog.d("BillingUtilities.clearPurpose: id_hex = " + strBytesToHex);
            ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().remove(strBytesToHex).apply();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$onPurchasesUpdatedInternal$11(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable) {
        if (atomicInteger.incrementAndGet() != atomicInteger2.get() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public static void lambda$onPurchasesUpdatedInternal$5(AlertDialog[] alertDialogArr) {
        AlertDialog alertDialog = new AlertDialog(ApplicationLoader.applicationContext, 3, null);
        alertDialogArr[0] = alertDialog;
        alertDialog.showDelayed(500L);
    }

    public static void lambda$onPurchasesUpdatedInternal$6(AlertDialog[] alertDialogArr) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public static void lambda$onPurchasesUpdatedInternal$7(AccountInstance accountInstance, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode) {
        LoginActivity loginActivity = (LoginActivity) LaunchActivity.findFragment();
        if (loginActivity == null) {
            loginActivity = new LoginActivity(accountInstance.getCurrentAccount());
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                safeLastFragment.presentFragment(loginActivity);
            }
        }
        String str = ((TLRPC.TL_inputStorePaymentAuthCode) tL_payments_assignPlayMarketTransaction.purpose).phone_number;
        TLRPC.auth_SentCode auth_sentcode = tL_updateSentPhoneCode.sent_code;
        loginActivity.paid = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        loginActivity.fillNextCodeParams(bundle, auth_sentcode, true);
    }

    public static void lambda$onPurchasesUpdatedInternal$8(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable) {
        if (atomicInteger.incrementAndGet() != atomicInteger2.get() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public static void lambda$onPurchasesUpdatedInternal$9(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable) {
        if (atomicInteger.incrementAndGet() != atomicInteger2.get() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void lambda$onQueriedPremiumProductDetails$14() {
        try {
            queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new BillingController$$ExternalSyntheticLambda1(this));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$queryProductDetails$0(ProductDetailsResponseListenerLegacy productDetailsResponseListenerLegacy, BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        productDetailsResponseListenerLegacy.onProductDetailsResponse(billingResult, queryProductDetailsResult.productDetailsList);
    }

    public void onQueriedPremiumProductDetails(BillingResult billingResult, List<ProductDetails> list) {
        FileLog.d("Billing: Query product details finished " + billingResult + ", " + list);
        if (billingResult.zza != 0) {
            switchToInvoice();
            int i = this.triesLeft - 1;
            this.triesLeft = i;
            if (i > 0) {
                AndroidUtilities.runOnUIThread(new BillingController$$ExternalSyntheticLambda3(this, 1), i == 2 ? 1000L : 10000L);
                return;
            }
            return;
        }
        for (ProductDetails productDetails : list) {
            if (productDetails.zzc.equals("telegram_premium")) {
                PREMIUM_PRODUCT_DETAILS = productDetails;
            }
        }
        if (PREMIUM_PRODUCT_DETAILS == null) {
            switchToInvoice();
        } else {
            switchBackFromInvoice();
            NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
        }
    }

    private void switchBackFromInvoice() {
        if (billingClientEmpty) {
            billingClientEmpty = false;
            NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
        }
    }

    private void switchToInvoice() {
        if (billingClientEmpty) {
            return;
        }
        billingClientEmpty = true;
        NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
    }

    public void addResultListener(String str, Consumer consumer) {
        this.resultListeners.put(str, consumer);
    }

    public void consumeGiftPurchase(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if ((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            FileLog.d("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.getOrderId() + " " + purchase.getPurchaseToken());
            BillingClient billingClient = this.billingClient;
            String purchaseToken = purchase.getPurchaseToken();
            if (purchaseToken == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            Symbol symbol = new Symbol();
            symbol.symbol = purchaseToken;
            billingClient.consumeAsync(new AndroidUtilities$$ExternalSyntheticLambda46(inputStorePaymentPurpose, purchase, runnable), symbol);
        }
    }

    public String formatCurrency(long j, String str) {
        return formatCurrency(j, str, getCurrencyExp(str));
    }

    public int getCurrencyExp(String str) {
        BillingUtilities.extractCurrencyExp(this.currencyExpMap);
        return ((Integer) j$.util.Map.EL.getOrDefault(this.currencyExpMap, str, 0)).intValue();
    }

    public String getLastPremiumToken() {
        return this.lastPremiumToken;
    }

    public String getLastPremiumTransaction() {
        return this.lastPremiumTransaction;
    }

    public boolean isReady() {
        BillingClientImpl billingClientImpl = (BillingClientImpl) this.billingClient;
        billingClientImpl.getClass();
        return billingClientImpl.zzaY();
    }

    public void launchBillingFlow(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List<BillingFlowParams$ProductDetailsParams> list) {
        launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, null, false);
    }

    @Override
    public void onBillingServiceDisconnected() {
        FileLog.d("Billing: Service disconnected");
        int i = this.isDisconnected ? 15000 : 5000;
        this.isDisconnected = true;
        AndroidUtilities.runOnUIThread(new BillingController$$ExternalSyntheticLambda3(this, 0), i);
    }

    @Override
    public void onBillingSetupFinished(BillingResult billingResult) {
        FileLog.d("Billing: Setup finished with result " + billingResult);
        if (billingResult.zza != 0) {
            if (this.isDisconnected) {
                return;
            }
            switchToInvoice();
            return;
        }
        this.isDisconnected = false;
        this.triesLeft = 3;
        try {
            queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new BillingController$$ExternalSyntheticLambda1(this));
        } catch (Exception e) {
            FileLog.e(e);
        }
        queryPurchases("inapp", new BillingController$$ExternalSyntheticLambda1(this));
        queryPurchases("subs", new BillingController$$ExternalSyntheticLambda1(this));
        if (this.setupListeners.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.setupListeners.size(); i++) {
            AndroidUtilities.runOnUIThread(this.setupListeners.get(i));
        }
        this.setupListeners.clear();
    }

    @Override
    public void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        onPurchasesUpdatedInternal(billingResult, list, null);
    }

    public void onPurchasesUpdatedInternal(BillingResult billingResult, List<Purchase> list, final Runnable runnable) {
        String str;
        TLRPC.InputStorePaymentPurpose purpose;
        AccountInstance accountInstance;
        Pair pair;
        Object obj;
        Object obj2;
        final BillingResult billingResult2 = billingResult;
        FileLog.d("Billing: Purchases updated: " + billingResult2 + ", " + list);
        int i = billingResult2.zza;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
                tL_inputAppEvent.type = "premium.promo_screen_fail";
                tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new PassportActivity$$ExternalSyntheticLambda1(1));
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
            } else {
                JSONObject jSONObject = purchase.zzc;
                if ((jSONObject.optInt("purchaseState", i2) != 4 ? 1 : 2) == i2) {
                    String strOptString = jSONObject.optString("obfuscatedAccountId");
                    String strOptString2 = jSONObject.optString("obfuscatedProfileId");
                    AccountIdentifiers accountIdentifiers = (strOptString == null && strOptString2 == null) ? null : new AccountIdentifiers(0, strOptString, strOptString2, false);
                    if (accountIdentifiers == null) {
                        FileLog.d("Billing: Extract payload. No AccountIdentifiers");
                    } else {
                        String str2 = accountIdentifiers.zza;
                        if (str2 == null || str2.isEmpty() || (str = accountIdentifiers.zzb) == null || str.isEmpty()) {
                            FileLog.d("Billing: Extract payload. Empty AccountIdentifiers");
                        } else {
                            try {
                                purpose = BillingUtilities.getPurpose(str);
                            } catch (Exception e) {
                                FileLog.e("Billing: Extract payload, failed to get purpose", e);
                                purpose = null;
                            }
                            try {
                                String str3 = new String(Base64.decode(str2, 0), Charsets.UTF_8);
                                FileLog.d("Billing: Extract payload. obfuscatedAccountIdString=".concat(str3));
                                if (str3.startsWith("account-")) {
                                    accountInstance = AccountInstance.getInstance(Integer.parseInt(str3.substring(8)));
                                } else {
                                    long j = Long.parseLong(str3);
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= 4) {
                                            accountInstance = null;
                                            break;
                                        }
                                        accountInstance = AccountInstance.getInstance(i3);
                                        if (accountInstance.getUserConfig().getClientUserId() == j) {
                                            break;
                                        } else {
                                            i3++;
                                        }
                                    }
                                    if (accountInstance == null) {
                                        FileLog.d("Billing: Extract payload. AccountInstance not found, accountId=" + j);
                                    }
                                    if (pair != null || (obj = pair.first) == null || (obj2 = pair.second) == null) {
                                        FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.getOrderId() + " purchase is purchased, but failed to extract saved payload");
                                    } else if (jSONObject.optBoolean("acknowledged", true)) {
                                        FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.getOrderId() + " purchase is purchased and acknowledged: consuming");
                                        atomicInteger.incrementAndGet();
                                        consumeGiftPurchase(purchase, (TLRPC.InputStorePaymentPurpose) obj2, new BillingController$$ExternalSyntheticLambda6(atomicInteger2, atomicInteger, runnable, 1));
                                    } else {
                                        StringBuilder sb = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                                        sb.append(purchase.getOrderId());
                                        sb.append(" purchase is purchased and not acknowledged: assigning (accountId=");
                                        final AccountInstance accountInstance2 = (AccountInstance) obj;
                                        sb.append(accountInstance2.getCurrentAccount());
                                        sb.append(") (purpose=");
                                        sb.append(obj2);
                                        sb.append(")");
                                        FileLog.d(sb.toString());
                                        this.requestingTokens.add(purchase.getPurchaseToken());
                                        final TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                        tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                        tL_dataJSON.data = purchase.zza;
                                        tL_payments_assignPlayMarketTransaction.purpose = (TLRPC.InputStorePaymentPurpose) obj2;
                                        final AlertDialog[] alertDialogArr = new AlertDialog[1];
                                        AndroidUtilities.runOnUIThread(new BillingController$$ExternalSyntheticLambda4(alertDialogArr, 1));
                                        atomicInteger.incrementAndGet();
                                        accountInstance2.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                AtomicInteger atomicInteger3 = atomicInteger;
                                                this.f$0.lambda$onPurchasesUpdatedInternal$10(alertDialogArr, purchase, tL_payments_assignPlayMarketTransaction, accountInstance2, billingResult2, atomicInteger2, atomicInteger3, runnable, tLObject, tL_error);
                                            }
                                        }, tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode ? 65608 : 65600);
                                    }
                                }
                                pair = new Pair(accountInstance, purpose);
                            } catch (Exception e2) {
                                FileLog.e("Billing: Extract Payload", e2);
                            }
                            if (pair != null) {
                                FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.getOrderId() + " purchase is purchased, but failed to extract saved payload");
                            } else {
                                FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.getOrderId() + " purchase is purchased, but failed to extract saved payload");
                            }
                        }
                    }
                    pair = null;
                    if (pair != null) {
                        FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.getOrderId() + " purchase is purchased, but failed to extract saved payload");
                    } else {
                        FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.getOrderId() + " purchase is purchased, but failed to extract saved payload");
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                    sb2.append(purchase.getOrderId());
                    sb2.append(" purchase is (state=");
                    sb2.append(jSONObject.optInt("purchaseState", 1) != 4 ? 1 : 2);
                    sb2.append("), (isAcknowledged=");
                    sb2.append(jSONObject.optBoolean("acknowledged", true));
                    sb2.append(")");
                    FileLog.d(sb2.toString());
                }
            }
            billingResult2 = billingResult;
            i2 = 1;
        }
        if (atomicInteger.get() != 0 || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void queryProductDetails(List<QueryProductDetailsParams$Product> list, ProductDetailsResponseListenerLegacy productDetailsResponseListenerLegacy) {
        if (!isReady()) {
            throw new IllegalStateException("Billing: Controller should be ready for this call!");
        }
        BillingClient billingClient = this.billingClient;
        zzcv zzcvVar = new zzcv(16);
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        for (QueryProductDetailsParams$Product queryProductDetailsParams$Product : list) {
            if (!"play_pass_subs".equals(queryProductDetailsParams$Product.zzb)) {
                hashSet.add(queryProductDetailsParams$Product.zzb);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        zzbt zzbtVarZzj = zzbt.zzj(list);
        zzcvVar.zza = zzbtVarZzj;
        if (zzbtVarZzj == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        billingClient.queryProductDetailsAsync(new zzbe(zzcvVar), new BillingController$$ExternalSyntheticLambda0(productDetailsResponseListenerLegacy, 0));
    }

    public void queryPurchases(String str, PurchasesResponseListener purchasesResponseListener) {
        BillingClient billingClient = this.billingClient;
        if (str == null) {
            throw new IllegalArgumentException("Product type must be set");
        }
        BillingClientImpl billingClientImpl = (BillingClientImpl) billingClient;
        billingClientImpl.getClass();
        if (BillingClientImpl.zzG(new zzx(billingClientImpl, purchasesResponseListener, str), 30000L, new zzbl(billingClientImpl, purchasesResponseListener, false, 17), billingClientImpl.zzan(), billingClientImpl.zzF()) == null) {
            BillingResult billingResultZzaq = billingClientImpl.zzaq();
            billingClientImpl.zzbd(25, 9, billingResultZzaq);
            zzbr zzbrVar = zzbt.zza;
            purchasesResponseListener.onQueryPurchasesResponse(billingResultZzaq, zzca.zza);
        }
    }

    public void setOnCanceled(Runnable runnable) {
        this.onCanceled = runnable;
    }

    public void lambda$onBillingServiceDisconnected$13() {
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

    public boolean startManageSubscription(Context context, String str) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + str + "&package=" + context.getPackageName())));
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public void whenSetuped(Runnable runnable) {
        this.setupListeners.add(runnable);
    }

    public String formatCurrency(long j, String str, int i) {
        return formatCurrency(j, str, i, false);
    }

    public void launchBillingFlow(final Activity activity, final AccountInstance accountInstance, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final List<BillingFlowParams$ProductDetailsParams> list, final BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams, boolean z) {
        String strEncodeToString;
        if (!isReady() || activity == null) {
            return;
        }
        if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z) {
            FileLog.d("BillingController.launchBillingFlow, checking consumables");
            queryPurchases("inapp", new PurchasesResponseListener() {
                @Override
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list2) {
                    this.f$0.lambda$launchBillingFlow$4(activity, accountInstance, inputStorePaymentPurpose, list, billingFlowParams$SubscriptionUpdateParams, billingResult, list2);
                }
            });
            return;
        }
        if (z) {
            FileLog.d("BillingController.launchBillingFlow, consumables checked, launching flow...");
        }
        boolean zIsClientActivated = accountInstance.getUserConfig().isClientActivated();
        boolean z2 = false;
        if (zIsClientActivated) {
            strEncodeToString = Base64.encodeToString(String.valueOf(accountInstance.getUserConfig().getClientUserId()).getBytes(Charsets.UTF_8), 0);
        } else {
            strEncodeToString = Base64.encodeToString(("account-" + accountInstance.getCurrentAccount()).getBytes(Charsets.UTF_8), 0);
        }
        long jNextLong = Utilities.random.nextLong();
        FileLog.d("BillingUtilities.savePurpose id=" + jNextLong + " paymentPurpose=" + inputStorePaymentPurpose);
        SerializedData serializedData = new SerializedData(8);
        serializedData.writeInt64(jNextLong);
        String strBytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
        serializedData.cleanup();
        FileLog.d("BillingUtilities.savePurpose id_hex=" + strBytesToHex + " paymentPurpose=" + inputStorePaymentPurpose);
        BillingUtilities.TL_savedPurpose tL_savedPurpose = new BillingUtilities.TL_savedPurpose();
        tL_savedPurpose.id = jNextLong;
        tL_savedPurpose.flags = 1;
        tL_savedPurpose.purpose = inputStorePaymentPurpose;
        SerializedData serializedData2 = new SerializedData(tL_savedPurpose.getObjectSize());
        tL_savedPurpose.serializeToStream(serializedData2);
        String strBytesToHex2 = Utilities.bytesToHex(serializedData2.toByteArray());
        serializedData2.cleanup();
        if (tL_savedPurpose.getObjectSize() > 28) {
            FileLog.d("BillingUtilities.savePurpose: sending short version, original size is " + tL_savedPurpose.getObjectSize() + " bytes");
            tL_savedPurpose.flags = 0;
            tL_savedPurpose.purpose = null;
        }
        SerializedData serializedData3 = new SerializedData(tL_savedPurpose.getObjectSize());
        tL_savedPurpose.serializeToStream(serializedData3);
        String strBytesToHex3 = Utilities.bytesToHex(serializedData3.toByteArray());
        serializedData3.cleanup();
        ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().putString(strBytesToHex, strBytesToHex2).apply();
        FileLog.d("BillingUtilities.savePurpose: saved {" + strBytesToHex2 + "} under " + strBytesToHex);
        StringBuilder sb = new StringBuilder("BillingUtilities.savePurpose: but sending {");
        sb.append(strBytesToHex3);
        sb.append("}");
        FileLog.d(sb.toString());
        zzfz zzfzVar = new zzfz();
        zzfzVar.zzb = 0;
        zzfzVar.zzc = true;
        ArrayList arrayList = new ArrayList(list);
        if (billingFlowParams$SubscriptionUpdateParams != null) {
            zzfzVar = new zzfz();
            zzfzVar.zza = billingFlowParams$SubscriptionUpdateParams.zza;
            zzfzVar.zzb = billingFlowParams$SubscriptionUpdateParams.zzc;
        }
        BillingClient billingClient = this.billingClient;
        boolean zIsEmpty = arrayList.isEmpty();
        if (zIsEmpty) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((BillingFlowParams$ProductDetailsParams) obj) == null) {
                throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
            }
        }
        zzs zzsVar = new zzs();
        if (!zIsEmpty && !((BillingFlowParams$ProductDetailsParams) arrayList.get(0)).zza.zzb.optString("packageName").isEmpty()) {
            z2 = true;
        }
        zzsVar.zzh = z2;
        zzsVar.zza = strEncodeToString;
        zzsVar.zzb = strBytesToHex3;
        boolean z3 = true;
        if (TextUtils.isEmpty((String) zzfzVar.zza) && TextUtils.isEmpty(null)) {
            z3 = false;
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        if (z3 && !zIsEmpty2) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!zzfzVar.zzc && !z3 && zIsEmpty2) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        BillingFlowParams$SubscriptionUpdateParams billingFlowParams$SubscriptionUpdateParams2 = new BillingFlowParams$SubscriptionUpdateParams();
        billingFlowParams$SubscriptionUpdateParams2.zza = (String) zzfzVar.zza;
        billingFlowParams$SubscriptionUpdateParams2.zzc = zzfzVar.zzb;
        zzsVar.zze = billingFlowParams$SubscriptionUpdateParams2;
        zzsVar.zzg = new ArrayList();
        zzsVar.zzf = zzbt.zzj(arrayList);
        int i2 = billingClient.launchBillingFlow(activity, zzsVar).zza;
        if (i2 != 0) {
            StringBuilder sb2 = new StringBuilder("Billing: Launch Error: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(strEncodeToString);
            sb2.append(", ");
            SQLitePreparedStatement$$ExternalSyntheticOutline0.m(strBytesToHex3, sb2);
        }
    }

    public String formatCurrency(long j, String str, int i, boolean z) {
        if (str != null && !str.isEmpty()) {
            if ("TON".equalsIgnoreCase(str)) {
                return "TON " + (j / 1.0E9d);
            }
            if ("XTR".equalsIgnoreCase(str)) {
                return BillingController$$ExternalSyntheticOutline0.m(j, ',', new StringBuilder("XTR "));
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
        return String.valueOf(j);
    }
}
