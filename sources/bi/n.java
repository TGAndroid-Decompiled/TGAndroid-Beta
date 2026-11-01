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
import org.telegram.messenger.dn;
import org.telegram.messenger.e20;
import org.telegram.messenger.is;
import org.telegram.messenger.pt;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.q70;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.d01;
import org.telegram.ui.ma0;
import org.telegram.ui.ta0;
public final class n implements Runnable {
    public final int f3208a;
    public final Object f3209b;
    public final Object f3210c;
    public final Object d;
    public final Object e;
    public final Object f3211f;
    public final Object h;
    public final Object f3212n;
    public final Object f3213r;

    public n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i10) {
        this.f3208a = i10;
        this.f3209b = obj;
        this.f3210c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f3211f = obj5;
        this.h = obj6;
        this.f3212n = obj7;
        this.f3213r = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        String str3;
        switch (this.f3208a) {
            case 0:
                String[] strArr = (String[]) this.f3209b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f3210c;
                vh.d dVar = (vh.d) this.d;
                boolean[] zArr = (boolean[]) this.e;
                ag.a aVar = (ag.a) this.f3211f;
                ImageView imageView = (ImageView) this.h;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) this.f3212n;
                int[] iArr = (int[]) this.f3213r;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    return;
                }
                boolean z10 = zArr[0];
                String str4 = strArr[0];
                aVar.a(str4, new d(str4, strArr, imageView, p6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f3209b;
                mg.o0 o0Var = (mg.o0) this.f3210c;
                TLObject tLObject = (TLObject) this.d;
                List list = (List) this.e;
                c5.g gVar = (c5.g) this.f3211f;
                mg.o0 o0Var2 = (mg.o0) this.h;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f3212n;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f3213r;
                if (tL_error != null) {
                    o0Var.a(tL_error);
                    return;
                } else if (tLObject != null) {
                    org.telegram.messenger.u1.i().d(((c5.m) list.get(0)).f3801c, new mg.f0(1, gVar, o0Var2));
                    org.telegram.messenger.u1.i().h = new mg.h0(o0Var, 0);
                    org.telegram.messenger.u1 i10 = org.telegram.messenger.u1.i();
                    Activity parentActivity = k2Var.getParentActivity();
                    org.telegram.messenger.c a2 = org.telegram.messenger.c.a(e20.f15506s0);
                    hf.b bVar = new hf.b(9, false);
                    bVar.m0((c5.m) list.get(0));
                    i10.l(parentActivity, a2, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar.K()));
                    return;
                } else {
                    return;
                }
            case 2:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f3209b;
                r20 r20Var = (r20) this.f3210c;
                TLObject tLObject2 = (TLObject) this.d;
                List list2 = (List) this.e;
                c5.g gVar2 = (c5.g) this.f3211f;
                r20 r20Var2 = (r20) this.h;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) this.f3212n;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f3213r;
                if (tL_error2 != null) {
                    r20Var.a(tL_error2);
                    return;
                } else if (tLObject2 != null) {
                    org.telegram.messenger.u1.i().d(((c5.m) list2.get(0)).f3801c, new mg.f0(0, gVar2, r20Var2));
                    org.telegram.messenger.u1.i().h = new mg.g0(r20Var, 0);
                    org.telegram.messenger.u1 i11 = org.telegram.messenger.u1.i();
                    Activity parentActivity2 = k2Var2.getParentActivity();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(e20.f15506s0);
                    hf.b bVar2 = new hf.b(9, false);
                    bVar2.m0((c5.m) list2.get(0));
                    i11.l(parentActivity2, a10, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar2.K()));
                    return;
                } else {
                    return;
                }
            case 3:
                a0.h hVar = (a0.h) this.f3210c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                pt notificationsController = ((is) this.f3209b).getNotificationsController();
                Collection values = ((HashMap) this.f3213r).values();
                notificationsController.getMessagesController().V3((ArrayList) this.f3211f, true);
                notificationsController.getMessagesController().P3((ArrayList) this.h, true);
                notificationsController.getMessagesController().S3((ArrayList) this.f3212n);
                pt.f17637k0.c(new dn(notificationsController, arrayList, hVar, arrayList2, values, 14));
                return;
            case 4:
                String str5 = (String) this.e;
                String str6 = (String) this.f3211f;
                String str7 = (String) this.h;
                String str8 = (String) this.f3212n;
                org.telegram.ui.Wallet.e2 e2Var = ((org.telegram.ui.Wallet.k0) this.f3210c).f34785g;
                ma0 ma0Var = new ma0((ta0) this.f3209b, (String) this.f3213r, 1);
                e2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = (String) this.d;
                tonconnectcreatesession.manifest_url = str5;
                e2Var.f34453f.sendRequestTyped(tonconnectcreatesession, new a3.b(1), new org.telegram.ui.Wallet.e1(e2Var, ma0Var, str6, str5, str7, str8, 0));
                return;
            case 5:
                UserInfoActivity.d0((UserInfoActivity) this.f3209b, (TLRPC.TL_error) this.f3210c, (TLObject) this.d, (TL_account.TL_birthday) this.e, (TLRPC.UserFull) this.f3211f, (TLObject) this.h, (int[]) this.f3213r, (ArrayList) this.f3212n);
                return;
            case 6:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.f3209b;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.f3210c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.e;
                byte[] bArr = (byte[]) this.f3211f;
                String str10 = ((org.telegram.ui.Wallet.b2) this.h).f34229a;
                d01 d01Var = (d01) this.f3212n;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.f3213r;
                if (e2Var2.d(z1Var, tonconnectsession, str9, bArr) && ((str = z1Var.e.client_id) == null || str10.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f20056id;
                    tonconnectregisterkey.client_id = str10;
                    e2Var2.f34453f.sendRequestTyped(tonconnectregisterkey, new a3.b(1), new org.telegram.ui.Wallet.d1(e2Var2, d01Var, h0Var, tonconnectsession, str9, bArr, z1Var));
                    return;
                }
                d01Var.a("Wallet or TON Connect session changed. Open the request again.");
                return;
            case 7:
                org.telegram.ui.Wallet.e2 e2Var3 = (org.telegram.ui.Wallet.e2) this.f3209b;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.f3210c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.e;
                byte[] bArr2 = (byte[]) this.f3211f;
                org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) this.h;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f3212n;
                d01 d01Var2 = (d01) this.f3213r;
                e2Var3.getClass();
                try {
                    org.telegram.messenger.i0.g3(new mg.c0(e2Var3, z1Var2, tonconnectsession2, str11, bArr2, org.telegram.ui.Wallet.e2.r(h0Var2, tonconnectsession2, str11, bArr2, z1Var2.f35451a, z1Var2.f35452b, z1Var2.d, tonconnectchallenge, e2Var3.f34453f.getCurrentTime()), d01Var2, 11));
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.c1(d01Var2, org.telegram.ui.Wallet.e2.i("prepare connect challenge", e), 1));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.e2 e2Var4 = (org.telegram.ui.Wallet.e2) this.f3209b;
                org.telegram.ui.Wallet.h0 h0Var3 = (org.telegram.ui.Wallet.h0) this.f3210c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str12 = (String) this.e;
                byte[] bArr3 = (byte[]) this.f3211f;
                JSONArray jSONArray = (JSONArray) this.h;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f3212n;
                ih.s sVar = (ih.s) this.f3213r;
                e2Var4.getClass();
                try {
                    org.telegram.messenger.i0.g3(new c41(e2Var4, str12, bArr3, tonconnectsession3, org.telegram.ui.Wallet.e2.s(h0Var3, tonconnectsession3, str12, bArr3, jSONArray, tL_urlAuthResultRequest.domain, null, null, e2Var4.f34453f.getCurrentTime()), sVar, h0Var3, jSONArray, tL_urlAuthResultRequest));
                    return;
                } catch (Exception e7) {
                    sVar.a(null, org.telegram.ui.Wallet.e2.i("prepare OAuth identity", e7));
                    return;
                }
            case 9:
                TLObject tLObject3 = (TLObject) this.f3209b;
                c5.m mVar = (c5.m) this.f3210c;
                c5.g gVar3 = (c5.g) this.d;
                ih.s sVar2 = (ih.s) this.e;
                Activity activity = (Activity) this.f3211f;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.h;
                List list3 = (List) this.f3212n;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f3213r;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.u1.i().d(mVar.f3801c, new mg.f0(4, gVar3, sVar2));
                    org.telegram.messenger.u1.i().h = new rh.p4(sVar2, 2);
                    org.telegram.messenger.u1 i12 = org.telegram.messenger.u1.i();
                    org.telegram.messenger.c a11 = org.telegram.messenger.c.a(e20.f15506s0);
                    hf.b bVar3 = new hf.b(9, false);
                    bVar3.m0((c5.m) list3.get(0));
                    i12.l(activity, a11, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar3.K()));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    sVar2.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    if (tL_error3 != null) {
                        str2 = tL_error3.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    sVar2.a(bool, str2);
                    return;
                }
            default:
                TLObject tLObject4 = (TLObject) this.f3209b;
                c5.m mVar2 = (c5.m) this.f3210c;
                c5.g gVar4 = (c5.g) this.d;
                q70 q70Var = (q70) this.e;
                Activity activity2 = (Activity) this.f3211f;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.h;
                List list4 = (List) this.f3212n;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f3213r;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.u1.i().d(mVar2.f3801c, new mg.f0(3, gVar4, q70Var));
                    org.telegram.messenger.u1.i().h = new rh.v4(q70Var, 2);
                    org.telegram.messenger.u1 i13 = org.telegram.messenger.u1.i();
                    org.telegram.messenger.c a12 = org.telegram.messenger.c.a(e20.f15506s0);
                    hf.b bVar4 = new hf.b(9, false);
                    bVar4.m0((c5.m) list4.get(0));
                    i13.l(activity2, a12, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar4.K()));
                    return;
                } else if (tLObject4 instanceof TLRPC.TL_boolFalse) {
                    q70Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error4 != null) {
                        str3 = tL_error4.text;
                    } else {
                        str3 = "SERVER_ERROR";
                    }
                    q70Var.a(bool2, str3);
                    return;
                }
        }
    }

    public n(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f3208a = 5;
        this.f3209b = userInfoActivity;
        this.f3210c = tL_error;
        this.d = tLObject;
        this.e = tL_birthday;
        this.f3211f = userFull;
        this.h = tLObject2;
        this.f3213r = iArr;
        this.f3212n = arrayList;
    }
}
