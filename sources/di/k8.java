package di;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ce;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.qf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.de0;
import org.telegram.ui.fk0;
import org.telegram.ui.i50;
import org.telegram.ui.ld0;
public final class k8 implements Runnable {
    public final int f9178a;
    public final int f9179b;
    public final Object f9180c;
    public final Object d;
    public final Object f9181e;
    public final Object f9182f;
    public final Object h;
    public final Object f9183n;
    public final Object f9184r;
    public final Object f9185s;

    public k8(y8 y8Var, boolean[] zArr, fj fjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i7, w10 w10Var, w10 w10Var2) {
        this.f9178a = 0;
        this.f9180c = y8Var;
        this.d = zArr;
        this.f9182f = fjVar;
        this.h = inputInvoice;
        this.f9183n = tL_payments_paymentFormStars;
        this.f9181e = zArr2;
        this.f9179b = i7;
        this.f9184r = w10Var;
        this.f9185s = w10Var2;
    }

    @Override
    public final void run() {
        String H;
        int i7 = this.f9178a;
        int i10 = this.f9179b;
        Object obj = this.f9185s;
        Object obj2 = this.f9184r;
        Object obj3 = this.f9183n;
        Object obj4 = this.h;
        Object obj5 = this.f9182f;
        Object obj6 = this.f9181e;
        Object obj7 = this.d;
        Object obj8 = this.f9180c;
        switch (i7) {
            case 0:
                y8 y8Var = (y8) obj8;
                ((boolean[]) obj7)[0] = true;
                y8Var.Y((fj) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new u6(y8Var, (boolean[]) obj6, this.f9179b, (w10) obj2, (w10) obj));
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
                view.post(new ce(qfVar, view, frameLayout, layoutParams, (ArrayList) obj3, (ArrayList) obj2, this.f9179b, (ji.g) obj));
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr3 = (int[]) obj6;
                i50 i50Var = (i50) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l10 = (Long) obj2;
                Integer num3 = (Integer) obj;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        mp.u1(launchActivity.P).Z3(tL_messages_chats.chats, false);
                        iArr3[0] = launchActivity.z0(this.f9179b, i50Var, num, num2, l10, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    i50Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                launchActivity.F0(org.telegram.ui.Components.b5.E(launchActivity, gd.N0(2131751442, null), gd.N0(2131748702, null)));
                return;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                i50 i50Var2 = (i50) obj7;
                TLObject tLObject2 = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.C1;
                try {
                    i50Var2.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (tLObject2 != null) {
                    mp.u1(i10).f4(authorizationform.users, false);
                    launchActivity2.t0(new fk0(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject2));
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
                de0 de0Var = ld0Var.f49735w;
                hi.e eVar = ld0Var.f49728b;
                org.telegram.messenger.a8.b("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    eVar.i(gd.a0(null, null, 2131745771, iVar.f11281a), false, true);
                    if (i10 == 7) {
                        H = gd.N0(2131745775, null);
                    } else {
                        H = gd.H(',', "SMSFeePurchaseTextDays", i10);
                    }
                    eVar.g(H, false);
                    eVar.setLoading(false);
                    eVar.setOnClickListener(new fi.d0(ld0Var, mVar, tL_inputStorePaymentAuthCode, str6, tL_payments_canPurchaseStore, 14));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    ld0Var.f49730e = "RESPONSE_FALSE";
                    new org.telegram.ui.Components.kc(de0Var.f47050a0, null).H(2131624012, gd.a0(null, null, 2131743631, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    ld0Var.f49730e = tL_error.text;
                    new org.telegram.ui.Components.kc(de0Var.f47050a0, null).g0(tL_error, false);
                    return;
                } else {
                    return;
                }
        }
    }

    public k8(qf qfVar, ji.e eVar, FrameLayout frameLayout, View view, RectF rectF, ArrayList arrayList, ArrayList arrayList2, int i7, ji.g gVar) {
        this.f9178a = 1;
        this.f9180c = qfVar;
        this.d = eVar;
        this.f9181e = frameLayout;
        this.f9182f = view;
        this.h = rectF;
        this.f9183n = arrayList;
        this.f9184r = arrayList2;
        this.f9179b = i7;
        this.f9185s = gVar;
    }

    public k8(LaunchActivity launchActivity, Object obj, Object obj2, int i7, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f9178a = i10;
        this.f9180c = launchActivity;
        this.d = obj;
        this.f9181e = obj2;
        this.f9179b = i7;
        this.f9182f = obj3;
        this.h = obj4;
        this.f9183n = obj5;
        this.f9184r = obj6;
        this.f9185s = obj7;
    }

    public k8(ld0 ld0Var, TLObject tLObject, TLRPC.TL_error tL_error, f5.i iVar, int i7, f5.m mVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f9178a = 4;
        this.f9180c = ld0Var;
        this.d = tLObject;
        this.f9181e = tL_error;
        this.f9182f = iVar;
        this.f9179b = i7;
        this.h = mVar;
        this.f9183n = tL_inputStorePaymentAuthCode;
        this.f9184r = str;
        this.f9185s = tL_payments_canPurchaseStore;
    }
}
