package fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import c8.wa;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.w80;
public final class f0 implements gj0 {
    public final int f11688a;
    public final Object f11689b;
    public final Object f11690c;
    public final Object d;

    public f0(Object obj, Object obj2, Object obj3, int i7) {
        this.f11688a = i7;
        this.f11689b = obj;
        this.f11690c = obj2;
        this.d = obj3;
    }

    @Override
    public final void b(int i7, View view) {
        TLRPC.WebPage webPage;
        int i10;
        int i11 = this.f11688a;
        String str = null;
        Object obj = this.d;
        Object obj2 = this.f11690c;
        Object obj3 = this.f11689b;
        boolean z10 = true;
        switch (i11) {
            case 0:
                c2 c2Var = (c2) obj3;
                n0 n0Var = (n0) view;
                s0 s0Var = n0Var.L;
                m60 F = m60.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, hd.a0(null, null, 2131748808, hd.x(s0Var.d, true)));
                F.k();
                F.c(2131232267, hd.M0(2131747786, null), new di.s2(18, (i9) obj, s0Var), false);
                F.l(2131232104, hd.M0(2131751767, null), new di.s2(19, c2Var, n0Var), !s0Var.f12300e);
                if (c2Var.N != m10.i(c2Var.O).e() && !c2Var.f()) {
                    z10 = false;
                }
                F.l(2131232109, hd.M0(2131751598, null), new di.s2(20, c2Var, s0Var), z10);
                F.Z();
                return;
            case 1:
                hi.v6 v6Var = (hi.v6) obj3;
                z10 z10Var = (z10) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                if (view instanceof org.telegram.ui.Cells.f7) {
                    gj message = ((org.telegram.ui.Cells.f7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.z5.q(v6Var.f29679a).v(v6Var);
                        if (v6Var.f15222c2 != null) {
                            org.telegram.messenger.w7.G(v6Var.f29679a).f(v6Var.f15222c2.F0());
                            v6Var.f15222c2 = null;
                        }
                        if (!message.f23872y0 && !message.f23876z0) {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                v6Var.f15222c2 = message;
                                org.telegram.messenger.z5.q(v6Var.f29679a).a(S0, message, v6Var);
                                org.telegram.messenger.w7.G(v6Var.f29679a).W(message.F0(), message, 1, 0);
                                return;
                            }
                            return;
                        }
                        v6Var.f15221b2.a(message);
                        hi.v6 v6Var2 = v6Var.W1;
                        if (v6Var2 != null) {
                            v6Var2.dismiss();
                        }
                        v6Var.dismiss();
                        return;
                    }
                    return;
                }
                b41 G = v6Var.f15230l2.G(i7 - 1);
                if (G != null && G.d == 1) {
                    new hi.v6(v6Var.getContext(), true, v6Var, z10Var, e6Var).show();
                    return;
                } else if (G != null && G.d == 2) {
                    v6Var.f15220a2.b();
                    return;
                } else if (G != null && G.d == 3) {
                    v6Var.h1();
                    return;
                } else if (G != null && G.d == 4) {
                    v6Var.g1();
                    return;
                } else {
                    return;
                }
            case 2:
                hi.l7 l7Var = (hi.l7) obj3;
                Context context = (Context) obj2;
                hi.x5 x5Var = (hi.x5) obj;
                org.telegram.ui.Cells.k3 k3Var = l7Var.V1;
                org.telegram.ui.Cells.k3 k3Var2 = l7Var.U1;
                b41 G2 = l7Var.T1.G(i7 - 1);
                if (G2 != null) {
                    if (G2.H(hi.j7.class) && (webPage = l7Var.f14591c2) != null && !hi.l7.g1(webPage)) {
                        tg.m2 m2Var = new tg.m2(context, l7Var.f29679a);
                        tg.h0 h0Var = new tg.h0();
                        h0Var.f57318c = k3Var2.d.getText().toString();
                        if (l7Var.f14596i2) {
                            str = k3Var.d.getText().toString();
                        }
                        h0Var.f57317b = str;
                        TLRPC.WebPage webPage2 = l7Var.f14591c2;
                        h0Var.d = webPage2;
                        h0Var.f57319e = l7Var.f14598k2;
                        h0Var.f57320f = l7Var.f14597j2;
                        hi.g7 g7Var = new hi.g7(l7Var, 0);
                        m2Var.H = h0Var;
                        if (webPage2 != null && (webPage2.photo != null || gj.K4(webPage2.document))) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        ia0 ia0Var = m2Var.f57454y;
                        ia0Var.setVisibility(i10);
                        m2Var.f57448f.b(m2Var.f57444a, h0Var, false);
                        m2Var.f57453x.a(!h0Var.f57320f, false);
                        ia0Var.a(!h0Var.f57319e, false);
                        m2Var.I = g7Var;
                        m2Var.f57447e.setImageDrawable(new hi.k3(x5Var, 9));
                        m2Var.show();
                        return;
                    } else if (G2.d == 2 && (view instanceof org.telegram.ui.Cells.q8)) {
                        boolean z11 = !l7Var.f14596i2;
                        l7Var.f14596i2 = z11;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z11);
                        l7Var.T1.O(true);
                        if (l7Var.f14596i2) {
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
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                Context context2 = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                w80 w80Var = (w80) tVar.f31442f3.get(i7);
                if (w80Var.f52496e && !m10.o()) {
                    e2Var.showDialog(new ug.x0(e2Var, 10, true));
                    return;
                } else if (!wa.a(w80Var)) {
                    v4.c0 c0Var = new v4.c0(context2);
                    c0Var.f58480a = i7;
                    tVar.f31443g3.w0(c0Var);
                    wa.b(w80Var);
                    int i12 = org.telegram.ui.Cells.s.h;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    ns.e().k(292, 5, w80Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
