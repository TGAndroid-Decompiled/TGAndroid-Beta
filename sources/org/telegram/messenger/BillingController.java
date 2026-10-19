package org.telegram.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import c5.r;
import com.android.billingclient.api.Purchase;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dg0;
public class BillingController implements r, c5.d {
    public static final c5.s PREMIUM_PRODUCT;
    public static c5.p PREMIUM_PRODUCT_DETAILS = null;
    public static final String PREMIUM_PRODUCT_ID = "telegram_premium";
    public static boolean billingClientEmpty;
    private static NumberFormat currencyInstance;
    private static NumberFormat currencyInstanceRounded;
    private static BillingController instance;
    private final c5.b billingClient;
    private boolean isDisconnected;
    private String lastPremiumToken;
    private String lastPremiumTransaction;
    private Runnable onCanceled;
    private final Map<String, q0.a> resultListeners = new HashMap();
    private final Set<String> requestingTokens = Collections.newSetFromMap(new ConcurrentHashMap());
    private final Map<String, Integer> currencyExpMap = new HashMap();
    private ArrayList<Runnable> setupListeners = new ArrayList<>();
    private int triesLeft = 0;

    public interface ProductDetailsResponseListenerLegacy {
        void onProductDetailsResponse(c5.i iVar, List<c5.p> list);
    }

    static {
        ?? obj = new Object();
        obj.f4695b = "subs";
        obj.f4694a = "telegram_premium";
        PREMIUM_PRODUCT = obj.a();
    }

