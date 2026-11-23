package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import c8.ya;
import di.ab;
import fi.f9;
import java.util.LinkedHashMap;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.messenger.p10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.va0;
import org.telegram.ui.z80;
public final class t1 implements qj0 {
    public final int f4110a;
    public final Object f4111b;
    public final Object f4112c;
    public final Object d;

    public t1(Object obj, Object obj2, Object obj3, int i7) {
        this.f4110a = i7;
        this.f4111b = obj;
        this.f4112c = obj2;
        this.d = obj3;
    }

    @Override
    public final void c(int i7, View view) {
        ah.r rVar;
        TLRPC.User user;
        TLRPC.WebPage webPage;
        int i10;
        int i11 = this.f4110a;
        String str = null;
        Object obj = this.d;
        Object obj2 = this.f4112c;
        Object obj3 = this.f4111b;
        boolean z10 = false;
        boolean z11 = false;
        z10 = false;
        switch (i11) {
            case 0:
                e2 e2Var = (e2) obj3;
                LinkedHashMap linkedHashMap = e2Var.f3576a2;
                c2 c2Var = (c2) obj2;
                a2 a2Var = (a2) obj;
                org.telegram.ui.ActionBar.m2 m2Var = e2Var.f30179c;
                o41 G = e2Var.f3584j2.G(i7 - 1);
                if (G != null) {
                    if (G.d == 1 && G.f56634a == 3) {
                        org.telegram.ui.Components.c5.l(e2Var.getContext(), hd.N0(2131751226, null), hd.N0(2131751231, null), null, new p1(e2Var, 2), new n1(e2Var, 3), false, false, e2Var.J0).C2();
                        return;
                    } else if (c2Var != null) {
                        if (G.H(b2.class)) {
                            e2Var.n1(G.d);
                            return;
                        }
                        Object obj4 = G.H;
                        if (obj4 instanceof TLRPC.User) {
                            e2Var.n1(((TLRPC.User) obj4).f28583id);
                            return;
                        } else if (obj4 instanceof TLRPC.Chat) {
                            e2Var.n1(-((TLRPC.Chat) obj4).f28434id);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        Object obj5 = G.H;
                        if (obj5 instanceof TLRPC.User) {
                            if (a2Var != null) {
                                TLRPC.User user2 = (TLRPC.User) obj5;
                                ek0 ek0Var = e2Var.f39532o1;
                                if (linkedHashMap.remove(Long.valueOf(user2.f28583id)) == null) {
                                    int size = linkedHashMap.size();
                                    e2Var.V1.getClass();
                                    if (size >= 10) {
                                        new lc(m2Var, e2Var.J0).Q(2131623982, 36, hd.G(10, "BotMultiContactsSelectorLimit", new Object[0])).k(true);
                                        try {
                                            m2Var.performHapticFeedback(3, 2);
                                            return;
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    }
                                    linkedHashMap.put(Long.valueOf(user2.f28583id), user2);
                                }
                                boolean containsKey = linkedHashMap.containsKey(Long.valueOf(user2.f28583id));
                                for (int i12 = 0; i12 < e2Var.f3584j2.E.size(); i12++) {
                                    o41 G2 = e2Var.f3584j2.G(i12);
                                    if (G2 != null && (G2.H instanceof TLRPC.User) && G2.f38103y == user2.f28583id) {
                                        G2.f38085e = containsKey;
                                    }
                                }
                                for (int i13 = 0; i13 < ek0Var.getChildCount(); i13++) {
                                    View childAt = ek0Var.getChildAt(i13);
                                    if ((childAt instanceof ah.r) && (user = (rVar = (ah.r) childAt).getUser()) != null && user.f28583id == user2.f28583id) {
                                        rVar.c(containsKey, true);
                                    }
                                }
                                hi.e eVar = e2Var.f3577b2;
                                if (eVar != null) {
                                    eVar.c(linkedHashMap.size(), true);
                                    eVar.setEnabled(!linkedHashMap.isEmpty());
                                    return;
                                }
                                return;
                            }
                            TLRPC.User user3 = (TLRPC.User) obj5;
                            org.telegram.messenger.g0.v1(e2Var.f3591q2);
                            if (e2Var.T1) {
                                ab abVar = new ab(e2Var.getContext(), e2Var.J0, user3, new n1(e2Var, 1));
                                if (!org.telegram.messenger.g0.Q1()) {
                                    abVar.a0(e2Var.f30197j1);
                                }
                                abVar.show();
                                return;
                            } else if (p10.b(user3.f28583id)) {
                                o10.u(hd.a0(null, null, 2131743497, org.telegram.messenger.n5.t(user3.f28583id)), new lc(m2Var, e2Var.J0), 2131624012, 36);
                                return;
                            } else {
                                n3 n3Var = new n3(e2Var.getContext(), e2Var.f30173a, user3.f28583id, wg.s.c(wg.s.b(1, e2Var.f3583i2)), new p1(e2Var, 0));
                                long j3 = user3.f28583id;
                                org.telegram.messenger.t1 t1Var = e2Var.U1;
                                if (t1Var != null && t1Var.a(j3)) {
                                    z10 = true;
                                }
                                n3Var.g1(z10);
                                n3Var.show();
                                return;
                            }
                        }
                        return;
                    }
                }
                return;
            case 1:
                fi.a2 a2Var2 = (fi.a2) obj3;
                fi.m0 m0Var = (fi.m0) view;
                fi.r0 r0Var = m0Var.L;
                a70 G3 = a70.G((ViewGroup) obj2, new fi.b(), view);
                G3.p(15, -1, hd.a0(null, null, 2131748615, hd.x(r0Var.d, true)));
                G3.k();
                G3.c(2131232268, hd.N0(2131747592, null), new di.f2(22, (f9) obj, r0Var), false);
                G3.l(2131232105, hd.N0(2131751755, null), new di.f2(23, a2Var2, m0Var), !r0Var.f12520e);
                G3.l(2131232110, hd.N0(2131751586, null), new di.f2(24, a2Var2, r0Var), (a2Var2.N == k10.i(a2Var2.O).e() || a2Var2.f()) ? true : true);
                G3.a0();
                return;
            case 2:
                hi.u6 u6Var = (hi.u6) obj3;
                y10 y10Var = (y10) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (view instanceof org.telegram.ui.Cells.h7) {
                    gj message = ((org.telegram.ui.Cells.h7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.a6.q(u6Var.f30173a).v(u6Var);
                        if (u6Var.f15549c2 != null) {
                            org.telegram.messenger.w7.G(u6Var.f30173a).f(u6Var.f15549c2.F0());
                            u6Var.f15549c2 = null;
                        }
                        if (!message.f24268y0 && !message.f24272z0) {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                u6Var.f15549c2 = message;
                                org.telegram.messenger.a6.q(u6Var.f30173a).a(S0, message, u6Var);
                                org.telegram.messenger.w7.G(u6Var.f30173a).W(message.F0(), message, 1, 0);
                                return;
                            }
                            return;
                        }
                        u6Var.f15548b2.a(message);
                        hi.u6 u6Var2 = u6Var.W1;
                        if (u6Var2 != null) {
                            u6Var2.dismiss();
                        }
                        u6Var.dismiss();
                        return;
                    }
                    return;
                }
                o41 G4 = u6Var.f15557l2.G(i7 - 1);
                if (G4 != null && G4.d == 1) {
                    new hi.u6(u6Var.getContext(), true, u6Var, y10Var, h6Var).show();
                    return;
                } else if (G4 != null && G4.d == 2) {
                    u6Var.f15547a2.b();
                    return;
                } else if (G4 != null && G4.d == 3) {
                    u6Var.i1();
                    return;
                } else if (G4 != null && G4.d == 4) {
                    u6Var.h1();
                    return;
                } else {
                    return;
                }
            case 3:
                hi.k7 k7Var = (hi.k7) obj3;
                Context context = (Context) obj2;
                hi.v5 v5Var = (hi.v5) obj;
                org.telegram.ui.Cells.l3 l3Var = k7Var.V1;
                org.telegram.ui.Cells.l3 l3Var2 = k7Var.U1;
                o41 G5 = k7Var.T1.G(i7 - 1);
                if (G5 != null) {
                    if (G5.H(hi.i7.class) && (webPage = k7Var.f14921c2) != null && !hi.k7.h1(webPage)) {
                        tg.l2 l2Var = new tg.l2(context, k7Var.f30173a);
                        tg.i0 i0Var = new tg.i0();
                        i0Var.f57957c = l3Var2.d.getText().toString();
                        if (k7Var.f14926i2) {
                            str = l3Var.d.getText().toString();
                        }
                        i0Var.f57956b = str;
                        TLRPC.WebPage webPage2 = k7Var.f14921c2;
                        i0Var.d = webPage2;
                        i0Var.f57958e = k7Var.f14928k2;
                        i0Var.f57959f = k7Var.f14927j2;
                        hi.s6 s6Var = new hi.s6(k7Var, 1);
                        l2Var.H = i0Var;
                        if (webPage2 != null && (webPage2.photo != null || gj.K4(webPage2.document))) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        va0 va0Var = l2Var.f58057y;
                        va0Var.setVisibility(i10);
                        l2Var.f58051f.b(l2Var.f58047a, i0Var, false);
                        l2Var.f58056x.a(!i0Var.f57959f, false);
                        va0Var.a(!i0Var.f57958e, false);
                        l2Var.I = s6Var;
                        l2Var.f58050e.setImageDrawable(new hi.k3(v5Var, 9));
                        l2Var.show();
                        return;
                    } else if (G5.d == 2 && (view instanceof org.telegram.ui.Cells.s8)) {
                        boolean z12 = !k7Var.f14926i2;
                        k7Var.f14926i2 = z12;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z12);
                        k7Var.T1.O(true);
                        if (k7Var.f14926i2) {
                            l3Var.requestFocus();
                            return;
                        } else {
                            l3Var2.requestFocus();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj2;
                Context context2 = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                z80 z80Var = (z80) tVar.f31825f3.get(i7);
                if (z80Var.f54497e && !k10.o()) {
                    g2Var.showDialog(new ug.y0(g2Var, 10, true));
                    return;
                } else if (!ya.a(z80Var)) {
                    v4.d0 d0Var = new v4.d0(context2);
                    d0Var.f59109a = i7;
                    tVar.f31826g3.w0(d0Var);
                    ya.b(z80Var);
                    int i14 = org.telegram.ui.Cells.s.h;
                    sVar.b(true, true);
                    for (int i15 = 0; i15 < tVar.getChildCount(); i15++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i15);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    ls.e().k(295, 5, z80Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
