package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import c8.ua;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.y31;
import org.telegram.ui.y80;
public final class f0 implements cj0 {
    public final int f8978a;
    public final Object f8979b;
    public final Object f8980c;
    public final Object d;

    public f0(Object obj, Object obj2, Object obj3, int i7) {
        this.f8978a = i7;
        this.f8979b = obj;
        this.f8980c = obj2;
        this.d = obj3;
    }

    @Override
    public final void c(int i7, View view) {
        TLRPC.WebPage webPage;
        int i10;
        int i11 = this.f8978a;
        String str = null;
        Object obj = this.d;
        Object obj2 = this.f8980c;
        Object obj3 = this.f8979b;
        boolean z9 = true;
        switch (i11) {
            case 0:
                g2 g2Var = (g2) obj3;
                n0 n0Var = (n0) view;
                s0 s0Var = n0Var.K;
                l60 F = l60.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, id.a0(null, null, 2131748808, id.x(s0Var.d, true)));
                F.k();
                F.c(2131232266, id.M0(2131747786, null), new bi.a4(27, (q9) obj, s0Var), false);
                F.l(2131232103, id.M0(2131751767, null), new bi.a4(28, g2Var, n0Var), !s0Var.f9717e);
                if (g2Var.M != p10.i(g2Var.N).e() && !g2Var.f()) {
                    z9 = false;
                }
                F.l(2131232108, id.M0(2131751598, null), new bi.a4(29, g2Var, s0Var), z9);
                F.Z();
                return;
            case 1:
                fi.w6 w6Var = (fi.w6) obj3;
                c20 c20Var = (c20) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                if (view instanceof org.telegram.ui.Cells.g7) {
                    ij message = ((org.telegram.ui.Cells.g7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.z5.q(w6Var.f28621a).v(w6Var);
                        if (w6Var.Y1 != null) {
                            org.telegram.messenger.w7.G(w6Var.f28621a).f(w6Var.Y1.F0());
                            w6Var.Y1 = null;
                        }
                        if (!message.f23307w0 && !message.f23311x0) {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                w6Var.Y1 = message;
                                org.telegram.messenger.z5.q(w6Var.f28621a).a(S0, message, w6Var);
                                org.telegram.messenger.w7.G(w6Var.f28621a).W(message.F0(), message, 1, 0);
                                return;
                            }
                            return;
                        }
                        w6Var.X1.a(message);
                        fi.w6 w6Var2 = w6Var.S1;
                        if (w6Var2 != null) {
                            w6Var2.dismiss();
                        }
                        w6Var.dismiss();
                        return;
                    }
                    return;
                }
                y31 G = w6Var.f13039h2.G(i7 - 1);
                if (G != null && G.d == 1) {
                    new fi.w6(w6Var.getContext(), true, w6Var, c20Var, g6Var).show();
                    return;
                } else if (G != null && G.d == 2) {
                    w6Var.W1.b();
                    return;
                } else if (G != null && G.d == 3) {
                    w6Var.h1();
                    return;
                } else if (G != null && G.d == 4) {
                    w6Var.g1();
                    return;
                } else {
                    return;
                }
            case 2:
                fi.m7 m7Var = (fi.m7) obj3;
                Context context = (Context) obj2;
                fi.y5 y5Var = (fi.y5) obj;
                org.telegram.ui.Cells.k3 k3Var = m7Var.R1;
                org.telegram.ui.Cells.k3 k3Var2 = m7Var.Q1;
                y31 G2 = m7Var.P1.G(i7 - 1);
                if (G2 != null) {
                    if (G2.H(fi.k7.class) && (webPage = m7Var.Y1) != null && !fi.m7.g1(webPage)) {
                        tg.i2 i2Var = new tg.i2(context, m7Var.f28621a);
                        tg.h0 h0Var = new tg.h0();
                        h0Var.f55722c = k3Var2.d.getText().toString();
                        if (m7Var.f12459e2) {
                            str = k3Var.d.getText().toString();
                        }
                        h0Var.f55721b = str;
                        TLRPC.WebPage webPage2 = m7Var.Y1;
                        h0Var.d = webPage2;
                        h0Var.f55723e = m7Var.f12461g2;
                        h0Var.f55724f = m7Var.f12460f2;
                        ai.i iVar = new ai.i(m7Var, 26);
                        i2Var.G = h0Var;
                        if (webPage2 != null && (webPage2.photo != null || ij.K4(webPage2.document))) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        ia0 ia0Var = i2Var.f55778y;
                        ia0Var.setVisibility(i10);
                        i2Var.f55772f.b(i2Var.f55768a, h0Var, false);
                        i2Var.f55777x.a(!h0Var.f55724f, false);
                        ia0Var.a(!h0Var.f55723e, false);
                        i2Var.H = iVar;
                        i2Var.f55771e.setImageDrawable(new fi.l3(y5Var, 9));
                        i2Var.show();
                        return;
                    } else if (G2.d == 2 && (view instanceof org.telegram.ui.Cells.r8)) {
                        boolean z10 = !m7Var.f12459e2;
                        m7Var.f12459e2 = z10;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                        m7Var.P1.O(true);
                        if (m7Var.f12459e2) {
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
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj2;
                Context context2 = (Context) obj;
                org.telegram.ui.Cells.s sVar = (org.telegram.ui.Cells.s) view;
                y80 y80Var = (y80) tVar.f30296e3.get(i7);
                if (y80Var.f51997e && !p10.o()) {
                    f2Var.showDialog(new ug.w0(f2Var, 10, true));
                    return;
                } else if (!ua.a(y80Var)) {
                    v4.c0 c0Var = new v4.c0(context2);
                    c0Var.f57225a = i7;
                    tVar.f30297f3.w0(c0Var);
                    ua.b(y80Var);
                    int i12 = org.telegram.ui.Cells.s.h;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    qs.e().k(292, 5, y80Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
