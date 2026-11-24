package defpackage;

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.Wallet.c;
public final class ln0 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;

    public ln0(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
        this.a = (byte) 10;
        this.h = userInfoActivity;
        this.b = tL_error;
        this.c = tLObject;
        this.d = tL_birthday;
        this.e = userFull;
        this.n = tLObject2;
        this.f = iArr;
        this.r = arrayList;
    }

    @Override
    public final void run() {
        String str;
        byte b = this.a;
        String str2 = "SERVER_ERROR";
        Object obj = this.r;
        Object obj2 = this.f;
        Object obj3 = this.n;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        Object obj8 = this.h;
        switch (b) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj7;
                tn0 tn0Var = (tn0) obj8;
                TLObject tLObject = (TLObject) obj6;
                List list = (List) obj5;
                fi0 fi0Var = (fi0) obj4;
                tn0 tn0Var2 = (tn0) obj3;
                d dVar = (d) obj2;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) obj;
                if (tL_error != null) {
                    tn0Var.a(tL_error);
                    return;
                } else if (tLObject != null) {
                    ci0.h().c(((kl8) list.get(0)).c, new ac0(fi0Var, tn0Var2, (byte) 2));
                    ci0.h().h = new nn0(tn0Var, (byte) 0);
                    ci0 h = ci0.h();
                    Activity parentActivity = dVar.getParentActivity();
                    j5 a = j5.a(y6c.t0);
                    lv6 lv6Var = new lv6((byte) 7, false);
                    lv6Var.L((kl8) list.get(0));
                    h.k(parentActivity, a, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(lv6Var.d()));
                    return;
                } else {
                    return;
                }
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj7;
                p8c p8cVar = (p8c) obj8;
                TLObject tLObject2 = (TLObject) obj6;
                List list2 = (List) obj5;
                fi0 fi0Var2 = (fi0) obj4;
                p8c p8cVar2 = (p8c) obj3;
                d dVar2 = (d) obj2;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) obj;
                if (tL_error2 != null) {
                    p8cVar.a(tL_error2);
                    return;
                } else if (tLObject2 != null) {
                    ci0.h().c(((kl8) list2.get(0)).c, new ac0(fi0Var2, p8cVar2, (byte) 1));
                    ci0.h().h = new mn0(p8cVar, (byte) 0);
                    ci0 h2 = ci0.h();
                    Activity parentActivity2 = dVar2.getParentActivity();
                    j5 a2 = j5.a(y6c.t0);
                    lv6 lv6Var2 = new lv6((byte) 7, false);
                    lv6Var2.L((kl8) list2.get(0));
                    h2.k(parentActivity2, a2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(lv6Var2.d()));
                    return;
                } else {
                    return;
                }
            case 2:
                String[] strArr = (String[]) obj7;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj8;
                u41 u41Var = (u41) obj6;
                boolean[] zArr = (boolean[]) obj5;
                f fVar = (f) obj4;
                ImageView imageView = (ImageView) obj3;
                wjb wjbVar = (wjb) obj2;
                int[] iArr = (int[]) obj;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    u41Var.setEnabled(false);
                    return;
                }
                boolean z = zArr[0];
                String str3 = strArr[0];
                fVar.a(str3, new s62(str3, strArr, imageView, wjbVar, z, iArr, u41Var, horizontalScrollView, zArr));
                return;
            case 3:
                w25 w25Var = (w25) obj7;
                r25 r25Var = (r25) obj8;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj6;
                String str4 = (String) obj5;
                byte[] bArr = (byte[]) obj4;
                String str5 = ((t25) obj3).a;
                x15 x15Var = (x15) obj2;
                y05 y05Var = (y05) obj;
                if (w25Var.c(r25Var, tonconnectsession, str4, bArr) && ((str = r25Var.e.client_id) == null || str5.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.id;
                    tonconnectregisterkey.client_id = str5;
                    w25Var.f.sendRequestTyped(tonconnectregisterkey, new hc((byte) 0), new t15(w25Var, x15Var, y05Var, tonconnectsession, str4, bArr, r25Var));
                    return;
                }
                x15Var.a("Wallet or TON Connect session changed. Open the request again.");
                return;
            case 4:
                w25 w25Var2 = (w25) obj7;
                y05 y05Var2 = (y05) obj8;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj6;
                String str6 = (String) obj5;
                byte[] bArr2 = (byte[]) obj4;
                r25 r25Var2 = (r25) obj3;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj2;
                x15 x15Var2 = (x15) obj;
                w25Var2.getClass();
                try {
                    gl.c3(new i87(w25Var2, r25Var2, tonconnectsession2, str6, bArr2, w25.r(y05Var2, tonconnectsession2, str6, bArr2, r25Var2.a, r25Var2.b, r25Var2.d, tonconnectchallenge, w25Var2.f.getCurrentTime()), x15Var2, (byte) 9));
                    return;
                } catch (Exception e) {
                    gl.c3(new s15(x15Var2, w25.h("prepare connect challenge", e), (byte) 1));
                    return;
                }
            case 5:
                w25 w25Var3 = (w25) obj7;
                y05 y05Var3 = (y05) obj8;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj6;
                String str7 = (String) obj5;
                byte[] bArr3 = (byte[]) obj4;
                JSONArray jSONArray = (JSONArray) obj3;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj2;
                ae2 ae2Var = (ae2) obj;
                w25Var3.getClass();
                try {
                    gl.c3(new r15(w25Var3, str7, bArr3, tonconnectsession3, w25.s(y05Var3, tonconnectsession3, str7, bArr3, jSONArray, tL_urlAuthResultRequest.domain, null, null, w25Var3.f.getCurrentTime()), ae2Var, y05Var3, jSONArray, tL_urlAuthResultRequest));
                    return;
                } catch (Exception e2) {
                    ae2Var.a(null, w25.h("prepare OAuth identity", e2));
                    return;
                }
            case 6:
                String str8 = (String) obj5;
                w25 w25Var4 = ((c) obj8).g;
                u36 u36Var = new u36((a46) obj7, (String) obj, (byte) 1);
                w25Var4.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = (String) obj6;
                tonconnectcreatesession.manifest_url = str8;
                w25Var4.f.sendRequestTyped(tonconnectcreatesession, new hc((byte) 0), new v15(w25Var4, u36Var, (String) obj4, str8, (String) obj3, (String) obj2, (byte) 0));
                return;
            case 7:
                im7 notificationsController = ((ad7) obj7).getNotificationsController();
                Collection values = ((HashMap) obj).values();
                notificationsController.getMessagesController().b4((ArrayList) obj4, true);
                notificationsController.getMessagesController().V3((ArrayList) obj3, true);
                notificationsController.getMessagesController().Y3((ArrayList) obj2);
                im7.l0.c(new vz4(notificationsController, (ArrayList) obj6, (vf6) obj8, (ArrayList) obj5, values, (byte) 29));
                return;
            case 8:
                TLObject tLObject3 = (TLObject) obj6;
                kl8 kl8Var = (kl8) obj8;
                fi0 fi0Var3 = (fi0) obj4;
                ae2 ae2Var2 = (ae2) obj3;
                Activity activity = (Activity) obj2;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) obj;
                List list3 = (List) obj5;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj7;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    ci0.h().c(kl8Var.c, new ac0(fi0Var3, ae2Var2, (byte) 5));
                    ci0.h().h = new qra(ae2Var2, (byte) 2);
                    ci0 h3 = ci0.h();
                    j5 a3 = j5.a(y6c.t0);
                    lv6 lv6Var3 = new lv6((byte) 7, false);
                    lv6Var3.L((kl8) list3.get(0));
                    h3.k(activity, a3, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(lv6Var3.d()));
                    return;
                }
                boolean z2 = tLObject3 instanceof TLRPC.TL_boolFalse;
                Boolean bool = Boolean.FALSE;
                if (z2) {
                    ae2Var2.a(bool, "PURCHASE_FORBIDDEN");
                    return;
                }
                if (tL_error3 != null) {
                    str2 = tL_error3.text;
                }
                ae2Var2.a(bool, str2);
                return;
            case 9:
                TLObject tLObject4 = (TLObject) obj6;
                kl8 kl8Var2 = (kl8) obj8;
                fi0 fi0Var4 = (fi0) obj4;
                et4 et4Var = (et4) obj3;
                Activity activity2 = (Activity) obj2;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj;
                List list4 = (List) obj5;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj7;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    ci0.h().c(kl8Var2.c, new ac0(fi0Var4, et4Var, (byte) 4));
                    ci0.h().h = new vra(et4Var, (byte) 2);
                    ci0 h4 = ci0.h();
                    j5 a4 = j5.a(y6c.t0);
                    lv6 lv6Var4 = new lv6((byte) 7, false);
                    lv6Var4.L((kl8) list4.get(0));
                    h4.k(activity2, a4, tL_inputStorePaymentStarsGift, Collections.singletonList(lv6Var4.d()));
                    return;
                }
                boolean z3 = tLObject4 instanceof TLRPC.TL_boolFalse;
                Boolean bool2 = Boolean.FALSE;
                if (z3) {
                    et4Var.a(bool2, "PURCHASE_FORBIDDEN");
                    return;
                }
                if (tL_error4 != null) {
                    str2 = tL_error4.text;
                }
                et4Var.a(bool2, str2);
                return;
            default:
                ((UserInfoActivity) obj8).f0((TLRPC.TL_error) obj7, (TLObject) obj6, (TL_account.TL_birthday) obj5, (TLRPC.UserFull) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj);
                return;
        }
    }

    public ln0(TLObject tLObject, kl8 kl8Var, fi0 fi0Var, i8c i8cVar, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.c = tLObject;
        this.h = kl8Var;
        this.e = fi0Var;
        this.n = i8cVar;
        this.f = activity;
        this.r = inputStorePaymentPurpose;
        this.d = list;
        this.b = tL_error;
    }

    public ln0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        this.a = b;
        this.b = obj;
        this.h = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.n = obj6;
        this.f = obj7;
        this.r = obj8;
    }
}
