package ei;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import b8.uf;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.t80;
public final class h0 implements fj0 {
    public final int f10349a;
    public final Object f10350b;
    public final Object f10351c;
    public final Object d;

    public h0(Object obj, Object obj2, Object obj3, int i3) {
        this.f10349a = i3;
        this.f10350b = obj;
        this.f10351c = obj2;
        this.d = obj3;
    }

    @Override
    public final void f(int i3, View view) {
        TLRPC.WebPage webPage;
        int i10;
        int i11 = this.f10349a;
        String str = null;
        Object obj = this.d;
        Object obj2 = this.f10351c;
        Object obj3 = this.f10350b;
        boolean z10 = true;
        switch (i11) {
            case 0:
                k2 k2Var = (k2) obj3;
                p0 p0Var = (p0) view;
                u0 u0Var = p0Var.L;
                f60 F = f60.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, bd.a0(null, null, 2131748816, bd.x(u0Var.d, true)));
                F.k();
                F.c(2131232266, bd.M0(2131747794, null), new b0(0, (r9) obj, u0Var), false);
                F.l(2131232103, bd.M0(2131751767, null), new b0(1, k2Var, p0Var), !u0Var.f11072e);
                if (k2Var.N != h10.i(k2Var.O).e() && !k2Var.f()) {
                    z10 = false;
                }
                F.l(2131232108, bd.M0(2131751599, null), new b0(2, k2Var, u0Var), z10);
                F.Z();
                return;
            case 1:
                gi.x6 x6Var = (gi.x6) obj3;
                u10 u10Var = (u10) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                if (view instanceof org.telegram.ui.Cells.f7) {
                    zi message = ((org.telegram.ui.Cells.f7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.z5.q(x6Var.f28583a).v(x6Var);
                        if (x6Var.Z1 != null) {
                            org.telegram.messenger.w7.G(x6Var.f28583a).f(x6Var.Z1.F0());
                            x6Var.Z1 = null;
                        }
                        if (!message.f26913w0 && !message.f26917x0) {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                x6Var.Z1 = message;
                                org.telegram.messenger.z5.q(x6Var.f28583a).a(S0, message, x6Var);
                                org.telegram.messenger.w7.G(x6Var.f28583a).X(message.F0(), message, 1, 0);
                                return;
                            }
                            return;
                        }
                        x6Var.Y1.a(message);
                        gi.x6 x6Var2 = x6Var.T1;
                        if (x6Var2 != null) {
                            x6Var2.dismiss();
                        }
                        x6Var.dismiss();
                        return;
                    }
                    return;
                }
                r31 G = x6Var.f13851i2.G(i3 - 1);
                if (G != null && G.d == 1) {
                    new gi.x6(x6Var.getContext(), true, x6Var, u10Var, e6Var).show();
                    return;
                } else if (G != null && G.d == 2) {
                    x6Var.X1.b();
                    return;
                } else if (G != null && G.d == 3) {
                    x6Var.h1();
                    return;
                } else if (G != null && G.d == 4) {
                    x6Var.g1();
                    return;
                } else {
                    return;
                }
            case 2:
                gi.m7 m7Var = (gi.m7) obj3;
                Context context = (Context) obj2;
                gi.y5 y5Var = (gi.y5) obj;
                org.telegram.ui.Cells.k3 k3Var = m7Var.S1;
                org.telegram.ui.Cells.k3 k3Var2 = m7Var.R1;
                r31 G2 = m7Var.Q1.G(i3 - 1);
                if (G2 != null) {
                    if (G2.H(gi.k7.class) && (webPage = m7Var.Z1) != null && !gi.m7.g1(webPage)) {
                        ug.j2 j2Var = new ug.j2(context, m7Var.f28583a);
                        ug.g0 g0Var = new ug.g0();
                        g0Var.f56010c = k3Var2.d.getText().toString();
                        if (m7Var.f13258f2) {
                            str = k3Var.d.getText().toString();
                        }
                        g0Var.f56009b = str;
                        TLRPC.WebPage webPage2 = m7Var.Z1;
                        g0Var.d = webPage2;
                        g0Var.f56011e = m7Var.f13260h2;
                        g0Var.f56012f = m7Var.f13259g2;
                        ai.v2 v2Var = new ai.v2(m7Var, 29);
                        j2Var.H = g0Var;
                        if (webPage2 != null && (webPage2.photo != null || zi.L4(webPage2.document))) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        ca0 ca0Var = j2Var.f56111y;
                        ca0Var.setVisibility(i10);
                        j2Var.f56105f.b(j2Var.f56101a, g0Var, false);
                        j2Var.f56110x.a(!g0Var.f56012f, false);
                        ca0Var.a(!g0Var.f56011e, false);
                        j2Var.I = v2Var;
                        j2Var.f56104e.setImageDrawable(new gi.k3(y5Var, 9));
                        j2Var.show();
                        return;
                    } else if (G2.d == 2 && (view instanceof org.telegram.ui.Cells.q8)) {
                        boolean z11 = !m7Var.f13258f2;
                        m7Var.f13258f2 = z11;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z11);
                        m7Var.Q1.O(true);
                        if (m7Var.f13258f2) {
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
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                Context context2 = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                t80 t80Var = (t80) tVar.f30366f3.get(i3);
                if (t80Var.f49737e && !h10.o()) {
                    d2Var.showDialog(new vg.v0(d2Var, 10, true));
                    return;
                } else if (!uf.a(t80Var)) {
                    u4.c0 c0Var = new u4.c0(context2);
                    c0Var.f55704a = i3;
                    tVar.f30367g3.w0(c0Var);
                    uf.b(t80Var);
                    int i12 = org.telegram.ui.Cells.s.h;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    hs.e().k(292, 5, t80Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
