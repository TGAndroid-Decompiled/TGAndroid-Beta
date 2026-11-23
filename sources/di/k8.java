package di;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.de;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.qf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.de0;
import org.telegram.ui.hk0;
import org.telegram.ui.ld0;
import org.telegram.ui.o60;
public final class k8 implements Runnable {
    public final int f9182a;
    public final int f9183b;
    public final Object f9184c;
    public final Object d;
    public final Object f9185e;
    public final Object f9186f;
    public final Object h;
    public final Object f9187n;
    public final Object f9188r;
    public final Object f9189s;

    public k8(y8 y8Var, boolean[] zArr, gj gjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i7, y10 y10Var, y10 y10Var2) {
        this.f9182a = 0;
        this.f9184c = y8Var;
        this.d = zArr;
        this.f9186f = gjVar;
        this.h = inputInvoice;
        this.f9187n = tL_payments_paymentFormStars;
        this.f9185e = zArr2;
        this.f9183b = i7;
        this.f9188r = y10Var;
        this.f9189s = y10Var2;
    }

    @Override
    public final void run() {
        String H;
        int i7 = this.f9182a;
        int i10 = this.f9183b;
        Object obj = this.f9189s;
        Object obj2 = this.f9188r;
        Object obj3 = this.f9187n;
        Object obj4 = this.h;
        Object obj5 = this.f9186f;
        Object obj6 = this.f9185e;
        Object obj7 = this.d;
        Object obj8 = this.f9184c;
        switch (i7) {
            case 0:
                y8 y8Var = (y8) obj8;
                ((boolean[]) obj7)[0] = true;
                y8Var.Y((gj) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new u6(y8Var, (boolean[]) obj6, this.f9183b, (y10) obj2, (y10) obj));
                return;
            case 1:
                qf qfVar = (qf) obj8;
                FrameLayout frameLayout = (FrameLayout) obj6;
                View view = (View) obj5;
                RectF rectF = (RectF) obj4;
                qfVar.getClass();
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                ((ji.e) obj7).getLocationInWindow(iArr);
                frameLayout.getLocationInWindow(iArr2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.leftMargin = Math.round((rectF.left + iArr[0]) - iArr2[0]);
                layoutParams.topMargin = Math.round((rectF.top + iArr[1]) - iArr2[1]);
                view.setLayoutParams(layoutParams);
                view.post(new de(qfVar, view, frameLayout, layoutParams, (ArrayList) obj3, (ArrayList) obj2, this.f9183b, (ji.f) obj));
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr3 = (int[]) obj6;
                o60 o60Var = (o60) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l10 = (Long) obj2;
                Integer num3 = (Integer) obj;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        np.u1(launchActivity.P).Z3(tL_messages_chats.chats, false);
                        iArr3[0] = launchActivity.z0(this.f9183b, o60Var, num, num2, l10, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    o60Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                launchActivity.F0(org.telegram.ui.Components.c5.E(launchActivity, hd.N0(2131751442, null), hd.N0(2131748702, null)));
                return;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                o60 o60Var2 = (o60) obj7;
                TLObject tLObject2 = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.C1;
                try {
                    o60Var2.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (tLObject2 != null) {
                    np.u1(i10).f4(authorizationform.users, false);
                    launchActivity2.t0(new hk0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject2));
                    return;
                }
                return;
            default:
                ld0 ld0Var = (ld0) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                f5.i iVar = (f5.i) obj5;
                f5.m mVar = (f5.m) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                de0 de0Var = ld0Var.f49577w;
                hi.d dVar = ld0Var.f49570b;
                org.telegram.messenger.a8.b("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar.i(hd.a0(null, null, 2131745771, iVar.f11282a), false, true);
                    if (i10 == 7) {
                        H = hd.N0(2131745775, null);
                    } else {
                        H = hd.H(',', "SMSFeePurchaseTextDays", i10);
                    }
                    dVar.g(H, false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new fi.d0(ld0Var, mVar, tL_inputStorePaymentAuthCode, str6, tL_payments_canPurchaseStore, 14));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    ld0Var.f49572e = "RESPONSE_FALSE";
                    new org.telegram.ui.Components.lc(de0Var.f46887a0, null).H(2131624012, hd.a0(null, null, 2131743635, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    ld0Var.f49572e = tL_error.text;
                    new org.telegram.ui.Components.lc(de0Var.f46887a0, null).g0(tL_error, false);
                    return;
                } else {
                    return;
                }
        }
    }

    public k8(qf qfVar, ji.e eVar, FrameLayout frameLayout, View view, RectF rectF, ArrayList arrayList, ArrayList arrayList2, int i7, ji.f fVar) {
        this.f9182a = 1;
        this.f9184c = qfVar;
        this.d = eVar;
        this.f9185e = frameLayout;
        this.f9186f = view;
        this.h = rectF;
        this.f9187n = arrayList;
        this.f9188r = arrayList2;
        this.f9183b = i7;
        this.f9189s = fVar;
    }

    public k8(LaunchActivity launchActivity, Object obj, Object obj2, int i7, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f9182a = i10;
        this.f9184c = launchActivity;
        this.d = obj;
        this.f9185e = obj2;
        this.f9183b = i7;
        this.f9186f = obj3;
        this.h = obj4;
        this.f9187n = obj5;
        this.f9188r = obj6;
        this.f9189s = obj7;
    }

    public k8(ld0 ld0Var, TLObject tLObject, TLRPC.TL_error tL_error, f5.i iVar, int i7, f5.m mVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f9182a = 4;
        this.f9184c = ld0Var;
        this.d = tLObject;
        this.f9185e = tL_error;
        this.f9186f = iVar;
        this.f9183b = i7;
        this.h = mVar;
        this.f9187n = tL_inputStorePaymentAuthCode;
        this.f9188r = str;
        this.f9189s = tL_payments_canPurchaseStore;
    }
}
