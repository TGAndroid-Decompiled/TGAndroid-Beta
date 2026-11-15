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
import org.telegram.messenger.at;
import org.telegram.messenger.jn;
import org.telegram.messenger.m10;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.d31;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.j90;
import org.telegram.ui.q90;
import org.telegram.ui.x21;
public final class g7 implements Runnable {
    public final int f8602a;
    public final Object f8603b;
    public final Object f8604c;
    public final Object d;
    public final Object f8605e;
    public final Object f8606f;
    public final Object h;
    public final Object f8607n;
    public final Object f8608r;

    public g7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i7) {
        this.f8602a = i7;
        this.f8603b = obj;
        this.f8604c = obj2;
        this.d = obj3;
        this.f8607n = obj4;
        this.f8605e = obj5;
        this.f8608r = obj6;
        this.f8606f = obj7;
        this.h = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        String str3;
        switch (this.f8602a) {
            case 0:
                TLObject tLObject = (TLObject) this.f8603b;
                f5.m mVar = (f5.m) this.f8604c;
                f5.f fVar = (f5.f) this.d;
                org.telegram.ui.Wallet.t1 t1Var = (org.telegram.ui.Wallet.t1) this.f8607n;
                Activity activity = (Activity) this.f8605e;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f8608r;
                List list = (List) this.f8606f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.r1.i().d(mVar.f10996c, new a7(1, fVar, t1Var));
                    org.telegram.messenger.r1.i().h = new t6(t1Var, 2);
                    org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(m10.f24934t0);
                    wf.b bVar = new wf.b(17, false);
                    bVar.R((f5.m) list.get(0));
                    i7.l(activity, a10, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar.p()));
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
                TLObject tLObject2 = (TLObject) this.f8603b;
                f5.m mVar2 = (f5.m) this.f8604c;
                f5.f fVar2 = (f5.f) this.d;
                bi.v5 v5Var = (bi.v5) this.f8607n;
                Activity activity2 = (Activity) this.f8605e;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.f8608r;
                List list2 = (List) this.f8606f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.r1.i().d(mVar2.f10996c, new a7(0, fVar2, v5Var));
                    org.telegram.messenger.r1.i().h = new b7(v5Var, 2);
                    org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a11 = org.telegram.messenger.c.a(m10.f24934t0);
                    wf.b bVar2 = new wf.b(17, false);
                    bVar2.R((f5.m) list2.get(0));
                    i10.l(activity2, a11, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar2.p()));
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    v5Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error2 != null) {
                        str2 = tL_error2.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    v5Var.a(bool2, str2);
                    return;
                }
            case 2:
                String[] strArr = (String[]) this.f8603b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f8604c;
                hi.d dVar = (hi.d) this.d;
                boolean[] zArr = (boolean[]) this.f8607n;
                hi.q4 q4Var = (hi.q4) this.f8605e;
                ImageView imageView = (ImageView) this.f8608r;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f8606f;
                int[] iArr = (int[]) this.h;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    return;
                }
                boolean z10 = zArr[0];
                String str4 = strArr[0];
                q4Var.a(str4, new oi.c(str4, strArr, imageView, e6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                return;
            case 3:
                a0.h hVar = (a0.h) this.f8604c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f8607n;
                at notificationsController = ((vr) this.f8603b).getNotificationsController();
                Collection values = ((HashMap) this.h).values();
                notificationsController.getMessagesController().Y3((ArrayList) this.f8605e, true);
                notificationsController.getMessagesController().S3((ArrayList) this.f8608r, true);
                notificationsController.getMessagesController().V3((ArrayList) this.f8606f);
                at.f22558l0.c(new jn(notificationsController, arrayList, hVar, arrayList2, values, 14));
                return;
            case 4:
                String str5 = (String) this.f8607n;
                String str6 = (String) this.f8605e;
                String str7 = (String) this.f8608r;
                String str8 = (String) this.f8606f;
                org.telegram.ui.Wallet.d2 d2Var = ((org.telegram.ui.Wallet.l0) this.f8604c).f44083g;
                j90 j90Var = new j90((q90) this.f8603b, (String) this.h, 1);
                d2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = (String) this.d;
                tonconnectcreatesession.manifest_url = str5;
                d2Var.f43733f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new org.telegram.ui.Wallet.d1(d2Var, j90Var, str6, str5, str7, str8, 0));
                return;
            case 5:
                UserInfoActivity.d0((UserInfoActivity) this.f8604c, (TLRPC.TL_error) this.h, (TLObject) this.f8603b, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f8607n, (TLObject) this.f8605e, (int[]) this.f8608r, (ArrayList) this.f8606f);
                return;
            case 6:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.f8603b;
                org.telegram.ui.Wallet.y1 y1Var = (org.telegram.ui.Wallet.y1) this.f8604c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.f8607n;
                byte[] bArr = (byte[]) this.f8605e;
                String str10 = ((org.telegram.ui.Wallet.a2) this.f8608r).f43468a;
                x21 x21Var = (x21) this.f8606f;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) this.h;
                if (d2Var2.d(y1Var, tonconnectsession, str9, bArr) && ((str3 = y1Var.f44708e.client_id) == null || str10.equalsIgnoreCase(str3))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f28313id;
                    tonconnectregisterkey.client_id = str10;
                    d2Var2.f43733f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.ui.Wallet.c1(d2Var2, x21Var, i0Var, tonconnectsession, str9, bArr, y1Var));
                    return;
                }
                x21Var.a("Wallet or TON Connect session changed. Open the request again.");
                return;
            case 7:
                org.telegram.ui.Wallet.d2 d2Var3 = (org.telegram.ui.Wallet.d2) this.f8603b;
                org.telegram.ui.Wallet.i0 i0Var2 = (org.telegram.ui.Wallet.i0) this.f8604c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.f8607n;
                byte[] bArr2 = (byte[]) this.f8605e;
                org.telegram.ui.Wallet.y1 y1Var2 = (org.telegram.ui.Wallet.y1) this.f8608r;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f8606f;
                x21 x21Var2 = (x21) this.h;
                d2Var3.getClass();
                try {
                    org.telegram.messenger.g0.h3(new j6(d2Var3, y1Var2, tonconnectsession2, str11, bArr2, org.telegram.ui.Wallet.d2.r(i0Var2, tonconnectsession2, str11, bArr2, y1Var2.f44705a, y1Var2.f44706b, y1Var2.d, tonconnectchallenge, d2Var3.f43733f.getCurrentTime()), x21Var2, 13));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.b1(x21Var2, org.telegram.ui.Wallet.d2.i("prepare connect challenge", e10), 1));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.d2 d2Var4 = (org.telegram.ui.Wallet.d2) this.f8603b;
                org.telegram.ui.Wallet.i0 i0Var3 = (org.telegram.ui.Wallet.i0) this.f8604c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str12 = (String) this.f8607n;
                byte[] bArr3 = (byte[]) this.f8605e;
                JSONArray jSONArray = (JSONArray) this.f8608r;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f8606f;
                org.telegram.ui.Wallet.t1 t1Var2 = (org.telegram.ui.Wallet.t1) this.h;
                d2Var4.getClass();
                try {
                    org.telegram.messenger.g0.h3(new d31(d2Var4, str12, bArr3, tonconnectsession3, org.telegram.ui.Wallet.d2.s(i0Var3, tonconnectsession3, str12, bArr3, jSONArray, tL_urlAuthResultRequest.domain, null, null, d2Var4.f43733f.getCurrentTime()), t1Var2, i0Var3, jSONArray, tL_urlAuthResultRequest));
                    return;
                } catch (Exception e11) {
                    t1Var2.a(null, org.telegram.ui.Wallet.d2.i("prepare OAuth identity", e11));
                    return;
                }
            case 9:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                wg.t tVar = (wg.t) this.f8604c;
                TLObject tLObject3 = (TLObject) this.f8603b;
                List list3 = (List) this.f8606f;
                f5.f fVar3 = (f5.f) this.d;
                wg.t tVar2 = (wg.t) this.f8607n;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f8605e;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f8608r;
                if (tL_error3 != null) {
                    tVar.a(tL_error3);
                    return;
                } else if (tLObject3 != null) {
                    org.telegram.messenger.r1.i().d(((f5.m) list3.get(0)).f10996c, new a7(5, fVar3, tVar2));
                    org.telegram.messenger.r1.i().h = new wg.p(tVar, 0);
                    org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
                    Activity parentActivity = e2Var.getParentActivity();
                    org.telegram.messenger.c a12 = org.telegram.messenger.c.a(m10.f24934t0);
                    wf.b bVar3 = new wf.b(17, false);
                    bVar3.R((f5.m) list3.get(0));
                    i11.l(parentActivity, a12, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar3.p()));
                    return;
                } else {
                    return;
                }
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                z10 z10Var = (z10) this.f8604c;
                TLObject tLObject4 = (TLObject) this.f8603b;
                List list4 = (List) this.f8606f;
                f5.f fVar4 = (f5.f) this.d;
                z10 z10Var2 = (z10) this.f8607n;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.f8605e;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f8608r;
                if (tL_error4 != null) {
                    z10Var.a(tL_error4);
                    return;
                } else if (tLObject4 != null) {
                    org.telegram.messenger.r1.i().d(((f5.m) list4.get(0)).f10996c, new a7(4, fVar4, z10Var2));
                    org.telegram.messenger.r1.i().h = new hi.h9(z10Var, 1);
                    org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
                    Activity parentActivity2 = e2Var2.getParentActivity();
                    org.telegram.messenger.c a13 = org.telegram.messenger.c.a(m10.f24934t0);
                    wf.b bVar4 = new wf.b(17, false);
                    bVar4.R((f5.m) list4.get(0));
                    i12.l(parentActivity2, a13, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar4.p()));
                    return;
                } else {
                    return;
                }
        }
    }

    public g7(TLRPC.TL_error tL_error, z10 z10Var, TLObject tLObject, List list, f5.f fVar, z10 z10Var2, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.f8602a = i7;
        this.h = tL_error;
        this.f8604c = z10Var;
        this.f8603b = tLObject;
        this.f8606f = list;
        this.d = fVar;
        this.f8607n = z10Var2;
        this.f8605e = e2Var;
        this.f8608r = inputStorePaymentPurpose;
    }

    public g7(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f8602a = 5;
        this.f8604c = userInfoActivity;
        this.h = tL_error;
        this.f8603b = tLObject;
        this.d = tL_birthday;
        this.f8607n = userFull;
        this.f8605e = tLObject2;
        this.f8608r = iArr;
        this.f8606f = arrayList;
    }
}
