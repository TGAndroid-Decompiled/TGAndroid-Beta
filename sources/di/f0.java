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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.x31;
import org.telegram.ui.z80;
public final class f0 implements bj0 {
    public final int f8983a;
    public final Object f8984b;
    public final Object f8985c;
    public final Object d;

    public f0(Object obj, Object obj2, Object obj3, int i7) {
        this.f8983a = i7;
        this.f8984b = obj;
        this.f8985c = obj2;
        this.d = obj3;
    }

    @Override
    public final void c(int i7, View view) {
        TLRPC.WebPage webPage;
        int i10;
        int i11 = this.f8983a;
        String str = null;
        Object obj = this.d;
        Object obj2 = this.f8985c;
        Object obj3 = this.f8984b;
        boolean z9 = true;
        switch (i11) {
            case 0:
                g2 g2Var = (g2) obj3;
                n0 n0Var = (n0) view;
                s0 s0Var = n0Var.K;
                k60 F = k60.F((ViewGroup) obj2, new b(), view);
                F.p(15, -1, id.a0(null, null, 2131748808, id.x(s0Var.d, true)));
                F.k();
                F.c(2131232266, id.M0(2131747786, null), new bi.a4(27, (q9) obj, s0Var), false);
                F.l(2131232103, id.M0(2131751767, null), new bi.a4(28, g2Var, n0Var), !s0Var.f9722e);
                if (g2Var.M != p10.i(g2Var.N).e() && !g2Var.f()) {
                    z9 = false;
                }
                F.l(2131232108, id.M0(2131751598, null), new bi.a4(29, g2Var, s0Var), z9);
                F.Z();
                return;
            case 1:
                fi.w6 w6Var = (fi.w6) obj3;
                c20 c20Var = (c20) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (view instanceof org.telegram.ui.Cells.g7) {
                    ij message = ((org.telegram.ui.Cells.g7) view).getMessage();
                    if (message != null) {
                        org.telegram.messenger.z5.q(w6Var.f28669a).v(w6Var);
                        if (w6Var.f13036b2 != null) {
                            org.telegram.messenger.w7.G(w6Var.f28669a).f(w6Var.f13036b2.F0());
                            w6Var.f13036b2 = null;
                        }
                        if (!message.f23311w0 && !message.f23315x0) {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                w6Var.f13036b2 = message;
                                org.telegram.messenger.z5.q(w6Var.f28669a).a(S0, message, w6Var);
                                org.telegram.messenger.w7.G(w6Var.f28669a).W(message.F0(), message, 1, 0);
                                return;
                            }
                            return;
                        }
                        w6Var.f13035a2.a(message);
                        fi.w6 w6Var2 = w6Var.V1;
                        if (w6Var2 != null) {
                            w6Var2.dismiss();
                        }
                        w6Var.dismiss();
                        return;
                    }
                    return;
                }
                x31 G = w6Var.f13044k2.G(i7 - 1);
                if (G != null && G.d == 1) {
                    new fi.w6(w6Var.getContext(), true, w6Var, c20Var, h6Var).show();
                    return;
                } else if (G != null && G.d == 2) {
                    w6Var.Z1.b();
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
                org.telegram.ui.Cells.k3 k3Var = m7Var.U1;
                org.telegram.ui.Cells.k3 k3Var2 = m7Var.T1;
                x31 G2 = m7Var.S1.G(i7 - 1);
                if (G2 != null) {
                    if (G2.H(fi.k7.class) && (webPage = m7Var.f12458b2) != null && !fi.m7.g1(webPage)) {
                        tg.i2 i2Var = new tg.i2(context, m7Var.f28669a);
                        tg.h0 h0Var = new tg.h0();
                        h0Var.f55721c = k3Var2.d.getText().toString();
                        if (m7Var.f12463h2) {
                            str = k3Var.d.getText().toString();
                        }
                        h0Var.f55720b = str;
                        TLRPC.WebPage webPage2 = m7Var.f12458b2;
                        h0Var.d = webPage2;
                        h0Var.f55722e = m7Var.f12465j2;
                        h0Var.f55723f = m7Var.f12464i2;
                        ai.i iVar = new ai.i(m7Var, 26);
                        i2Var.G = h0Var;
                        if (webPage2 != null && (webPage2.photo != null || ij.K4(webPage2.document))) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        ha0 ha0Var = i2Var.f55777y;
                        ha0Var.setVisibility(i10);
                        i2Var.f55771f.b(i2Var.f55767a, h0Var, false);
                        i2Var.f55776x.a(!h0Var.f55723f, false);
                        ha0Var.a(!h0Var.f55722e, false);
                        i2Var.H = iVar;
                        i2Var.f55770e.setImageDrawable(new fi.l3(y5Var, 9));
                        i2Var.show();
                        return;
                    } else if (G2.d == 2 && (view instanceof org.telegram.ui.Cells.r8)) {
                        boolean z10 = !m7Var.f12463h2;
                        m7Var.f12463h2 = z10;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                        m7Var.S1.O(true);
                        if (m7Var.f12463h2) {
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
                z80 z80Var = (z80) tVar.f30307e3.get(i7);
                if (z80Var.f52327e && !p10.o()) {
                    f2Var.showDialog(new ug.w0(f2Var, 10, true));
                    return;
                } else if (!ua.a(z80Var)) {
                    v4.c0 c0Var = new v4.c0(context2);
                    c0Var.f57221a = i7;
                    tVar.f30308f3.w0(c0Var);
                    ua.b(z80Var);
                    int i12 = org.telegram.ui.Cells.s.h;
                    sVar.b(true, true);
                    for (int i13 = 0; i13 < tVar.getChildCount(); i13++) {
                        org.telegram.ui.Cells.s sVar2 = (org.telegram.ui.Cells.s) tVar.getChildAt(i13);
                        if (sVar2 != sVar) {
                            sVar2.b(false, true);
                        }
                    }
                    qs.e().k(292, 5, z80Var);
                    return;
                } else {
                    return;
                }
        }
    }
}
