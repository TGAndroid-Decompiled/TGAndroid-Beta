package defpackage;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.c;
import org.telegram.ui.LaunchActivity;
public final class nx1 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;
    public final Object s;

    public nx1(ve6 ve6Var, TLObject tLObject, TLRPC.TL_error tL_error, gl8 gl8Var, int i, kl8 kl8Var, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.a = (byte) 3;
        this.c = ve6Var;
        this.d = tLObject;
        this.e = tL_error;
        this.f = gl8Var;
        this.b = i;
        this.h = kl8Var;
        this.n = tL_inputStorePaymentAuthCode;
        this.r = str;
        this.s = tL_payments_canPurchaseStore;
    }

    @Override
    public final void run() {
        String H;
        byte b = this.a;
        int i = this.b;
        Object obj = this.s;
        Object obj2 = this.r;
        Object obj3 = this.n;
        Object obj4 = this.h;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b) {
            case 0:
                c cVar = (c) obj8;
                FrameLayout frameLayout = (FrameLayout) obj6;
                View view = (View) obj5;
                RectF rectF = (RectF) obj4;
                cVar.getClass();
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                ((yic) obj7).getLocationInWindow(iArr);
                frameLayout.getLocationInWindow(iArr2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.leftMargin = Math.round((rectF.left + iArr[0]) - iArr2[0]);
                layoutParams.topMargin = Math.round((rectF.top + iArr[1]) - iArr2[1]);
                view.setLayoutParams(layoutParams);
                view.post(new ox1(cVar, view, frameLayout, layoutParams, (ArrayList) obj3, (ArrayList) obj2, this.b, (zic) obj));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr3 = (int[]) obj6;
                kz5 kz5Var = (kz5) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l = (Long) obj2;
                Integer num3 = (Integer) obj;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        na7.q1(launchActivity.P).V3(tL_messages_chats.chats, false);
                        iArr3[0] = launchActivity.z0(this.b, kz5Var, num, num2, l, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    kz5Var.run();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                launchActivity.F0(ij.E(launchActivity, k96.M0(2131751442, null), k96.M0(2131748703, null)));
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                kz5 kz5Var2 = (kz5) obj7;
                TLObject tLObject2 = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.C1;
                try {
                    kz5Var2.run();
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                if (tLObject2 != null) {
                    na7.q1(i).b4(authorizationform.users, false);
                    launchActivity2.t0(new vx7(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject2));
                    return;
                }
                return;
            case 3:
                ve6 ve6Var = (ve6) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                gl8 gl8Var = (gl8) obj5;
                kl8 kl8Var = (kl8) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                mf6 mf6Var = ve6Var.w;
                u41 u41Var = ve6Var.b;
                fa4.b("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    u41Var.i(k96.a0(null, null, 2131745775, gl8Var.a), false, true);
                    if (i == 7) {
                        H = k96.M0(2131745779, null);
                    } else {
                        H = k96.H(',', "SMSFeePurchaseTextDays", i);
                    }
                    u41Var.g(H, false);
                    u41Var.setLoading(false);
                    u41Var.setOnClickListener(new og(ve6Var, kl8Var, tL_inputStorePaymentAuthCode, str6, tL_payments_canPurchaseStore, (byte) 9));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    ve6Var.e = "RESPONSE_FALSE";
                    new u21(mf6Var.a0, null).H(2131624012, k96.a0(null, null, 2131743639, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    ve6Var.e = tL_error.text;
                    new u21(mf6Var.a0, null).g0(tL_error, false);
                    return;
                } else {
                    return;
                }
            default:
                gta gtaVar = (gta) obj8;
                ((boolean[]) obj7)[0] = true;
                gtaVar.X((k27) obj6, (TLRPC.InputInvoice) obj5, (TLRPC.TL_payments_paymentFormStars) obj4, new ora(gtaVar, (boolean[]) obj3, this.b, (p8c) obj2, (p8c) obj));
                return;
        }
    }

    public nx1(gta gtaVar, boolean[] zArr, k27 k27Var, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i, p8c p8cVar, p8c p8cVar2) {
        this.a = (byte) 4;
        this.c = gtaVar;
        this.d = zArr;
        this.e = k27Var;
        this.f = inputInvoice;
        this.h = tL_payments_paymentFormStars;
        this.n = zArr2;
        this.b = i;
        this.r = p8cVar;
        this.s = p8cVar2;
    }

    public nx1(c cVar, yic yicVar, FrameLayout frameLayout, View view, RectF rectF, ArrayList arrayList, ArrayList arrayList2, int i, zic zicVar) {
        this.a = (byte) 0;
        this.c = cVar;
        this.d = yicVar;
        this.e = frameLayout;
        this.f = view;
        this.h = rectF;
        this.n = arrayList;
        this.r = arrayList2;
        this.b = i;
        this.s = zicVar;
    }

    public nx1(LaunchActivity launchActivity, Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.c = launchActivity;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.f = obj3;
        this.h = obj4;
        this.n = obj5;
        this.r = obj6;
        this.s = obj7;
    }
}
