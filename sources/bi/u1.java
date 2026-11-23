package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import c8.za;
import di.ab;
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
public final class u1 implements qj0 {
    public final int f4091a;
    public final Object f4092b;
    public final Object f4093c;
    public final Object d;

    public u1(Object obj, Object obj2, Object obj3, int i7) {
        this.f4091a = i7;
        this.f4092b = obj;
        this.f4093c = obj2;
        this.d = obj3;
    }

    @Override
    public final void c(int i7, View view) {
        ah.r rVar;
        TLRPC.User user;
        TLRPC.WebPage webPage;
        int i10;
        int i11 = this.f4091a;
        String str = null;
        Object obj = this.d;
        Object obj2 = this.f4093c;
        Object obj3 = this.f4092b;
        boolean z10 = false;
        boolean z11 = false;
        z10 = false;
        switch (i11) {
            case 0:
                f2 f2Var = (f2) obj3;
                LinkedHashMap linkedHashMap = f2Var.f3528a2;
                d2 d2Var = (d2) obj2;
                b2 b2Var = (b2) obj;
                org.telegram.ui.ActionBar.m2 m2Var = f2Var.f30145c;
                o41 G = f2Var.f3536j2.G(i7 - 1);
                if (G != null) {
                    if (G.d == 1 && G.f56599a == 3) {
                        org.telegram.ui.Components.c5.l(f2Var.getContext(), hd.N0(2131751226, null), hd.N0(2131751231, null), null, new p1(f2Var, 2), new n1(f2Var, 3), false, false, f2Var.J0).C2();
                        return;
                    } else if (d2Var != null) {
                        if (G.H(c2.class)) {
                            f2Var.n1(G.d);
                            return;
                        }
                        Object obj4 = G.H;
                        if (obj4 instanceof TLRPC.User) {
                            f2Var.n1(((TLRPC.User) obj4).f28547id);
                            return;
                        } else if (obj4 instanceof TLRPC.Chat) {
                            f2Var.n1(-((TLRPC.Chat) obj4).f28398id);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        Object obj5 = G.H;
                        if (obj5 instanceof TLRPC.User) {
                            if (b2Var != null) {
                                TLRPC.User user2 = (TLRPC.User) obj5;
                                ek0 ek0Var = f2Var.f39487o1;
                                if (linkedHashMap.remove(Long.valueOf(user2.f28547id)) == null) {
                                    int size = linkedHashMap.size();
                                    f2Var.V1.getClass();
                                    if (size >= 10) {
                                        new lc(m2Var, f2Var.J0).Q(2131623982, 36, hd.G(10, "BotMultiContactsSelectorLimit", new Object[0])).k(true);
                                        try {
                                            m2Var.performHapticFeedback(3, 2);
                                            return;
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    }
                                    linkedHashMap.put(Long.valueOf(user2.f28547id), user2);
                                }
                                boolean containsKey = linkedHashMap.containsKey(Long.valueOf(user2.f28547id));
                                for (int i12 = 0; i12 < f2Var.f3536j2.E.size(); i12++) {
                                    o41 G2 = f2Var.f3536j2.G(i12);
                                    if (G2 != null && (G2.H instanceof TLRPC.User) && G2.f38069y == user2.f28547id) {
                                        G2.f38051e = containsKey;
                                    }
                                }
                                for (int i13 = 0; i13 < ek0Var.getChildCount(); i13++) {
                                    View childAt = ek0Var.getChildAt(i13);
                                    if ((childAt instanceof ah.r) && (user = (rVar = (ah.r) childAt).getUser()) != null && user.f28547id == user2.f28547id) {
                                        rVar.c(containsKey, true);
                                    }
                                }
                                hi.d dVar = f2Var.f3529b2;
                                if (dVar != null) {
                                    dVar.c(linkedHashMap.size(), true);
                                    dVar.setEnabled(!linkedHashMap.isEmpty());
                                    return;
                                }
                                return;
                            }
                            TLRPC.User user3 = (TLRPC.User) obj5;
                            org.telegram.messenger.g0.v1(f2Var.f3543q2);
                            if (f2Var.T1) {
                                ab abVar = new ab(f2Var.getContext(), f2Var.J0, user3, new n1(f2Var, 1));
                                if (!org.telegram.messenger.g0.Q1()) {
                                    abVar.a0(f2Var.f30163j1);
                                }
                                abVar.show();
                                return;
                            } else if (p10.b(user3.f28547id)) {
                                o10.u(hd.a0(null, null, 2131743499, org.telegram.messenger.n5.t(user3.f28547id)), new lc(m2Var, f2Var.J0), 2131624012, 36);
                                return;
                            } else {
                                p3 p3Var = new p3(f2Var.getContext(), f2Var.f30139a, user3.f28547id, wg.s.c(wg.s.b(1, f2Var.f3535i2)), new p1(f2Var, 0));
                                long j3 = user3.f28547id;
                                org.telegram.messenger.t1 t1Var = f2Var.U1;
                                if (t1Var != null && t1Var.a(j3)) {
                                    z10 = true;
                                }
                                p3Var.g1(z10);
                                p3Var.show();
                                return;
                            }
                        }
                        return;
                    }
                }
                return;
            case 1:
                fi.a2 a2Var = (fi.a2) obj3;
                fi.m0 m0Var = (fi.m0) view;
                fi.r0 r0Var = m0Var.L;
                a70 G3 = a70.G((ViewGroup) obj2, new fi.b(), view);
                G3.p(15, -1, hd.a0(null, null, 2131748615, hd.x(r0Var.d, true)));
                G3.k();
                G3.c(2131232268, hd.N0(2131747592, null), new di.w2(20, (fi.f9) obj, r0Var), false);
                G3.l(2131232105, hd.N0(2131751755, null), new di.w2(21, a2Var, m0Var), !r0Var.f12481e);
                G3.l(2131232110, hd.N0(2131751586, null), new di.w2(22, a2Var, r0Var), (a2Var.N == k10.i(a2Var.O).e() || a2Var.f()) ? true : true);
                G3.a0();
                return;
            case 2:
                hi.v6 v6Var = (hi.v6) obj3;
                y10 y10Var = (y10) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (view instanceof org.telegram.ui.Cells.h7) {
                    gj message = ((org.telegram.ui.Cells.h7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.a6.q(v6Var.f30139a).v(v6Var);
                        if (v6Var.f15534c2 != null) {
                            org.telegram.messenger.w7.G(v6Var.f30139a).f(v6Var.f15534c2.F0());
                            v6Var.f15534c2 = null;
                        }
                        if (!message.f24232y0 && !message.f24236z0) {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                v6Var.f15534c2 = message;
                                org.telegram.messenger.a6.q(v6Var.f30139a).a(S0, message, v6Var);
                                org.telegram.messenger.w7.G(v6Var.f30139a).W(message.F0(), message, 1, 0);
                                return;
                            }
                            return;
                        }
                        v6Var.f15533b2.a(message);
                        hi.v6 v6Var2 = v6Var.W1;
                        if (v6Var2 != null) {
                            v6Var2.dismiss();
                        }
                        v6Var.dismiss();
                        return;
                    }
                    return;
                }
                o41 G4 = v6Var.f15542l2.G(i7 - 1);
                if (G4 != null && G4.d == 1) {
                    new hi.v6(v6Var.getContext(), true, v6Var, y10Var, h6Var).show();
                    return;
                } else if (G4 != null && G4.d == 2) {
                    v6Var.f15532a2.b();
                    return;
                } else if (G4 != null && G4.d == 3) {
                    v6Var.i1();
                    return;
                } else if (G4 != null && G4.d == 4) {
                    v6Var.h1();
                    return;
                } else {
                    return;
                }
            case 3:
                hi.l7 l7Var = (hi.l7) obj3;
                Context context = (Context) obj2;
                hi.w5 w5Var = (hi.w5) obj;
                org.telegram.ui.Cells.l3 l3Var = l7Var.V1;
                org.telegram.ui.Cells.l3 l3Var2 = l7Var.U1;
                o41 G5 = l7Var.T1.G(i7 - 1);
                if (G5 != null) {
                    if (G5.H(hi.j7.class) && (webPage = l7Var.f14933c2) != null && !hi.l7.h1(webPage)) {
                        tg.l2 l2Var = new tg.l2(context, l7Var.f30139a);
                        tg.i0 i0Var = new tg.i0();
                        i0Var.f57922c = l3Var2.d.getText().toString();
                        if (l7Var.f14938i2) {
                            str = l3Var.d.getText().toString();
                        }
                        i0Var.f57921b = str;
                        TLRPC.WebPage webPage2 = l7Var.f14933c2;
                        i0Var.d = webPage2;
                        i0Var.f57923e = l7Var.f14940k2;
                        i0Var.f57924f = l7Var.f14939j2;
                        hi.t6 t6Var = new hi.t6(l7Var, 1);
                        l2Var.H = i0Var;
                        if (webPage2 != null && (webPage2.photo != null || gj.K4(webPage2.document))) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        va0 va0Var = l2Var.f58022y;
                        va0Var.setVisibility(i10);
                        l2Var.f58016f.b(l2Var.f58012a, i0Var, false);
                        l2Var.f58021x.a(!i0Var.f57924f, false);
                        va0Var.a(!i0Var.f57923e, false);
                        l2Var.I = t6Var;
                        l2Var.f58015e.setImageDrawable(new hi.k3(w5Var, 9));
                        l2Var.show();
                        return;
                    } else if (G5.d == 2 && (view instanceof org.telegram.ui.Cells.s8)) {
                        boolean z12 = !l7Var.f14938i2;
                        l7Var.f14938i2 = z12;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z12);
                        l7Var.T1.O(true);
                        if (l7Var.f14938i2) {
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
                z80 z80Var = (z80) tVar.f31791f3.get(i7);
                if (z80Var.f54460e && !k10.o()) {
                    g2Var.showDialog(new ug.y0(g2Var, 10, true));
                    return;
                } else if (!za.a(z80Var)) {
                    v4.c0 c0Var = new v4.c0(context2);
                    c0Var.f59055a = i7;
                    tVar.f31792g3.w0(c0Var);
                    za.b(z80Var);
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
