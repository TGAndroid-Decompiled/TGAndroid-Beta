package di;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.p31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gi0;
public final class e2 implements r10 {
    public final int f8692a;
    public final Object f8693b;
    public final Object f8694c;
    public final Object d;
    public final Object f8695e;

    public e2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f8692a = i7;
        this.f8693b = obj;
        this.f8694c = obj2;
        this.d = obj3;
        this.f8695e = obj4;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        AlertDialog$Builder alertDialog$Builder;
        gj gjVar;
        org.telegram.ui.Components.lc k10;
        CharSequence P2;
        int i7 = this.f8692a;
        Object obj3 = this.f8695e;
        Object obj4 = this.d;
        Object obj5 = this.f8694c;
        Object obj6 = this.f8693b;
        switch (i7) {
            case 0:
                f6 f6Var = (f6) obj6;
                r10 r10Var = (r10) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (updates != null) {
                    ArrayList A0 = np.A0(updates, TL_update.TL_updateNewMessage.class);
                    int size = A0.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            Object obj7 = A0.get(i10);
                            i10++;
                            TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj7).message;
                            if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                gjVar = new gj(f6Var.f30139a, message, false, false);
                            }
                        } else {
                            gjVar = null;
                        }
                    }
                    np.u1(f6Var.f30139a).V3(updates, false);
                    if (gjVar != null) {
                        TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) gjVar.f24177k.action).gift;
                        r10Var.a(starGift, new ai.m(f6Var, gjVar, arrayList, starGift, 12));
                        return;
                    }
                    r10Var.a(null, null);
                    y8.y(f6Var.f30139a, false).N();
                    p8 G = y8.y(f6Var.f30139a, false).G(k10.i(f6Var.f30139a).e(), false);
                    if (G != null) {
                        G.l(arrayList, null);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                        alertDialog$Builder = new AlertDialog$Builder(0, f6Var.getContext(), new fi.b());
                        String N0 = hd.N0(2131749738, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.g0.W2(hd.N0(2131749740, null));
                    } else {
                        String str = tL_error.text;
                        if (str != null && str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                            long currentTime = ConnectionsManager.getInstance(f6Var.f30139a).getCurrentTime();
                            alertDialog$Builder = new AlertDialog$Builder(0, f6Var.getContext(), new fi.b());
                            String N02 = hd.N0(2131749738, null);
                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28743a;
                            t1Var2.S = N02;
                            t1Var2.U = org.telegram.messenger.g0.W2(hd.a0(null, null, 2131749739, hd.x(Long.parseLong(tL_error.text.substring(25)) + currentTime, true)));
                        } else {
                            f6Var.k().g0(tL_error, false);
                            runnable.run();
                            return;
                        }
                    }
                    org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                    runnable.run();
                    return;
                } else {
                    return;
                }
            case 1:
                f6 f6Var2 = (f6) obj6;
                vf.b bVar = (vf.b) obj5;
                bi.f2 f2Var = (bi.f2) obj4;
                v2 v2Var = (v2) obj3;
                TL_stars.starGiftDepositPayload stargiftdepositpayload = (TL_stars.starGiftDepositPayload) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (stargiftdepositpayload == null) {
                    bVar.b();
                    if (f2Var != null) {
                        k10 = new org.telegram.ui.Components.lc(f2Var.f30145c, f6Var2.J0);
                    } else {
                        k10 = f6Var2.k();
                    }
                    k10.g0(tL_error2, false);
                    return;
                }
                v2Var.a(stargiftdepositpayload);
                return;
            case 2:
                p31 p31Var = (p31) obj5;
                String str2 = (String) obj4;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.t1) obj6).dismiss();
                if (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue) {
                    p31Var.run();
                    return;
                }
                org.telegram.ui.ActionBar.w2 w2Var = gi0.f48060a;
                if (w2Var != null) {
                    w2Var.dismiss();
                    gi0.f48060a = null;
                }
                org.telegram.ui.Components.lc a10 = gi0.a();
                String N03 = hd.N0(2131753125, null);
                if (TextUtils.isEmpty(str2)) {
                    P2 = hd.N0(2131753126, null);
                } else {
                    P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, h6Var), hd.a0(null, null, 2131753127, str2));
                }
                a10.I(2131624012, N03, P2).j();
                return;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj6;
                fi.f7 f7Var = (fi.f7) obj5;
                String str3 = (String) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                TLRPC.Updates updates2 = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.h6 h6Var2 = v0Var.f53312e;
                if (updates2 != null) {
                    np.u1(v0Var.N).V3(updates2, false);
                    v0Var.x(f7Var, "requested_chat_sent", org.telegram.ui.web.v0.A(str3, "req_id"));
                    long j3 = v0Var.V.f28547id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f28547id);
                    org.telegram.ui.web.a0 a0Var = new org.telegram.ui.web.a0(v0Var, bundle, user, j3);
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null) {
                        T.presentFragment(a0Var);
                    }
                    org.telegram.ui.web.c0 c0Var = v0Var.f53309c;
                    if (c0Var != null) {
                        c0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error4 != null) {
                    new org.telegram.ui.Components.lc(v0Var, h6Var2).g0(tL_error4, false);
                    v0Var.x(f7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str3, "req_id"));
                    return;
                } else {
                    new org.telegram.ui.Components.lc(v0Var, h6Var2).f0("UNKNOWN_BUTTON", false);
                    v0Var.x(f7Var, "requested_chat_failed", org.telegram.ui.web.v0.A(str3, "req_id"));
                    return;
                }
        }
    }
}
