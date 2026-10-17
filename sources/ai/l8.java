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
import org.telegram.ui.Components.f51;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.db0;
import org.telegram.ui.kb0;
public final class l8 implements Runnable {
    public final int f1776a;
    public final Object f1777b;
    public final Object f1778c;
    public final Object d;
    public final Object e;
    public final Object f1779f;
    public final Object h;
    public final Object f1780n;
    public final Object f1781r;

    public l8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.f1776a = i10;
        this.f1777b = obj;
        this.f1778c = obj2;
        this.d = obj3;
        this.f1780n = obj4;
        this.e = obj5;
        this.f1781r = obj6;
        this.f1779f = obj7;
        this.h = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        String str3;
        switch (this.f1776a) {
            case 0:
                TLObject tLObject = (TLObject) this.f1777b;
                c5.o oVar = (c5.o) this.f1778c;
                c5.i iVar = (c5.i) this.d;
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.f1780n;
                Activity activity = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f1781r;
                List list = (List) this.f1779f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(oVar.f4775c, new b8(1, iVar, s1Var));
                    BillingController.getInstance().setOnCanceled(new d8(s1Var, 2));
                    BillingController billingController = BillingController.getInstance();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    n4.s sVar = new n4.s(9, false);
                    sVar.K((c5.o) list.get(0));
                    billingController.launchBillingFlow(activity, accountInstance, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(sVar.j()));
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    s1Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    if (tL_error != null) {
                        str = tL_error.text;
                    } else {
                        str = "SERVER_ERROR";
                    }
                    s1Var.run(bool, str);
                    return;
                }
            case 1:
                TLObject tLObject2 = (TLObject) this.f1777b;
                c5.o oVar2 = (c5.o) this.f1778c;
                c5.i iVar2 = (c5.i) this.d;
                sc scVar = (sc) this.f1780n;
                Activity activity2 = (Activity) this.e;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.f1781r;
                List list2 = (List) this.f1779f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(oVar2.f4775c, new b8(0, iVar2, scVar));
                    BillingController.getInstance().setOnCanceled(new g8(scVar, 0));
                    BillingController billingController2 = BillingController.getInstance();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    n4.s sVar2 = new n4.s(9, false);
                    sVar2.K((c5.o) list2.get(0));
                    billingController2.launchBillingFlow(activity2, accountInstance2, tL_inputStorePaymentStarsGift, Collections.singletonList(sVar2.j()));
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    scVar.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error2 != null) {
                        str2 = tL_error2.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    scVar.run(bool2, str2);
                    return;
                }
            case 2:
                String[] strArr = (String[]) this.f1777b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f1778c;
                ei.d dVar = (ei.d) this.d;
                boolean[] zArr = (boolean[]) this.f1780n;
                hg.o oVar3 = (hg.o) this.e;
                ImageView imageView = (ImageView) this.f1781r;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f1779f;
                int[] iArr = (int[]) this.h;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    return;
                }
                boolean z10 = zArr[0];
                String str4 = strArr[0];
                oVar3.run(str4, new ki.c(str4, strArr, imageView, d6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                return;
            case 3:
                ((MessagesStorage) this.f1777b).lambda$loadUnreadMessages$76((a0.h) this.f1778c, (ArrayList) this.d, (ArrayList) this.f1780n, (ArrayList) this.e, (ArrayList) this.f1781r, (ArrayList) this.f1779f, (HashMap) this.h);
                return;
            case 4:
                String str5 = (String) this.f1780n;
                String str6 = (String) this.e;
                String str7 = (String) this.f1781r;
                String str8 = (String) this.f1779f;
                org.telegram.ui.Wallet.f2 f2Var = ((org.telegram.ui.Wallet.m0) this.f1778c).f34555g;
                db0 db0Var = new db0((kb0) this.f1777b, (String) this.h, 1);
                f2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = (String) this.d;
                tonconnectcreatesession.manifest_url = str5;
                f2Var.f34194f.sendRequestTyped(tonconnectcreatesession, new Object(), new org.telegram.ui.Wallet.i1(f2Var, db0Var, str6, str5, str7, str8));
                return;
            case 5:
                UserInfoActivity.Y((UserInfoActivity) this.f1778c, (TLRPC.TL_error) this.h, (TLObject) this.f1777b, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f1780n, (TLObject) this.e, (int[]) this.f1781r, (ArrayList) this.f1779f);
                return;
            case 6:
                org.telegram.ui.Wallet.f2 f2Var2 = (org.telegram.ui.Wallet.f2) this.f1777b;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.f1778c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.f1780n;
                byte[] bArr = (byte[]) this.e;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.f1781r;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f1779f;
                org.telegram.ui.Wallet.x xVar = (org.telegram.ui.Wallet.x) this.h;
                f2Var2.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new u7(f2Var2, a2Var, tonconnectsession, str9, bArr, org.telegram.ui.Wallet.f2.p(j0Var, tonconnectsession, str9, bArr, a2Var.f33969a, a2Var.f33970b, a2Var.d, tonconnectchallenge, f2Var2.f34194f.getCurrentTime()), xVar, 12));
                    return;
                } catch (Exception e) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.d1(xVar, org.telegram.ui.Wallet.f2.h("prepare connect challenge", e), 0));
                    return;
                }
            case 7:
                org.telegram.ui.Wallet.f2 f2Var3 = (org.telegram.ui.Wallet.f2) this.f1777b;
                org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) this.f1778c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str10 = (String) this.f1780n;
                byte[] bArr2 = (byte[]) this.e;
                JSONArray jSONArray = (JSONArray) this.f1781r;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f1779f;
                org.telegram.ui.Wallet.s1 s1Var2 = (org.telegram.ui.Wallet.s1) this.h;
                f2Var3.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new f51(f2Var3, str10, bArr2, tonconnectsession2, org.telegram.ui.Wallet.f2.q(j0Var2, tonconnectsession2, str10, bArr2, jSONArray, tL_urlAuthResultRequest.domain, null, null, f2Var3.f34194f.getCurrentTime()), s1Var2, j0Var2, jSONArray, tL_urlAuthResultRequest));
                    return;
                } catch (Exception e7) {
                    s1Var2.run(null, org.telegram.ui.Wallet.f2.h("prepare OAuth identity", e7));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.f2 f2Var4 = (org.telegram.ui.Wallet.f2) this.f1777b;
                org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) this.f1778c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.f1780n;
                byte[] bArr3 = (byte[]) this.e;
                String str12 = ((org.telegram.ui.Wallet.c2) this.f1781r).f34071a;
                org.telegram.ui.Wallet.x xVar2 = (org.telegram.ui.Wallet.x) this.f1779f;
                org.telegram.ui.Wallet.j0 j0Var3 = (org.telegram.ui.Wallet.j0) this.h;
                if (f2Var4.c(a2Var2, tonconnectsession3, str11, bArr3) && ((str3 = a2Var2.e.client_id) == null || str12.equalsIgnoreCase(str3))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession3.f20530id;
                    tonconnectregisterkey.client_id = str12;
                    f2Var4.f34194f.sendRequestTyped(tonconnectregisterkey, new Object(), new org.telegram.ui.Wallet.c1(f2Var4, xVar2, j0Var3, tonconnectsession3, str11, bArr3, a2Var2));
                    return;
                }
                xVar2.run("Wallet or TON Connect session changed. Open the request again.");
                return;
            case 9:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                ug.t tVar = (ug.t) this.f1778c;
                TLObject tLObject3 = (TLObject) this.f1777b;
                List list3 = (List) this.f1779f;
                c5.i iVar3 = (c5.i) this.d;
                ug.t tVar2 = (ug.t) this.f1780n;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f1781r;
                if (tL_error3 != null) {
                    tVar.run(tL_error3);
                    return;
                } else if (tLObject3 != null) {
                    BillingController.getInstance().addResultListener(((c5.o) list3.get(0)).f4775c, new b8(5, iVar3, tVar2));
                    BillingController.getInstance().setOnCanceled(new ug.p(tVar, 0));
                    BillingController billingController3 = BillingController.getInstance();
                    Activity parentActivity = n2Var.getParentActivity();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    n4.s sVar3 = new n4.s(9, false);
                    sVar3.K((c5.o) list3.get(0));
                    billingController3.launchBillingFlow(parentActivity, accountInstance3, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(sVar3.j()));
                    return;
                } else {
                    return;
                }
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                Utilities.Callback callback = (Utilities.Callback) this.f1778c;
                TLObject tLObject4 = (TLObject) this.f1777b;
                List list4 = (List) this.f1779f;
                c5.i iVar4 = (c5.i) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.f1780n;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.e;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f1781r;
                if (tL_error4 != null) {
                    callback.run(tL_error4);
                    return;
                } else if (tLObject4 != null) {
                    BillingController.getInstance().addResultListener(((c5.o) list4.get(0)).f4775c, new b8(4, iVar4, callback2));
                    BillingController.getInstance().setOnCanceled(new ei.ia(1, callback));
                    BillingController billingController4 = BillingController.getInstance();
                    Activity parentActivity2 = n2Var2.getParentActivity();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    n4.s sVar4 = new n4.s(9, false);
                    sVar4.K((c5.o) list4.get(0));
                    billingController4.launchBillingFlow(parentActivity2, accountInstance4, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(sVar4.j()));
                    return;
                } else {
                    return;
                }
        }
    }

    public l8(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, List list, c5.i iVar, Utilities.Callback callback2, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i10) {
        this.f1776a = i10;
        this.h = tL_error;
        this.f1778c = callback;
        this.f1777b = tLObject;
        this.f1779f = list;
        this.d = iVar;
        this.f1780n = callback2;
        this.e = n2Var;
        this.f1781r = inputStorePaymentPurpose;
    }

    public l8(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f1776a = 5;
        this.f1778c = userInfoActivity;
        this.h = tL_error;
        this.f1777b = tLObject;
        this.d = tL_birthday;
        this.f1780n = userFull;
        this.e = tLObject2;
        this.f1781r = iArr;
        this.f1779f = arrayList;
    }
}
