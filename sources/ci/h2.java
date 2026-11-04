package ci;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.t21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh0;
public final class h2 implements n10 {
    public final int f5207a;
    public final Object f5208b;
    public final Object f5209c;
    public final Object d;
    public final Object f5210e;

    public h2(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f5207a = i3;
        this.f5208b = obj;
        this.f5209c = obj2;
        this.d = obj3;
        this.f5210e = obj4;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        AlertDialog$Builder alertDialog$Builder;
        zi ziVar;
        org.telegram.ui.Components.fc k10;
        CharSequence P2;
        int i3 = this.f5207a;
        Object obj3 = this.f5210e;
        Object obj4 = this.d;
        Object obj5 = this.f5209c;
        Object obj6 = this.f5208b;
        switch (i3) {
            case 0:
                l6 l6Var = (l6) obj6;
                n10 n10Var = (n10) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    ArrayList y02 = hp.y0(updates, TL_update.TL_updateNewMessage.class);
                    int size = y02.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj7 = y02.get(i10);
                            i10++;
                            TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj7).message;
                            if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                ziVar = new zi(l6Var.f28583a, message, false, false);
                            }
                        } else {
                            ziVar = null;
                        }
                    }
                    hp.s1(l6Var.f28583a).O3(updates, false);
                    if (ziVar != null) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) ziVar.f26868k.action).gift;
                        n10Var.a(starGift, new ai.z3(l6Var, ziVar, arrayList, starGift, 8));
                        return;
                    }
                    n10Var.a(null, null);
                    e9.y(l6Var.f28583a, false).O();
                    v8 G = e9.y(l6Var.f28583a, false).G(h10.i(l6Var.f28583a).e(), false);
                    if (G != null) {
                        G.k(arrayList, null);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                        alertDialog$Builder = new AlertDialog$Builder(0, l6Var.getContext(), new ei.b());
                        String M0 = bd.M0(2131749763, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.g0.X2(bd.M0(2131749765, null));
                    } else {
                        String str = tL_error.text;
                        if (str != null && str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                            long currentTime = ConnectionsManager.getInstance(l6Var.f28583a).getCurrentTime();
                            alertDialog$Builder = new AlertDialog$Builder(0, l6Var.getContext(), new ei.b());
                            String M02 = bd.M0(2131749763, null);
                            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.f27343a;
                            s1Var2.S = M02;
                            s1Var2.U = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131749764, bd.x(Long.parseLong(tL_error.text.substring(25)) + currentTime, true)));
                        } else {
                            l6Var.k().f0(tL_error, false);
                            runnable.run();
                            return;
                        }
                    }
                    k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                    runnable.run();
                    return;
                } else {
                    return;
                }
            case 1:
                l6 l6Var2 = (l6) obj6;
                sf.b bVar = (sf.b) obj5;
                xg.e1 e1Var = (xg.e1) obj4;
                d3 d3Var = (d3) obj3;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload == null) {
                    bVar.b();
                    if (e1Var != null) {
                        k10 = new org.telegram.ui.Components.fc(e1Var.f28589c, l6Var2.J0);
                    } else {
                        k10 = l6Var2.k();
                    }
                    k10.f0(tL_error2, false);
                    return;
                }
                d3Var.a(stargiftdepositpayload);
                return;
            case 2:
                t21 t21Var = (t21) obj5;
                String str2 = (String) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.s1) obj6).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    t21Var.run();
                    return;
                }
                org.telegram.ui.ActionBar.t2 t2Var = yh0.f52282a;
                if (t2Var != null) {
                    t2Var.dismiss();
                    yh0.f52282a = null;
                }
                org.telegram.ui.Components.fc a10 = yh0.a();
                String M03 = bd.M0(2131753128, null);
                if (TextUtils.isEmpty(str2)) {
                    P2 = bd.M0(2131753129, null);
                } else {
                    P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, e6Var), bd.a0(null, null, 2131753130, str2));
                }
                a10.I(2131624011, M03, P2).j();
                return;
            default:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj6;
                ei.p7 p7Var = (ei.p7) obj5;
                String str3 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = w0Var.f51067e;
                if (updates2 != null) {
                    hp.s1(w0Var.N).O3(updates2, false);
                    w0Var.x(p7Var, "requested_chat_sent", org.telegram.ui.web.w0.A(str3, "req_id"));
                    long j10 = w0Var.V.f27150id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f27150id);
                    org.telegram.ui.web.b0 b0Var = new org.telegram.ui.web.b0(w0Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(b0Var);
                    }
                    org.telegram.ui.web.d0 d0Var = w0Var.f51064c;
                    if (d0Var != null) {
                        d0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error4 != null) {
                    new org.telegram.ui.Components.fc(w0Var, e6Var2).f0(tL_error4, false);
                    w0Var.x(p7Var, "requested_chat_failed", org.telegram.ui.web.w0.A(str3, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.fc(w0Var, e6Var2).e0("UNKNOWN_BUTTON", false);
                    w0Var.x(p7Var, "requested_chat_failed", org.telegram.ui.web.w0.A(str3, "req_id"));
                    return;
                }
        }
    }
}
