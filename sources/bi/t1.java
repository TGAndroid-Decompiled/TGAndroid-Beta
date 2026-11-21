package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import c8.ya;
import di.ab;
import fi.f9;
import java.util.LinkedHashMap;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.va0;
import org.telegram.ui.z80;
public final class t1 implements qj0 {
    public final int f4100a;
    public final Object f4101b;
    public final Object f4102c;
    public final Object d;

    public t1(Object obj, Object obj2, Object obj3, int i7) {
        this.f4100a = i7;
        this.f4101b = obj;
        this.f4102c = obj2;
        this.d = obj3;
    }

    @Override
    public final void c(int i7, View view) {
        ah.r rVar;
        TLRPC.User user;
        TLRPC.WebPage webPage;
        int i10;
        int i11 = this.f4100a;
        String str = null;
        Object obj = this.d;
        Object obj2 = this.f4102c;
        Object obj3 = this.f4101b;
        boolean z10 = false;
        boolean z11 = false;
        z10 = false;
        switch (i11) {
            case 0:
                e2 e2Var = (e2) obj3;
                LinkedHashMap linkedHashMap = e2Var.f3558a2;
                c2 c2Var = (c2) obj2;
                a2 a2Var = (a2) obj;
                org.telegram.ui.ActionBar.m2 m2Var = e2Var.f30176c;
                o41 G = e2Var.f3566j2.G(i7 - 1);
                if (G != null) {
                    if (G.d == 1 && G.f56630a == 3) {
                        org.telegram.ui.Components.c5.l(e2Var.getContext(), gd.N0(2131751226, null), gd.N0(2131751231, null), null, new p1(e2Var, 2), new n1(e2Var, 3), false, false, e2Var.J0).C2();
                        return;
                    } else if (c2Var != null) {
                        if (G.H(b2.class)) {
                            e2Var.n1(G.d);
                            return;
                        }
                        Object obj4 = G.H;
                        if (obj4 instanceof TLRPC.User) {
                            e2Var.n1(((TLRPC.User) obj4).f28580id);
                            return;
                        } else if (obj4 instanceof TLRPC.Chat) {
                            e2Var.n1(-((TLRPC.Chat) obj4).f28431id);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        Object obj5 = G.H;
                        if (obj5 instanceof TLRPC.User) {
                            if (a2Var != null) {
                                TLRPC.User user2 = (TLRPC.User) obj5;
                                ek0 ek0Var = e2Var.f39539o1;
                                if (linkedHashMap.remove(Long.valueOf(user2.f28580id)) == null) {
                                    int size = linkedHashMap.size();
                                    e2Var.V1.getClass();
                                    if (size >= 10) {
                                        new lc(m2Var, e2Var.J0).Q(2131623982, 36, gd.G(10, "BotMultiContactsSelectorLimit", new Object[0])).k(true);
                                        try {
                                            m2Var.performHapticFeedback(3, 2);
                                            return;
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    }
                                    linkedHashMap.put(Long.valueOf(user2.f28580id), user2);
                                }
                                boolean containsKey = linkedHashMap.containsKey(Long.valueOf(user2.f28580id));
                                for (int i12 = 0; i12 < e2Var.f3566j2.E.size(); i12++) {
                                    o41 G2 = e2Var.f3566j2.G(i12);
                                    if (G2 != null && (G2.H instanceof TLRPC.User) && G2.f38109y == user2.f28580id) {
                                        G2.f38091e = containsKey;
                                    }
                                }
                                for (int i13 = 0; i13 < ek0Var.getChildCount(); i13++) {
                                    View childAt = ek0Var.getChildAt(i13);
                                    if ((childAt instanceof ah.r) && (user = (rVar = (ah.r) childAt).getUser()) != null && user.f28580id == user2.f28580id) {
                                        rVar.c(containsKey, true);
                                    }
                                }
                                hi.e eVar = e2Var.f3559b2;
                                if (eVar != null) {
                                    eVar.c(linkedHashMap.size(), true);
                                    eVar.setEnabled(!linkedHashMap.isEmpty());
                                    return;
                                }
                                return;
                            }
                            TLRPC.User user3 = (TLRPC.User) obj5;
                            org.telegram.messenger.g0.v1(e2Var.f3573q2);
                            if (e2Var.T1) {
                                ab abVar = new ab(e2Var.getContext(), e2Var.J0, user3, new n1(e2Var, 1));
                                if (!org.telegram.messenger.g0.Q1()) {
                                    abVar.a0(e2Var.f30194j1);
                                }
                                abVar.show();
                                return;
                            } else if (o10.b(user3.f28580id)) {
                                n10.u(gd.a0(null, null, 2131743499, org.telegram.messenger.n5.t(user3.f28580id)), new lc(m2Var, e2Var.J0), 2131624012, 36);
                                return;
                            } else {
                                n3 n3Var = new n3(e2Var.getContext(), e2Var.f30170a, user3.f28580id, wg.s.c(wg.s.b(1, e2Var.f3565i2)), new p1(e2Var, 0));
                                long j3 = user3.f28580id;
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
                G3.p(15, -1, gd.a0(null, null, 2131748615, gd.x(r0Var.d, true)));
                G3.k();
                G3.c(2131232268, gd.N0(2131747592, null), new di.f2(22, (f9) obj, r0Var), false);
                G3.l(2131232105, gd.N0(2131751755, null), new di.f2(23, a2Var2, m0Var), !r0Var.f12517e);
                G3.l(2131232110, gd.N0(2131751586, null), new di.f2(24, a2Var2, r0Var), (a2Var2.N == j10.i(a2Var2.O).e() || a2Var2.f()) ? true : true);
                G3.a0();
                return;
            case 2:
                hi.u6 u6Var = (hi.u6) obj3;
                x10 x10Var = (x10) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (view instanceof org.telegram.ui.Cells.h7) {
                    fj message = ((org.telegram.ui.Cells.h7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.a6.q(u6Var.f30170a).v(u6Var);
                        if (u6Var.f15546c2 != null) {
                            org.telegram.messenger.w7.G(u6Var.f30170a).f(u6Var.f15546c2.F0());
                            u6Var.f15546c2 = null;
                        }
                        if (!message.f24048y0 && !message.f24052z0) {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                u6Var.f15546c2 = message;
                                org.telegram.messenger.a6.q(u6Var.f30170a).a(S0, message, u6Var);
                                org.telegram.messenger.w7.G(u6Var.f30170a).W(message.F0(), message, 1, 0);
                                return;
                            }
                            return;
                        }
                        u6Var.f15545b2.a(message);
                        hi.u6 u6Var2 = u6Var.W1;
                        if (u6Var2 != null) {
                            u6Var2.dismiss();
                        }
                        u6Var.dismiss();
                        return;
                    }
                    return;
                }
                o41 G4 = u6Var.f15554l2.G(i7 - 1);
                if (G4 != null && G4.d == 1) {
                    new hi.u6(u6Var.getContext(), true, u6Var, x10Var, h6Var).show();
                    return;
                } else if (G4 != null && G4.d == 2) {
                    u6Var.f15544a2.b();
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
                    if (G5.H(hi.i7.class) && (webPage = k7Var.f14918c2) != null && !hi.k7.h1(webPage)) {
                        tg.l2 l2Var = new tg.l2(context, k7Var.f30170a);
                        tg.i0 i0Var = new tg.i0();
                        i0Var.f57953c = l3Var2.d.getText().toString();
                        if (k7Var.f14923i2) {
                            str = l3Var.d.getText().toString();
                        }
                        i0Var.f57952b = str;
                        TLRPC.WebPage webPage2 = k7Var.f14918c2;
                        i0Var.d = webPage2;
                        i0Var.f57954e = k7Var.f14925k2;
                        i0Var.f57955f = k7Var.f14924j2;
                        hi.s6 s6Var = new hi.s6(k7Var, 1);
                        l2Var.H = i0Var;
                        if (webPage2 != null && (webPage2.photo != null || fj.K4(webPage2.document))) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        va0 va0Var = l2Var.f58053y;
                        va0Var.setVisibility(i10);
                        l2Var.f58047f.b(l2Var.f58043a, i0Var, false);
                        l2Var.f58052x.a(!i0Var.f57955f, false);
                        va0Var.a(!i0Var.f57954e, false);
                        l2Var.I = s6Var;
                        l2Var.f58046e.setImageDrawable(new hi.k3(v5Var, 9));
                        l2Var.show();
                        return;
                    } else if (G5.d == 2 && (view instanceof org.telegram.ui.Cells.s8)) {
                        boolean z12 = !k7Var.f14923i2;
                        k7Var.f14923i2 = z12;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z12);
                        k7Var.T1.O(true);
                        if (k7Var.f14923i2) {
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
                z80 z80Var = (z80) tVar.f31822f3.get(i7);
                if (z80Var.f54493e && !j10.o()) {
                    g2Var.showDialog(new ug.y0(g2Var, 10, true));
                    return;
                } else if (!ya.a(z80Var)) {
                    v4.d0 d0Var = new v4.d0(context2);
                    d0Var.f59105a = i7;
                    tVar.f31823g3.w0(d0Var);
                    ya.b(z80Var);
                    int i14 = org.telegram.ui.Cells.s.h;
                    sVar.b(true, true);
                    for (int i15 = 0; i15 < tVar.getChildCount(); i15++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i15);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    ks.e().k(295, 5, z80Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
