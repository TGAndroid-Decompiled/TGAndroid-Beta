package di;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ce;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.pf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.de0;
import org.telegram.ui.hk0;
import org.telegram.ui.ld0;
import org.telegram.ui.n60;
public final class j8 implements Runnable {
    public final int f9092a;
    public final int f9093b;
    public final Object f9094c;
    public final Object d;
    public final Object f9095e;
    public final Object f9096f;
    public final Object h;
    public final Object f9097n;
    public final Object f9098r;
    public final Object f9099s;

    public j8(x8 x8Var, boolean[] zArr, fj fjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i7, x10 x10Var, x10 x10Var2) {
        this.f9092a = 0;
        this.f9094c = x8Var;
        this.d = zArr;
        this.f9096f = fjVar;
        this.h = inputInvoice;
        this.f9097n = tL_payments_paymentFormStars;
        this.f9095e = zArr2;
        this.f9093b = i7;
        this.f9098r = x10Var;
        this.f9099s = x10Var2;
    }

    @Override
    public final void run() {
        String H;
        int i7 = this.f9092a;
        int i10 = this.f9093b;
        Object obj = this.f9099s;
        Object obj2 = this.f9098r;
        Object obj3 = this.f9097n;
        Object obj4 = this.h;
        Object obj5 = this.f9096f;
        Object obj6 = this.f9095e;
        Object obj7 = this.d;
        Object obj8 = this.f9094c;
        switch (i7) {
            case 0:
                x8 x8Var = (x8) obj8;
                ((boolean[]) obj7)[0] = true;
                x8Var.Y((fj) obj5, (TLRPC.InputInvoice) obj4, (TLRPC.TL_payments_paymentFormStars) obj3, new u6(x8Var, (boolean[]) obj6, this.f9093b, (x10) obj2, (x10) obj));
                return;
            case 1:
                pf pfVar = (pf) obj8;
                FrameLayout frameLayout = (FrameLayout) obj6;
                View view = (View) obj5;
                RectF rectF = (RectF) obj4;
                pfVar.getClass();
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                ((ji.e) obj7).getLocationInWindow(iArr);
                frameLayout.getLocationInWindow(iArr2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.leftMargin = Math.round((rectF.left + iArr[0]) - iArr2[0]);
                layoutParams.topMargin = Math.round((rectF.top + iArr[1]) - iArr2[1]);
                view.setLayoutParams(layoutParams);
                view.post(new ce(pfVar, view, frameLayout, layoutParams, (ArrayList) obj3, this.f9093b, (ji.g) obj2, (ji.f) obj, 1));
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr3 = (int[]) obj6;
                n60 n60Var = (n60) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l10 = (Long) obj2;
                Integer num3 = (Integer) obj;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        mp.u1(launchActivity.P).Z3(tL_messages_chats.chats, false);
                        iArr3[0] = launchActivity.z0(this.f9093b, n60Var, num, num2, l10, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    n60Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                launchActivity.F0(org.telegram.ui.Components.b5.E(launchActivity, gd.M0(2131751443, null), gd.M0(2131748703, null)));
                return;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                n60 n60Var2 = (n60) obj7;
                TLObject tLObject2 = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.C1;
                try {
                    n60Var2.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (tLObject2 != null) {
                    mp.u1(i10).f4(authorizationform.users, false);
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
                de0 de0Var = ld0Var.f49584w;
                hi.d dVar = ld0Var.f49577b;
                org.telegram.messenger.a8.b("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    dVar.i(gd.a0(null, null, 2131745772, iVar.f11290a), false, true);
                    if (i10 == 7) {
                        H = gd.M0(2131745776, null);
                    } else {
                        H = gd.H(',', "SMSFeePurchaseTextDays", i10);
                    }
                    dVar.g(H, false);
                    dVar.setLoading(false);
                    dVar.setOnClickListener(new fi.d0(ld0Var, mVar, tL_inputStorePaymentAuthCode, str6, tL_payments_canPurchaseStore, 14));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    ld0Var.f49579e = "RESPONSE_FALSE";
                    new org.telegram.ui.Components.lc(de0Var.f46934a0, null).H(2131624012, gd.a0(null, null, 2131743641, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    ld0Var.f49579e = tL_error.text;
                    new org.telegram.ui.Components.lc(de0Var.f46934a0, null).g0(tL_error, false);
                    return;
                } else {
                    return;
                }
        }
    }

    public j8(pf pfVar, ji.e eVar, FrameLayout frameLayout, View view, RectF rectF, ArrayList arrayList, int i7, ji.g gVar, ji.f fVar) {
        this.f9092a = 1;
        this.f9094c = pfVar;
        this.d = eVar;
        this.f9095e = frameLayout;
        this.f9096f = view;
        this.h = rectF;
        this.f9097n = arrayList;
        this.f9093b = i7;
        this.f9098r = gVar;
        this.f9099s = fVar;
    }

    public j8(LaunchActivity launchActivity, Object obj, Object obj2, int i7, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f9092a = i10;
        this.f9094c = launchActivity;
        this.d = obj;
        this.f9095e = obj2;
        this.f9093b = i7;
        this.f9096f = obj3;
        this.h = obj4;
        this.f9097n = obj5;
        this.f9098r = obj6;
        this.f9099s = obj7;
    }

    public j8(ld0 ld0Var, TLObject tLObject, TLRPC.TL_error tL_error, f5.i iVar, int i7, f5.m mVar, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.f9092a = 4;
        this.f9094c = ld0Var;
        this.d = tLObject;
        this.f9095e = tL_error;
        this.f9096f = iVar;
        this.f9093b = i7;
        this.h = mVar;
        this.f9097n = tL_inputStorePaymentAuthCode;
        this.f9098r = str;
        this.f9099s = tL_payments_canPurchaseStore;
    }
}
