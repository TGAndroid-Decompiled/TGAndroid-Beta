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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.UserInfoActivity;
import org.telegram.ui.Wallet.c;
public final class nn0 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;

    public nn0(UserInfoActivity userInfoActivity, TLRPC.TL_error tL_error, TLObject tLObject, TL_account.TL_birthday tL_birthday, TLRPC.UserFull userFull, TLObject tLObject2, int[] iArr, ArrayList arrayList) {
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
                gi0 gi0Var = (gi0) obj4;
                tn0 tn0Var2 = (tn0) obj3;
                e eVar = (e) obj2;
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) obj;
                if (tL_error != null) {
                    tn0Var.a(tL_error);
                    return;
                } else if (tLObject != null) {
                    di0.h().c(((wo8) list.get(0)).c, new cc0(gi0Var, tn0Var2, (byte) 2));
                    di0.h().h = new en0(tn0Var, (byte) 1);
                    di0 h = di0.h();
                    Activity parentActivity = eVar.getParentActivity();
                    k5 a = k5.a(yac.t0);
                    qx6 qx6Var = new qx6((byte) 7, false);
                    qx6Var.O((wo8) list.get(0));
                    h.k(parentActivity, a, tL_inputStorePaymentPremiumGiveaway, Collections.singletonList(qx6Var.g()));
                    return;
                } else {
                    return;
                }
            case 1:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj7;
                pcc pccVar = (pcc) obj8;
                TLObject tLObject2 = (TLObject) obj6;
                List list2 = (List) obj5;
                gi0 gi0Var2 = (gi0) obj4;
                pcc pccVar2 = (pcc) obj3;
                e eVar2 = (e) obj2;
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) obj;
                if (tL_error2 != null) {
                    pccVar.a(tL_error2);
                    return;
                } else if (tLObject2 != null) {
                    di0.h().c(((wo8) list2.get(0)).c, new cc0(gi0Var2, pccVar2, (byte) 1));
                    di0.h().h = new jn0(pccVar, (byte) 2);
                    di0 h2 = di0.h();
                    Activity parentActivity2 = eVar2.getParentActivity();
                    k5 a2 = k5.a(yac.t0);
                    qx6 qx6Var2 = new qx6((byte) 7, false);
                    qx6Var2.O((wo8) list2.get(0));
                    h2.k(parentActivity2, a2, tL_inputStorePaymentPremiumGiftCode, Collections.singletonList(qx6Var2.g()));
                    return;
                } else {
                    return;
                }
            case 2:
                String[] strArr = (String[]) obj7;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj8;
                c51 c51Var = (c51) obj6;
                boolean[] zArr = (boolean[]) obj5;
                c cVar = (c) obj4;
                ImageView imageView = (ImageView) obj3;
                vnb vnbVar = (vnb) obj2;
                int[] iArr = (int[]) obj;
                if (TextUtils.isEmpty(strArr[0].trim())) {
                    horizontalScrollView.setVisibility(8);
                    c51Var.setEnabled(false);
                    return;
                }
                boolean z = zArr[0];
                String str3 = strArr[0];
                cVar.a(str3, new j72(str3, strArr, imageView, vnbVar, z, iArr, c51Var, horizontalScrollView, zArr));
                return;
            case 3:
                a55 a55Var = (a55) obj7;
                v45 v45Var = (v45) obj8;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj6;
                String str4 = (String) obj5;
                byte[] bArr = (byte[]) obj4;
                String str5 = ((x45) obj3).a;
                v35 v35Var = (v35) obj2;
                c35 c35Var = (c35) obj;
                if (a55Var.c(v45Var, tonconnectsession, str4, bArr) && ((str = v45Var.e.client_id) == null || str5.equalsIgnoreCase(str))) {
                    TL_wallet.tonConnectRegisterKey tonconnectregisterkey = new TL_wallet.tonConnectRegisterKey();
                    tonconnectregisterkey.session_id = tonconnectsession.id;
                    tonconnectregisterkey.client_id = str5;
                    a55Var.f.sendRequestTyped(tonconnectregisterkey, new ic((byte) 0), new z35(a55Var, v35Var, c35Var, tonconnectsession, str4, bArr, v45Var));
                    return;
                }
                v35Var.a("Wallet or TON Connect session changed. Open the request again.");
                return;
            case 4:
                a55 a55Var2 = (a55) obj7;
                c35 c35Var2 = (c35) obj8;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj6;
                String str6 = (String) obj5;
                byte[] bArr2 = (byte[]) obj4;
                v45 v45Var2 = (v45) obj3;
                TL_wallet.tonConnectChallenge tonconnectchallenge = (TL_wallet.tonConnectChallenge) obj2;
                v35 v35Var2 = (v35) obj;
                a55Var2.getClass();
                try {
                    hl.c3(new ra7(a55Var2, v45Var2, tonconnectsession2, str6, bArr2, a55.r(c35Var2, tonconnectsession2, str6, bArr2, v45Var2.a, v45Var2.b, v45Var2.d, tonconnectchallenge, a55Var2.f.getCurrentTime()), v35Var2, (byte) 9));
                    return;
                } catch (Exception e) {
                    hl.c3(new y35(v35Var2, a55.h("prepare connect challenge", e), (byte) 1));
                    return;
                }
            case 5:
                a55 a55Var3 = (a55) obj7;
                c35 c35Var3 = (c35) obj8;
                TL_wallet.tonConnectSession tonconnectsession3 = (TL_wallet.tonConnectSession) obj6;
                String str7 = (String) obj5;
                byte[] bArr3 = (byte[]) obj4;
                JSONArray jSONArray = (JSONArray) obj3;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj2;
                qe2 qe2Var = (qe2) obj;
                a55Var3.getClass();
                try {
                    hl.c3(new x35(a55Var3, str7, bArr3, tonconnectsession3, a55.s(c35Var3, tonconnectsession3, str7, bArr3, jSONArray, tL_urlAuthResultRequest.domain, null, null, a55Var3.f.getCurrentTime()), qe2Var, c35Var3, jSONArray, tL_urlAuthResultRequest));
                    return;
                } catch (Exception e2) {
                    qe2Var.a(null, a55.h("prepare OAuth identity", e2));
                    return;
                }
            case 6:
                String str8 = (String) obj5;
                a55 a55Var4 = ((c) obj8).g;
                x56 x56Var = new x56((e66) obj7, (String) obj, (byte) 1);
                a55Var4.getClass();
                TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                tonconnectcreatesession.dapp_client_id = (String) obj6;
                tonconnectcreatesession.manifest_url = str8;
                a55Var4.f.sendRequestTyped(tonconnectcreatesession, new ic((byte) 0), new a45(a55Var4, x56Var, (String) obj4, str8, (String) obj3, (String) obj2, (byte) 0));
                return;
            case 7:
                ip7 notificationsController = ((jf7) obj7).getNotificationsController();
                Collection values = ((HashMap) obj).values();
                notificationsController.getMessagesController().j4((ArrayList) obj4, true);
                notificationsController.getMessagesController().c4((ArrayList) obj3, true);
                notificationsController.getMessagesController().g4((ArrayList) obj2);
                ip7.l0.c(new cp7(notificationsController, (ArrayList) obj6, (zh6) obj8, (ArrayList) obj5, values));
                return;
            case 8:
                TLObject tLObject3 = (TLObject) obj6;
                wo8 wo8Var = (wo8) obj8;
                gi0 gi0Var3 = (gi0) obj4;
                iv4 iv4Var = (iv4) obj3;
                Activity activity = (Activity) obj2;
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = (TLRPC.TL_inputStorePaymentStarsGift) obj;
                List list3 = (List) obj5;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj7;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    di0.h().c(wo8Var.c, new cc0(gi0Var3, iv4Var, (byte) 4));
                    di0.h().h = new xva(iv4Var, (byte) 2);
                    di0 h3 = di0.h();
                    k5 a3 = k5.a(yac.t0);
                    qx6 qx6Var3 = new qx6((byte) 7, false);
                    qx6Var3.O((wo8) list3.get(0));
                    h3.k(activity, a3, tL_inputStorePaymentStarsGift, Collections.singletonList(qx6Var3.g()));
                    return;
                }
                boolean z2 = tLObject3 instanceof TLRPC.TL_boolFalse;
                Boolean bool = Boolean.FALSE;
                if (z2) {
                    iv4Var.a(bool, "PURCHASE_FORBIDDEN");
                    return;
                }
                if (tL_error3 != null) {
                    str2 = tL_error3.text;
                }
                iv4Var.a(bool, str2);
                return;
            case 9:
                TLObject tLObject4 = (TLObject) obj6;
                wo8 wo8Var2 = (wo8) obj8;
                gi0 gi0Var4 = (gi0) obj4;
                qe2 qe2Var2 = (qe2) obj3;
                Activity activity2 = (Activity) obj2;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) obj;
                List list4 = (List) obj5;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj7;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    di0.h().c(wo8Var2.c, new cc0(gi0Var4, qe2Var2, (byte) 5));
                    di0.h().h = new cwa(qe2Var2, (byte) 3);
                    di0 h4 = di0.h();
                    k5 a4 = k5.a(yac.t0);
                    qx6 qx6Var4 = new qx6((byte) 7, false);
                    qx6Var4.O((wo8) list4.get(0));
                    h4.k(activity2, a4, tL_inputStorePaymentStarsGiveaway, Collections.singletonList(qx6Var4.g()));
                    return;
                }
                boolean z3 = tLObject4 instanceof TLRPC.TL_boolFalse;
                Boolean bool2 = Boolean.FALSE;
                if (z3) {
                    qe2Var2.a(bool2, "PURCHASE_FORBIDDEN");
                    return;
                }
                if (tL_error4 != null) {
                    str2 = tL_error4.text;
                }
                qe2Var2.a(bool2, str2);
                return;
            default:
                ((UserInfoActivity) obj8).f0((TLRPC.TL_error) obj7, (TLObject) obj6, (TL_account.TL_birthday) obj5, (TLRPC.UserFull) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj);
                return;
        }
    }

    public nn0(TLObject tLObject, wo8 wo8Var, gi0 gi0Var, icc iccVar, Activity activity, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.c = tLObject;
        this.h = wo8Var;
        this.e = gi0Var;
        this.n = iccVar;
        this.f = activity;
        this.r = inputStorePaymentPurpose;
        this.d = list;
        this.b = tL_error;
    }

    public nn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
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
