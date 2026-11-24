package defpackage;

import android.view.ViewPropertyAnimator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class u67 extends my0 {
    public boolean A1;
    public final gf0 l1;
    public final boolean m1;
    public final boolean n1;
    public final gt7 o1;
    public final EditTextBoldCursor p1;
    public final vc q1;
    public final b61 r1;
    public final io s1;
    public final nk t1;
    public final nk u1;
    public nk v1;
    public long w1;
    public int x1;
    public boolean y1;
    public final pn2[] z1;

    public u67(android.content.Context r38, int r39, long r40, defpackage.v67 r42, defpackage.yv1 r43, defpackage.ylb r44, int r45, defpackage.qac r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u67.<init>(android.content.Context, int, long, v67, yv1, ylb, int, qac):void");
    }

    public static String F0(long j) {
        if (j <= 0) {
            return jb6.M0(2131746825, null);
        }
        String x = jb6.x(j, true);
        if (!x.isEmpty()) {
            return Character.toUpperCase(x.charAt(0)) + x.substring(1);
        }
        return x;
    }

    public final void D0() {
        boolean z;
        float f;
        boolean z2 = this.A1;
        gf0 gf0Var = this.l1;
        if (z2 && !this.J && gf0Var != null && this.b.getY() > gm.L(32.0f)) {
            z = true;
        } else {
            z = false;
        }
        if (this.y1 != z) {
            this.y1 = z;
            if (gf0Var != null) {
                gf0Var.setEnabled(z);
                gf0Var.setClickable(z);
                ViewPropertyAnimator animate = gf0Var.animate();
                float f2 = 0.6f;
                float f3 = 1.0f;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f);
                if (z) {
                    f2 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f2);
                if (!z) {
                    f3 = 0.0f;
                }
                wi8.s(scaleY, f3, 180L);
            }
        }
    }

    public final void E0(boolean z) {
        boolean z2;
        if (this.x1 == 0 && (this.v1.b >= 0 || this.w1 > 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        b61 b61Var = this.r1;
        if (b61Var.e0 != z2) {
            b61Var.setEnabled(z2);
            b61Var.setClickable(z2);
            float f = 0.6f;
            if (z) {
                ViewPropertyAnimator animate = b61Var.animate();
                if (z2) {
                    f = 1.0f;
                }
                wi8.s(animate, f, 180L);
                return;
            }
            if (z2) {
                f = 1.0f;
            }
            b61Var.setAlpha(f);
        }
    }

    public final void G0(nk nkVar, boolean z, boolean z2, boolean z3) {
        int i;
        boolean z4;
        boolean z5;
        float f;
        nk nkVar2 = this.v1;
        int i2 = this.x1;
        this.x1 = 0;
        if (nkVar != null) {
            this.v1 = nkVar;
            i = 0;
        } else {
            nkVar = nk.j(0L, ok.a);
            this.v1 = nkVar;
            i = this.x1 | 1;
            this.x1 = i;
        }
        if (this.u1.b < nkVar.b) {
            this.x1 = i | 4;
        }
        if (!nkVar.l() && this.t1.b > this.v1.b) {
            this.x1 |= 2;
        }
        if (!z2 && nkVar2.b == this.v1.b) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z2 && i2 == this.x1) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            gt7 gt7Var = this.o1;
            if (this.x1 == 0) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            gt7Var.a(f);
            gt7 gt7Var2 = this.o1;
            int i3 = this.x1;
            if ((i3 & 4) != 0) {
                gt7Var2.setText(jb6.a0(null, null, 2131744103, this.u1.g()));
            } else if ((i3 & 2) != 0) {
                gt7Var2.setText(jb6.a0(null, null, 2131744102, this.t1.g()));
            } else {
                gt7Var2.setText(jb6.M0(2131746810, null));
            }
        }
        if (z4 || z5) {
            b61 b61Var = this.r1;
            if (!this.n1) {
                if (!this.v1.l()) {
                    b61Var.i(nxa.Z0(false, jb6.a0(null, null, 2131746814, jb6.E(this.v1.a(), ',')), this.z1), z3, true);
                } else {
                    b61Var.i(jb6.M0(2131746815, null), z3, true);
                }
            } else {
                b61Var.i(jb6.M0(2131746816, null), z3, true);
            }
            E0(z3);
        }
        if (z4) {
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            cj0.h();
            sb.append(cj0.f("USD", 2, (long) (this.v1.c() * oc7.r1(this.a).l4.s3.i * 1.0E-5d * 100.0d), false));
            this.s1.c(sb, z3, true);
        }
        if (z && z4) {
            String b = this.v1.b();
            this.p1.setText(b);
            this.p1.setSelection(b.length());
        }
    }

    @Override
    public final boolean T(float f, float f2) {
        gf0 gf0Var;
        if (this.y1 && (gf0Var = this.l1) != null && f >= gf0Var.getX() && f <= gf0Var.getX() + gf0Var.getWidth() && f2 >= gf0Var.getY() && f2 <= gf0Var.getY() + gf0Var.getHeight()) {
            return false;
        }
        return super.T(f, f2);
    }

    @Override
    public final void d0(float f) {
        super.d0(f);
        D0();
    }

    @Override
    public final void show() {
        super.show();
        gm.d3(new pg6(this, (byte) 21), 50L);
    }

    @Override
    public final void w() {
        this.A1 = true;
        D0();
    }
}
