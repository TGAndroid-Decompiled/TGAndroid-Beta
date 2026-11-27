package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Size;
import java.util.Iterator;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.q;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.TwoStepVerificationActivity;
public final class yn6 implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public yn6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn6.a():void");
    }

    private final void b() {
        pi9 pi9Var = (pi9) this.c;
        xl9 xl9Var = (xl9) this.d;
        boolean z = this.b;
        boolean z2 = !z;
        zl9 zl9Var = xl9Var.w;
        Iterator it = xl9Var.I.iterator();
        while (it.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
            am9 m = zl9Var.m(pagetablecell);
            boolean z3 = true;
            if (m != null) {
                if (m.b != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m.a.getText());
                    if (spannableStringBuilder.length() <= 0 || (mm9.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) == 0) {
                        z3 = false;
                    }
                    ajb.l(m.b, z2);
                    if (!z) {
                        if (spannableStringBuilder.length() > 0) {
                            mm9.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        }
                    } else if (z3) {
                        mm9.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                    }
                    ajb.d(m.b, spannableStringBuilder);
                    m.b(m.b);
                }
            } else {
                boolean z4 = true;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ajb.h(pagetablecell));
                if (spannableStringBuilder2.length() <= 0 || (mm9.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) == 0) {
                    z4 = false;
                }
                ajb.l(pagetablecell, z2);
                if (!z) {
                    if (spannableStringBuilder2.length() > 0) {
                        mm9.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                    }
                } else if (z4) {
                    mm9.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                }
                ajb.d(pagetablecell, spannableStringBuilder2);
            }
        }
        zl9Var.invalidate();
        xh9 xh9Var = xl9Var.F;
        if (xh9Var != null && xl9Var.a != null) {
            xh9Var.a();
        }
        pi9Var.J2();
    }

    private final void c() {
        oi9 oi9Var = (oi9) this.d;
        oi9Var.f.l3(true);
        cj9.k((e) this.c, this.b, new zi9(oi9Var, (byte) 2));
    }

    private final void d() {
        Size size;
        int i;
        boolean z;
        xn9 xn9Var = (xn9) this.c;
        boolean z2 = this.b;
        fn9 fn9Var = (fn9) this.d;
        if (!xn9Var.f) {
            return;
        }
        xn9Var.F = z2;
        if (z2) {
            size = xn9Var.c;
        } else {
            size = xn9Var.b;
        }
        xn9Var.a = size;
        if (z2) {
            i = xn9Var.l;
        } else {
            i = xn9Var.k;
        }
        xn9Var.j = i;
        if (z2) {
            z = xn9Var.o;
        } else {
            z = xn9Var.n;
        }
        xn9Var.m = z;
        ho9 ho9Var = xn9Var.N;
        if (ho9Var != null) {
            ho9Var.c = size;
            ho9Var.d = i;
            ho9Var.v();
            ho9Var.B = false;
            ho9Var.A = 0L;
        }
        xn9Var.Q = -1L;
        xn9Var.v0 = fn9Var;
        sn9 sn9Var = xn9Var.i;
        sn9Var.b("GL dual input selected: input=" + (z2 ? 1 : 0));
    }

    private final void e() {
        int i;
        String str;
        ln9 ln9Var = (ln9) this.d;
        jp9 jp9Var = (jp9) ((pq8) this.c).b;
        int i2 = jp9Var.a0;
        if (i2 != 7 && i2 != 8 && i2 != 9 && i2 != 10) {
            cp9 cp9Var = ln9Var.a;
            ep9 ep9Var = ln9Var.c;
            dp9 dp9Var = ln9Var.b;
            jp9Var.s = cp9Var;
            jp9Var.t = dp9Var;
            jp9Var.u = ep9Var;
            jp9Var.v = ln9Var.e;
            if (cp9Var == cp9.a) {
                if (jp9Var.f != null) {
                    i = 3;
                }
                i = 1;
            } else {
                if (ln9Var.f) {
                    i = 2;
                }
                i = 1;
            }
            jp9Var.b0 = i;
            jp9Var.n();
            sn9 sn9Var = jp9Var.m;
            StringBuilder sb = new StringBuilder("camera configured: facing=");
            sb.append(cp9Var);
            sb.append(", mode=");
            sb.append(dp9Var);
            sb.append(", recording=");
            sb.append(ln9Var.d);
            sb.append(", fps=");
            sb.append((int) ep9Var.a);
            sb.append(", maxZoom=");
            sb.append(jp9Var.v);
            sb.append(", flash=");
            int i3 = jp9Var.b0;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        str = "null";
                    } else {
                        str = "SCREEN";
                    }
                } else {
                    str = "TORCH";
                }
            } else {
                str = "NONE";
            }
            sb.append(str);
            sb.append(", switch=");
            boolean z = this.b;
            sb.append(z);
            sn9Var.b(sb.toString());
            if (!z && !jp9Var.y) {
                return;
            }
            jp9Var.y = false;
            q qVar = (q) jp9Var.d.b;
            qVar.r0 = true;
            cc4.b("RoundVideo camera flip session ready: facing=" + cp9Var + ", elapsedMs=" + q.b(qVar));
            qVar.q();
            jp9Var.o();
        }
    }

    private final void f() {
        xd5 xd5Var = (xd5) this.c;
        en9 en9Var = (en9) this.d;
        if (this.b) {
            uc7.s1(xd5Var.a).n0(true);
            en9Var.run();
        } else {
            e S = LaunchActivity.S();
            if (S == null) {
                return;
            }
            S.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.o0(3)));
        }
        xd5Var.dismiss();
    }

    private final void g() {
        fu5 fu5Var = (fu5) this.d;
        ((Runnable) this.c).run();
        if (this.b) {
            fu5Var.u();
        }
    }

    private final void h() {
        ((icc) this.c).a(Boolean.valueOf(this.b), (String) this.d);
    }

    private final void i() {
        ((iv4) this.c).a(Boolean.valueOf(this.b), (String) this.d);
    }

    private final void j() {
        ((qe2) this.c).a(Boolean.valueOf(this.b), (String) this.d);
    }

    private final void k() {
        ((TwoStepVerificationActivity) this.c).m0((byte[]) this.d, this.b);
    }

    private final void l() {
        ((VideoCapturerDevice) this.c).lambda$init$4(this.b, (String) this.d);
    }

    private final void m() {
        rjc rjcVar = (rjc) this.c;
        nn3 nn3Var = (nn3) this.d;
        njc njcVar = rjcVar.r;
        if (njcVar != null) {
            njcVar.detachCurrent();
            rjcVar.r.d(this.b);
        }
        if (nn3Var != null) {
            nn3Var.run();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn6.run():void");
    }

    public yn6(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