    private BillingController(Context context) {
        c5.b cVar;
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(context);
        fVar.f3092a = new rb.b(4);
        fVar.f3094c = this;
        if (context != null) {
            if (((BillingController) fVar.f3094c) != null) {
                if (((rb.b) fVar.f3092a) != null) {
                    ((rb.b) fVar.f3092a).getClass();
                    if (((BillingController) fVar.f3094c) != null) {
                        rb.b bVar = (rb.b) fVar.f3092a;
                        BillingController billingController = (BillingController) fVar.f3094c;
                        if (fVar.a()) {
                            cVar = new c5.e0(bVar, context, billingController, fVar);
                        } else {
                            cVar = new c5.c(bVar, context, billingController, fVar);
                        }
                    } else {
                        rb.b bVar2 = (rb.b) fVar.f3092a;
                        if (fVar.a()) {
                            cVar = new c5.e0(bVar2, context, fVar);
                        } else {
                            cVar = new c5.c(bVar2, context, fVar);
                        }
                    }
                    this.billingClient = cVar;
                    return;
                }
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        throw new IllegalArgumentException("Please provide a valid Context.");
    }

    public static BillingController getInstance() {
        if (instance == null) {
            instance = new BillingController(ApplicationLoader.applicationContext);
        }
        return instance;
    }

    public static String getResponseCodeString(int i10) {
        if (i10 != 12) {
            switch (i10) {
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

    public static void lambda$consumeGiftPurchase$12(TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Purchase purchase, Runnable runnable, c5.i iVar, String str) {
        Object valueOf;
        StringBuilder sb2 = new StringBuilder("BillingController consumeGiftPurchase ");
        sb2.append(inputStorePaymentPurpose);
        sb2.append(" ");
        sb2.append(purchase.a());
        sb2.append(" ");
        sb2.append(purchase.c());
        sb2.append(" done: ");
        int i10 = iVar.f4752a;
        if (i10 == 0) {
            valueOf = "OK";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        sb2.append(" ");
        i2.e.v(iVar.f4754c, sb2);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$launchBillingFlow$1(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, c5.g gVar) {
        launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, gVar, true);
    }

    public static void lambda$launchBillingFlow$2(Purchase purchase, List list, String str, AtomicInteger atomicInteger, Runnable runnable, c5.i iVar, String str2) {
        if (iVar.f4752a == 0) {
            FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.c() + ": OK");
            list.add(str);
            if (atomicInteger.get() == list.size()) {
                runnable.run();
                return;
            }
            return;
        }
        FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.c() + ": " + iVar.f4752a + " " + iVar.f4754c);
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

    public void lambda$launchBillingFlow$4(android.app.Activity r9, org.telegram.messenger.AccountInstance r10, org.telegram.tgnet.TLRPC.InputStorePaymentPurpose r11, java.util.List r12, c5.g r13, c5.i r14, java.util.List r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.BillingController.lambda$launchBillingFlow$4(android.app.Activity, org.telegram.messenger.AccountInstance, org.telegram.tgnet.TLRPC$InputStorePaymentPurpose, java.util.List, c5.g, c5.i, java.util.List):void");
    }

    public void lambda$onPurchasesUpdatedInternal$10(org.telegram.ui.ActionBar.b2[] b2VarArr, Purchase purchase, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, AccountInstance accountInstance, c5.i iVar, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        c5.a aVar;
        AndroidUtilities.runOnUIThread(new f0(b2VarArr, 0));
        this.requestingTokens.remove(purchase.c());
        if (tLObject instanceof TLRPC.Updates) {
            FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased and now assigned");
            if (tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode) {
                ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove((TLRPC.Updates) tLObject, TL_update.TL_updateSentPhoneCode.class);
                int size = findUpdatesAndRemove.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = findUpdatesAndRemove.get(i10);
                    i10++;
                    AndroidUtilities.runOnUIThread(new h0(accountInstance, tL_payments_assignPlayMarketTransaction, (TL_update.TL_updateSentPhoneCode) obj, 10));
                }
            }
            accountInstance.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            ArrayList b10 = purchase.b();
            int size2 = b10.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = b10.get(i11);
                i11++;
                q0.a remove = this.resultListeners.remove((String) obj2);
                if (remove != null) {
                    remove.accept(iVar);
                }
            }
            consumeGiftPurchase(purchase, tL_payments_assignPlayMarketTransaction.purpose, new y(atomicInteger, atomicInteger2, runnable, 1));
            JSONObject jSONObject = purchase.f6271c;
            String optString = jSONObject.optString("obfuscatedAccountId");
            String optString2 = jSONObject.optString("obfuscatedProfileId");
            if (optString == null && optString2 == null) {
                aVar = null;
            } else {
                aVar = new c5.a(optString, optString2);
            }
            String str2 = aVar.f4695b;
            try {
                FileLog.d("BillingUtilities.clearPurpose: got {" + str2 + "}");
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str2));
                zf.a a2 = zf.a.a(serializedData, serializedData.readInt32(true));
                SerializedData serializedData2 = new SerializedData(8);
                serializedData2.writeInt64(a2.f51519b);
                String bytesToHex = Utilities.bytesToHex(serializedData2.toByteArray());
                serializedData2.cleanup();
                FileLog.d("BillingUtilities.clearPurpose: id_hex = " + bytesToHex);
                ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().remove(bytesToHex).apply();
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
        sb2.append(purchase.a());
        sb2.append(" purchase is purchased and failed to assign: ");
        if (tL_error == null) {
            str = null;
        } else {
            str = tL_error.text;
        }
        i2.e.v(str, sb2);
        Runnable runnable2 = this.onCanceled;
        if (runnable2 != null) {
            runnable2.run();
            this.onCanceled = null;
        }
        if (tL_error != null) {
            NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingConfirmPurchaseError, tL_payments_assignPlayMarketTransaction, tL_error);
        }
        AndroidUtilities.runOnUIThread(new y(atomicInteger, atomicInteger2, runnable, 2));
    }

    public static void lambda$onPurchasesUpdatedInternal$11(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable) {
        if (atomicInteger.incrementAndGet() == atomicInteger2.get() && runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$onPurchasesUpdatedInternal$5(org.telegram.ui.ActionBar.b2[] b2VarArr) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
        b2VarArr[0] = b2Var;
        b2Var.r(500L);
    }

    public static void lambda$onPurchasesUpdatedInternal$6(org.telegram.ui.ActionBar.b2[] b2VarArr) {
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
    }

    public static void lambda$onPurchasesUpdatedInternal$7(AccountInstance accountInstance, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode) {
        dg0 dg0Var = (dg0) LaunchActivity.N();
        if (dg0Var == null) {
            dg0Var = new dg0(accountInstance.getCurrentAccount());
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(dg0Var);
            }
        }
        dg0Var.q1(((TLRPC.TL_inputStorePaymentAuthCode) tL_payments_assignPlayMarketTransaction.purpose).phone_number, tL_updateSentPhoneCode.sent_code);
    }

    public static void lambda$onPurchasesUpdatedInternal$8(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable) {
        if (atomicInteger.incrementAndGet() == atomicInteger2.get() && runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$onPurchasesUpdatedInternal$9(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable) {
        if (atomicInteger.incrementAndGet() == atomicInteger2.get() && runnable != null) {
            runnable.run();
        }
    }

    public void lambda$onQueriedPremiumProductDetails$14() {
        try {
            queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new e0(this));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$queryProductDetails$0(ProductDetailsResponseListenerLegacy productDetailsResponseListenerLegacy, c5.i iVar, c5.t tVar) {
        productDetailsResponseListenerLegacy.onProductDetailsResponse(iVar, tVar.f4781a);
    }

    public void onQueriedPremiumProductDetails(c5.i iVar, List<c5.p> list) {
        long j10;
        FileLog.d("Billing: Query product details finished " + iVar + ", " + list);
        if (iVar.f4752a == 0) {
            for (c5.p pVar : list) {
                if (pVar.f4775c.equals("telegram_premium")) {
                    PREMIUM_PRODUCT_DETAILS = pVar;
                }
            }
            if (PREMIUM_PRODUCT_DETAILS == null) {
                switchToInvoice();
                return;
            }
            switchBackFromInvoice();
            NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
            return;
        }
        switchToInvoice();
        int i10 = this.triesLeft - 1;
        this.triesLeft = i10;
        if (i10 > 0) {
            if (i10 == 2) {
                j10 = 1000;
            } else {
                j10 = 10000;
            }
            AndroidUtilities.runOnUIThread(new z(this, 0), j10);
        }
    }

    private void switchBackFromInvoice() {
        if (!billingClientEmpty) {
            return;
        }
        billingClientEmpty = false;
        NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
    }

    private void switchToInvoice() {
        if (billingClientEmpty) {
            return;
        }
        billingClientEmpty = true;
        NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingProductDetailsUpdated, new Object[0]);
    }

    public void addResultListener(String str, q0.a aVar) {
        this.resultListeners.put(str, aVar);
    }

    public void consumeGiftPurchase(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if (!(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) && !(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            return;
        }
        FileLog.d("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.a() + " " + purchase.c());
        c5.b bVar = this.billingClient;
        String c10 = purchase.c();
        if (c10 != null) {
            ?? obj = new Object();
            obj.f4758a = c10;
            bVar.a(obj, new c(inputStorePaymentPurpose, purchase, runnable));
            return;
        }
        throw new IllegalArgumentException("Purchase token must be set");
    }

    public String formatCurrency(long j10, String str) {
        return formatCurrency(j10, str, getCurrencyExp(str));
    }

    public int getCurrencyExp(String str) {
        zf.b.a(this.currencyExpMap);
        return ((Integer) Map.EL.getOrDefault(this.currencyExpMap, str, 0)).intValue();
    }

    public String getLastPremiumToken() {
        return this.lastPremiumToken;
    }

    public String getLastPremiumTransaction() {
        return this.lastPremiumTransaction;
    }

    public boolean isReady() {
        c5.c cVar = (c5.c) this.billingClient;
        cVar.getClass();
        return cVar.o();
    }

    public void launchBillingFlow(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List<c5.e> list) {
        launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, null, false);
    }

    @Override
    public void onBillingServiceDisconnected() {
        int i10;
        FileLog.d("Billing: Service disconnected");
        if (this.isDisconnected) {
            i10 = 15000;
        } else {
            i10 = 5000;
        }
        this.isDisconnected = true;
        AndroidUtilities.runOnUIThread(new z(this, 1), i10);
    }

    @Override
    public void onBillingSetupFinished(c5.i iVar) {
        FileLog.d("Billing: Setup finished with result " + iVar);
        if (iVar.f4752a == 0) {
            this.isDisconnected = false;
            this.triesLeft = 3;
            try {
                queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new e0(this));
            } catch (Exception e) {
                FileLog.e(e);
            }
            queryPurchases("inapp", new e0(this));
            queryPurchases("subs", new e0(this));
            if (!this.setupListeners.isEmpty()) {
                for (int i10 = 0; i10 < this.setupListeners.size(); i10++) {
                    AndroidUtilities.runOnUIThread(this.setupListeners.get(i10));
                }
                this.setupListeners.clear();
            }
        } else if (!this.isDisconnected) {
            switchToInvoice();
        }
    }

    @Override
    public void onPurchasesUpdated(c5.i iVar, List<Purchase> list) {
        onPurchasesUpdatedInternal(iVar, list, null);
    }

    public void onPurchasesUpdatedInternal(c5.i r19, java.util.List<com.android.billingclient.api.Purchase> r20, final java.lang.Runnable r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.BillingController.onPurchasesUpdatedInternal(c5.i, java.util.List, java.lang.Runnable):void");
    }

    public void queryProductDetails(List<c5.s> list, ProductDetailsResponseListenerLegacy productDetailsResponseListenerLegacy) {
        if (isReady()) {
            c5.b bVar = this.billingClient;
            ya.d dVar = new ya.d(7);
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (c5.s sVar : list) {
                    if (!"play_pass_subs".equals(sVar.f4780b)) {
                        hashSet.add(sVar.f4780b);
                    }
                }
                if (hashSet.size() <= 1) {
                    com.google.android.gms.internal.play_billing.r t10 = com.google.android.gms.internal.play_billing.r.t(list);
                    dVar.f50116b = t10;
                    if (t10 != null) {
                        bVar.c(new a6.i(dVar), new d0(productDetailsResponseListenerLegacy, 0));
                        return;
                    }
                    throw new IllegalArgumentException("Product list must be set to a non empty list.");
                }
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        throw new IllegalStateException("Billing: Controller should be ready for this call!");
    }

    public void queryPurchases(String str, c5.q qVar) {
        c5.b bVar = this.billingClient;
        if (str != null) {
            c5.c cVar = (c5.c) bVar;
            cVar.getClass();
            if (c5.c.f(new c5.v(cVar, qVar, str), 30000L, new j9.u(6, cVar, qVar), cVar.r(), cVar.e()) == null) {
                c5.i u10 = cVar.u();
                cVar.y(25, 9, u10);
                com.google.android.gms.internal.play_billing.p pVar = com.google.android.gms.internal.play_billing.r.f7198b;
                qVar.b(u10, com.google.android.gms.internal.play_billing.v.e);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Product type must be set");
    }

    public void setOnCanceled(Runnable runnable) {
        this.onCanceled = runnable;
    }

    public void lambda$onBillingServiceDisconnected$13() {
        if (!isReady()) {
            try {
                zf.b.a(this.currencyExpMap);
                if (!BuildVars.useInvoiceBilling()) {
                    this.billingClient.d(this);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public boolean startManageSubscription(Context context, String str) {
        try {
            String packageName = context.getPackageName();
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + str + "&package=" + packageName)));
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public void whenSetuped(Runnable runnable) {
        this.setupListeners.add(runnable);
    }

    public String formatCurrency(long j10, String str, int i10) {
        return formatCurrency(j10, str, i10, false);
    }

    public void launchBillingFlow(final Activity activity, final AccountInstance accountInstance, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final List<c5.e> list, final c5.g gVar, boolean z10) {
        String encodeToString;
        if (!isReady() || activity == null) {
            return;
        }
        if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z10) {
            FileLog.d("BillingController.launchBillingFlow, checking consumables");
            queryPurchases("inapp", new c5.q() {
                @Override
                public final void b(c5.i iVar, List list2) {
                    BillingController.this.lambda$launchBillingFlow$4(activity, accountInstance, inputStorePaymentPurpose, list, gVar, iVar, list2);
                }
            });
            return;
        }
        if (z10) {
            FileLog.d("BillingController.launchBillingFlow, consumables checked, launching flow...");
        }
        boolean isClientActivated = accountInstance.getUserConfig().isClientActivated();
        boolean z11 = false;
        if (isClientActivated) {
            encodeToString = Base64.encodeToString(String.valueOf(accountInstance.getUserConfig().getClientUserId()).getBytes(d9.j.f7891a), 0);
        } else {
            encodeToString = Base64.encodeToString(("account-" + accountInstance.getCurrentAccount()).getBytes(d9.j.f7891a), 0);
        }
        long nextLong = Utilities.random.nextLong();
        FileLog.d("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
        SerializedData serializedData = new SerializedData(8);
        serializedData.writeInt64(nextLong);
        String bytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
        serializedData.cleanup();
        FileLog.d("BillingUtilities.savePurpose id_hex=" + bytesToHex + " paymentPurpose=" + inputStorePaymentPurpose);
        ?? tLObject = new TLObject();
        tLObject.f51519b = nextLong;
        tLObject.f51518a = 1;
        tLObject.f51520c = inputStorePaymentPurpose;
        SerializedData serializedData2 = new SerializedData(tLObject.getObjectSize());
        tLObject.serializeToStream(serializedData2);
        String bytesToHex2 = Utilities.bytesToHex(serializedData2.toByteArray());
        serializedData2.cleanup();
        if (tLObject.getObjectSize() > 28) {
            FileLog.d("BillingUtilities.savePurpose: sending short version, original size is " + tLObject.getObjectSize() + " bytes");
            tLObject.f51518a = 0;
            tLObject.f51520c = null;
        }
        SerializedData serializedData3 = new SerializedData(tLObject.getObjectSize());
        tLObject.serializeToStream(serializedData3);
        String bytesToHex3 = Utilities.bytesToHex(serializedData3.toByteArray());
        serializedData3.cleanup();
        ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().putString(bytesToHex, bytesToHex2).apply();
        FileLog.d("BillingUtilities.savePurpose: saved {" + bytesToHex2 + "} under " + bytesToHex);
        StringBuilder sb2 = new StringBuilder("BillingUtilities.savePurpose: but sending {");
        sb2.append(bytesToHex3);
        sb2.append("}");
        FileLog.d(sb2.toString());
        ?? obj = new Object();
        obj.f4728a = 0;
        obj.f4729b = true;
        ArrayList arrayList = new ArrayList(list);
        c5.f fVar = obj;
        if (gVar != null) {
            ?? obj2 = new Object();
            obj2.f4730c = gVar.f4732a;
            obj2.f4728a = gVar.f4733b;
            fVar = obj2;
        }
        c5.b bVar = this.billingClient;
        boolean isEmpty = arrayList.isEmpty();
        if (!isEmpty) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj3 = arrayList.get(i10);
                i10++;
                if (((c5.e) obj3) == null) {
                    throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                }
            }
            ?? obj4 = new Object();
            if (!isEmpty && !((c5.e) arrayList.get(0)).f4726a.f4774b.optString("packageName").isEmpty()) {
                z11 = true;
            }
            obj4.f4735a = z11;
            obj4.f4736b = encodeToString;
            obj4.f4737c = bytesToHex3;
            boolean z12 = true;
            if (TextUtils.isEmpty((String) fVar.f4730c) && TextUtils.isEmpty(null)) {
                z12 = false;
            }
            boolean isEmpty2 = TextUtils.isEmpty(null);
            if (z12 && !isEmpty2) {
                throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            }
            if (!fVar.f4729b && !z12 && isEmpty2) {
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }
            ?? obj5 = new Object();
            obj5.f4732a = (String) fVar.f4730c;
            obj5.f4733b = fVar.f4728a;
            obj4.d = obj5;
            obj4.f4738f = new ArrayList();
            obj4.e = com.google.android.gms.internal.play_billing.r.t(arrayList);
            int i11 = bVar.b(activity, obj4).f4752a;
            if (i11 != 0) {
                StringBuilder sb3 = new StringBuilder("Billing: Launch Error: ");
                sb3.append(i11);
                sb3.append(", ");
                sb3.append(encodeToString);
                sb3.append(", ");
                i2.e.v(bytesToHex3, sb3);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Details of the products must be provided.");
    }

    public String formatCurrency(long j10, String str, int i10, boolean z10) {
        if (str != null && !str.isEmpty()) {
            if ("TON".equalsIgnoreCase(str)) {
                return "TON " + (j10 / 1.0E9d);
            } else if ("XTR".equalsIgnoreCase(str)) {
                return g0.h(j10, ',', new StringBuilder("XTR "));
            } else {
                Currency currency = Currency.getInstance(str);
                if (currency != null) {
                    if (currencyInstance == null) {
                        currencyInstance = NumberFormat.getCurrencyInstance();
                    }
                    currencyInstance.setCurrency(currency);
                    if (z10) {
                        currencyInstance.setMaximumFractionDigits(0);
                        currencyInstance.setMinimumFractionDigits(0);
                        return currencyInstance.format(Math.round(j10 / Math.pow(10.0d, i10)));
                    }
                    int defaultFractionDigits = currency.getDefaultFractionDigits();
                    currencyInstance.setMinimumFractionDigits(defaultFractionDigits);
                    currencyInstance.setMaximumFractionDigits(defaultFractionDigits);
                    return currencyInstance.format(j10 / Math.pow(10.0d, i10));
                }
                return j10 + " " + str;
            }
        }
        return String.valueOf(j10);
    }
}
