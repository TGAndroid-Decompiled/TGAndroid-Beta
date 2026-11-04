package ci;

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
import org.telegram.messenger.cn;
import org.telegram.messenger.h10;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.us;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.t21;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.e51;
import org.telegram.ui.f90;
import org.telegram.ui.m90;
public final class o7 implements Runnable {
    public final int f5688a;
    public final Object f5689b;
    public final Object f5690c;
    public final Object d;
    public final Object f5691e;
    public final Object f5692f;
    public final Object h;
    public final Object f5693n;
    public final Object f5694r;

    public o7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i3) {
        this.f5688a = i3;
        this.f5689b = obj;
        this.f5690c = obj2;
        this.d = obj3;
        this.f5693n = obj4;
        this.f5691e = obj5;
        this.f5694r = obj6;
        this.f5692f = obj7;
        this.h = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        String str3;
        switch (this.f5688a) {
            case 0:
                TLObject tLObject = (TLObject) this.f5689b;
                e5.l lVar = (e5.l) this.f5690c;
                e5.f fVar = (e5.f) this.d;
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.f5693n;
                Activity activity = (Activity) this.f5691e;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f5694r;
                List list = (List) this.f5692f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.r1.i().d(lVar.f9611c, new i7(1, fVar, s1Var));
                    org.telegram.messenger.r1.i().h = new c7(s1Var, 2);
                    org.telegram.messenger.r1 i3 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(h10.f22829t0);
                    ?? obj = new Object();
                    obj.B((e5.l) list.get(0));
                    i3.l(activity, a10, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(obj.k()));
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    s1Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    if (tL_error != null) {
                        str = tL_error.text;
                    } else {
                        str = "SERVER_ERROR";
                    }
                    s1Var.a(bool, str);
                    return;
                }
            case 1:
                TLObject tLObject2 = (TLObject) this.f5689b;
                e5.l lVar2 = (e5.l) this.f5690c;
                e5.f fVar2 = (e5.f) this.d;
                ai.d6 d6Var = (ai.d6) this.f5693n;
                Activity activity2 = (Activity) this.f5691e;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.f5694r;
                List list2 = (List) this.f5692f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.r1.i().d(lVar2.f9611c, new i7(0, fVar2, d6Var));
                    org.telegram.messenger.r1.i().h = new j7(d6Var, 2);
                    org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a11 = org.telegram.messenger.c.a(h10.f22829t0);
                    ?? obj2 = new Object();
                    obj2.B((e5.l) list2.get(0));
                    i10.l(activity2, a11, tL_inputStorePaymentStarsGift, Collections.singletonList(obj2.k()));
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    d6Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error2 != null) {
                        str2 = tL_error2.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    d6Var.a(bool2, str2);
                    return;
                }
            case 2:
                String[] strArr = (String[]) this.f5689b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f5690c;
                gi.d dVar = (gi.d) this.d;
                boolean[] zArr = (boolean[]) this.f5693n;
                gi.q4 q4Var = (gi.q4) this.f5691e;
                ImageView imageView = (ImageView) this.f5694r;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f5692f;
                int[] iArr = (int[]) this.h;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    return;
                }
                boolean z10 = zArr[0];
                String str4 = strArr[0];
                q4Var.a(str4, new mi.c(str4, strArr, imageView, e6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                return;
            case 3:
                a0.h hVar = (a0.h) this.f5690c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f5693n;
                us notificationsController = ((qr) this.f5689b).getNotificationsController();
                Collection values = ((HashMap) this.h).values();
                notificationsController.getMessagesController().Y3((ArrayList) this.f5691e, true);
                notificationsController.getMessagesController().S3((ArrayList) this.f5694r, true);
                notificationsController.getMessagesController().V3((ArrayList) this.f5692f);
                us.f25748l0.c(new cn(notificationsController, arrayList, hVar, arrayList2, values, 14));
                return;
            case 4:
                String str5 = (String) this.f5693n;
                String str6 = (String) this.f5691e;
                String str7 = (String) this.f5694r;
                String str8 = (String) this.f5692f;
                org.telegram.ui.Wallet.c2 c2Var = ((org.telegram.ui.Wallet.k0) this.f5690c).f42723g;
                f90 f90Var = new f90((m90) this.f5689b, (String) this.h, 1);
                c2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = (String) this.d;
                tonconnectcreatesession.manifest_url = str5;
                c2Var.f42381f.sendRequestTyped(tonconnectcreatesession, new c3.b(1), new org.telegram.ui.Wallet.c1(c2Var, f90Var, str6, str5, str7, str8, 0));
                return;
            case 5:
                UserInfoActivity.d0((UserInfoActivity) this.f5690c, (TLRPC.TL_error) this.h, (TLObject) this.f5689b, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f5693n, (TLObject) this.f5691e, (int[]) this.f5694r, (ArrayList) this.f5692f);
                return;
            case 6:
                org.telegram.ui.Wallet.c2 c2Var2 = (org.telegram.ui.Wallet.c2) this.f5689b;
                org.telegram.ui.Wallet.x1 x1Var = (org.telegram.ui.Wallet.x1) this.f5690c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.f5693n;
                byte[] bArr = (byte[]) this.f5691e;
                String str10 = ((org.telegram.ui.Wallet.z1) this.f5694r).f43494a;
                e51 e51Var = (e51) this.f5692f;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.h;
                if (c2Var2.d(x1Var, tonconnectsession, str9, bArr) && ((str3 = x1Var.f43387e.client_id) == null || str10.equalsIgnoreCase(str3))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f27264id;
                    tonconnectregisterkey.client_id = str10;
                    c2Var2.f42381f.sendRequestTyped(tonconnectregisterkey, new c3.b(1), new org.telegram.ui.Wallet.b1(c2Var2, e51Var, h0Var, tonconnectsession, str9, bArr, x1Var));
                    return;
                }
                e51Var.a("Wallet or TON Connect session changed. Open the request again.");
                return;
            case 7:
                org.telegram.ui.Wallet.c2 c2Var3 = (org.telegram.ui.Wallet.c2) this.f5689b;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.f5690c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.f5693n;
                byte[] bArr2 = (byte[]) this.f5691e;
                org.telegram.ui.Wallet.x1 x1Var2 = (org.telegram.ui.Wallet.x1) this.f5694r;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f5692f;
                e51 e51Var2 = (e51) this.h;
                c2Var3.getClass();
                try {
                    org.telegram.messenger.g0.h3(new s6(c2Var3, x1Var2, tonconnectsession2, str11, bArr2, org.telegram.ui.Wallet.c2.r(h0Var2, tonconnectsession2, str11, bArr2, x1Var2.f43384a, x1Var2.f43385b, x1Var2.d, tonconnectchallenge, c2Var3.f42381f.getCurrentTime()), e51Var2, 13));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.a1(e51Var2, org.telegram.ui.Wallet.c2.i("prepare connect challenge", e10), 1));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.c2 c2Var4 = (org.telegram.ui.Wallet.c2) this.f5689b;
                org.telegram.ui.Wallet.h0 h0Var3 = (org.telegram.ui.Wallet.h0) this.f5690c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str12 = (String) this.f5693n;
                byte[] bArr3 = (byte[]) this.f5691e;
                JSONArray jSONArray = (JSONArray) this.f5694r;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f5692f;
                org.telegram.ui.Wallet.s1 s1Var2 = (org.telegram.ui.Wallet.s1) this.h;
                c2Var4.getClass();
                try {
                    org.telegram.messenger.g0.h3(new t21(c2Var4, str12, bArr3, tonconnectsession3, org.telegram.ui.Wallet.c2.s(h0Var3, tonconnectsession3, str12, bArr3, jSONArray, tL_urlAuthResultRequest.domain, null, null, c2Var4.f42381f.getCurrentTime()), s1Var2, h0Var3, jSONArray, tL_urlAuthResultRequest));
                    return;
                } catch (Exception e11) {
                    s1Var2.a(null, org.telegram.ui.Wallet.c2.i("prepare OAuth identity", e11));
                    return;
                }
            case 9:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                xg.v vVar = (xg.v) this.f5690c;
                TLObject tLObject3 = (TLObject) this.f5689b;
                List list3 = (List) this.f5692f;
                e5.f fVar3 = (e5.f) this.d;
                xg.v vVar2 = (xg.v) this.f5693n;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f5691e;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f5694r;
                if (tL_error3 != null) {
                    vVar.a(tL_error3);
                    return;
                } else if (tLObject3 != null) {
                    org.telegram.messenger.r1.i().d(((e5.l) list3.get(0)).f9611c, new i7(5, fVar3, vVar2));
                    org.telegram.messenger.r1.i().h = new xg.r(vVar, 0);
                    org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
                    Activity parentActivity = d2Var.getParentActivity();
                    org.telegram.messenger.c a12 = org.telegram.messenger.c.a(h10.f22829t0);
                    ?? obj3 = new Object();
                    obj3.B((e5.l) list3.get(0));
                    i11.l(parentActivity, a12, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(obj3.k()));
                    return;
                } else {
                    return;
                }
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                u10 u10Var = (u10) this.f5690c;
                TLObject tLObject4 = (TLObject) this.f5689b;
                List list4 = (List) this.f5692f;
                e5.f fVar4 = (e5.f) this.d;
                u10 u10Var2 = (u10) this.f5693n;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.f5691e;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f5694r;
                if (tL_error4 != null) {
                    u10Var.a(tL_error4);
                    return;
                } else if (tLObject4 != null) {
                    org.telegram.messenger.r1.i().d(((e5.l) list4.get(0)).f9611c, new i7(4, fVar4, u10Var2));
                    org.telegram.messenger.r1.i().h = new gi.k9(u10Var, 1);
                    org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
                    Activity parentActivity2 = d2Var2.getParentActivity();
                    org.telegram.messenger.c a13 = org.telegram.messenger.c.a(h10.f22829t0);
                    ?? obj4 = new Object();
                    obj4.B((e5.l) list4.get(0));
                    i12.l(parentActivity2, a13, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(obj4.k()));
                    return;
                } else {
                    return;
                }
        }
    }

    public o7(TLRPC.TL_error tL_error, u10 u10Var, TLObject tLObject, List list, e5.f fVar, u10 u10Var2, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i3) {
        this.f5688a = i3;
        this.h = tL_error;
        this.f5690c = u10Var;
        this.f5689b = tLObject;
        this.f5692f = list;
        this.d = fVar;
        this.f5693n = u10Var2;
        this.f5691e = d2Var;
        this.f5694r = inputStorePaymentPurpose;
    }

    public o7(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f5688a = 5;
        this.f5690c = userInfoActivity;
        this.h = tL_error;
        this.f5689b = tLObject;
        this.d = tL_birthday;
        this.f5693n = userFull;
        this.f5691e = tLObject2;
        this.f5694r = iArr;
        this.f5692f = arrayList;
    }
}
