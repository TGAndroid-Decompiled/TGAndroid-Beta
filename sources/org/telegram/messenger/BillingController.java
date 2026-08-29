package org.telegram.messenger;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.r;
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
import org.telegram.ui.fg0;
public class BillingController implements p2.n, p2.c {
    public static final p2.o PREMIUM_PRODUCT;
    public static p2.l PREMIUM_PRODUCT_DETAILS = null;
    public static final String PREMIUM_PRODUCT_ID = "telegram_premium";
    public static boolean billingClientEmpty;
    private static NumberFormat currencyInstance;
    private static NumberFormat currencyInstanceRounded;
    private static BillingController instance;
    private final p2.a billingClient;
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
        void onProductDetailsResponse(p2.g gVar, List<p2.l> list);
    }

    static {
        d9.c cVar = new d9.c();
        cVar.f5537c = "subs";
        cVar.f5536b = "telegram_premium";
        PREMIUM_PRODUCT = cVar.a();
    }

    private BillingController(Context context) {
        p2.a bVar;
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(context);
        fVar.f1343a = new f7.v(19);
        fVar.f1344b = this;
        if (context != null) {
            if (((BillingController) fVar.f1344b) != null) {
                if (((f7.v) fVar.f1343a) != null) {
                    ((f7.v) fVar.f1343a).getClass();
                    if (((BillingController) fVar.f1344b) != null) {
                        f7.v vVar = (f7.v) fVar.f1343a;
                        BillingController billingController = (BillingController) fVar.f1344b;
                        if (fVar.a()) {
                            bVar = new p2.w(vVar, context, billingController, fVar);
                        } else {
                            bVar = new p2.b(vVar, context, billingController, fVar);
                        }
                    } else {
                        f7.v vVar2 = (f7.v) fVar.f1343a;
                        if (fVar.a()) {
                            bVar = new p2.w(vVar2, context, fVar);
                        } else {
                            bVar = new p2.b(vVar2, context, fVar);
                        }
                    }
                    this.billingClient = bVar;
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

    public static void lambda$consumeGiftPurchase$12(TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Purchase purchase, Runnable runnable, p2.g gVar, String str) {
        Object valueOf;
        StringBuilder sb2 = new StringBuilder("BillingController consumeGiftPurchase ");
        sb2.append(inputStorePaymentPurpose);
        sb2.append(" ");
        sb2.append(purchase.a());
        sb2.append(" ");
        sb2.append(purchase.c());
        sb2.append(" done: ");
        int i10 = gVar.f45457a;
        if (i10 == 0) {
            valueOf = "OK";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        sb2.append(" ");
        org.telegram.ui.th.v(gVar.f45459c, sb2);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$launchBillingFlow$1(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, p2.e eVar) {
        launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, eVar, true);
    }

    public static void lambda$launchBillingFlow$2(Purchase purchase, List list, String str, AtomicInteger atomicInteger, Runnable runnable, p2.g gVar, String str2) {
        if (gVar.f45457a == 0) {
            FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.c() + ": OK");
            list.add(str);
            if (atomicInteger.get() == list.size()) {
                runnable.run();
                return;
            }
            return;
        }
        FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.c() + ": " + gVar.f45457a + " " + gVar.f45459c);
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

    public void lambda$launchBillingFlow$4(android.app.Activity r9, org.telegram.messenger.AccountInstance r10, org.telegram.tgnet.TLRPC.InputStorePaymentPurpose r11, java.util.List r12, p2.e r13, p2.g r14, java.util.List r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.BillingController.lambda$launchBillingFlow$4(android.app.Activity, org.telegram.messenger.AccountInstance, org.telegram.tgnet.TLRPC$InputStorePaymentPurpose, java.util.List, p2.e, p2.g, java.util.List):void");
    }

    public void lambda$onPurchasesUpdatedInternal$10(org.telegram.ui.ActionBar.c2[] c2VarArr, Purchase purchase, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, AccountInstance accountInstance, p2.g gVar, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        d9.c cVar;
        AndroidUtilities.runOnUIThread(new e0(c2VarArr, 0));
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
                    AndroidUtilities.runOnUIThread(new f0(accountInstance, tL_payments_assignPlayMarketTransaction, (TL_update.TL_updateSentPhoneCode) obj, 8));
                }
            }
            accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            ArrayList b10 = purchase.b();
            int size2 = b10.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = b10.get(i11);
                i11++;
                q0.a remove = this.resultListeners.remove((String) obj2);
                if (remove != null) {
                    remove.accept(gVar);
                }
            }
            consumeGiftPurchase(purchase, tL_payments_assignPlayMarketTransaction.purpose, new y(atomicInteger, atomicInteger2, runnable, 1));
            JSONObject jSONObject = purchase.f3512c;
            String optString = jSONObject.optString("obfuscatedAccountId");
            String optString2 = jSONObject.optString("obfuscatedProfileId");
            if (optString == null && optString2 == null) {
                cVar = null;
            } else {
                cVar = new d9.c(1, optString, optString2);
            }
            String str2 = cVar.f5537c;
            try {
                FileLog.d("BillingUtilities.clearPurpose: got {" + str2 + "}");
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str2));
                jf.a a2 = jf.a.a(serializedData, serializedData.readInt32(true));
                SerializedData serializedData2 = new SerializedData(8);
                serializedData2.writeInt64(a2.f11548b);
                String bytesToHex = Utilities.bytesToHex(serializedData2.toByteArray());
                serializedData2.cleanup();
                FileLog.d("BillingUtilities.clearPurpose: id_hex = " + bytesToHex);
                ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().remove(bytesToHex).apply();
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
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
        org.telegram.ui.th.v(str, sb2);
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

    public static void lambda$onPurchasesUpdatedInternal$5(org.telegram.ui.ActionBar.c2[] c2VarArr) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
        c2VarArr[0] = c2Var;
        c2Var.q(500L);
    }

    public static void lambda$onPurchasesUpdatedInternal$6(org.telegram.ui.ActionBar.c2[] c2VarArr) {
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
        }
    }

    public static void lambda$onPurchasesUpdatedInternal$7(AccountInstance accountInstance, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode) {
        fg0 fg0Var = (fg0) LaunchActivity.N();
        if (fg0Var == null) {
            fg0Var = new fg0(accountInstance.getCurrentAccount());
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(fg0Var);
            }
        }
        fg0Var.q1(((TLRPC.TL_inputStorePaymentAuthCode) tL_payments_assignPlayMarketTransaction.purpose).phone_number, tL_updateSentPhoneCode.sent_code);
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
            queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new d0(this));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static void lambda$queryProductDetails$0(ProductDetailsResponseListenerLegacy productDetailsResponseListenerLegacy, p2.g gVar, p2.p pVar) {
        productDetailsResponseListenerLegacy.onProductDetailsResponse(gVar, pVar.f45480a);
    }

    public void onQueriedPremiumProductDetails(p2.g gVar, List<p2.l> list) {
        long j10;
        FileLog.d("Billing: Query product details finished " + gVar + ", " + list);
        if (gVar.f45457a == 0) {
            for (p2.l lVar : list) {
                if (lVar.f45473c.equals("telegram_premium")) {
                    PREMIUM_PRODUCT_DETAILS = lVar;
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
        p2.a aVar = this.billingClient;
        String c3 = purchase.c();
        if (c3 != null) {
            ?? obj = new Object();
            obj.f7032a = c3;
            aVar.a(obj, new f(inputStorePaymentPurpose, purchase, runnable));
            return;
        }
        throw new IllegalArgumentException("Purchase token must be set");
    }

    public String formatCurrency(long j10, String str) {
        return formatCurrency(j10, str, getCurrencyExp(str));
    }

    public int getCurrencyExp(String str) {
        jf.b.a(this.currencyExpMap);
        return ((Integer) Map.EL.getOrDefault(this.currencyExpMap, str, 0)).intValue();
    }

    public String getLastPremiumToken() {
        return this.lastPremiumToken;
    }

    public String getLastPremiumTransaction() {
        return this.lastPremiumTransaction;
    }

    public boolean isReady() {
        p2.b bVar = (p2.b) this.billingClient;
        bVar.getClass();
        return bVar.o();
    }

    public void launchBillingFlow(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List<p2.d> list) {
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
    public void onBillingSetupFinished(p2.g gVar) {
        FileLog.d("Billing: Setup finished with result " + gVar);
        if (gVar.f45457a == 0) {
            this.isDisconnected = false;
            this.triesLeft = 3;
            try {
                queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new d0(this));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            queryPurchases("inapp", new d0(this));
            queryPurchases("subs", new d0(this));
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
    public void onPurchasesUpdated(p2.g gVar, List<Purchase> list) {
        onPurchasesUpdatedInternal(gVar, list, null);
    }

    public void onPurchasesUpdatedInternal(p2.g r20, java.util.List<com.android.billingclient.api.Purchase> r21, final java.lang.Runnable r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.BillingController.onPurchasesUpdatedInternal(p2.g, java.util.List, java.lang.Runnable):void");
    }

    public void queryProductDetails(List<p2.o> list, ProductDetailsResponseListenerLegacy productDetailsResponseListenerLegacy) {
        if (isReady()) {
            p2.a aVar = this.billingClient;
            org.telegram.ui.Components.n nVar = new org.telegram.ui.Components.n(5);
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (p2.o oVar : list) {
                    if (!"play_pass_subs".equals(oVar.f45479b)) {
                        hashSet.add(oVar.f45479b);
                    }
                }
                if (hashSet.size() <= 1) {
                    r u10 = r.u(list);
                    nVar.f30787b = u10;
                    if (u10 != null) {
                        aVar.c(new nh.d6(nVar), new d(productDetailsResponseListenerLegacy, 1));
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

    public void queryPurchases(String str, p2.m mVar) {
        p2.a aVar = this.billingClient;
        if (str != null) {
            p2.b bVar = (p2.b) aVar;
            bVar.getClass();
            if (p2.b.f(new p2.r(bVar, mVar, str), 30000L, new od.i(bVar, mVar, false, 7), bVar.r(), bVar.e()) == null) {
                p2.g u10 = bVar.u();
                bVar.y(25, 9, u10);
                com.google.android.gms.internal.play_billing.p pVar = r.f4681b;
                mVar.b(u10, com.google.android.gms.internal.play_billing.v.f4708e);
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
                jf.b.a(this.currencyExpMap);
                if (!BuildVars.useInvoiceBilling()) {
                    this.billingClient.d(this);
                }
            } catch (Exception e10) {
                FileLog.e(e10);
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

    public void launchBillingFlow(final Activity activity, final AccountInstance accountInstance, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final List<p2.d> list, final p2.e eVar, boolean z10) {
        String encodeToString;
        if (!isReady() || activity == null) {
            return;
        }
        if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z10) {
            FileLog.d("BillingController.launchBillingFlow, checking consumables");
            queryPurchases("inapp", new p2.m() {
                @Override
                public final void b(p2.g gVar, List list2) {
                    BillingController.this.lambda$launchBillingFlow$4(activity, accountInstance, inputStorePaymentPurpose, list, eVar, gVar, list2);
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
            encodeToString = Base64.encodeToString(String.valueOf(accountInstance.getUserConfig().getClientUserId()).getBytes(p8.d.f45658c), 0);
        } else {
            encodeToString = Base64.encodeToString(("account-" + accountInstance.getCurrentAccount()).getBytes(p8.d.f45658c), 0);
        }
        long nextLong = Utilities.random.nextLong();
        FileLog.d("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
        SerializedData serializedData = new SerializedData(8);
        serializedData.writeInt64(nextLong);
        String bytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
        serializedData.cleanup();
        FileLog.d("BillingUtilities.savePurpose id_hex=" + bytesToHex + " paymentPurpose=" + inputStorePaymentPurpose);
        ?? tLObject = new TLObject();
        tLObject.f11548b = nextLong;
        tLObject.f11547a = 1;
        tLObject.f11549c = inputStorePaymentPurpose;
        SerializedData serializedData2 = new SerializedData(tLObject.getObjectSize());
        tLObject.serializeToStream(serializedData2);
        String bytesToHex2 = Utilities.bytesToHex(serializedData2.toByteArray());
        serializedData2.cleanup();
        if (tLObject.getObjectSize() > 28) {
            FileLog.d("BillingUtilities.savePurpose: sending short version, original size is " + tLObject.getObjectSize() + " bytes");
            tLObject.f11547a = 0;
            tLObject.f11549c = null;
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
        obj.f16482b = 0;
        obj.f16481a = true;
        ArrayList arrayList = new ArrayList(list);
        m.a aVar = obj;
        if (eVar != null) {
            ?? obj2 = new Object();
            obj2.f16483c = eVar.f45450a;
            obj2.f16482b = eVar.f45451b;
            aVar = obj2;
        }
        p2.a aVar2 = this.billingClient;
        boolean isEmpty = arrayList.isEmpty();
        if (!isEmpty) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj3 = arrayList.get(i10);
                i10++;
                if (((p2.d) obj3) == null) {
                    throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                }
            }
            ?? obj4 = new Object();
            if (!isEmpty && !((p2.d) arrayList.get(0)).f45448a.f45472b.optString("packageName").isEmpty()) {
                z11 = true;
            }
            obj4.f45452a = z11;
            obj4.f45453b = encodeToString;
            obj4.f45454c = bytesToHex3;
            boolean z12 = true;
            if (TextUtils.isEmpty((String) aVar.f16483c) && TextUtils.isEmpty(null)) {
                z12 = false;
            }
            boolean isEmpty2 = TextUtils.isEmpty(null);
            if (z12 && !isEmpty2) {
                throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            }
            if (!aVar.f16481a && !z12 && isEmpty2) {
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }
            ?? obj5 = new Object();
            obj5.f45450a = (String) aVar.f16483c;
            obj5.f45451b = aVar.f16482b;
            obj4.d = obj5;
            obj4.f45456f = new ArrayList();
            obj4.f45455e = r.u(arrayList);
            int i11 = aVar2.b(activity, obj4).f45457a;
            if (i11 != 0) {
                StringBuilder sb3 = new StringBuilder("Billing: Launch Error: ");
                sb3.append(i11);
                sb3.append(", ");
                sb3.append(encodeToString);
                sb3.append(", ");
                org.telegram.ui.th.v(bytesToHex3, sb3);
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
                return j7.l1.m(j10, ',', new StringBuilder("XTR "));
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
