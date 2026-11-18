package di;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.n31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gi0;
public final class e2 implements q10 {
    public final int f8695a;
    public final Object f8696b;
    public final Object f8697c;
    public final Object d;
    public final Object f8698e;

    public e2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f8695a = i7;
        this.f8696b = obj;
        this.f8697c = obj2;
        this.d = obj3;
        this.f8698e = obj4;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        AlertDialog$Builder alertDialog$Builder;
        fj fjVar;
        org.telegram.ui.Components.lc k10;
        CharSequence P2;
        int i7 = this.f8695a;
        Object obj3 = this.f8698e;
        Object obj4 = this.d;
        Object obj5 = this.f8697c;
        Object obj6 = this.f8696b;
        switch (i7) {
            case 0:
                f6 f6Var = (f6) obj6;
                q10 q10Var = (q10) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    ArrayList A0 = mp.A0(updates, TL_update.TL_updateNewMessage.class);
                    int size = A0.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj7 = A0.get(i10);
                            i10++;
                            TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj7).message;
                            if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                fjVar = new fj(f6Var.f30189a, message, false, false);
                            }
                        } else {
                            fjVar = null;
                        }
                    }
                    mp.u1(f6Var.f30189a).V3(updates, false);
                    if (fjVar != null) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) fjVar.f23968k.action).gift;
                        q10Var.a(starGift, new ai.s(f6Var, fjVar, arrayList, starGift, 12));
                        return;
                    }
                    q10Var.a(null, null);
                    x8.y(f6Var.f30189a, false).N();
                    o8 G = x8.y(f6Var.f30189a, false).G(j10.i(f6Var.f30189a).e(), false);
                    if (G != null) {
                        G.l(arrayList, null);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                        alertDialog$Builder = new AlertDialog$Builder(0, f6Var.getContext(), new fi.b());
                        String M0 = gd.M0(2131749739, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.g0.W2(gd.M0(2131749741, null));
                    } else {
                        String str = tL_error.text;
                        if (str != null && str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                            long currentTime = ConnectionsManager.getInstance(f6Var.f30189a).getCurrentTime();
                            alertDialog$Builder = new AlertDialog$Builder(0, f6Var.getContext(), new fi.b());
                            String M02 = gd.M0(2131749739, null);
                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f28746a;
                            u1Var2.S = M02;
                            u1Var2.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749740, gd.x(Long.parseLong(tL_error.text.substring(25)) + currentTime, true)));
                        } else {
                            f6Var.k().g0(tL_error, false);
                            runnable.run();
                            return;
                        }
                    }
                    org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
                    runnable.run();
                    return;
                } else {
                    return;
                }
            case 1:
                f6 f6Var2 = (f6) obj6;
                vf.b bVar = (vf.b) obj5;
                bi.a2 a2Var = (bi.a2) obj4;
                v2 v2Var = (v2) obj3;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload == null) {
                    bVar.b();
                    if (a2Var != null) {
                        k10 = new org.telegram.ui.Components.lc(a2Var.f30195c, f6Var2.J0);
                    } else {
                        k10 = f6Var2.k();
                    }
                    k10.g0(tL_error2, false);
                    return;
                }
                v2Var.a(stargiftdepositpayload);
                return;
            case 2:
                n31 n31Var = (n31) obj5;
                String str2 = (String) obj4;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.u1) obj6).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    n31Var.run();
                    return;
                }
                org.telegram.ui.ActionBar.x2 x2Var = gi0.f48115a;
                if (x2Var != null) {
                    x2Var.dismiss();
                    gi0.f48115a = null;
                }
                org.telegram.ui.Components.lc a10 = gi0.a();
                String M03 = gd.M0(2131753126, null);
                if (TextUtils.isEmpty(str2)) {
                    P2 = gd.M0(2131753127, null);
                } else {
                    P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, i6Var), gd.a0(null, null, 2131753128, str2));
                }
                a10.I(2131624012, M03, P2).j();
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj6;
                fi.f7 f7Var = (fi.f7) obj5;
                String str3 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.i6 i6Var2 = v0Var.f53350e;
                if (updates2 != null) {
                    mp.u1(v0Var.N).V3(updates2, false);
                    v0Var.x(f7Var, "requested_chat_sent", org.telegram.ui.web.v0.A(str3, "req_id"));
                    long j3 = v0Var.V.f28554id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f28554id);
                    org.telegram.ui.web.a0 a0Var = new org.telegram.ui.web.a0(v0Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(a0Var);
                    }
                    org.telegram.ui.web.c0 c0Var = v0Var.f53347c;
                    if (c0Var != null) {
                        c0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error4 != null) {
                    new org.telegram.ui.Components.lc(v0Var, i6Var2).g0(tL_error4, false);
                    v0Var.x(f7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str3, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.lc(v0Var, i6Var2).f0("UNKNOWN_BUTTON", false);
                    v0Var.x(f7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str3, "req_id"));
                    return;
                }
        }
    }
}
