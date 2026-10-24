package ai;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.m51;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.hb0;
import org.telegram.ui.ob0;
public final class m8 implements Runnable {
    public final int f1817a;
    public final Object f1818b;
    public final Object f1819c;
    public final Object d;
    public final Object e;
    public final Object f1820f;
    public final Object h;
    public final Object f1821n;
    public final Object f1822r;

    public m8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.f1817a = i10;
        this.f1818b = obj;
        this.f1819c = obj2;
        this.d = obj3;
        this.f1821n = obj4;
        this.e = obj5;
        this.f1822r = obj6;
        this.f1820f = obj7;
        this.h = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        String str3;
        switch (this.f1817a) {
            case 0:
                TLObject tLObject = (TLObject) this.f1818b;
                c5.p pVar = (c5.p) this.f1819c;
                c5.i iVar = (c5.i) this.d;
                org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.f1821n;
                Activity activity = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f1822r;
                List list = (List) this.f1820f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(pVar.f4780c, new c8(1, iVar, r1Var));
                    BillingController.getInstance().setOnCanceled(new e8(r1Var, 2));
                    BillingController billingController = BillingController.getInstance();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    n4.s sVar = new n4.s(9, false);
                    sVar.G((c5.p) list.get(0));
                    billingController.launchBillingFlow(activity, accountInstance, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(sVar.k()));
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    r1Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    if (tL_error != null) {
                        str = tL_error.text;
                    } else {
                        str = "SERVER_ERROR";
                    }
                    r1Var.run(bool, str);
                    return;
                }
            case 1:
                TLObject tLObject2 = (TLObject) this.f1818b;
                c5.p pVar2 = (c5.p) this.f1819c;
                c5.i iVar2 = (c5.i) this.d;
                uc ucVar = (uc) this.f1821n;
                Activity activity2 = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.f1822r;
                List list2 = (List) this.f1820f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(pVar2.f4780c, new c8(0, iVar2, ucVar));
                    BillingController.getInstance().setOnCanceled(new h8(ucVar, 0));
                    BillingController billingController2 = BillingController.getInstance();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    n4.s sVar2 = new n4.s(9, false);
                    sVar2.G((c5.p) list2.get(0));
                    billingController2.launchBillingFlow(activity2, accountInstance2, tL_inputStorePaymentStarsGift, Collections.singletonList(sVar2.k()));
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    ucVar.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error2 != null) {
                        str2 = tL_error2.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    ucVar.run(bool2, str2);
                    return;
                }
            case 2:
                String[] strArr = (String[]) this.f1818b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f1819c;
                ei.d dVar = (ei.d) this.d;
                boolean[] zArr = (boolean[]) this.f1821n;
                hg.o oVar = (hg.o) this.e;
                ImageView imageView = (ImageView) this.f1822r;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f1820f;
                int[] iArr = (int[]) this.h;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    return;
                }
                boolean z10 = zArr[0];
                String str4 = strArr[0];
                oVar.run(str4, new ki.c(str4, strArr, imageView, g6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                return;
            case 3:
                ((MessagesStorage) this.f1818b).lambda$loadUnreadMessages$76((a0.h) this.f1819c, (ArrayList) this.d, (ArrayList) this.f1821n, (ArrayList) this.e, (ArrayList) this.f1822r, (ArrayList) this.f1820f, (HashMap) this.h);
                return;
            case 4:
                String str5 = (String) this.f1821n;
                String str6 = (String) this.e;
                String str7 = (String) this.f1822r;
                String str8 = (String) this.f1820f;
                org.telegram.ui.Wallet.e2 e2Var = ((org.telegram.ui.Wallet.l0) this.f1819c).f34747g;
                hb0 hb0Var = new hb0((ob0) this.f1818b, (String) this.h, 1);
                e2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = (String) this.d;
                tonconnectcreatesession.manifest_url = str5;
                e2Var.f34434f.sendRequestTyped(tonconnectcreatesession, new Object(), new org.telegram.ui.Wallet.h1(e2Var, hb0Var, str6, str5, str7, str8));
                return;
            case 5:
                UserInfoActivity.Y((UserInfoActivity) this.f1819c, (TLRPC.TL_error) this.h, (TLObject) this.f1818b, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f1821n, (TLObject) this.e, (int[]) this.f1822r, (ArrayList) this.f1820f);
                return;
            case 6:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.f1818b;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f1819c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.f1821n;
                byte[] bArr = (byte[]) this.e;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.f1822r;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f1820f;
                org.telegram.ui.Wallet.w wVar = (org.telegram.ui.Wallet.w) this.h;
                e2Var2.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new v7(e2Var2, z1Var, tonconnectsession, str9, bArr, org.telegram.ui.Wallet.e2.p(i0Var, tonconnectsession, str9, bArr, z1Var.f35484a, z1Var.f35485b, z1Var.d, tonconnectchallenge, e2Var2.f34434f.getCurrentTime()), wVar, 12));
                    return;
                } catch (Exception e) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.c1(wVar, org.telegram.ui.Wallet.e2.h("prepare connect challenge", e), 0));
                    return;
                }
            case 7:
                org.telegram.ui.Wallet.e2 e2Var3 = (org.telegram.ui.Wallet.e2) this.f1818b;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.f1819c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str10 = (String) this.f1821n;
                byte[] bArr2 = (byte[]) this.e;
                JSONArray jSONArray = (JSONArray) this.f1822r;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f1820f;
                org.telegram.ui.Wallet.r1 r1Var2 = (org.telegram.ui.Wallet.r1) this.h;
                e2Var3.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new m51(e2Var3, str10, bArr2, tonconnectsession2, org.telegram.ui.Wallet.e2.q(i0Var2, tonconnectsession2, str10, bArr2, jSONArray, tL_urlAuthResultRequest.domain, null, null, e2Var3.f34434f.getCurrentTime()), r1Var2, i0Var2, jSONArray, tL_urlAuthResultRequest));
                    return;
                } catch (Exception e7) {
                    r1Var2.run(null, org.telegram.ui.Wallet.e2.h("prepare OAuth identity", e7));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.e2 e2Var4 = (org.telegram.ui.Wallet.e2) this.f1818b;
                org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) this.f1819c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.f1821n;
                byte[] bArr3 = (byte[]) this.e;
                String str12 = ((org.telegram.ui.Wallet.b2) this.f1822r).f34326a;
                org.telegram.ui.Wallet.w wVar2 = (org.telegram.ui.Wallet.w) this.f1820f;
                org.telegram.ui.Wallet.i0 i0Var3 = (org.telegram.ui.Wallet.i0) this.h;
                if (e2Var4.c(z1Var2, tonconnectsession3, str11, bArr3) && ((str3 = z1Var2.e.client_id) == null || str12.equalsIgnoreCase(str3))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession3.f20602id;
                    tonconnectregisterkey.client_id = str12;
                    e2Var4.f34434f.sendRequestTyped(tonconnectregisterkey, new Object(), new org.telegram.ui.Wallet.b1(e2Var4, wVar2, i0Var3, tonconnectsession3, str11, bArr3, z1Var2));
                    return;
                }
                wVar2.run("Wallet or TON Connect session changed. Open the request again.");
                return;
            case 9:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                ug.t tVar = (ug.t) this.f1819c;
                TLObject tLObject3 = (TLObject) this.f1818b;
                List list3 = (List) this.f1820f;
                c5.i iVar3 = (c5.i) this.d;
                ug.t tVar2 = (ug.t) this.f1821n;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f1822r;
                if (tL_error3 != null) {
                    tVar.run(tL_error3);
                    return;
                } else if (tLObject3 != null) {
                    BillingController.getInstance().addResultListener(((c5.p) list3.get(0)).f4780c, new c8(5, iVar3, tVar2));
                    BillingController.getInstance().setOnCanceled(new ug.p(tVar, 0));
                    BillingController billingController3 = BillingController.getInstance();
                    Activity parentActivity = o2Var.getParentActivity();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    n4.s sVar3 = new n4.s(9, false);
                    sVar3.G((c5.p) list3.get(0));
                    billingController3.launchBillingFlow(parentActivity, accountInstance3, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(sVar3.k()));
                    return;
                } else {
                    return;
                }
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                Utilities.Callback callback = (Utilities.Callback) this.f1819c;
                TLObject tLObject4 = (TLObject) this.f1818b;
                List list4 = (List) this.f1820f;
                c5.i iVar4 = (c5.i) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.f1821n;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f1822r;
                if (tL_error4 != null) {
                    callback.run(tL_error4);
                    return;
                } else if (tLObject4 != null) {
                    BillingController.getInstance().addResultListener(((c5.p) list4.get(0)).f4780c, new c8(4, iVar4, callback2));
                    BillingController.getInstance().setOnCanceled(new ei.ia(1, callback));
                    BillingController billingController4 = BillingController.getInstance();
                    Activity parentActivity2 = o2Var2.getParentActivity();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    n4.s sVar4 = new n4.s(9, false);
                    sVar4.G((c5.p) list4.get(0));
                    billingController4.launchBillingFlow(parentActivity2, accountInstance4, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(sVar4.k()));
                    return;
                } else {
                    return;
                }
        }
    }

    public m8(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, List list, c5.i iVar, Utilities.Callback callback2, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i10) {
        this.f1817a = i10;
        this.h = tL_error;
        this.f1819c = callback;
        this.f1818b = tLObject;
        this.f1820f = list;
        this.d = iVar;
        this.f1821n = callback2;
        this.e = o2Var;
        this.f1822r = inputStorePaymentPurpose;
    }

    public m8(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f1817a = 5;
        this.f1819c = userInfoActivity;
        this.h = tL_error;
        this.f1818b = tLObject;
        this.d = tL_birthday;
        this.f1821n = userFull;
        this.e = tLObject2;
        this.f1822r = iArr;
        this.f1820f = arrayList;
    }
}
