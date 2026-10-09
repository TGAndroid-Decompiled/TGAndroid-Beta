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
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q51;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.ec0;
import org.telegram.ui.ft;
import org.telegram.ui.wb0;
import org.telegram.ui.ze;
public final class k implements Runnable {
    public final int f12527a;
    public final Object f12528b;
    public final Object f12529c;
    public final Object d;
    public final Object f12530e;
    public final Object f12531f;
    public final Object h;
    public final Object f12532n;
    public final Object f12533r;

    public k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.f12527a = i10;
        this.f12528b = obj;
        this.f12529c = obj2;
        this.d = obj3;
        this.f12530e = obj4;
        this.f12531f = obj5;
        this.h = obj6;
        this.f12532n = obj7;
        this.f12533r = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        String str3;
        switch (this.f12527a) {
            case 0:
                String[] strArr = (String[]) this.f12528b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f12529c;
                ci.d dVar = (ci.d) this.d;
                boolean[] zArr = (boolean[]) this.f12530e;
                hi.a aVar = (hi.a) this.f12531f;
                ImageView imageView = (ImageView) this.h;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f12532n;
                int[] iArr = (int[]) this.f12533r;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    return;
                }
                boolean z10 = zArr[0];
                String str4 = strArr[0];
                aVar.run(str4, new c(str4, strArr, imageView, e6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                return;
            case 1:
                ((MessagesStorage) this.f12528b).lambda$loadUnreadMessages$76((a0.i) this.f12529c, (ArrayList) this.d, (ArrayList) this.f12530e, (ArrayList) this.f12531f, (ArrayList) this.h, (ArrayList) this.f12532n, (HashMap) this.f12533r);
                return;
            case 2:
                String str5 = (String) this.f12530e;
                String str6 = (String) this.f12531f;
                String str7 = (String) this.h;
                String str8 = (String) this.f12532n;
                org.telegram.ui.Wallet.d2 d2Var = ((org.telegram.ui.Wallet.k0) this.f12529c).f35098g;
                wb0 wb0Var = new wb0((ec0) this.f12528b, (String) this.f12533r, 1);
                d2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = (String) this.d;
                tonconnectcreatesession.manifest_url = str5;
                d2Var.f34791f.sendRequestTyped(tonconnectcreatesession, new Object(), new org.telegram.ui.Wallet.g1(d2Var, wb0Var, str6, str5, str7, str8));
                return;
            case 3:
                UserInfoActivity.Y((UserInfoActivity) this.f12528b, (TLRPC.TL_error) this.f12529c, (TLObject) this.d, (TL_account.TL_birthday) this.f12530e, (TLRPC.UserFull) this.f12531f, (TLObject) this.h, (int[]) this.f12533r, (ArrayList) this.f12532n);
                return;
            case 4:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.f12528b;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.f12529c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.f12530e;
                byte[] bArr = (byte[]) this.f12531f;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f12532n;
                ft ftVar = (ft) this.f12533r;
                d2Var2.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ze((Object) d2Var2, (Object) y1Var, (Object) tonconnectsession, str9, (Object) bArr, (Object) org.telegram.ui.Wallet.d2.p(h0Var, tonconnectsession, str9, bArr, y1Var.f35646a, y1Var.f35647b, y1Var.d, tonconnectchallenge, d2Var2.f34791f.getCurrentTime()), (Object) ftVar, 8));
                    return;
                } catch (Exception e7) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.b1(ftVar, org.telegram.ui.Wallet.d2.h("prepare connect challenge", e7), 0));
                    return;
                }
            case 5:
                org.telegram.ui.Wallet.d2 d2Var3 = (org.telegram.ui.Wallet.d2) this.f12528b;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.f12529c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str10 = (String) this.f12530e;
                byte[] bArr2 = (byte[]) this.f12531f;
                JSONArray jSONArray = (JSONArray) this.h;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f12532n;
                ai.m0 m0Var = (ai.m0) this.f12533r;
                d2Var3.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new q51(d2Var3, str10, bArr2, tonconnectsession2, org.telegram.ui.Wallet.d2.q(h0Var2, tonconnectsession2, str10, bArr2, jSONArray, tL_urlAuthResultRequest.domain, null, null, d2Var3.f34791f.getCurrentTime()), m0Var, h0Var2, jSONArray, tL_urlAuthResultRequest));
                    return;
                } catch (Exception e10) {
                    m0Var.run(null, org.telegram.ui.Wallet.d2.h("prepare OAuth identity", e10));
                    return;
                }
            case 6:
                org.telegram.ui.Wallet.d2 d2Var4 = (org.telegram.ui.Wallet.d2) this.f12528b;
                org.telegram.ui.Wallet.y1 y1Var2 = (org.telegram.ui.Wallet.y1) this.f12529c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.f12530e;
                byte[] bArr3 = (byte[]) this.f12531f;
                String str12 = ((org.telegram.ui.Wallet.a2) this.h).f34610a;
                ft ftVar2 = (ft) this.f12532n;
                org.telegram.ui.Wallet.h0 h0Var3 = (org.telegram.ui.Wallet.h0) this.f12533r;
                if (d2Var4.c(y1Var2, tonconnectsession3, str11, bArr3) && ((str = y1Var2.f35649e.client_id) == null || str12.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession3.f20299id;
                    tonconnectregisterkey.client_id = str12;
                    d2Var4.f34791f.sendRequestTyped(tonconnectregisterkey, new Object(), new pr(d2Var4, ftVar2, h0Var3, tonconnectsession3, str11, bArr3, y1Var2));
                    return;
                }
                ftVar2.run("Wallet or TON Connect session changed. Open the request again.");
                return;
            case 7:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f12528b;
                tg.v vVar = (tg.v) this.f12529c;
                TLObject tLObject = (TLObject) this.d;
                List list = (List) this.f12530e;
                c5.h hVar = (c5.h) this.f12531f;
                tg.v vVar2 = (tg.v) this.h;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f12532n;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f12533r;
                if (tL_error != null) {
                    vVar.run(tL_error);
                    return;
                } else if (tLObject != null) {
                    BillingController.getInstance().addResultListener(((c5.o) list.get(0)).f4279c, new ci.j5(3, hVar, vVar2));
                    BillingController.getInstance().setOnCanceled(new tg.r(vVar, 0));
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = n2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar = new pf.b(7, false);
                    bVar.T((c5.o) list.get(0));
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar.A()));
                    return;
                } else {
                    return;
                }
            case 8:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f12528b;
                Utilities.Callback callback = (Utilities.Callback) this.f12529c;
                TLObject tLObject2 = (TLObject) this.d;
                List list2 = (List) this.f12530e;
                c5.h hVar2 = (c5.h) this.f12531f;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.f12532n;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f12533r;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else if (tLObject2 != null) {
                    BillingController.getInstance().addResultListener(((c5.o) list2.get(0)).f4279c, new ci.j5(2, hVar2, callback2));
                    BillingController.getInstance().setOnCanceled(new xa(1, callback));
                    BillingController billingController2 = BillingController.getInstance();
                    Activity parentActivity2 = n2Var2.getParentActivity();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar2 = new pf.b(7, false);
                    bVar2.T((c5.o) list2.get(0));
                    billingController2.launchBillingFlow(parentActivity2, accountInstance2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar2.A()));
                    return;
                } else {
                    return;
                }
            case 9:
                TLObject tLObject3 = (TLObject) this.f12528b;
                c5.o oVar = (c5.o) this.f12529c;
                c5.h hVar3 = (c5.h) this.d;
                qh.r rVar = (qh.r) this.f12530e;
                Activity activity = (Activity) this.f12531f;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.h;
                List list3 = (List) this.f12532n;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f12533r;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(oVar.f4279c, new ci.j5(5, hVar3, rVar));
                    BillingController.getInstance().setOnCanceled(new yh.e4(rVar, 2));
                    BillingController billingController3 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar3 = new pf.b(7, false);
                    bVar3.T((c5.o) list3.get(0));
                    billingController3.launchBillingFlow(activity, accountInstance3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar3.A()));
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
                TLObject tLObject4 = (TLObject) this.f12528b;
                c5.o oVar2 = (c5.o) this.f12529c;
                c5.h hVar4 = (c5.h) this.d;
                f90 f90Var = (f90) this.f12530e;
                Activity activity2 = (Activity) this.f12531f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.h;
                List list4 = (List) this.f12532n;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f12533r;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(oVar2.f4279c, new ci.j5(4, hVar4, f90Var));
                    BillingController.getInstance().setOnCanceled(new yh.g4(f90Var, 0));
                    BillingController billingController4 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    pf.b bVar4 = new pf.b(7, false);
                    bVar4.T((c5.o) list4.get(0));
                    billingController4.launchBillingFlow(activity2, accountInstance4, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar4.A()));
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    f90Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error4 != null) {
                        str3 = tL_error4.text;
                    } else {
                        str3 = "SERVER_ERROR";
                    }
                    f90Var.run(bool2, str3);
                    return;
                }
        }
    }

    public k(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f12527a = 3;
        this.f12528b = userInfoActivity;
        this.f12529c = tL_error;
        this.d = tLObject;
        this.f12530e = tL_birthday;
        this.f12531f = userFull;
        this.h = tLObject2;
        this.f12533r = iArr;
        this.f12532n = arrayList;
    }
}
