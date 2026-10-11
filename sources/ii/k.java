package ii;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import ci.xa;
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
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.s51;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.dc0;
import org.telegram.ui.et;
import org.telegram.ui.vb0;
import org.telegram.ui.ye;
public final class k implements Runnable {
    public final int f12526a;
    public final Object f12527b;
    public final Object f12528c;
    public final Object d;
    public final Object f12529e;
    public final Object f12530f;
    public final Object h;
    public final Object f12531n;
    public final Object f12532r;

    public k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.f12526a = i10;
        this.f12527b = obj;
        this.f12528c = obj2;
        this.d = obj3;
        this.f12529e = obj4;
        this.f12530f = obj5;
        this.h = obj6;
        this.f12531n = obj7;
        this.f12532r = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        String str3;
        switch (this.f12526a) {
            case 0:
                String[] strArr = (String[]) this.f12527b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f12528c;
                ci.d dVar = (ci.d) this.d;
                boolean[] zArr = (boolean[]) this.f12529e;
                hi.a aVar = (hi.a) this.f12530f;
                ImageView imageView = (ImageView) this.h;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f12531n;
                int[] iArr = (int[]) this.f12532r;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    return;
                }
                boolean z10 = zArr[0];
                String str4 = strArr[0];
                aVar.run(str4, new c(str4, strArr, imageView, d6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                return;
            case 1:
                ((MessagesStorage) this.f12527b).lambda$loadUnreadMessages$76((a0.i) this.f12528c, (ArrayList) this.d, (ArrayList) this.f12529e, (ArrayList) this.f12530f, (ArrayList) this.h, (ArrayList) this.f12531n, (HashMap) this.f12532r);
                return;
            case 2:
                String str5 = (String) this.f12529e;
                String str6 = (String) this.f12530f;
                String str7 = (String) this.h;
                String str8 = (String) this.f12531n;
                org.telegram.ui.Wallet.f2 f2Var = ((org.telegram.ui.Wallet.l0) this.f12528c).f35190g;
                vb0 vb0Var = new vb0((dc0) this.f12527b, (String) this.f12532r, 1);
                f2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = (String) this.d;
                tonconnectcreatesession.manifest_url = str5;
                f2Var.f34894f.sendRequestTyped(tonconnectcreatesession, new Object(), new org.telegram.ui.Wallet.i1(f2Var, vb0Var, str6, str5, str7, str8));
                return;
            case 3:
                UserInfoActivity.Y((UserInfoActivity) this.f12527b, (TLRPC.TL_error) this.f12528c, (TLObject) this.d, (TL_account.TL_birthday) this.f12529e, (TLRPC.UserFull) this.f12530f, (TLObject) this.h, (int[]) this.f12532r, (ArrayList) this.f12531n);
                return;
            case 4:
                org.telegram.ui.Wallet.f2 f2Var2 = (org.telegram.ui.Wallet.f2) this.f12527b;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.f12528c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.f12529e;
                byte[] bArr = (byte[]) this.f12530f;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f12531n;
                et etVar = (et) this.f12532r;
                f2Var2.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ye((Object) f2Var2, (Object) a2Var, (Object) tonconnectsession, str9, (Object) bArr, (Object) org.telegram.ui.Wallet.f2.p(i0Var, tonconnectsession, str9, bArr, a2Var.f34648a, a2Var.f34649b, a2Var.d, tonconnectchallenge, f2Var2.f34894f.getCurrentTime()), (Object) etVar, 8));
                    return;
                } catch (Exception e7) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.d1(etVar, org.telegram.ui.Wallet.f2.h("prepare connect challenge", e7), 0));
                    return;
                }
            case 5:
                org.telegram.ui.Wallet.f2 f2Var3 = (org.telegram.ui.Wallet.f2) this.f12527b;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.f12528c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str10 = (String) this.f12529e;
                byte[] bArr2 = (byte[]) this.f12530f;
                JSONArray jSONArray = (JSONArray) this.h;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f12531n;
                ai.m0 m0Var = (ai.m0) this.f12532r;
                f2Var3.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new s51(f2Var3, str10, bArr2, tonconnectsession2, org.telegram.ui.Wallet.f2.q(i0Var2, tonconnectsession2, str10, bArr2, jSONArray, tL_urlAuthResultRequest.domain, null, null, f2Var3.f34894f.getCurrentTime()), m0Var, i0Var2, jSONArray, tL_urlAuthResultRequest));
                    return;
                } catch (Exception e10) {
                    m0Var.run(null, org.telegram.ui.Wallet.f2.h("prepare OAuth identity", e10));
                    return;
                }
            case 6:
                org.telegram.ui.Wallet.f2 f2Var4 = (org.telegram.ui.Wallet.f2) this.f12527b;
                org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) this.f12528c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.f12529e;
                byte[] bArr3 = (byte[]) this.f12530f;
                String str12 = ((org.telegram.ui.Wallet.c2) this.h).f34732a;
                et etVar2 = (et) this.f12531n;
                org.telegram.ui.Wallet.i0 i0Var3 = (org.telegram.ui.Wallet.i0) this.f12532r;
                if (f2Var4.c(a2Var2, tonconnectsession3, str11, bArr3) && ((str = a2Var2.f34651e.client_id) == null || str12.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession3.f20293id;
                    tonconnectregisterkey.client_id = str12;
                    f2Var4.f34894f.sendRequestTyped(tonconnectregisterkey, new Object(), new org.telegram.ui.Wallet.c1(f2Var4, etVar2, i0Var3, tonconnectsession3, str11, bArr3, a2Var2));
                    return;
                }
                etVar2.run("Wallet or TON Connect session changed. Open the request again.");
                return;
            case 7:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f12527b;
                tg.u uVar = (tg.u) this.f12528c;
                TLObject tLObject = (TLObject) this.d;
                List list = (List) this.f12529e;
                c5.h hVar = (c5.h) this.f12530f;
                tg.u uVar2 = (tg.u) this.h;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f12531n;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f12532r;
                if (tL_error != null) {
                    uVar.run(tL_error);
                    return;
                } else if (tLObject != null) {
                    BillingController.getInstance().addResultListener(((c5.o) list.get(0)).f4278c, new ci.j5(3, hVar, uVar2));
                    BillingController.getInstance().setOnCanceled(new tg.q(uVar, 0));
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = m2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar = new pf.b(7, false);
                    bVar.X((c5.o) list.get(0));
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar.H()));
                    return;
                } else {
                    return;
                }
            case 8:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f12527b;
                Utilities.Callback callback = (Utilities.Callback) this.f12528c;
                TLObject tLObject2 = (TLObject) this.d;
                List list2 = (List) this.f12529e;
                c5.h hVar2 = (c5.h) this.f12530f;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.f12531n;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f12532r;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else if (tLObject2 != null) {
                    BillingController.getInstance().addResultListener(((c5.o) list2.get(0)).f4278c, new ci.j5(2, hVar2, callback2));
                    BillingController.getInstance().setOnCanceled(new xa(1, callback));
                    BillingController billingController2 = BillingController.getInstance();
                    Activity parentActivity2 = m2Var2.getParentActivity();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar2 = new pf.b(7, false);
                    bVar2.X((c5.o) list2.get(0));
                    billingController2.launchBillingFlow(parentActivity2, accountInstance2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar2.H()));
                    return;
                } else {
                    return;
                }
            case 9:
                TLObject tLObject3 = (TLObject) this.f12527b;
                c5.o oVar = (c5.o) this.f12528c;
                c5.h hVar3 = (c5.h) this.d;
                qh.r rVar = (qh.r) this.f12529e;
                Activity activity = (Activity) this.f12530f;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.h;
                List list3 = (List) this.f12531n;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f12532r;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(oVar.f4278c, new ci.j5(5, hVar3, rVar));
                    BillingController.getInstance().setOnCanceled(new yh.e4(rVar, 2));
                    BillingController billingController3 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar3 = new pf.b(7, false);
                    bVar3.X((c5.o) list3.get(0));
                    billingController3.launchBillingFlow(activity, accountInstance3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar3.H()));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    rVar.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    if (tL_error3 != null) {
                        str2 = tL_error3.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    rVar.run(bool, str2);
                    return;
                }
            default:
                TLObject tLObject4 = (TLObject) this.f12527b;
                c5.o oVar2 = (c5.o) this.f12528c;
                c5.h hVar4 = (c5.h) this.d;
                g90 g90Var = (g90) this.f12529e;
                Activity activity2 = (Activity) this.f12530f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.h;
                List list4 = (List) this.f12531n;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f12532r;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(oVar2.f4278c, new ci.j5(4, hVar4, g90Var));
                    BillingController.getInstance().setOnCanceled(new yh.g4(g90Var, 0));
                    BillingController billingController4 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar4 = new pf.b(7, false);
                    bVar4.X((c5.o) list4.get(0));
                    billingController4.launchBillingFlow(activity2, accountInstance4, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar4.H()));
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    g90Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error4 != null) {
                        str3 = tL_error4.text;
                    } else {
                        str3 = "SERVER_ERROR";
                    }
                    g90Var.run(bool2, str3);
                    return;
                }
        }
    }

    public k(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f12526a = 3;
        this.f12527b = userInfoActivity;
        this.f12528c = tL_error;
        this.d = tLObject;
        this.f12529e = tL_birthday;
        this.f12530f = userFull;
        this.h = tLObject2;
        this.f12532r = iArr;
        this.f12531n = arrayList;
    }
}
