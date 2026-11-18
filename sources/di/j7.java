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
import org.telegram.messenger.j10;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.messenger.xs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.n31;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.l90;
import org.telegram.ui.p51;
import org.telegram.ui.r90;
public final class j7 implements Runnable {
    public final int f9085a;
    public final Object f9086b;
    public final Object f9087c;
    public final Object d;
    public final Object f9088e;
    public final Object f9089f;
    public final Object h;
    public final Object f9090n;
    public final Object f9091r;

    public j7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i7) {
        this.f9085a = i7;
        this.f9086b = obj;
        this.f9087c = obj2;
        this.d = obj3;
        this.f9090n = obj4;
        this.f9088e = obj5;
        this.f9091r = obj6;
        this.f9089f = obj7;
        this.h = obj8;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        String str3;
        switch (this.f9085a) {
            case 0:
                TLObject tLObject = (TLObject) this.f9086b;
                f5.m mVar = (f5.m) this.f9087c;
                f5.f fVar = (f5.f) this.d;
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) this.f9090n;
                Activity activity = (Activity) this.f9088e;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f9091r;
                List list = (List) this.f9089f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.r1.i().d(mVar.f11304c, new d7(1, fVar, e0Var));
                    org.telegram.messenger.r1.i().h = new w6(e0Var, 2);
                    org.telegram.messenger.r1 i7 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a10 = org.telegram.messenger.c.a(j10.f24773t0);
                    wf.b bVar = new wf.b(17, false);
                    bVar.R((f5.m) list.get(0));
                    i7.l(activity, a10, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(bVar.q()));
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    e0Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool = Boolean.FALSE;
                    if (tL_error != null) {
                        str = tL_error.text;
                    } else {
                        str = "SERVER_ERROR";
                    }
                    e0Var.a(bool, str);
                    return;
                }
            case 1:
                TLObject tLObject2 = (TLObject) this.f9086b;
                f5.m mVar2 = (f5.m) this.f9087c;
                f5.f fVar2 = (f5.f) this.d;
                bi.c8 c8Var = (bi.c8) this.f9090n;
                Activity activity2 = (Activity) this.f9088e;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) this.f9091r;
                List list2 = (List) this.f9089f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.r1.i().d(mVar2.f11304c, new d7(0, fVar2, c8Var));
                    org.telegram.messenger.r1.i().h = new e7(c8Var, 2);
                    org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
                    org.telegram.messenger.c a11 = org.telegram.messenger.c.a(j10.f24773t0);
                    wf.b bVar2 = new wf.b(17, false);
                    bVar2.R((f5.m) list2.get(0));
                    i10.l(activity2, a11, tL_inputStorePaymentStarsGift, Collections.singletonList(bVar2.q()));
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                    c8Var.a(Boolean.FALSE, "PURCHASE_FORBIDDEN");
                    return;
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error2 != null) {
                        str2 = tL_error2.text;
                    } else {
                        str2 = "SERVER_ERROR";
                    }
                    c8Var.a(bool2, str2);
                    return;
                }
            case 2:
                String[] strArr = (String[]) this.f9086b;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f9087c;
                hi.d dVar = (hi.d) this.d;
                boolean[] zArr = (boolean[]) this.f9090n;
                hi.e7 e7Var = (hi.e7) this.f9088e;
                ImageView imageView = (ImageView) this.f9091r;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.f9089f;
                int[] iArr = (int[]) this.h;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    dVar.setEnabled(false);
                    return;
                }
                boolean z10 = zArr[0];
                String str4 = strArr[0];
                e7Var.a(str4, new oi.c(str4, strArr, imageView, i6Var, z10, iArr, dVar, horizontalScrollView, zArr));
                return;
            case 3:
                a0.h hVar = (a0.h) this.f9087c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.f9090n;
                xs notificationsController = ((tr) this.f9086b).getNotificationsController();
                Collection values = ((HashMap) this.h).values();
                notificationsController.getMessagesController().f4((ArrayList) this.f9088e, true);
                notificationsController.getMessagesController().Z3((ArrayList) this.f9091r, true);
                notificationsController.getMessagesController().c4((ArrayList) this.f9089f);
                xs.f27959l0.c(new fn(notificationsController, arrayList, hVar, arrayList2, values, 14));
                return;
            case 4:
                String str5 = (String) this.f9090n;
                String str6 = (String) this.f9088e;
                String str7 = (String) this.f9091r;
                String str8 = (String) this.f9089f;
                org.telegram.ui.Wallet.l2 l2Var = ((org.telegram.ui.Wallet.u0) this.f9087c).f45088g;
                l90 l90Var = new l90((r90) this.f9086b, (String) this.h, 1);
                l2Var.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = (String) this.d;
                tonconnectcreatesession.manifest_url = str5;
                l2Var.f44483f.sendRequestTyped(tonconnectcreatesession, new d3.b(1), new s1(l2Var, l90Var, str6, str5, str7, str8, 1));
                return;
            case 5:
                UserInfoActivity.d0((UserInfoActivity) this.f9087c, (TLRPC.TL_error) this.h, (TLObject) this.f9086b, (TL_account.TL_birthday) this.d, (TLRPC.UserFull) this.f9090n, (TLObject) this.f9088e, (int[]) this.f9091r, (ArrayList) this.f9089f);
                return;
            case 6:
                org.telegram.ui.Wallet.l2 l2Var2 = (org.telegram.ui.Wallet.l2) this.f9086b;
                org.telegram.ui.Wallet.g2 g2Var = (org.telegram.ui.Wallet.g2) this.f9087c;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.d;
                String str9 = (String) this.f9090n;
                byte[] bArr = (byte[]) this.f9088e;
                String str10 = ((org.telegram.ui.Wallet.i2) this.f9091r).f44341a;
                p51 p51Var = (p51) this.f9089f;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) this.h;
                if (l2Var2.d(g2Var, tonconnectsession, str9, bArr) && ((str3 = g2Var.f44250e.client_id) == null || str10.equalsIgnoreCase(str3))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.f28667id;
                    tonconnectregisterkey.client_id = str10;
                    l2Var2.f44483f.sendRequestTyped(tonconnectregisterkey, new d3.b(1), new org.telegram.ui.Wallet.l1(l2Var2, p51Var, r0Var, tonconnectsession, str9, bArr, g2Var));
                    return;
                }
                p51Var.a("Wallet or TON Connect session changed. Open the request again.");
                return;
            case 7:
                org.telegram.ui.Wallet.l2 l2Var3 = (org.telegram.ui.Wallet.l2) this.f9086b;
                org.telegram.ui.Wallet.r0 r0Var2 = (org.telegram.ui.Wallet.r0) this.f9087c;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.d;
                String str11 = (String) this.f9090n;
                byte[] bArr2 = (byte[]) this.f9088e;
                org.telegram.ui.Wallet.g2 g2Var2 = (org.telegram.ui.Wallet.g2) this.f9091r;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) this.f9089f;
                p51 p51Var2 = (p51) this.h;
                l2Var3.getClass();
                try {
                    org.telegram.messenger.g0.g3(new m6(l2Var3, g2Var2, tonconnectsession2, str11, bArr2, org.telegram.ui.Wallet.l2.r(r0Var2, tonconnectsession2, str11, bArr2, g2Var2.f44247a, g2Var2.f44248b, g2Var2.d, tonconnectchallenge, l2Var3.f44483f.getCurrentTime()), p51Var2, 12));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.k1(p51Var2, org.telegram.ui.Wallet.l2.i("prepare connect challenge", e10), 1));
                    return;
                }
            case 8:
                org.telegram.ui.Wallet.l2 l2Var4 = (org.telegram.ui.Wallet.l2) this.f9086b;
                org.telegram.ui.Wallet.r0 r0Var3 = (org.telegram.ui.Wallet.r0) this.f9087c;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) this.d;
                String str12 = (String) this.f9090n;
                byte[] bArr3 = (byte[]) this.f9088e;
                JSONArray jSONArray = (JSONArray) this.f9091r;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.f9089f;
                org.telegram.ui.Wallet.e0 e0Var2 = (org.telegram.ui.Wallet.e0) this.h;
                l2Var4.getClass();
                try {
                    org.telegram.messenger.g0.g3(new n31(l2Var4, str12, bArr3, tonconnectsession3, org.telegram.ui.Wallet.l2.s(r0Var3, tonconnectsession3, str12, bArr3, jSONArray, tL_urlAuthResultRequest.domain, null, null, l2Var4.f44483f.getCurrentTime()), e0Var2, r0Var3, jSONArray, tL_urlAuthResultRequest));
                    return;
                } catch (Exception e11) {
                    e0Var2.a(null, org.telegram.ui.Wallet.l2.i("prepare OAuth identity", e11));
                    return;
                }
            case 9:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                wg.v vVar = (wg.v) this.f9087c;
                TLObject tLObject3 = (TLObject) this.f9086b;
                List list3 = (List) this.f9089f;
                f5.f fVar3 = (f5.f) this.d;
                wg.v vVar2 = (wg.v) this.f9090n;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f9088e;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f9091r;
                if (tL_error3 != null) {
                    vVar.a(tL_error3);
                    return;
                } else if (tLObject3 != null) {
                    org.telegram.messenger.r1.i().d(((f5.m) list3.get(0)).f11304c, new d7(5, fVar3, vVar2));
                    org.telegram.messenger.r1.i().h = new wg.p(vVar, 0);
                    org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
                    Activity parentActivity = h2Var.getParentActivity();
                    org.telegram.messenger.c a12 = org.telegram.messenger.c.a(j10.f24773t0);
                    wf.b bVar3 = new wf.b(17, false);
                    bVar3.R((f5.m) list3.get(0));
                    i11.l(parentActivity, a12, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(bVar3.q()));
                    return;
                } else {
                    return;
                }
            default:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                x10 x10Var = (x10) this.f9087c;
                TLObject tLObject4 = (TLObject) this.f9086b;
                List list4 = (List) this.f9089f;
                f5.f fVar4 = (f5.f) this.d;
                x10 x10Var2 = (x10) this.f9090n;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) this.f9088e;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f9091r;
                if (tL_error4 != null) {
                    x10Var.a(tL_error4);
                    return;
                } else if (tLObject4 != null) {
                    org.telegram.messenger.r1.i().d(((f5.m) list4.get(0)).f11304c, new d7(4, fVar4, x10Var2));
                    org.telegram.messenger.r1.i().h = new hi.i9(x10Var, 1);
                    org.telegram.messenger.r1 i12 = org.telegram.messenger.r1.i();
                    Activity parentActivity2 = h2Var2.getParentActivity();
                    org.telegram.messenger.c a13 = org.telegram.messenger.c.a(j10.f24773t0);
                    wf.b bVar4 = new wf.b(17, false);
                    bVar4.R((f5.m) list4.get(0));
                    i12.l(parentActivity2, a13, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(bVar4.q()));
                    return;
                } else {
                    return;
                }
        }
    }

    public j7(TLRPC.TL_error tL_error, x10 x10Var, TLObject tLObject, List list, f5.f fVar, x10 x10Var2, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, int i7) {
        this.f9085a = i7;
        this.h = tL_error;
        this.f9087c = x10Var;
        this.f9086b = tLObject;
        this.f9089f = list;
        this.d = fVar;
        this.f9090n = x10Var2;
        this.f9088e = h2Var;
        this.f9091r = inputStorePaymentPurpose;
    }

    public j7(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.f9085a = 5;
        this.f9087c = userInfoActivity;
        this.h = tL_error;
        this.f9086b = tLObject;
        this.d = tL_birthday;
        this.f9090n = userFull;
        this.f9088e = tLObject2;
        this.f9091r = iArr;
        this.f9089f = arrayList;
    }
}
