package di;

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
import org.telegram.messenger.fn;
import org.telegram.messenger.i10;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.messenger.xs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.o31;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.a31;
import org.telegram.ui.l90;
import org.telegram.ui.r90;
public final class j7 implements Runnable {
    public final int f9069a;
    public final Object f9070b;
    public final Object f9071c;
    public final Object d;
    public final Object f9072e;
    public final Object f9073f;
    public final Object h;
    public final Object f9074n;
    public final Object f9075r;

    public j7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i7) {
        this.f9069a = i7;
        this.f9070b = obj;
        this.f9071c = obj2;
        this.d = obj3;
        this.f9074n = obj4;
        this.f9072e = obj5;
        this.f9075r = obj6;
        this.f9073f = obj7;
        this.h = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        String str3;
        switch (this.f9069a) {
            case 0:
                TLObject tLObject = (TLObject) this.f9070b;
                f5.m mVar = (f5.m) this.f9071c;
                f5.f fVar = (f5.f) this.d;
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) this.f9074n;
                Activity activity = (Activity) this.f9072e;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f9075r;
                List list = (List) this.f9073f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.r1.i().d(mVar.f11295c, new d7(1, fVar, f0Var));
                    org.telegram.messenger.r1.i().h = new x6(f0Var, 2);
                    org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i10.f24637t0);
                    wf.b bVar = new wf.b(17, false);
                    bVar.R((f5.m) list.get(0));
                    i7.l(activity, a10, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar.q()));
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    f0Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    if (tL_error != null) {
                        str = tL_error.text;
                    } else {
                        str = "SERVER_ERROR";
                    }
                    f0Var.a(bool, str);
                    return;
                }
            case 1:
                TLObject tLObject2 = (TLObject) this.f9070b;
                f5.m mVar2 = (f5.m) this.f9071c;
                f5.f fVar2 = (f5.f) this.d;
                bi.h8 h8Var = (bi.h8) this.f9074n;
                Activity activity2 = (Activity) this.f9072e;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.f9075r;
                List list2 = (List) this.f9073f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.r1.i().d(mVar2.f11295c, new d7(0, fVar2, h8Var));
                    org.telegram.messenger.r1.i().h = new e7(h8Var, 2);
                    org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a11 = org.telegram.messenger.c.a(i10.f24637t0);
                    wf.b bVar2 = new wf.b(17, false);
                    bVar2.R((f5.m) list2.get(0));
                    i10.l(activity2, a11, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar2.q()));
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    h8Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error2 != null) {
                        str2 = tL_error2.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    h8Var.a(bool2, str2);
                    return;
                }
            case 2:
                String[] strArr = (String[]) this.f9070b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f9071c;
                hi.e eVar = (hi.e) this.d;
                boolean[] zArr = (boolean[]) this.f9074n;
                hi.y7 y7Var = (hi.y7) this.f9072e;
                ImageView imageView = (ImageView) this.f9075r;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f9073f;
                int[] iArr = (int[]) this.h;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    eVar.setEnabled(false);
                    return;
                }
                boolean z10 = zArr[0];
                String str4 = strArr[0];
                y7Var.a(str4, new oi.c(str4, strArr, imageView, i6Var, z10, iArr, eVar, horizontalScrollView, zArr));
                return;
            case 3:
                a0.h hVar = (a0.h) this.f9071c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f9074n;
                xs notificationsController = ((tr) this.f9070b).getNotificationsController();
                Collection values = ((HashMap) this.h).values();
                notificationsController.getMessagesController().f4((ArrayList) this.f9072e, true);
                notificationsController.getMessagesController().Z3((ArrayList) this.f9075r, true);
                notificationsController.getMessagesController().c4((ArrayList) this.f9073f);
                xs.f28073l0.c(new fn(notificationsController, arrayList, hVar, arrayList2, values, 14));
                return;
            case 4:
                String str5 = (String) this.f9074n;
                String str6 = (String) this.f9072e;
                String str7 = (String) this.f9075r;
                String str8 = (String) this.f9073f;
                org.telegram.ui.Wallet.m2 m2Var = ((org.telegram.ui.Wallet.v0) this.f9071c).f45260g;
                l90 l90Var = new l90((r90) this.f9070b, (String) this.h, 1);
                m2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = (String) this.d;
                tonconnectcreatesession.manifest_url = str5;
                m2Var.f44652f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new s1(m2Var, l90Var, str6, str5, str7, str8, 1));
                return;
            case 5:
                UserInfoActivity.d0((UserInfoActivity) this.f9071c, (TLRPC.TL_error) this.h, (TLObject) this.f9070b, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f9074n, (TLObject) this.f9072e, (int[]) this.f9075r, (ArrayList) this.f9073f);
                return;
            case 6:
                org.telegram.ui.Wallet.m2 m2Var2 = (org.telegram.ui.Wallet.m2) this.f9070b;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.f9071c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.f9074n;
                byte[] bArr = (byte[]) this.f9072e;
                String str10 = ((org.telegram.ui.Wallet.j2) this.f9075r).f44513a;
                a31 a31Var = (a31) this.f9073f;
                org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) this.h;
                if (m2Var2.d(h2Var, tonconnectsession, str9, bArr) && ((str3 = h2Var.f44422e.client_id) == null || str10.equalsIgnoreCase(str3))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f28754id;
                    tonconnectregisterkey.client_id = str10;
                    m2Var2.f44652f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.ui.Wallet.m1(m2Var2, a31Var, s0Var, tonconnectsession, str9, bArr, h2Var));
                    return;
                }
                a31Var.a("Wallet or TON Connect session changed. Open the request again.");
                return;
            case 7:
                org.telegram.ui.Wallet.m2 m2Var3 = (org.telegram.ui.Wallet.m2) this.f9070b;
                org.telegram.ui.Wallet.s0 s0Var2 = (org.telegram.ui.Wallet.s0) this.f9071c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.f9074n;
                byte[] bArr2 = (byte[]) this.f9072e;
                org.telegram.ui.Wallet.h2 h2Var2 = (org.telegram.ui.Wallet.h2) this.f9075r;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f9073f;
                a31 a31Var2 = (a31) this.h;
                m2Var3.getClass();
                try {
                    org.telegram.messenger.g0.g3(new m6(m2Var3, h2Var2, tonconnectsession2, str11, bArr2, org.telegram.ui.Wallet.m2.r(s0Var2, tonconnectsession2, str11, bArr2, h2Var2.f44419a, h2Var2.f44420b, h2Var2.d, tonconnectchallenge, m2Var3.f44652f.getCurrentTime()), a31Var2, 12));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.l1(a31Var2, org.telegram.ui.Wallet.m2.i("prepare connect challenge", e10), 1));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.m2 m2Var4 = (org.telegram.ui.Wallet.m2) this.f9070b;
                org.telegram.ui.Wallet.s0 s0Var3 = (org.telegram.ui.Wallet.s0) this.f9071c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str12 = (String) this.f9074n;
                byte[] bArr3 = (byte[]) this.f9072e;
                JSONArray jSONArray = (JSONArray) this.f9075r;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f9073f;
                org.telegram.ui.Wallet.f0 f0Var2 = (org.telegram.ui.Wallet.f0) this.h;
                m2Var4.getClass();
                try {
                    org.telegram.messenger.g0.g3(new o31(m2Var4, str12, bArr3, tonconnectsession3, org.telegram.ui.Wallet.m2.s(s0Var3, tonconnectsession3, str12, bArr3, jSONArray, tL_urlAuthResultRequest.domain, null, null, m2Var4.f44652f.getCurrentTime()), f0Var2, s0Var3, jSONArray, tL_urlAuthResultRequest));
                    return;
                } catch (Exception e11) {
                    f0Var2.a(null, org.telegram.ui.Wallet.m2.i("prepare OAuth identity", e11));
                    return;
                }
            case 9:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                wg.u uVar = (wg.u) this.f9071c;
                TLObject tLObject3 = (TLObject) this.f9070b;
                List list3 = (List) this.f9073f;
                f5.f fVar3 = (f5.f) this.d;
                wg.u uVar2 = (wg.u) this.f9074n;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f9072e;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f9075r;
                if (tL_error3 != null) {
                    uVar.a(tL_error3);
                    return;
                } else if (tLObject3 != null) {
                    org.telegram.messenger.r1.i().d(((f5.m) list3.get(0)).f11295c, new d7(5, fVar3, uVar2));
                    org.telegram.messenger.r1.i().h = new wg.q(uVar, 0);
                    org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
                    Activity parentActivity = g2Var.getParentActivity();
                    org.telegram.messenger.c a12 = org.telegram.messenger.c.a(i10.f24637t0);
                    wf.b bVar3 = new wf.b(17, false);
                    bVar3.R((f5.m) list3.get(0));
                    i11.l(parentActivity, a12, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar3.q()));
                    return;
                } else {
                    return;
                }
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                w10 w10Var = (w10) this.f9071c;
                TLObject tLObject4 = (TLObject) this.f9070b;
                List list4 = (List) this.f9073f;
                f5.f fVar4 = (f5.f) this.d;
                w10 w10Var2 = (w10) this.f9074n;
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) this.f9072e;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f9075r;
                if (tL_error4 != null) {
                    w10Var.a(tL_error4);
                    return;
                } else if (tLObject4 != null) {
                    org.telegram.messenger.r1.i().d(((f5.m) list4.get(0)).f11295c, new d7(4, fVar4, w10Var2));
                    org.telegram.messenger.r1.i().h = new hi.ca(w10Var, 1);
                    org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
                    Activity parentActivity2 = g2Var2.getParentActivity();
                    org.telegram.messenger.c a13 = org.telegram.messenger.c.a(i10.f24637t0);
                    wf.b bVar4 = new wf.b(17, false);
                    bVar4.R((f5.m) list4.get(0));
                    i12.l(parentActivity2, a13, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar4.q()));
                    return;
                } else {
                    return;
                }
        }
    }

    public j7(TLRPC.TL_error tL_error, w10 w10Var, TLObject tLObject, List list, f5.f fVar, w10 w10Var2, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.f9069a = i7;
        this.h = tL_error;
        this.f9071c = w10Var;
        this.f9070b = tLObject;
        this.f9073f = list;
        this.d = fVar;
        this.f9074n = w10Var2;
        this.f9072e = g2Var;
        this.f9075r = inputStorePaymentPurpose;
    }

    public j7(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f9069a = 5;
        this.f9071c = userInfoActivity;
        this.h = tL_error;
        this.f9070b = tLObject;
        this.d = tL_birthday;
        this.f9074n = userFull;
        this.f9072e = tLObject2;
        this.f9075r = iArr;
        this.f9073f = arrayList;
    }
}
