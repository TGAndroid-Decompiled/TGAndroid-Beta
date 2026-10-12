package ji;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import di.wa;
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
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.m51;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.bc0;
import org.telegram.ui.ff;
import org.telegram.ui.jc0;
import org.telegram.ui.mt;
public final class k implements Runnable {
    public final int f13361a;
    public final Object f13362b;
    public final Object f13363c;
    public final Object d;
    public final Object e;
    public final Object f13364f;
    public final Object h;
    public final Object f13365n;
    public final Object f13366r;

    public k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.f13361a = i10;
        this.f13362b = obj;
        this.f13363c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f13364f = obj5;
        this.h = obj6;
        this.f13365n = obj7;
        this.f13366r = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        String str3;
        switch (this.f13361a) {
            case 0:
                String[] strArr = (String[]) this.f13362b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f13363c;
                di.d dVar = (di.d) this.d;
                boolean[] zArr = (boolean[]) this.e;
                ii.a aVar = (ii.a) this.f13364f;
                ImageView imageView = (ImageView) this.h;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f13365n;
                int[] iArr = (int[]) this.f13366r;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    return;
                }
                boolean z10 = zArr[0];
                String str4 = strArr[0];
                aVar.run(str4, new c(str4, strArr, imageView, c6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                return;
            case 1:
                ((MessagesStorage) this.f13362b).lambda$loadUnreadMessages$76((a0.h) this.f13363c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f13364f, (ArrayList) this.h, (ArrayList) this.f13365n, (HashMap) this.f13366r);
                return;
            case 2:
                String str5 = (String) this.e;
                String str6 = (String) this.f13364f;
                String str7 = (String) this.h;
                String str8 = (String) this.f13365n;
                org.telegram.ui.Wallet.d2 d2Var = ((org.telegram.ui.Wallet.j0) this.f13363c).f33323g;
                bc0 bc0Var = new bc0((jc0) this.f13362b, (String) this.f13366r, 1);
                d2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = (String) this.d;
                tonconnectcreatesession.manifest_url = str5;
                d2Var.f33043f.sendRequestTyped(tonconnectcreatesession, new Object(), new org.telegram.ui.Wallet.g1(d2Var, bc0Var, str6, str5, str7, str8));
                return;
            case 3:
                UserInfoActivity.Y((UserInfoActivity) this.f13362b, (TLRPC.TL_error) this.f13363c, (TLObject) this.d, (TL_account.TL_birthday) this.e, (TLRPC.UserFull) this.f13364f, (TLObject) this.h, (int[]) this.f13366r, (ArrayList) this.f13365n);
                return;
            case 4:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.f13362b;
                org.telegram.ui.Wallet.g0 g0Var = (org.telegram.ui.Wallet.g0) this.f13363c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.e;
                byte[] bArr = (byte[]) this.f13364f;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f13365n;
                mt mtVar = (mt) this.f13366r;
                d2Var2.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new ff((Object) d2Var2, (Object) y1Var, (Object) tonconnectsession, str9, (Object) bArr, (Object) org.telegram.ui.Wallet.d2.p(g0Var, tonconnectsession, str9, bArr, y1Var.f33875a, y1Var.f33876b, y1Var.d, tonconnectchallenge, d2Var2.f33043f.getCurrentTime()), (Object) mtVar, 8));
                    return;
                } catch (Exception e) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.b1(mtVar, org.telegram.ui.Wallet.d2.h("prepare connect challenge", e), 0));
                    return;
                }
            case 5:
                org.telegram.ui.Wallet.d2 d2Var3 = (org.telegram.ui.Wallet.d2) this.f13362b;
                org.telegram.ui.Wallet.g0 g0Var2 = (org.telegram.ui.Wallet.g0) this.f13363c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str10 = (String) this.e;
                byte[] bArr2 = (byte[]) this.f13364f;
                JSONArray jSONArray = (JSONArray) this.h;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f13365n;
                bi.f0 f0Var = (bi.f0) this.f13366r;
                d2Var3.getClass();
                try {
                    AndroidUtilities.runOnUIThread(new m51(d2Var3, str10, bArr2, tonconnectsession2, org.telegram.ui.Wallet.d2.q(g0Var2, tonconnectsession2, str10, bArr2, jSONArray, tL_urlAuthResultRequest.domain, null, null, d2Var3.f33043f.getCurrentTime()), f0Var, g0Var2, jSONArray, tL_urlAuthResultRequest));
                    return;
                } catch (Exception e7) {
                    f0Var.run(null, org.telegram.ui.Wallet.d2.h("prepare OAuth identity", e7));
                    return;
                }
            case 6:
                org.telegram.ui.Wallet.d2 d2Var4 = (org.telegram.ui.Wallet.d2) this.f13362b;
                org.telegram.ui.Wallet.y1 y1Var2 = (org.telegram.ui.Wallet.y1) this.f13363c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.e;
                byte[] bArr3 = (byte[]) this.f13364f;
                String str12 = ((org.telegram.ui.Wallet.a2) this.h).f32918a;
                mt mtVar2 = (mt) this.f13365n;
                org.telegram.ui.Wallet.g0 g0Var3 = (org.telegram.ui.Wallet.g0) this.f13366r;
                if (d2Var4.c(y1Var2, tonconnectsession3, str11, bArr3) && ((str = y1Var2.e.client_id) == null || str12.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession3.f19475id;
                    tonconnectregisterkey.client_id = str12;
                    d2Var4.f33043f.sendRequestTyped(tonconnectregisterkey, new Object(), new org.telegram.ui.Wallet.a1(d2Var4, mtVar2, g0Var3, tonconnectsession3, str11, bArr3, y1Var2));
                    return;
                }
                mtVar2.run("Wallet or TON Connect session changed. Open the request again.");
                return;
            case 7:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f13362b;
                ug.v vVar = (ug.v) this.f13363c;
                TLObject tLObject = (TLObject) this.d;
                List list = (List) this.e;
                c5.i iVar = (c5.i) this.f13364f;
                ug.v vVar2 = (ug.v) this.h;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f13365n;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f13366r;
                if (tL_error != null) {
                    vVar.run(tL_error);
                    return;
                } else if (tLObject != null) {
                    BillingController.getInstance().addResultListener(((c5.p) list.get(0)).f4404c, new di.j5(3, iVar, vVar2));
                    BillingController.getInstance().setOnCanceled(new ug.r(vVar, 0));
                    BillingController billingController = BillingController.getInstance();
                    Activity parentActivity = m2Var.getParentActivity();
                    AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                    qf.b bVar = new qf.b(9);
                    bVar.e0((c5.p) list.get(0));
                    billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar.w()));
                    return;
                } else {
                    return;
                }
            case 8:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f13362b;
                Utilities.Callback callback = (Utilities.Callback) this.f13363c;
                TLObject tLObject2 = (TLObject) this.d;
                List list2 = (List) this.e;
                c5.i iVar2 = (c5.i) this.f13364f;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.f13365n;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f13366r;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else if (tLObject2 != null) {
                    BillingController.getInstance().addResultListener(((c5.p) list2.get(0)).f4404c, new di.j5(2, iVar2, callback2));
                    BillingController.getInstance().setOnCanceled(new wa(1, callback));
                    BillingController billingController2 = BillingController.getInstance();
                    Activity parentActivity2 = m2Var2.getParentActivity();
                    AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    qf.b bVar2 = new qf.b(9);
                    bVar2.e0((c5.p) list2.get(0));
                    billingController2.launchBillingFlow(parentActivity2, accountInstance2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar2.w()));
                    return;
                } else {
                    return;
                }
            case 9:
                TLObject tLObject3 = (TLObject) this.f13362b;
                c5.p pVar = (c5.p) this.f13363c;
                c5.i iVar3 = (c5.i) this.d;
                rh.s sVar = (rh.s) this.e;
                Activity activity = (Activity) this.f13364f;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.h;
                List list3 = (List) this.f13365n;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f13366r;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(pVar.f4404c, new di.j5(5, iVar3, sVar));
                    BillingController.getInstance().setOnCanceled(new zh.e4(sVar, 2));
                    BillingController billingController3 = BillingController.getInstance();
                    AccountInstance accountInstance3 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    qf.b bVar3 = new qf.b(9);
                    bVar3.e0((c5.p) list3.get(0));
                    billingController3.launchBillingFlow(activity, accountInstance3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar3.w()));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    sVar.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    if (tL_error3 != null) {
                        str2 = tL_error3.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    sVar.run(bool, str2);
                    return;
                }
            default:
                TLObject tLObject4 = (TLObject) this.f13362b;
                c5.p pVar2 = (c5.p) this.f13363c;
                c5.i iVar4 = (c5.i) this.d;
                d90 d90Var = (d90) this.e;
                Activity activity2 = (Activity) this.f13364f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.h;
                List list4 = (List) this.f13365n;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f13366r;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    BillingController.getInstance().addResultListener(pVar2.f4404c, new di.j5(4, iVar4, d90Var));
                    BillingController.getInstance().setOnCanceled(new zh.g4(d90Var, 0));
                    BillingController billingController4 = BillingController.getInstance();
                    AccountInstance accountInstance4 = AccountInstance.getInstance(UserConfig.selectedAccount);
                    qf.b bVar4 = new qf.b(9);
                    bVar4.e0((c5.p) list4.get(0));
                    billingController4.launchBillingFlow(activity2, accountInstance4, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar4.w()));
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    d90Var.run(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error4 != null) {
                        str3 = tL_error4.text;
                    } else {
                        str3 = "SERVER_ERROR";
                    }
                    d90Var.run(bool2, str3);
                    return;
                }
        }
    }

    public k(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f13361a = 3;
        this.f13362b = userInfoActivity;
        this.f13363c = tL_error;
        this.d = tLObject;
        this.e = tL_birthday;
        this.f13364f = userFull;
        this.h = tLObject2;
        this.f13366r = iArr;
        this.f13365n = arrayList;
    }
}
