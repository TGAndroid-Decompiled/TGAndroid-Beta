package bi;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.telegram.messenger.c20;
import org.telegram.messenger.dt;
import org.telegram.messenger.mn;
import org.telegram.messenger.p10;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.y21;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.l90;
import org.telegram.ui.s90;
public final class n8 implements Runnable {
    public final int f4412a;
    public final Object f4413b;
    public final Object f4414c;
    public final Object d;
    public final Object f4415e;
    public final Object f4416f;
    public final Object h;
    public final Object f4417n;
    public final Object f4418r;

    public n8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i7) {
        this.f4412a = i7;
        this.f4413b = obj;
        this.f4414c = obj2;
        this.d = obj3;
        this.f4417n = obj4;
        this.f4415e = obj5;
        this.f4418r = obj6;
        this.f4416f = obj7;
        this.h = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        String str3;
        switch (this.f4412a) {
            case 0:
                TLObject tLObject = (TLObject) this.f4413b;
                f5.l lVar = (f5.l) this.f4414c;
                f5.f fVar = (f5.f) this.d;
                org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) this.f4417n;
                Activity activity = (Activity) this.f4415e;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f4418r;
                List list = (List) this.f4416f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.r1.i().d(lVar.f11173c, new h8(1, fVar, t1Var));
                    org.telegram.messenger.r1.i().h = new b8(t1Var, 2);
                    org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(p10.f24474s0);
                    q4.q qVar = new q4.q(20, false);
                    qVar.g((f5.l) list.get(0));
                    i7.l(activity, a10, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(qVar.a()));
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    t1Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    if (tL_error != null) {
                        str = tL_error.text;
                    } else {
                        str = "SERVER_ERROR";
                    }
                    t1Var.a(bool, str);
                    return;
                }
            case 1:
                TLObject tLObject2 = (TLObject) this.f4413b;
                f5.l lVar2 = (f5.l) this.f4414c;
                f5.f fVar2 = (f5.f) this.d;
                mc mcVar = (mc) this.f4417n;
                Activity activity2 = (Activity) this.f4415e;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.f4418r;
                List list2 = (List) this.f4416f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.r1.i().d(lVar2.f11173c, new h8(0, fVar2, mcVar));
                    org.telegram.messenger.r1.i().h = new i8(mcVar, 2);
                    org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a11 = org.telegram.messenger.c.a(p10.f24474s0);
                    q4.q qVar2 = new q4.q(20, false);
                    qVar2.g((f5.l) list2.get(0));
                    i10.l(activity2, a11, tL_inputStorePaymentStarsGift, Collections.singletonList(qVar2.a()));
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    mcVar.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error2 != null) {
                        str2 = tL_error2.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    mcVar.a(bool2, str2);
                    return;
                }
            case 2:
                String[] strArr = (String[]) this.f4413b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f4414c;
                fi.d dVar = (fi.d) this.d;
                boolean[] zArr = (boolean[]) this.f4417n;
                hi.u1 u1Var = (hi.u1) this.f4415e;
                ImageView imageView = (ImageView) this.f4418r;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.f4416f;
                int[] iArr = (int[]) this.h;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    return;
                }
                boolean z9 = zArr[0];
                String str4 = strArr[0];
                u1Var.a(str4, new li.c(str4, strArr, imageView, h6Var, z9, iArr, dVar, horizontalScrollView, zArr));
                return;
            case 3:
                a0.h hVar = (a0.h) this.f4414c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f4417n;
                dt notificationsController = ((yr) this.f4413b).getNotificationsController();
                Collection values = ((HashMap) this.h).values();
                notificationsController.getMessagesController().Y3((ArrayList) this.f4415e, true);
                notificationsController.getMessagesController().S3((ArrayList) this.f4418r, true);
                notificationsController.getMessagesController().V3((ArrayList) this.f4416f);
                dt.f22080k0.c(new mn(notificationsController, arrayList, hVar, arrayList2, values, 14));
                return;
            case 4:
                String str5 = (String) this.f4417n;
                String str6 = (String) this.f4415e;
                String str7 = (String) this.f4418r;
                String str8 = (String) this.f4416f;
                org.telegram.ui.Wallet.d2 d2Var = ((org.telegram.ui.Wallet.l0) this.f4414c).f42754g;
                l90 l90Var = new l90((s90) this.f4413b, (String) this.h, 1);
                d2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = (String) this.d;
                tonconnectcreatesession.manifest_url = str5;
                d2Var.f42290f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new org.telegram.ui.Wallet.d1(d2Var, l90Var, str6, str5, str7, str8, 0));
                return;
            case 5:
                UserInfoActivity.d0((UserInfoActivity) this.f4414c, (TLRPC.TL_error) this.h, (TLObject) this.f4413b, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f4417n, (TLObject) this.f4415e, (int[]) this.f4418r, (ArrayList) this.f4416f);
                return;
            case 6:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.f4413b;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) this.f4414c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.f4417n;
                byte[] bArr = (byte[]) this.f4415e;
                String str10 = ((org.telegram.ui.Wallet.a2) this.f4418r).f42092a;
                org.telegram.ui.Wallet.s sVar = (org.telegram.ui.Wallet.s) this.f4416f;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.h;
                if (d2Var2.d(y1Var, tonconnectsession, str9, bArr) && ((str3 = y1Var.f43377e.client_id) == null || str10.equalsIgnoreCase(str3))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f27222id;
                    tonconnectregisterkey.client_id = str10;
                    d2Var2.f42290f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.ui.Wallet.c1(d2Var2, sVar, i0Var, tonconnectsession, str9, bArr, y1Var));
                    return;
                }
                sVar.a("Wallet or TON Connect session changed. Open the request again.");
                return;
            case 7:
                org.telegram.ui.Wallet.d2 d2Var3 = (org.telegram.ui.Wallet.d2) this.f4413b;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.f4414c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.f4417n;
                byte[] bArr2 = (byte[]) this.f4415e;
                org.telegram.ui.Wallet.y1 y1Var2 = (org.telegram.ui.Wallet.y1) this.f4418r;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f4416f;
                org.telegram.ui.Wallet.s sVar2 = (org.telegram.ui.Wallet.s) this.h;
                d2Var3.getClass();
                try {
                    org.telegram.messenger.g0.h3(new r7(d2Var3, y1Var2, tonconnectsession2, str11, bArr2, org.telegram.ui.Wallet.d2.r(i0Var2, tonconnectsession2, str11, bArr2, y1Var2.f43374a, y1Var2.f43375b, y1Var2.d, tonconnectchallenge, d2Var3.f42290f.getCurrentTime()), sVar2, 13));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.b1(sVar2, org.telegram.ui.Wallet.d2.i("prepare connect challenge", e10), 1));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.d2 d2Var4 = (org.telegram.ui.Wallet.d2) this.f4413b;
                org.telegram.ui.Wallet.i0 i0Var3 = (org.telegram.ui.Wallet.i0) this.f4414c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str12 = (String) this.f4417n;
                byte[] bArr3 = (byte[]) this.f4415e;
                JSONArray jSONArray = (JSONArray) this.f4418r;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f4416f;
                org.telegram.ui.Wallet.t1 t1Var2 = (org.telegram.ui.Wallet.t1) this.h;
                d2Var4.getClass();
                try {
                    org.telegram.messenger.g0.h3(new y21(d2Var4, str12, bArr3, tonconnectsession3, org.telegram.ui.Wallet.d2.s(i0Var3, tonconnectsession3, str12, bArr3, jSONArray, tL_urlAuthResultRequest.domain, null, null, d2Var4.f42290f.getCurrentTime()), t1Var2, i0Var3, jSONArray, tL_urlAuthResultRequest));
                    return;
                } catch (Exception e11) {
                    t1Var2.a(null, org.telegram.ui.Wallet.d2.i("prepare OAuth identity", e11));
                    return;
                }
            case 9:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                wg.u uVar = (wg.u) this.f4414c;
                TLObject tLObject3 = (TLObject) this.f4413b;
                List list3 = (List) this.f4416f;
                f5.f fVar3 = (f5.f) this.d;
                wg.u uVar2 = (wg.u) this.f4417n;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f4415e;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f4418r;
                if (tL_error3 != null) {
                    uVar.a(tL_error3);
                    return;
                } else if (tLObject3 != null) {
                    org.telegram.messenger.r1.i().d(((f5.l) list3.get(0)).f11173c, new h8(5, fVar3, uVar2));
                    org.telegram.messenger.r1.i().h = new wg.p(uVar, 0);
                    org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
                    Activity parentActivity = f2Var.getParentActivity();
                    org.telegram.messenger.c a12 = org.telegram.messenger.c.a(p10.f24474s0);
                    q4.q qVar3 = new q4.q(20, false);
                    qVar3.g((f5.l) list3.get(0));
                    i11.l(parentActivity, a12, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(qVar3.a()));
                    return;
                } else {
                    return;
                }
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                c20 c20Var = (c20) this.f4414c;
                TLObject tLObject4 = (TLObject) this.f4413b;
                List list4 = (List) this.f4416f;
                f5.f fVar4 = (f5.f) this.d;
                c20 c20Var2 = (c20) this.f4417n;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.f4415e;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f4418r;
                if (tL_error4 != null) {
                    c20Var.a(tL_error4);
                    return;
                } else if (tLObject4 != null) {
                    org.telegram.messenger.r1.i().d(((f5.l) list4.get(0)).f11173c, new h8(4, fVar4, c20Var2));
                    org.telegram.messenger.r1.i().h = new fi.j9(c20Var, 1);
                    org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
                    Activity parentActivity2 = f2Var2.getParentActivity();
                    org.telegram.messenger.c a13 = org.telegram.messenger.c.a(p10.f24474s0);
                    q4.q qVar4 = new q4.q(20, false);
                    qVar4.g((f5.l) list4.get(0));
                    i12.l(parentActivity2, a13, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(qVar4.a()));
                    return;
                } else {
                    return;
                }
        }
    }

    public n8(TLRPC.TL_error tL_error, c20 c20Var, TLObject tLObject, List list, f5.f fVar, c20 c20Var2, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.f4412a = i7;
        this.h = tL_error;
        this.f4414c = c20Var;
        this.f4413b = tLObject;
        this.f4416f = list;
        this.d = fVar;
        this.f4417n = c20Var2;
        this.f4415e = f2Var;
        this.f4418r = inputStorePaymentPurpose;
    }

    public n8(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f4412a = 5;
        this.f4414c = userInfoActivity;
        this.h = tL_error;
        this.f4413b = tLObject;
        this.d = tL_birthday;
        this.f4417n = userFull;
        this.f4415e = tLObject2;
        this.f4418r = iArr;
        this.f4416f = arrayList;
    }
}
