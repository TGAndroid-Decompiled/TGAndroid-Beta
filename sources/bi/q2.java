package bi;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.x21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bi0;
public final class q2 implements v10 {
    public final int f4555a;
    public final Object f4556b;
    public final Object f4557c;
    public final Object d;
    public final Object f4558e;

    public q2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f4555a = i7;
        this.f4556b = obj;
        this.f4557c = obj2;
        this.d = obj3;
        this.f4558e = obj4;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        AlertDialog$Builder alertDialog$Builder;
        ij ijVar;
        org.telegram.ui.Components.hc k10;
        CharSequence P2;
        int i7 = this.f4555a;
        Object obj3 = this.f4558e;
        Object obj4 = this.d;
        Object obj5 = this.f4557c;
        Object obj6 = this.f4556b;
        switch (i7) {
            case 0:
                k7 k7Var = (k7) obj6;
                v10 v10Var = (v10) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    ArrayList y02 = qp.y0(updates, TL_update.TL_updateNewMessage.class);
                    int size = y02.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj7 = y02.get(i10);
                            i10++;
                            TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj7).message;
                            if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                ijVar = new ij(k7Var.f28612a, message, false, false);
                            }
                        } else {
                            ijVar = null;
                        }
                    }
                    qp.s1(k7Var.f28612a).O3(updates, false);
                    if (ijVar != null) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) ijVar.f23237k.action).gift;
                        v10Var.a(starGift, new ai.d0(k7Var, ijVar, arrayList, starGift, 6));
                        return;
                    }
                    v10Var.a(null, null);
                    ea.y(k7Var.f28612a, false).O();
                    v9 G = ea.y(k7Var.f28612a, false).G(p10.i(k7Var.f28612a).e(), false);
                    if (G != null) {
                        G.k(arrayList, null);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                        alertDialog$Builder = new AlertDialog$Builder(0, k7Var.getContext(), new di.b());
                        String M0 = org.telegram.messenger.hd.M0(2131749754, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131749756, null));
                    } else {
                        String str = tL_error.text;
                        if (str != null && str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                            long currentTime = ConnectionsManager.getInstance(k7Var.f28612a).getCurrentTime();
                            alertDialog$Builder = new AlertDialog$Builder(0, k7Var.getContext(), new di.b());
                            String M02 = org.telegram.messenger.hd.M0(2131749754, null);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27292a;
                            u1Var2.R = M02;
                            u1Var2.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131749755, org.telegram.messenger.hd.x(Long.parseLong(tL_error.text.substring(25)) + currentTime, true)));
                        } else {
                            k7Var.k().f0(tL_error, false);
                            runnable.run();
                            return;
                        }
                    }
                    jg.g.C(null, 2131747830, alertDialog$Builder, null);
                    runnable.run();
                    return;
                } else {
                    return;
                }
            case 1:
                k7 k7Var2 = (k7) obj6;
                vf.b bVar = (vf.b) obj5;
                wg.f1 f1Var = (wg.f1) obj4;
                q3 q3Var = (q3) obj3;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload == null) {
                    bVar.b();
                    if (f1Var != null) {
                        k10 = new org.telegram.ui.Components.hc(f1Var.f28618c, k7Var2.I0);
                    } else {
                        k10 = k7Var2.k();
                    }
                    k10.f0(tL_error2, false);
                    return;
                }
                q3Var.a(stargiftdepositpayload);
                return;
            case 2:
                x21 x21Var = (x21) obj5;
                String str2 = (String) obj4;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.u1) obj6).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    x21Var.run();
                    return;
                }
                org.telegram.ui.ActionBar.v2 v2Var = bi0.f44356a;
                if (v2Var != null) {
                    v2Var.dismiss();
                    bi0.f44356a = null;
                }
                org.telegram.ui.Components.hc a10 = bi0.a();
                String M03 = org.telegram.messenger.hd.M0(2131753128, null);
                if (TextUtils.isEmpty(str2)) {
                    P2 = org.telegram.messenger.hd.M0(2131753129, null);
                } else {
                    P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, f6Var), org.telegram.messenger.hd.a0(null, null, 2131753130, str2));
                }
                a10.I(2131624011, M03, P2).j();
                return;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj6;
                di.o7 o7Var = (di.o7) obj5;
                String str3 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.f6 f6Var2 = x0Var.f51365e;
                if (updates2 != null) {
                    qp.s1(x0Var.M).O3(updates2, false);
                    x0Var.x(o7Var, "requested_chat_sent", org.telegram.ui.web.x0.A(str3, "req_id"));
                    long j3 = x0Var.U.f27101id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f27101id);
                    org.telegram.ui.web.b0 b0Var = new org.telegram.ui.web.b0(x0Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(b0Var);
                    }
                    org.telegram.ui.web.d0 d0Var = x0Var.f51362c;
                    if (d0Var != null) {
                        d0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error4 != null) {
                    new org.telegram.ui.Components.hc(x0Var, f6Var2).f0(tL_error4, false);
                    x0Var.x(o7Var, "requested_chat_failed", org.telegram.ui.web.x0.A(str3, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.hc(x0Var, f6Var2).e0("UNKNOWN_BUTTON", false);
                    x0Var.x(o7Var, "requested_chat_failed", org.telegram.ui.web.x0.A(str3, "req_id"));
                    return;
                }
        }
    }
}
