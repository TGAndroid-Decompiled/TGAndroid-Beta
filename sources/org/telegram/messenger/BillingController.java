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
import org.telegram.ui.og0;
import org.telegram.ui.zy;
public class BillingController implements p2.o, p2.c {
    public static final p2.p PREMIUM_PRODUCT;
    public static p2.m PREMIUM_PRODUCT_DETAILS = null;
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
        void onProductDetailsResponse(p2.h hVar, List<p2.m> list);
    }

    static {
        b6.h hVar = new b6.h();
        hVar.f1729c = "subs";
        hVar.f1728b = "telegram_premium";
        PREMIUM_PRODUCT = hVar.a();
    }

    private BillingController(Context context) {
        p2.a bVar;
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(context);
        fVar.f824a = new cb.b(18);
        fVar.f825b = this;
        if (context != null) {
            if (((BillingController) fVar.f825b) != null) {
                if (((cb.b) fVar.f824a) != null) {
                    ((cb.b) fVar.f824a).getClass();
                    if (((BillingController) fVar.f825b) != null) {
                        cb.b bVar2 = (cb.b) fVar.f824a;
                        BillingController billingController = (BillingController) fVar.f825b;
                        if (fVar.a()) {
                            bVar = new p2.x(bVar2, context, billingController, fVar);
                        } else {
                            bVar = new p2.b(bVar2, context, billingController, fVar);
                        }
                    } else {
                        cb.b bVar3 = (cb.b) fVar.f824a;
                        if (fVar.a()) {
                            bVar = new p2.x(bVar3, context, fVar);
                        } else {
                            bVar = new p2.b(bVar3, context, fVar);
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

    public static void lambda$consumeGiftPurchase$12(TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Purchase purchase, Runnable runnable, p2.h hVar, String str) {
        Object valueOf;
        StringBuilder sb = new StringBuilder("BillingController consumeGiftPurchase ");
        sb.append(inputStorePaymentPurpose);
        sb.append(" ");
        sb.append(purchase.a());
        sb.append(" ");
        sb.append(purchase.c());
        sb.append(" done: ");
        int i10 = hVar.f44145a;
        if (i10 == 0) {
            valueOf = "OK";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb.append(valueOf);
        sb.append(" ");
        org.telegram.ui.yh.v(hVar.f44147c, sb);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$launchBillingFlow$1(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, p2.e eVar) {
        launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, eVar, true);
    }

    public static void lambda$launchBillingFlow$2(Purchase purchase, List list, String str, AtomicInteger atomicInteger, Runnable runnable, p2.h hVar, String str2) {
        if (hVar.f44145a == 0) {
            FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.c() + ": OK");
            list.add(str);
            if (atomicInteger.get() == list.size()) {
                runnable.run();
                return;
            }
            return;
        }
        FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.c() + ": " + hVar.f44145a + " " + hVar.f44147c);
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

    public void lambda$launchBillingFlow$4(android.app.Activity r9, org.telegram.messenger.AccountInstance r10, org.telegram.tgnet.TLRPC.InputStorePaymentPurpose r11, java.util.List r12, p2.e r13, p2.h r14, java.util.List r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.BillingController.lambda$launchBillingFlow$4(android.app.Activity, org.telegram.messenger.AccountInstance, org.telegram.tgnet.TLRPC$InputStorePaymentPurpose, java.util.List, p2.e, p2.h, java.util.List):void");
    }

    public void lambda$onPurchasesUpdatedInternal$10(org.telegram.ui.ActionBar.d2[] d2VarArr, Purchase purchase, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, AccountInstance accountInstance, p2.h hVar, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        int i10;
        b6.h hVar2;
        AndroidUtilities.runOnUIThread(new f0(d2VarArr, 0));
        this.requestingTokens.remove(purchase.c());
        if (tLObject instanceof TLRPC.Updates) {
            FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased and now assigned");
            if (tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode) {
                ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove((TLRPC.Updates) tLObject, TL_update.TL_updateSentPhoneCode.class);
                int size = findUpdatesAndRemove.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = findUpdatesAndRemove.get(i11);
                    i11++;
                    AndroidUtilities.runOnUIThread(new g0(accountInstance, tL_payments_assignPlayMarketTransaction, (TL_update.TL_updateSentPhoneCode) obj, 9));
                }
            }
            accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
            ArrayList b10 = purchase.b();
            int size2 = b10.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = b10.get(i12);
                i12++;
                q0.a remove = this.resultListeners.remove((String) obj2);
                if (remove != null) {
                    remove.accept(hVar);
                }
            }
            consumeGiftPurchase(purchase, tL_payments_assignPlayMarketTransaction.purpose, new y(atomicInteger, atomicInteger2, runnable, 1));
            JSONObject jSONObject = purchase.f2541c;
            String optString = jSONObject.optString("obfuscatedAccountId");
            String optString2 = jSONObject.optString("obfuscatedProfileId");
            if (optString == null && optString2 == null) {
                hVar2 = null;
            } else {
                hVar2 = new b6.h(2, optString, optString2);
            }
            String str2 = hVar2.f1729c;
            try {
                FileLog.d("BillingUtilities.clearPurpose: got {" + str2 + "}");
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str2));
                lf.a a2 = lf.a.a(serializedData, serializedData.readInt32(true));
                SerializedData serializedData2 = new SerializedData(8);
                serializedData2.writeInt64(a2.f12384b);
                String bytesToHex = Utilities.bytesToHex(serializedData2.toByteArray());
                serializedData2.cleanup();
                FileLog.d("BillingUtilities.clearPurpose: id_hex = " + bytesToHex);
                ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().remove(bytesToHex).apply();
                return;
            } catch (Exception e6) {
                FileLog.e(e6);
                return;
            }
        }
        StringBuilder sb = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
        sb.append(purchase.a());
        sb.append(" purchase is purchased and failed to assign: ");
        if (tL_error == null) {
            str = null;
        } else {
            str = tL_error.text;
        }
        org.telegram.ui.yh.v(str, sb);
        Runnable runnable2 = this.onCanceled;
        if (runnable2 != null) {
            runnable2.run();
            this.onCanceled = null;
        }
        if (tL_error != null) {
            i10 = 2;
            NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingConfirmPurchaseError, tL_payments_assignPlayMarketTransaction, tL_error);
        } else {
            i10 = 2;
        }
        AndroidUtilities.runOnUIThread(new y(atomicInteger, atomicInteger2, runnable, i10));
    }

    public static void lambda$onPurchasesUpdatedInternal$11(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable) {
        if (atomicInteger.incrementAndGet() == atomicInteger2.get() && runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$onPurchasesUpdatedInternal$5(org.telegram.ui.ActionBar.d2[] d2VarArr) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ApplicationLoader.applicationContext, 3, null);
        d2VarArr[0] = d2Var;
        d2Var.q(500L);
    }

    public static void lambda$onPurchasesUpdatedInternal$6(org.telegram.ui.ActionBar.d2[] d2VarArr) {
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            d2Var.dismiss();
        }
    }

    public static void lambda$onPurchasesUpdatedInternal$7(AccountInstance accountInstance, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode) {
        og0 og0Var = (og0) LaunchActivity.N();
        if (og0Var == null) {
            og0Var = new og0(accountInstance.getCurrentAccount());
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                U.presentFragment(og0Var);
            }
        }
        og0Var.q1(((TLRPC.TL_inputStorePaymentAuthCode) tL_payments_assignPlayMarketTransaction.purpose).phone_number, tL_updateSentPhoneCode.sent_code);
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
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public static void lambda$queryProductDetails$0(ProductDetailsResponseListenerLegacy productDetailsResponseListenerLegacy, p2.h hVar, p2.q qVar) {
        productDetailsResponseListenerLegacy.onProductDetailsResponse(hVar, qVar.f44168a);
    }

    public void onQueriedPremiumProductDetails(p2.h hVar, List<p2.m> list) {
        long j10;
        FileLog.d("Billing: Query product details finished " + hVar + ", " + list);
        if (hVar.f44145a == 0) {
            for (p2.m mVar : list) {
                if (mVar.f44161c.equals("telegram_premium")) {
                    PREMIUM_PRODUCT_DETAILS = mVar;
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
            com.google.android.gms.internal.clearcut.e eVar = new com.google.android.gms.internal.clearcut.e();
            eVar.f3277b = c3;
            aVar.a(eVar, new f(inputStorePaymentPurpose, purchase, runnable));
            return;
        }
        throw new IllegalArgumentException("Purchase token must be set");
    }

    public String formatCurrency(long j10, String str) {
        return formatCurrency(j10, str, getCurrencyExp(str));
    }

    public int getCurrencyExp(String str) {
        lf.b.a(this.currencyExpMap);
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
    public void onBillingSetupFinished(p2.h hVar) {
        FileLog.d("Billing: Setup finished with result " + hVar);
        if (hVar.f44145a == 0) {
            this.isDisconnected = false;
            this.triesLeft = 3;
            try {
                queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new e0(this));
            } catch (Exception e6) {
                FileLog.e(e6);
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
    public void onPurchasesUpdated(p2.h hVar, List<Purchase> list) {
        onPurchasesUpdatedInternal(hVar, list, null);
    }

    public void onPurchasesUpdatedInternal(p2.h r20, java.util.List<com.android.billingclient.api.Purchase> r21, final java.lang.Runnable r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.BillingController.onPurchasesUpdatedInternal(p2.h, java.util.List, java.lang.Runnable):void");
    }

    public void queryProductDetails(List<p2.p> list, ProductDetailsResponseListenerLegacy productDetailsResponseListenerLegacy) {
        if (isReady()) {
            p2.a aVar = this.billingClient;
            oh.h4 h4Var = new oh.h4(7, false);
            if (list != null && !list.isEmpty()) {
                HashSet hashSet = new HashSet();
                for (p2.p pVar : list) {
                    if (!"play_pass_subs".equals(pVar.f44167b)) {
                        hashSet.add(pVar.f44167b);
                    }
                }
                if (hashSet.size() <= 1) {
                    r u10 = r.u(list);
                    h4Var.f17180b = u10;
                    if (u10 != null) {
                        aVar.c(new org.telegram.ui.web.e0(h4Var), new d0(productDetailsResponseListenerLegacy, 0));
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

    public void queryPurchases(String str, p2.n nVar) {
        p2.a aVar = this.billingClient;
        if (str != null) {
            p2.b bVar = (p2.b) aVar;
            bVar.getClass();
            if (p2.b.f(new p2.s(bVar, nVar, str), 30000L, new zy(bVar, nVar, false, 4), bVar.r(), bVar.e()) == null) {
                p2.h u10 = bVar.u();
                bVar.y(25, 9, u10);
                com.google.android.gms.internal.play_billing.p pVar = r.f3577b;
                nVar.b(u10, com.google.android.gms.internal.play_billing.v.f3604e);
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
                lf.b.a(this.currencyExpMap);
                if (!BuildVars.useInvoiceBilling()) {
                    this.billingClient.d(this);
                }
            } catch (Exception e6) {
                FileLog.e(e6);
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

    public void launchBillingFlow(final Activity activity, final AccountInstance accountInstance, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final List<p2.d> list, final p2.e eVar, boolean z4) {
        String encodeToString;
        if (!isReady() || activity == null) {
            return;
        }
        if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z4) {
            FileLog.d("BillingController.launchBillingFlow, checking consumables");
            queryPurchases("inapp", new p2.n() {
                @Override
                public final void b(p2.h hVar, List list2) {
                    BillingController.this.lambda$launchBillingFlow$4(activity, accountInstance, inputStorePaymentPurpose, list, eVar, hVar, list2);
                }
            });
            return;
        }
        if (z4) {
            FileLog.d("BillingController.launchBillingFlow, consumables checked, launching flow...");
        }
        boolean isClientActivated = accountInstance.getUserConfig().isClientActivated();
        boolean z10 = false;
        if (isClientActivated) {
            encodeToString = Base64.encodeToString(String.valueOf(accountInstance.getUserConfig().getClientUserId()).getBytes(r8.d.f46738c), 0);
        } else {
            encodeToString = Base64.encodeToString(("account-" + accountInstance.getCurrentAccount()).getBytes(r8.d.f46738c), 0);
        }
        long nextLong = Utilities.random.nextLong();
        FileLog.d("BillingUtilities.savePurpose id=" + nextLong + " paymentPurpose=" + inputStorePaymentPurpose);
        SerializedData serializedData = new SerializedData(8);
        serializedData.writeInt64(nextLong);
        String bytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
        serializedData.cleanup();
        FileLog.d("BillingUtilities.savePurpose id_hex=" + bytesToHex + " paymentPurpose=" + inputStorePaymentPurpose);
        ?? tLObject = new TLObject();
        tLObject.f12384b = nextLong;
        tLObject.f12383a = 1;
        tLObject.f12385c = inputStorePaymentPurpose;
        SerializedData serializedData2 = new SerializedData(tLObject.getObjectSize());
        tLObject.serializeToStream(serializedData2);
        String bytesToHex2 = Utilities.bytesToHex(serializedData2.toByteArray());
        serializedData2.cleanup();
        if (tLObject.getObjectSize() > 28) {
            FileLog.d("BillingUtilities.savePurpose: sending short version, original size is " + tLObject.getObjectSize() + " bytes");
            tLObject.f12383a = 0;
            tLObject.f12385c = null;
        }
        SerializedData serializedData3 = new SerializedData(tLObject.getObjectSize());
        tLObject.serializeToStream(serializedData3);
        String bytesToHex3 = Utilities.bytesToHex(serializedData3.toByteArray());
        serializedData3.cleanup();
        ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().putString(bytesToHex, bytesToHex2).apply();
        FileLog.d("BillingUtilities.savePurpose: saved {" + bytesToHex2 + "} under " + bytesToHex);
        StringBuilder sb = new StringBuilder("BillingUtilities.savePurpose: but sending {");
        sb.append(bytesToHex3);
        sb.append("}");
        FileLog.d(sb.toString());
        ?? obj = new Object();
        obj.f1839b = 0;
        obj.f1838a = true;
        ArrayList arrayList = new ArrayList(list);
        b7.l0 l0Var = obj;
        if (eVar != null) {
            ?? obj2 = new Object();
            obj2.f1840c = eVar.f44135a;
            obj2.f1839b = eVar.f44136b;
            l0Var = obj2;
        }
        p2.a aVar = this.billingClient;
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
            if (!isEmpty && !((p2.d) arrayList.get(0)).f44133a.f44160b.optString("packageName").isEmpty()) {
                z10 = true;
            }
            obj4.f44137a = z10;
            obj4.f44138b = encodeToString;
            obj4.f44139c = bytesToHex3;
            boolean z11 = true;
            if (TextUtils.isEmpty((String) l0Var.f1840c) && TextUtils.isEmpty(null)) {
                z11 = false;
            }
            boolean isEmpty2 = TextUtils.isEmpty(null);
            if (z11 && !isEmpty2) {
                throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            }
            if (!l0Var.f1838a && !z11 && isEmpty2) {
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }
            ?? obj5 = new Object();
            obj5.f44135a = (String) l0Var.f1840c;
            obj5.f44136b = l0Var.f1839b;
            obj4.d = obj5;
            obj4.f44141f = new ArrayList();
            obj4.f44140e = r.u(arrayList);
            int i11 = aVar.b(activity, obj4).f44145a;
            if (i11 != 0) {
                StringBuilder sb2 = new StringBuilder("Billing: Launch Error: ");
                sb2.append(i11);
                sb2.append(", ");
                sb2.append(encodeToString);
                sb2.append(", ");
                org.telegram.ui.yh.v(bytesToHex3, sb2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Details of the products must be provided.");
    }

    public String formatCurrency(long j10, String str, int i10, boolean z4) {
        if (str != null && !str.isEmpty()) {
            if ("TON".equalsIgnoreCase(str)) {
                return "TON " + (j10 / 1.0E9d);
            } else if ("XTR".equalsIgnoreCase(str)) {
                return l.d.l(j10, ',', new StringBuilder("XTR "));
            } else {
                Currency currency = Currency.getInstance(str);
                if (currency != null) {
                    if (currencyInstance == null) {
                        currencyInstance = NumberFormat.getCurrencyInstance();
                    }
                    currencyInstance.setCurrency(currency);
                    if (z4) {
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
