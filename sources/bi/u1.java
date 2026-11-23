package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import c8.za;
import di.ab;
import java.util.LinkedHashMap;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.n10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.y80;
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
    public final void b(int i7, View view) {
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
                org.telegram.ui.ActionBar.m2 m2Var = f2Var.f30229c;
                n41 G = f2Var.f3536j2.G(i7 - 1);
                if (G != null) {
                    if (G.d == 1 && G.f56712a == 3) {
                        org.telegram.ui.Components.b5.l(f2Var.getContext(), gd.N0(2131751226, null), gd.N0(2131751231, null), null, new p1(f2Var, 2), new n1(f2Var, 3), false, false, f2Var.J0).D0();
                        return;
                    } else if (d2Var != null) {
                        if (G.H(c2.class)) {
                            f2Var.n1(G.d);
                            return;
                        }
                        Object obj4 = G.H;
                        if (obj4 instanceof TLRPC.User) {
                            f2Var.n1(((TLRPC.User) obj4).f28641id);
                            return;
                        } else if (obj4 instanceof TLRPC.Chat) {
                            f2Var.n1(-((TLRPC.Chat) obj4).f28492id);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        Object obj5 = G.H;
                        if (obj5 instanceof TLRPC.User) {
                            if (b2Var != null) {
                                TLRPC.User user2 = (TLRPC.User) obj5;
                                ek0 ek0Var = f2Var.f39246o1;
                                if (linkedHashMap.remove(Long.valueOf(user2.f28641id)) == null) {
                                    int size = linkedHashMap.size();
                                    f2Var.V1.getClass();
                                    if (size >= 10) {
                                        new kc(m2Var, f2Var.J0).Q(2131623982, 36, gd.G(10, "BotMultiContactsSelectorLimit", new Object[0])).k(true);
                                        try {
                                            m2Var.performHapticFeedback(3, 2);
                                            return;
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    }
                                    linkedHashMap.put(Long.valueOf(user2.f28641id), user2);
                                }
                                boolean containsKey = linkedHashMap.containsKey(Long.valueOf(user2.f28641id));
                                for (int i12 = 0; i12 < f2Var.f3536j2.E.size(); i12++) {
                                    n41 G2 = f2Var.f3536j2.G(i12);
                                    if (G2 != null && (G2.H instanceof TLRPC.User) && G2.f37666y == user2.f28641id) {
                                        G2.f37648e = containsKey;
                                    }
                                }
                                for (int i13 = 0; i13 < ek0Var.getChildCount(); i13++) {
                                    View childAt = ek0Var.getChildAt(i13);
                                    if ((childAt instanceof ah.r) && (user = (rVar = (ah.r) childAt).getUser()) != null && user.f28641id == user2.f28641id) {
                                        rVar.c(containsKey, true);
                                    }
                                }
                                hi.e eVar = f2Var.f3529b2;
                                if (eVar != null) {
                                    eVar.c(linkedHashMap.size(), true);
                                    eVar.setEnabled(!linkedHashMap.isEmpty());
                                    return;
                                }
                                return;
                            }
                            TLRPC.User user3 = (TLRPC.User) obj5;
                            org.telegram.messenger.g0.v1(f2Var.f3543q2);
                            if (f2Var.T1) {
                                ab abVar = new ab(f2Var.getContext(), f2Var.J0, user3, new n1(f2Var, 1));
                                if (!org.telegram.messenger.g0.Q1()) {
                                    abVar.a0(f2Var.f30247j1);
                                }
                                abVar.show();
                                return;
                            } else if (n10.b(user3.f28641id)) {
                                m10.u(gd.a0(null, null, 2131743495, org.telegram.messenger.n5.t(user3.f28641id)), new kc(m2Var, f2Var.J0), 2131624012, 36);
                                return;
                            } else {
                                p3 p3Var = new p3(f2Var.getContext(), f2Var.f30223a, user3.f28641id, wg.r.c(wg.r.b(1, f2Var.f3535i2)), new p1(f2Var, 0));
                                long j3 = user3.f28641id;
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
                x60 G3 = x60.G((ViewGroup) obj2, new fi.b(), view);
                G3.p(15, -1, gd.a0(null, null, 2131748615, gd.x(r0Var.d, true)));
                G3.k();
                G3.c(2131232271, gd.N0(2131747592, null), new di.f2(22, (fi.f9) obj, r0Var), false);
                G3.l(2131232108, gd.N0(2131751755, null), new di.f2(23, a2Var, m0Var), !r0Var.f12482e);
                G3.l(2131232113, gd.N0(2131751586, null), new di.f2(24, a2Var, r0Var), (a2Var.N == i10.i(a2Var.O).e() || a2Var.f()) ? true : true);
                G3.a0();
                return;
            case 2:
                hi.e7 e7Var = (hi.e7) obj3;
                w10 w10Var = (w10) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                if (view instanceof org.telegram.ui.Cells.g7) {
                    fj message = ((org.telegram.ui.Cells.g7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.a6.q(e7Var.f30223a).v(e7Var);
                        if (e7Var.f14377c2 != null) {
                            org.telegram.messenger.w7.G(e7Var.f30223a).f(e7Var.f14377c2.F0());
                            e7Var.f14377c2 = null;
                        }
                        if (!message.f24128y0 && !message.f24132z0) {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                e7Var.f14377c2 = message;
                                org.telegram.messenger.a6.q(e7Var.f30223a).a(S0, message, e7Var);
                                org.telegram.messenger.w7.G(e7Var.f30223a).W(message.F0(), message, 1, 0);
                                return;
                            }
                            return;
                        }
                        e7Var.f14376b2.a(message);
                        hi.e7 e7Var2 = e7Var.W1;
                        if (e7Var2 != null) {
                            e7Var2.dismiss();
                        }
                        e7Var.dismiss();
                        return;
                    }
                    return;
                }
                n41 G4 = e7Var.f14385l2.G(i7 - 1);
                if (G4 != null && G4.d == 1) {
                    new hi.e7(e7Var.getContext(), true, e7Var, w10Var, i6Var).show();
                    return;
                } else if (G4 != null && G4.d == 2) {
                    e7Var.f14375a2.b();
                    return;
                } else if (G4 != null && G4.d == 3) {
                    e7Var.i1();
                    return;
                } else if (G4 != null && G4.d == 4) {
                    e7Var.h1();
                    return;
                } else {
                    return;
                }
            case 3:
                hi.f8 f8Var = (hi.f8) obj3;
                Context context = (Context) obj2;
                hi.f6 f6Var = (hi.f6) obj;
                org.telegram.ui.Cells.l3 l3Var = f8Var.V1;
                org.telegram.ui.Cells.l3 l3Var2 = f8Var.U1;
                n41 G5 = f8Var.T1.G(i7 - 1);
                if (G5 != null) {
                    if (G5.H(hi.d8.class) && (webPage = f8Var.f14486c2) != null && !hi.f8.h1(webPage)) {
                        tg.o2 o2Var = new tg.o2(context, f8Var.f30223a);
                        tg.m0 m0Var2 = new tg.m0();
                        m0Var2.f58074c = l3Var2.d.getText().toString();
                        if (f8Var.f14491i2) {
                            str = l3Var.d.getText().toString();
                        }
                        m0Var2.f58073b = str;
                        TLRPC.WebPage webPage2 = f8Var.f14486c2;
                        m0Var2.d = webPage2;
                        m0Var2.f58075e = f8Var.f14493k2;
                        m0Var2.f58076f = f8Var.f14492j2;
                        hi.c7 c7Var = new hi.c7(f8Var, 1);
                        o2Var.H = m0Var2;
                        if (webPage2 != null && (webPage2.photo != null || fj.K4(webPage2.document))) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        sa0 sa0Var = o2Var.f58162y;
                        sa0Var.setVisibility(i10);
                        o2Var.f58156f.b(o2Var.f58152a, m0Var2, false);
                        o2Var.f58161x.a(!m0Var2.f58076f, false);
                        sa0Var.a(!m0Var2.f58075e, false);
                        o2Var.I = c7Var;
                        o2Var.f58155e.setImageDrawable(new hi.t3(f6Var, 9));
                        o2Var.show();
                        return;
                    } else if (G5.d == 2 && (view instanceof org.telegram.ui.Cells.r8)) {
                        boolean z12 = !f8Var.f14491i2;
                        f8Var.f14491i2 = z12;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z12);
                        f8Var.T1.O(true);
                        if (f8Var.f14491i2) {
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
                y80 y80Var = (y80) tVar.f31887f3.get(i7);
                if (y80Var.f54310e && !i10.o()) {
                    g2Var.showDialog(new ug.y0(g2Var, 10, true));
                    return;
                } else if (!za.a(y80Var)) {
                    v4.d0 d0Var = new v4.d0(context2);
                    d0Var.f59190a = i7;
                    tVar.f31888g3.w0(d0Var);
                    za.b(y80Var);
                    int i14 = org.telegram.ui.Cells.s.h;
                    sVar.b(true, true);
                    for (int i15 = 0; i15 < tVar.getChildCount(); i15++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i15);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    ks.e().k(295, 5, y80Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
