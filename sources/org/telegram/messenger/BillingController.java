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
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ig0;

public class BillingController implements n2.n, n2.c {
    public static final n2.o PREMIUM_PRODUCT;
    public static n2.l PREMIUM_PRODUCT_DETAILS = null;
    public static final String PREMIUM_PRODUCT_ID = "telegram_premium";
    public static boolean billingClientEmpty;
    private static NumberFormat currencyInstance;
    private static NumberFormat currencyInstanceRounded;
    private static BillingController instance;
    private final n2.a billingClient;
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
        void onProductDetailsResponse(n2.g gVar, List<n2.l> list);
    }

    static {
        c9.b bVar = new c9.b();
        bVar.f2567c = "subs";
        bVar.f2566b = "telegram_premium";
        PREMIUM_PRODUCT = bVar.a();
    }

    private BillingController(Context context) {
        n2.a xVar;
        androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(context);
        fVar.f1348a = new w9.d(15);
        fVar.f1349b = this;
        if (context == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (((BillingController) fVar.f1349b) == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (((w9.d) fVar.f1348a) == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        ((w9.d) fVar.f1348a).getClass();
        if (((BillingController) fVar.f1349b) != null) {
            w9.d dVar = (w9.d) fVar.f1348a;
            BillingController billingController = (BillingController) fVar.f1349b;
            xVar = fVar.a() ? new n2.x(dVar, context, billingController, fVar) : new n2.b(dVar, context, billingController, fVar);
        } else {
            w9.d dVar2 = (w9.d) fVar.f1348a;
            xVar = fVar.a() ? new n2.x(dVar2, context, fVar) : new n2.b(dVar2, context, fVar);
        }
        this.billingClient = xVar;
    }

    public static BillingController getInstance() {
        if (instance == null) {
            instance = new BillingController(ApplicationLoader.applicationContext);
        }
        return instance;
    }

    public static String getResponseCodeString(int i10) {
        if (i10 == 12) {
            return "NETWORK_ERROR";
        }
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

    public static void lambda$consumeGiftPurchase$12(TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Purchase purchase, Runnable runnable, n2.g gVar, String str) {
        StringBuilder sb2 = new StringBuilder("BillingController consumeGiftPurchase ");
        sb2.append(inputStorePaymentPurpose);
        sb2.append(" ");
        sb2.append(purchase.a());
        sb2.append(" ");
        sb2.append(purchase.c());
        sb2.append(" done: ");
        int i10 = gVar.f18147a;
        sb2.append(i10 == 0 ? "OK" : Integer.valueOf(i10));
        sb2.append(" ");
        org.telegram.ui.Cells.pa.v(gVar.f18149c, sb2);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$launchBillingFlow$1(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, n2.e eVar) {
        launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, eVar, true);
    }

    public static void lambda$launchBillingFlow$2(Purchase purchase, List list, String str, AtomicInteger atomicInteger, Runnable runnable, n2.g gVar, String str2) {
        if (gVar.f18147a == 0) {
            FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.c() + ": OK");
            list.add(str);
            if (atomicInteger.get() == list.size()) {
                runnable.run();
                return;
            }
            return;
        }
        FileLog.d("BillingController.launchBillingFlow, consumed " + purchase.c() + ": " + gVar.f18147a + " " + gVar.f18149c);
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

    public void lambda$launchBillingFlow$4(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, n2.e eVar, n2.g gVar, List list2) {
        if (gVar.f18147a != 0) {
            StringBuilder sb2 = new StringBuilder("BillingController.launchBillingFlow, checked consumables: ");
            sb2.append(gVar.f18147a);
            sb2.append(" ");
            org.telegram.ui.Cells.pa.v(gVar.f18149c, sb2);
            launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, eVar, false);
            return;
        }
        FileLog.d("BillingController.launchBillingFlow, checked consumables: OK");
        b0 b0Var = new b0(this, activity, accountInstance, inputStorePaymentPurpose, list, eVar, 0);
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            final Purchase purchase = (Purchase) it.next();
            if (purchase.f2935c.optBoolean("acknowledged", true)) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    final String str = ((n2.d) it2.next()).f18134a.f18163c;
                    if (purchase.b().contains(str)) {
                        atomicInteger.incrementAndGet();
                        FileLog.d("BillingController.launchBillingFlow, consuming " + purchase.c());
                        n2.a aVar = this.billingClient;
                        String strC = purchase.c();
                        if (strC == null) {
                            throw new IllegalArgumentException("Purchase token must be set");
                        }
                        ec.a aVar2 = new ec.a();
                        aVar2.f5368b = strC;
                        final b0 b0Var2 = b0Var;
                        b0Var = b0Var2;
                        aVar.a(aVar2, new n2.h() {
                            @Override
                            public final void a(n2.g gVar2, String str2) {
                                BillingController.lambda$launchBillingFlow$2(purchase, arrayList, str, atomicInteger, b0Var2, gVar2, str2);
                            }
                        });
                        break;
                    }
                }
            } else {
                atomicInteger.incrementAndGet();
                j3.a aVarA = n2.g.a();
                aVarA.f12301a = 0;
                onPurchasesUpdatedInternal(aVarA.a(), Collections.singletonList(purchase), new f0(arrayList, (Object) atomicInteger, (Object) b0Var, 7));
            }
        }
        if (atomicInteger.get() == 0) {
            b0Var.run();
        }
    }

    public void lambda$onPurchasesUpdatedInternal$10(org.telegram.ui.ActionBar.b2[] b2VarArr, Purchase purchase, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, AccountInstance accountInstance, n2.g gVar, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new e0(b2VarArr, 0));
        this.requestingTokens.remove(purchase.c());
        int i10 = 1;
        if (!(tLObject instanceof TLRPC.Updates)) {
            StringBuilder sb2 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
            sb2.append(purchase.a());
            sb2.append(" purchase is purchased and failed to assign: ");
            org.telegram.ui.Cells.pa.v(tL_error == null ? null : tL_error.text, sb2);
            Runnable runnable2 = this.onCanceled;
            if (runnable2 != null) {
                runnable2.run();
                this.onCanceled = null;
            }
            int i11 = 2;
            if (tL_error != null) {
                NotificationCenter.getGlobalInstance().postNotificationNameOnUIThread(NotificationCenter.billingConfirmPurchaseError, tL_payments_assignPlayMarketTransaction, tL_error);
            }
            AndroidUtilities.runOnUIThread(new y(atomicInteger, atomicInteger2, runnable, i11));
            return;
        }
        FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased and now assigned");
        int i12 = 8;
        if (tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode) {
            ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove((TLRPC.Updates) tLObject, TL_update.TL_updateSentPhoneCode.class);
            int size = arrayListFindUpdatesAndRemove.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayListFindUpdatesAndRemove.get(i13);
                i13++;
                AndroidUtilities.runOnUIThread(new f0(accountInstance, tL_payments_assignPlayMarketTransaction, (TL_update.TL_updateSentPhoneCode) obj, i12));
            }
        }
        accountInstance.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        ArrayList arrayListB = purchase.b();
        int size2 = arrayListB.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayListB.get(i14);
            i14++;
            q0.a aVarRemove = this.resultListeners.remove((String) obj2);
            if (aVarRemove != null) {
                aVarRemove.accept(gVar);
            }
        }
        consumeGiftPurchase(purchase, tL_payments_assignPlayMarketTransaction.purpose, new y(atomicInteger, atomicInteger2, runnable, i10));
        JSONObject jSONObject = purchase.f2935c;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        String str = ((strOptString == null && strOptString2 == null) ? null : new c9.b(i10, strOptString, strOptString2)).f2567c;
        try {
            FileLog.d("BillingUtilities.clearPurpose: got {" + str + "}");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(str));
            gf.a aVarA = gf.a.a(serializedData, serializedData.readInt32(true));
            SerializedData serializedData2 = new SerializedData(8);
            serializedData2.writeInt64(aVarA.f6927b);
            String strBytesToHex = Utilities.bytesToHex(serializedData2.toByteArray());
            serializedData2.cleanup();
            FileLog.d("BillingUtilities.clearPurpose: id_hex = " + strBytesToHex);
            ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().remove(strBytesToHex).apply();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void lambda$onPurchasesUpdatedInternal$11(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable) {
        if (atomicInteger.incrementAndGet() != atomicInteger2.get() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public static void lambda$onPurchasesUpdatedInternal$5(org.telegram.ui.ActionBar.b2[] b2VarArr) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
        b2VarArr[0] = b2Var;
        b2Var.q(500L);
    }

    public static void lambda$onPurchasesUpdatedInternal$6(org.telegram.ui.ActionBar.b2[] b2VarArr) {
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
    }

    public static void lambda$onPurchasesUpdatedInternal$7(AccountInstance accountInstance, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction, TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode) {
        ig0 ig0Var = (ig0) LaunchActivity.N();
        if (ig0Var == null) {
            ig0Var = new ig0(accountInstance.getCurrentAccount());
            org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
            if (n2VarU != null) {
                n2VarU.presentFragment(ig0Var);
            }
        }
        ig0Var.q1(((TLRPC.TL_inputStorePaymentAuthCode) tL_payments_assignPlayMarketTransaction.purpose).phone_number, tL_updateSentPhoneCode.sent_code);
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
            queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new d0(this));
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void lambda$queryProductDetails$0(ProductDetailsResponseListenerLegacy productDetailsResponseListenerLegacy, n2.g gVar, n2.p pVar) {
        productDetailsResponseListenerLegacy.onProductDetailsResponse(gVar, pVar.f18170a);
    }

    public void onQueriedPremiumProductDetails(n2.g gVar, List<n2.l> list) {
        FileLog.d("Billing: Query product details finished " + gVar + ", " + list);
        if (gVar.f18147a != 0) {
            switchToInvoice();
            int i10 = this.triesLeft - 1;
            this.triesLeft = i10;
            if (i10 > 0) {
                AndroidUtilities.runOnUIThread(new z(this, 0), i10 == 2 ? 1000L : 10000L);
                return;
            }
            return;
        }
        for (n2.l lVar : list) {
            if (lVar.f18163c.equals("telegram_premium")) {
                PREMIUM_PRODUCT_DETAILS = lVar;
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

    public void addResultListener(String str, q0.a aVar) {
        this.resultListeners.put(str, aVar);
    }

    public void consumeGiftPurchase(Purchase purchase, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, Runnable runnable) {
        if ((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiftCode) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentPremiumGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentAuthCode)) {
            FileLog.d("BillingController consumeGiftPurchase " + inputStorePaymentPurpose + " " + purchase.a() + " " + purchase.c());
            n2.a aVar = this.billingClient;
            String strC = purchase.c();
            if (strC == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            ec.a aVar2 = new ec.a();
            aVar2.f5368b = strC;
            aVar.a(aVar2, new f(inputStorePaymentPurpose, purchase, runnable));
        }
    }

    public String formatCurrency(long j10, String str) {
        return formatCurrency(j10, str, getCurrencyExp(str));
    }

    public int getCurrencyExp(String str) {
        gf.b.a(this.currencyExpMap);
        return ((Integer) j$.util.Map.EL.getOrDefault(this.currencyExpMap, str, 0)).intValue();
    }

    public String getLastPremiumToken() {
        return this.lastPremiumToken;
    }

    public String getLastPremiumTransaction() {
        return this.lastPremiumTransaction;
    }

    public boolean isReady() {
        n2.b bVar = (n2.b) this.billingClient;
        bVar.getClass();
        return bVar.o();
    }

    public void launchBillingFlow(Activity activity, AccountInstance accountInstance, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List<n2.d> list) {
        launchBillingFlow(activity, accountInstance, inputStorePaymentPurpose, list, null, false);
    }

    @Override
    public void onBillingServiceDisconnected() {
        FileLog.d("Billing: Service disconnected");
        int i10 = this.isDisconnected ? 15000 : 5000;
        this.isDisconnected = true;
        AndroidUtilities.runOnUIThread(new z(this, 1), i10);
    }

    @Override
    public void onBillingSetupFinished(n2.g gVar) {
        FileLog.d("Billing: Setup finished with result " + gVar);
        if (gVar.f18147a != 0) {
            if (this.isDisconnected) {
                return;
            }
            switchToInvoice();
            return;
        }
        this.isDisconnected = false;
        this.triesLeft = 3;
        try {
            queryProductDetails(Collections.singletonList(PREMIUM_PRODUCT), new d0(this));
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        queryPurchases("inapp", new d0(this));
        queryPurchases("subs", new d0(this));
        if (this.setupListeners.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.setupListeners.size(); i10++) {
            AndroidUtilities.runOnUIThread(this.setupListeners.get(i10));
        }
        this.setupListeners.clear();
    }

    @Override
    public void onPurchasesUpdated(n2.g gVar, List<Purchase> list) {
        onPurchasesUpdatedInternal(gVar, list, null);
    }

    public void onPurchasesUpdatedInternal(n2.g gVar, List<Purchase> list, final Runnable runnable) {
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurposeB;
        AccountInstance accountInstance;
        q0.b bVar;
        Object obj;
        final n2.g gVar2 = gVar;
        FileLog.d("Billing: Purchases updated: " + gVar2 + ", " + list);
        int i10 = gVar2.f18147a;
        int i11 = 1;
        if (i10 != 0) {
            if (i10 == 1) {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
                tL_inputAppEvent.type = "premium.promo_screen_fail";
                tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new jh.m5(5));
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
            ArrayList arrayListB = purchase.b();
            JSONObject jSONObject = purchase.f2935c;
            if (arrayListB.contains("telegram_premium")) {
                this.lastPremiumTransaction = purchase.a();
                this.lastPremiumToken = purchase.c();
            }
            if (this.requestingTokens.contains(purchase.c())) {
                FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is already requesting...");
            } else if (jSONObject.optInt("purchaseState", i11) != 4) {
                String strOptString = jSONObject.optString("obfuscatedAccountId");
                String strOptString2 = jSONObject.optString("obfuscatedProfileId");
                c9.b bVar2 = (strOptString == null && strOptString2 == null) ? null : new c9.b(1, strOptString, strOptString2);
                if (bVar2 == null) {
                    FileLog.d("Billing: Extract payload. No AccountIdentifiers");
                } else {
                    String str = bVar2.f2566b;
                    String str2 = bVar2.f2567c;
                    if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
                        FileLog.d("Billing: Extract payload. Empty AccountIdentifiers");
                    } else {
                        try {
                            inputStorePaymentPurposeB = gf.b.b(str2);
                        } catch (Exception e9) {
                            FileLog.e("Billing: Extract payload, failed to get purpose", e9);
                            inputStorePaymentPurposeB = null;
                        }
                        try {
                            String str3 = new String(Base64.decode(str, 0), o8.d.f19363c);
                            FileLog.d("Billing: Extract payload. obfuscatedAccountIdString=".concat(str3));
                            if (str3.startsWith("account-")) {
                                accountInstance = AccountInstance.getInstance(Integer.parseInt(str3.substring(8)));
                            } else {
                                long j10 = Long.parseLong(str3);
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= 4) {
                                        accountInstance = null;
                                        break;
                                    }
                                    AccountInstance accountInstance2 = AccountInstance.getInstance(i12);
                                    if (accountInstance2.getUserConfig().getClientUserId() == j10) {
                                        accountInstance = accountInstance2;
                                        break;
                                    }
                                    i12++;
                                }
                                if (accountInstance == null) {
                                    FileLog.d("Billing: Extract payload. AccountInstance not found, accountId=" + j10);
                                }
                                if (bVar != null) {
                                    obj = bVar.f46057a;
                                    Object obj2 = bVar.f46058b;
                                    if (obj != null || obj2 == null) {
                                        FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                                    } else if (jSONObject.optBoolean("acknowledged", true)) {
                                        FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased and acknowledged: consuming");
                                        atomicInteger.incrementAndGet();
                                        consumeGiftPurchase(purchase, (TLRPC.InputStorePaymentPurpose) obj2, new y(atomicInteger2, atomicInteger, runnable, 0));
                                    } else {
                                        StringBuilder sb2 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                                        sb2.append(purchase.a());
                                        sb2.append(" purchase is purchased and not acknowledged: assigning (accountId=");
                                        final AccountInstance accountInstance3 = (AccountInstance) obj;
                                        sb2.append(accountInstance3.getCurrentAccount());
                                        sb2.append(") (purpose=");
                                        sb2.append(obj2);
                                        sb2.append(")");
                                        FileLog.d(sb2.toString());
                                        this.requestingTokens.add(purchase.c());
                                        final TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                        tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                        tL_dataJSON.data = purchase.f2933a;
                                        tL_payments_assignPlayMarketTransaction.purpose = (TLRPC.InputStorePaymentPurpose) obj2;
                                        final org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
                                        AndroidUtilities.runOnUIThread(new e0(b2VarArr, 1));
                                        atomicInteger.incrementAndGet();
                                        accountInstance3.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new RequestDelegate() {
                                            @Override
                                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                this.f22083a.lambda$onPurchasesUpdatedInternal$10(b2VarArr, purchase, tL_payments_assignPlayMarketTransaction, accountInstance3, gVar2, atomicInteger2, atomicInteger, runnable, tLObject, tL_error);
                                            }
                                        }, tL_payments_assignPlayMarketTransaction.purpose instanceof TLRPC.TL_inputStorePaymentAuthCode ? 65608 : 65600);
                                    }
                                } else {
                                    FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                                }
                            }
                            bVar = new q0.b(accountInstance, inputStorePaymentPurposeB);
                        } catch (Exception e10) {
                            FileLog.e("Billing: Extract Payload", e10);
                        }
                        if (bVar != null) {
                            obj = bVar.f46057a;
                            Object obj3 = bVar.f46058b;
                            if (obj != null) {
                                FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                            } else {
                                FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                            }
                        } else {
                            FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                        }
                    }
                }
                bVar = null;
                if (bVar != null) {
                    obj = bVar.f46057a;
                    Object obj4 = bVar.f46058b;
                    if (obj != null) {
                        FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                    } else {
                        FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                    }
                } else {
                    FileLog.d("BillingController.onPurchasesUpdatedInternal: " + purchase.a() + " purchase is purchased, but failed to extract saved payload");
                }
            } else {
                StringBuilder sb3 = new StringBuilder("BillingController.onPurchasesUpdatedInternal: ");
                sb3.append(purchase.a());
                sb3.append(" purchase is (state=");
                sb3.append(jSONObject.optInt("purchaseState", 1) != 4 ? 1 : 2);
                sb3.append("), (isAcknowledged=");
                sb3.append(jSONObject.optBoolean("acknowledged", true));
                sb3.append(")");
                FileLog.d(sb3.toString());
            }
            gVar2 = gVar;
            i11 = 1;
        }
        if (atomicInteger.get() != 0 || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void queryProductDetails(List<n2.o> list, ProductDetailsResponseListenerLegacy productDetailsResponseListenerLegacy) {
        if (!isReady()) {
            throw new IllegalStateException("Billing: Controller should be ready for this call!");
        }
        n2.a aVar = this.billingClient;
        ga.c cVar = new ga.c(27, false);
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        for (n2.o oVar : list) {
            if (!"play_pass_subs".equals(oVar.f18169b)) {
                hashSet.add(oVar.f18169b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        r rVarU = r.u(list);
        cVar.f6834b = rVarU;
        if (rVarU == null) {
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }
        aVar.c(new n1.d(cVar), new d(productDetailsResponseListenerLegacy, 1));
    }

    public void queryPurchases(String str, n2.m mVar) {
        n2.a aVar = this.billingClient;
        if (str == null) {
            throw new IllegalArgumentException("Product type must be set");
        }
        n2.b bVar = (n2.b) aVar;
        bVar.getClass();
        if (n2.b.f(new n2.r(bVar, mVar, str), 30000L, new a9.o(bVar, mVar, false, 27), bVar.r(), bVar.e()) == null) {
            n2.g gVarU = bVar.u();
            bVar.y(25, 9, gVarU);
            com.google.android.gms.internal.play_billing.p pVar = r.f4109b;
            mVar.c(gVarU, com.google.android.gms.internal.play_billing.v.f4136e);
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
            gf.b.a(this.currencyExpMap);
            if (BuildVars.useInvoiceBilling()) {
                return;
            }
            this.billingClient.d(this);
        } catch (Exception e9) {
            FileLog.e(e9);
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

    public String formatCurrency(long j10, String str, int i10) {
        return formatCurrency(j10, str, i10, false);
    }

    public void launchBillingFlow(final Activity activity, final AccountInstance accountInstance, final TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, final List<n2.d> list, final n2.e eVar, boolean z10) {
        String strEncodeToString;
        if (!isReady() || activity == null) {
            return;
        }
        if (((inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentGiftPremium) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) || (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) && !z10) {
            FileLog.d("BillingController.launchBillingFlow, checking consumables");
            queryPurchases("inapp", new n2.m() {
                @Override
                public final void c(n2.g gVar, List list2) {
                    this.f19649a.lambda$launchBillingFlow$4(activity, accountInstance, inputStorePaymentPurpose, list, eVar, gVar, list2);
                }
            });
            return;
        }
        if (z10) {
            FileLog.d("BillingController.launchBillingFlow, consumables checked, launching flow...");
        }
        boolean zIsClientActivated = accountInstance.getUserConfig().isClientActivated();
        boolean z11 = false;
        if (zIsClientActivated) {
            strEncodeToString = Base64.encodeToString(String.valueOf(accountInstance.getUserConfig().getClientUserId()).getBytes(o8.d.f19363c), 0);
        } else {
            strEncodeToString = Base64.encodeToString(("account-" + accountInstance.getCurrentAccount()).getBytes(o8.d.f19363c), 0);
        }
        long jNextLong = Utilities.random.nextLong();
        FileLog.d("BillingUtilities.savePurpose id=" + jNextLong + " paymentPurpose=" + inputStorePaymentPurpose);
        SerializedData serializedData = new SerializedData(8);
        serializedData.writeInt64(jNextLong);
        String strBytesToHex = Utilities.bytesToHex(serializedData.toByteArray());
        serializedData.cleanup();
        FileLog.d("BillingUtilities.savePurpose id_hex=" + strBytesToHex + " paymentPurpose=" + inputStorePaymentPurpose);
        gf.a aVar = new gf.a();
        aVar.f6927b = jNextLong;
        aVar.f6926a = 1;
        aVar.f6928c = inputStorePaymentPurpose;
        SerializedData serializedData2 = new SerializedData(aVar.getObjectSize());
        aVar.serializeToStream(serializedData2);
        String strBytesToHex2 = Utilities.bytesToHex(serializedData2.toByteArray());
        serializedData2.cleanup();
        if (aVar.getObjectSize() > 28) {
            FileLog.d("BillingUtilities.savePurpose: sending short version, original size is " + aVar.getObjectSize() + " bytes");
            aVar.f6926a = 0;
            aVar.f6928c = null;
        }
        SerializedData serializedData3 = new SerializedData(aVar.getObjectSize());
        aVar.serializeToStream(serializedData3);
        String strBytesToHex3 = Utilities.bytesToHex(serializedData3.toByteArray());
        serializedData3.cleanup();
        ApplicationLoader.applicationContext.getSharedPreferences("purchases", 0).edit().putString(strBytesToHex, strBytesToHex2).apply();
        FileLog.d("BillingUtilities.savePurpose: saved {" + strBytesToHex2 + "} under " + strBytesToHex);
        StringBuilder sb2 = new StringBuilder("BillingUtilities.savePurpose: but sending {");
        sb2.append(strBytesToHex3);
        sb2.append("}");
        FileLog.d(sb2.toString());
        m.a aVar2 = new m.a();
        aVar2.f17258b = 0;
        aVar2.f17257a = true;
        ArrayList arrayList = new ArrayList(list);
        if (eVar != null) {
            aVar2 = new m.a();
            aVar2.f17259c = eVar.f18140a;
            aVar2.f17258b = eVar.f18141b;
        }
        n2.a aVar3 = this.billingClient;
        boolean zIsEmpty = arrayList.isEmpty();
        if (zIsEmpty) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((n2.d) obj) == null) {
                throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
            }
        }
        n2.f fVar = new n2.f();
        if (!zIsEmpty && !((n2.d) arrayList.get(0)).f18134a.f18162b.optString("packageName").isEmpty()) {
            z11 = true;
        }
        fVar.f18142a = z11;
        fVar.f18143b = strEncodeToString;
        fVar.f18144c = strBytesToHex3;
        boolean z12 = true;
        if (TextUtils.isEmpty((String) aVar2.f17259c) && TextUtils.isEmpty(null)) {
            z12 = false;
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(null);
        if (z12 && !zIsEmpty2) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!aVar2.f17257a && !z12 && zIsEmpty2) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        n2.e eVar2 = new n2.e();
        eVar2.f18140a = (String) aVar2.f17259c;
        eVar2.f18141b = aVar2.f17258b;
        fVar.d = eVar2;
        fVar.f18146f = new ArrayList();
        fVar.f18145e = r.u(arrayList);
        int i11 = aVar3.b(activity, fVar).f18147a;
        if (i11 != 0) {
            StringBuilder sb3 = new StringBuilder("Billing: Launch Error: ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(strEncodeToString);
            sb3.append(", ");
            org.telegram.ui.Cells.pa.v(strBytesToHex3, sb3);
        }
    }

    public String formatCurrency(long j10, String str, int i10, boolean z10) {
        if (str != null && !str.isEmpty()) {
            if ("TON".equalsIgnoreCase(str)) {
                return "TON " + (j10 / 1.0E9d);
            }
            if ("XTR".equalsIgnoreCase(str)) {
                return i0.a.m(j10, ',', new StringBuilder("XTR "));
            }
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
        return String.valueOf(j10);
    }
}
