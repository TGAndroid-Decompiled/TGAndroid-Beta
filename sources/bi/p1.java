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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.y60;
import org.telegram.ui.y80;
public final class p1 implements oj0 {
    public final int f3959a;
    public final Object f3960b;
    public final Object f3961c;
    public final Object d;

    public p1(Object obj, Object obj2, Object obj3, int i7) {
        this.f3959a = i7;
        this.f3960b = obj;
        this.f3961c = obj2;
        this.d = obj3;
    }

    @Override
    public final void c(int i7, View view) {
        ah.r rVar;
        TLRPC.User user;
        TLRPC.WebPage webPage;
        int i10;
        int i11 = this.f3959a;
        String str = null;
        Object obj = this.d;
        Object obj2 = this.f3961c;
        Object obj3 = this.f3960b;
        boolean z10 = false;
        boolean z11 = false;
        z10 = false;
        switch (i11) {
            case 0:
                a2 a2Var = (a2) obj3;
                LinkedHashMap linkedHashMap = a2Var.f3380a2;
                y1 y1Var = (y1) obj2;
                w1 w1Var = (w1) obj;
                org.telegram.ui.ActionBar.n2 n2Var = a2Var.f30195c;
                l41 G = a2Var.f3388j2.G(i7 - 1);
                if (G != null) {
                    if (G.d == 1 && G.f56589a == 3) {
                        org.telegram.ui.Components.b5.l(a2Var.getContext(), gd.M0(2131751227, null), gd.M0(2131751232, null), null, new l1(a2Var, 2), new j1(a2Var, 3), false, false, a2Var.J0).C2();
                        return;
                    } else if (y1Var != null) {
                        if (G.H(x1.class)) {
                            a2Var.n1(G.d);
                            return;
                        }
                        Object obj4 = G.H;
                        if (obj4 instanceof TLRPC.User) {
                            a2Var.n1(((TLRPC.User) obj4).f28554id);
                            return;
                        } else if (obj4 instanceof TLRPC.Chat) {
                            a2Var.n1(-((TLRPC.Chat) obj4).f28405id);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        Object obj5 = G.H;
                        if (obj5 instanceof TLRPC.User) {
                            if (w1Var != null) {
                                TLRPC.User user2 = (TLRPC.User) obj5;
                                ck0 ck0Var = a2Var.f39534o1;
                                if (linkedHashMap.remove(Long.valueOf(user2.f28554id)) == null) {
                                    int size = linkedHashMap.size();
                                    a2Var.V1.getClass();
                                    if (size >= 10) {
                                        new lc(n2Var, a2Var.J0).Q(2131623982, 36, gd.G(10, "BotMultiContactsSelectorLimit", new Object[0])).k(true);
                                        try {
                                            n2Var.performHapticFeedback(3, 2);
                                            return;
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    }
                                    linkedHashMap.put(Long.valueOf(user2.f28554id), user2);
                                }
                                boolean containsKey = linkedHashMap.containsKey(Long.valueOf(user2.f28554id));
                                for (int i12 = 0; i12 < a2Var.f3388j2.E.size(); i12++) {
                                    l41 G2 = a2Var.f3388j2.G(i12);
                                    if (G2 != null && (G2.H instanceof TLRPC.User) && G2.f37029y == user2.f28554id) {
                                        G2.f37011e = containsKey;
                                    }
                                }
                                for (int i13 = 0; i13 < ck0Var.getChildCount(); i13++) {
                                    View childAt = ck0Var.getChildAt(i13);
                                    if ((childAt instanceof ah.r) && (user = (rVar = (ah.r) childAt).getUser()) != null && user.f28554id == user2.f28554id) {
                                        rVar.c(containsKey, true);
                                    }
                                }
                                hi.d dVar = a2Var.f3381b2;
                                if (dVar != null) {
                                    dVar.c(linkedHashMap.size(), true);
                                    dVar.setEnabled(!linkedHashMap.isEmpty());
                                    return;
                                }
                                return;
                            }
                            TLRPC.User user3 = (TLRPC.User) obj5;
                            org.telegram.messenger.g0.v1(a2Var.f3395q2);
                            if (a2Var.T1) {
                                ab abVar = new ab(a2Var.getContext(), a2Var.J0, user3, new j1(a2Var, 1));
                                if (!org.telegram.messenger.g0.Q1()) {
                                    abVar.a0(a2Var.f30213j1);
                                }
                                abVar.show();
                                return;
                            } else if (o10.b(user3.f28554id)) {
                                n10.u(gd.a0(null, null, 2131743505, org.telegram.messenger.n5.t(user3.f28554id)), new lc(n2Var, a2Var.J0), 2131624012, 36);
                                return;
                            } else {
                                j3 j3Var = new j3(a2Var.getContext(), a2Var.f30189a, user3.f28554id, wg.s.c(wg.s.b(1, a2Var.f3387i2)), new l1(a2Var, 0));
                                long j3 = user3.f28554id;
                                org.telegram.messenger.t1 t1Var = a2Var.U1;
                                if (t1Var != null && t1Var.a(j3)) {
                                    z10 = true;
                                }
                                j3Var.g1(z10);
                                j3Var.show();
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
                y60 G3 = y60.G((ViewGroup) obj2, new fi.b(), view);
                G3.p(15, -1, gd.a0(null, null, 2131748616, gd.x(r0Var.d, true)));
                G3.k();
                G3.c(2131232268, gd.M0(2131747593, null), new di.w2(20, (f9) obj, r0Var), false);
                G3.l(2131232105, gd.M0(2131751756, null), new di.w2(21, a2Var2, m0Var), !r0Var.f12489e);
                G3.l(2131232110, gd.M0(2131751587, null), new di.w2(22, a2Var2, r0Var), (a2Var2.N == j10.i(a2Var2.O).e() || a2Var2.f()) ? true : true);
                G3.a0();
                return;
            case 2:
                hi.v6 v6Var = (hi.v6) obj3;
                x10 x10Var = (x10) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                if (view instanceof org.telegram.ui.Cells.g7) {
                    fj message = ((org.telegram.ui.Cells.g7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.a6.q(v6Var.f30189a).v(v6Var);
                        if (v6Var.f15582c2 != null) {
                            org.telegram.messenger.w7.G(v6Var.f30189a).f(v6Var.f15582c2.F0());
                            v6Var.f15582c2 = null;
                        }
                        if (!message.f24023y0 && !message.f24027z0) {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                v6Var.f15582c2 = message;
                                org.telegram.messenger.a6.q(v6Var.f30189a).a(S0, message, v6Var);
                                org.telegram.messenger.w7.G(v6Var.f30189a).W(message.F0(), message, 1, 0);
                                return;
                            }
                            return;
                        }
                        v6Var.f15581b2.a(message);
                        hi.v6 v6Var2 = v6Var.W1;
                        if (v6Var2 != null) {
                            v6Var2.dismiss();
                        }
                        v6Var.dismiss();
                        return;
                    }
                    return;
                }
                l41 G4 = v6Var.f15590l2.G(i7 - 1);
                if (G4 != null && G4.d == 1) {
                    new hi.v6(v6Var.getContext(), true, v6Var, x10Var, i6Var).show();
                    return;
                } else if (G4 != null && G4.d == 2) {
                    v6Var.f15580a2.b();
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
                org.telegram.ui.Cells.k3 k3Var = l7Var.V1;
                org.telegram.ui.Cells.k3 k3Var2 = l7Var.U1;
                l41 G5 = l7Var.T1.G(i7 - 1);
                if (G5 != null) {
                    if (G5.H(hi.j7.class) && (webPage = l7Var.f14946c2) != null && !hi.l7.h1(webPage)) {
                        tg.k2 k2Var = new tg.k2(context, l7Var.f30189a);
                        tg.h0 h0Var = new tg.h0();
                        h0Var.f57894c = k3Var2.d.getText().toString();
                        if (l7Var.f14951i2) {
                            str = k3Var.d.getText().toString();
                        }
                        h0Var.f57893b = str;
                        TLRPC.WebPage webPage2 = l7Var.f14946c2;
                        h0Var.d = webPage2;
                        h0Var.f57895e = l7Var.f14953k2;
                        h0Var.f57896f = l7Var.f14952j2;
                        hi.t6 t6Var = new hi.t6(l7Var, 1);
                        k2Var.H = h0Var;
                        if (webPage2 != null && (webPage2.photo != null || fj.K4(webPage2.document))) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        ta0 ta0Var = k2Var.f57997y;
                        ta0Var.setVisibility(i10);
                        k2Var.f57991f.b(k2Var.f57987a, h0Var, false);
                        k2Var.f57996x.a(!h0Var.f57896f, false);
                        ta0Var.a(!h0Var.f57895e, false);
                        k2Var.I = t6Var;
                        k2Var.f57990e.setImageDrawable(new hi.l3(w5Var, 9));
                        k2Var.show();
                        return;
                    } else if (G5.d == 2 && (view instanceof org.telegram.ui.Cells.r8)) {
                        boolean z12 = !l7Var.f14951i2;
                        l7Var.f14951i2 = z12;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z12);
                        l7Var.T1.O(true);
                        if (l7Var.f14951i2) {
                            k3Var.requestFocus();
                            return;
                        } else {
                            k3Var2.requestFocus();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.Cells.t tVar = (org.telegram.ui.Cells.t) obj3;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj2;
                Context context2 = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                y80 y80Var = (y80) tVar.f31816f3.get(i7);
                if (y80Var.f54093e && !j10.o()) {
                    h2Var.showDialog(new ug.z0(h2Var, 10, true));
                    return;
                } else if (!ya.a(y80Var)) {
                    v4.d0 d0Var = new v4.d0(context2);
                    d0Var.f59066a = i7;
                    tVar.f31817g3.w0(d0Var);
                    ya.b(y80Var);
                    int i14 = org.telegram.ui.Cells.s.h;
                    sVar.b(true, true);
                    for (int i15 = 0; i15 < tVar.getChildCount(); i15++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i15);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    ks.e().k(294, 5, y80Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
