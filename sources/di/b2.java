package di;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.d31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.di0;
public final class b2 implements s10 {
    public final int f8239a;
    public final Object f8240b;
    public final Object f8241c;
    public final Object d;
    public final Object f8242e;

    public b2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f8239a = i7;
        this.f8240b = obj;
        this.f8241c = obj2;
        this.d = obj3;
        this.f8242e = obj4;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        AlertDialog$Builder alertDialog$Builder;
        gj gjVar;
        org.telegram.ui.Components.cc k10;
        CharSequence P2;
        int i7 = this.f8239a;
        Object obj3 = this.f8242e;
        Object obj4 = this.d;
        Object obj5 = this.f8241c;
        Object obj6 = this.f8240b;
        switch (i7) {
            case 0:
                c6 c6Var = (c6) obj6;
                s10 s10Var = (s10) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    ArrayList y02 = np.y0(updates, TL_update.TL_updateNewMessage.class);
                    int size = y02.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj7 = y02.get(i10);
                            i10++;
                            TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj7).message;
                            if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                gjVar = new gj(c6Var.f29679a, message, false, false);
                            }
                        } else {
                            gjVar = null;
                        }
                    }
                    np.s1(c6Var.f29679a).O3(updates, false);
                    if (gjVar != null) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) gjVar.f23817k.action).gift;
                        s10Var.a(starGift, new androidx.car.app.utils.a(c6Var, gjVar, arrayList, starGift, 8));
                        return;
                    }
                    s10Var.a(null, null);
                    v8.y(c6Var.f29679a, false).O();
                    m8 G = v8.y(c6Var.f29679a, false).G(m10.i(c6Var.f29679a).e(), false);
                    if (G != null) {
                        G.k(arrayList, null);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                        alertDialog$Builder = new AlertDialog$Builder(0, c6Var.getContext(), new fi.b());
                        String M0 = hd.M0(2131749755, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.g0.X2(hd.M0(2131749757, null));
                    } else {
                        String str = tL_error.text;
                        if (str != null && str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                            long currentTime = ConnectionsManager.getInstance(c6Var.f29679a).getCurrentTime();
                            alertDialog$Builder = new AlertDialog$Builder(0, c6Var.getContext(), new fi.b());
                            String M02 = hd.M0(2131749755, null);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28392a;
                            t1Var2.S = M02;
                            t1Var2.U = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749756, hd.x(Long.parseLong(tL_error.text.substring(25)) + currentTime, true)));
                        } else {
                            c6Var.k().f0(tL_error, false);
                            runnable.run();
                            return;
                        }
                    }
                    i5.c.C(null, 2131747831, alertDialog$Builder, null);
                    runnable.run();
                    return;
                } else {
                    return;
                }
            case 1:
                c6 c6Var2 = (c6) obj6;
                vf.b bVar = (vf.b) obj5;
                wg.c1 c1Var = (wg.c1) obj4;
                w2 w2Var = (w2) obj3;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload == null) {
                    bVar.b();
                    if (c1Var != null) {
                        k10 = new org.telegram.ui.Components.cc(c1Var.f29685c, c6Var2.J0);
                    } else {
                        k10 = c6Var2.k();
                    }
                    k10.f0(tL_error2, false);
                    return;
                }
                w2Var.a(stargiftdepositpayload);
                return;
            case 2:
                d31 d31Var = (d31) obj5;
                String str2 = (String) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.t1) obj6).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    d31Var.run();
                    return;
                }
                org.telegram.ui.ActionBar.u2 u2Var = di0.f46411a;
                if (u2Var != null) {
                    u2Var.dismiss();
                    di0.f46411a = null;
                }
                org.telegram.ui.Components.cc a10 = di0.a();
                String M03 = hd.M0(2131753128, null);
                if (TextUtils.isEmpty(str2)) {
                    P2 = hd.M0(2131753129, null);
                } else {
                    P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, e6Var), hd.a0(null, null, 2131753130, str2));
                }
                a10.I(2131624012, M03, P2).j();
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj6;
                fi.i7 i7Var = (fi.i7) obj5;
                String str3 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = v0Var.f52818e;
                if (updates2 != null) {
                    np.s1(v0Var.N).O3(updates2, false);
                    v0Var.x(i7Var, "requested_chat_sent", org.telegram.ui.web.v0.A(str3, "req_id"));
                    long j3 = v0Var.V.f28200id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f28200id);
                    org.telegram.ui.web.a0 a0Var = new org.telegram.ui.web.a0(v0Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(a0Var);
                    }
                    org.telegram.ui.web.c0 c0Var = v0Var.f52815c;
                    if (c0Var != null) {
                        c0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error4 != null) {
                    new org.telegram.ui.Components.cc(v0Var, e6Var2).f0(tL_error4, false);
                    v0Var.x(i7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str3, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.cc(v0Var, e6Var2).e0("UNKNOWN_BUTTON", false);
                    v0Var.x(i7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str3, "req_id"));
                    return;
                }
        }
    }
}
