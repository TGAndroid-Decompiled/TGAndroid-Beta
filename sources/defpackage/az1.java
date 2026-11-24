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
public final class az1 implements Runnable {
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

    public az1(wg6 wg6Var, TLObject tLObject, TLRPC.TL_error tL_error, in8 in8Var, int i, ln8 ln8Var, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.a = (byte) 3;
        this.c = wg6Var;
        this.d = tLObject;
        this.e = tL_error;
        this.f = in8Var;
        this.b = i;
        this.h = ln8Var;
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
                ((ykc) obj7).getLocationInWindow(iArr);
                frameLayout.getLocationInWindow(iArr2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.leftMargin = Math.round((rectF.left + iArr[0]) - iArr2[0]);
                layoutParams.topMargin = Math.round((rectF.top + iArr[1]) - iArr2[1]);
                view.setLayoutParams(layoutParams);
                view.post(new bz1(cVar, view, frameLayout, layoutParams, (ArrayList) obj3, (ArrayList) obj2, this.b, (zkc) obj));
                return;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr3 = (int[]) obj6;
                k16 k16Var = (k16) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l = (Long) obj2;
                Integer num3 = (Integer) obj;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        oc7.r1(launchActivity.P).X3(tL_messages_chats.chats, false);
                        iArr3[0] = launchActivity.z0(this.b, k16Var, num, num2, l, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    k16Var.run();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                launchActivity.F0(ik.E(launchActivity, jb6.M0(2131751391, null), jb6.M0(2131748652, null)));
                return;
            case 2:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                k16 k16Var2 = (k16) obj7;
                TLObject tLObject2 = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                String str5 = LaunchActivity.C1;
                try {
                    k16Var2.run();
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
                if (tLObject2 != null) {
                    oc7.r1(i).d4(authorizationform.users, false);
                    launchActivity2.t0(new xz7(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str2, str3, str4, authorizationform, (TL_account.Password) tLObject2));
                    return;
                }
                return;
            case 3:
                wg6 wg6Var = (wg6) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                in8 in8Var = (in8) obj5;
                ln8 ln8Var = (ln8) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                mh6 mh6Var = wg6Var.w;
                b61 b61Var = wg6Var.b;
                fc4.b("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    b61Var.i(jb6.a0(null, null, 2131745701, in8Var.a), false, true);
                    if (i == 7) {
                        H = jb6.M0(2131745705, null);
                    } else {
                        H = jb6.H(',', "SMSFeePurchaseTextDays", i);
                    }
                    b61Var.g(H, false);
                    b61Var.setLoading(false);
                    b61Var.setOnClickListener(new oh(wg6Var, ln8Var, tL_inputStorePaymentAuthCode, str6, tL_payments_canPurchaseStore, (byte) 9));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    wg6Var.e = "RESPONSE_FALSE";
                    new c41(mh6Var.a0, null).H(2131624012, jb6.a0(null, null, 2131743565, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    wg6Var.e = tL_error.text;
                    new c41(mh6Var.a0, null).g0(tL_error, false);
                    return;
                } else {
                    return;
                }
            default:
                jva jvaVar = (jva) obj8;
                ((boolean[]) obj7)[0] = true;
                jvaVar.X((k47) obj6, (TLRPC.InputInvoice) obj5, (TLRPC.TL_payments_paymentFormStars) obj4, new pta(jvaVar, (boolean[]) obj3, this.b, (qac) obj2, (qac) obj));
                return;
        }
    }

    public az1(jva jvaVar, boolean[] zArr, k47 k47Var, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i, qac qacVar, qac qacVar2) {
        this.a = (byte) 4;
        this.c = jvaVar;
        this.d = zArr;
        this.e = k47Var;
        this.f = inputInvoice;
        this.h = tL_payments_paymentFormStars;
        this.n = zArr2;
        this.b = i;
        this.r = qacVar;
        this.s = qacVar2;
    }

    public az1(c cVar, ykc ykcVar, FrameLayout frameLayout, View view, RectF rectF, ArrayList arrayList, ArrayList arrayList2, int i, zkc zkcVar) {
        this.a = (byte) 0;
        this.c = cVar;
        this.d = ykcVar;
        this.e = frameLayout;
        this.f = view;
        this.h = rectF;
        this.n = arrayList;
        this.r = arrayList2;
        this.b = i;
        this.s = zkcVar;
    }

    public az1(LaunchActivity launchActivity, Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
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
