package defpackage;

import android.view.ViewPropertyAnimator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class a77 extends nx0 {
    public boolean A1;
    public final ie0 l1;
    public final boolean m1;
    public final boolean n1;
    public final lu7 o1;
    public final EditTextBoldCursor p1;
    public final xs0 q1;
    public final c51 r1;
    public final in s1;
    public final oj t1;
    public final oj u1;
    public oj v1;
    public long w1;
    public int x1;
    public boolean y1;
    public final wm2[] z1;

    public a77(android.content.Context r38, int r39, long r40, defpackage.b77 r42, defpackage.zu1 r43, defpackage.vnb r44, int r45, defpackage.pcc r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a77.<init>(android.content.Context, int, long, b77, zu1, vnb, int, pcc):void");
    }

    public static String G0(long j) {
        if (j <= 0) {
            return ob6.M0(2131746819, null);
        }
        String x = ob6.x(j, true);
        if (!x.isEmpty()) {
            return Character.toUpperCase(x.charAt(0)) + x.substring(1);
        }
        return x;
    }

    public final void E0() {
        boolean z;
        float f;
        boolean z2 = this.A1;
        ie0 ie0Var = this.l1;
        if (z2 && !this.J && ie0Var != null && this.b.getY() > hl.L(32.0f)) {
            z = true;
        } else {
            z = false;
        }
        if (this.y1 != z) {
            this.y1 = z;
            if (ie0Var != null) {
                ie0Var.setEnabled(z);
                ie0Var.setClickable(z);
                ViewPropertyAnimator animate = ie0Var.animate();
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
                ik8.s(scaleY, f3, 180L);
            }
        }
    }

    public final void F0(boolean z) {
        boolean z2;
        if (this.x1 == 0 && (this.v1.b >= 0 || this.w1 > 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        c51 c51Var = this.r1;
        if (c51Var.e0 != z2) {
            c51Var.setEnabled(z2);
            c51Var.setClickable(z2);
            float f = 0.6f;
            if (z) {
                ViewPropertyAnimator animate = c51Var.animate();
                if (z2) {
                    f = 1.0f;
                }
                ik8.s(animate, f, 180L);
                return;
            }
            if (z2) {
                f = 1.0f;
            }
            c51Var.setAlpha(f);
        }
    }

    public final void H0(oj ojVar, boolean z, boolean z2, boolean z3) {
        int i;
        boolean z4;
        boolean z5;
        float f;
        oj ojVar2 = this.v1;
        int i2 = this.x1;
        this.x1 = 0;
        if (ojVar != null) {
            this.v1 = ojVar;
            i = 0;
        } else {
            ojVar = oj.j(0L, pj.a);
            this.v1 = ojVar;
            i = this.x1 | 1;
            this.x1 = i;
        }
        if (this.u1.b < ojVar.b) {
            this.x1 = i | 4;
        }
        if (!ojVar.l() && this.t1.b > this.v1.b) {
            this.x1 |= 2;
        }
        if (!z2 && ojVar2.b == this.v1.b) {
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
            lu7 lu7Var = this.o1;
            if (this.x1 == 0) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            lu7Var.a(f);
            lu7 lu7Var2 = this.o1;
            int i3 = this.x1;
            if ((i3 & 4) != 0) {
                lu7Var2.setText(ob6.a0(null, null, 2131744071, this.u1.g()));
            } else if ((i3 & 2) != 0) {
                lu7Var2.setText(ob6.a0(null, null, 2131744070, this.t1.g()));
            } else {
                lu7Var2.setText(ob6.M0(2131746804, null));
            }
        }
        if (z4 || z5) {
            c51 c51Var = this.r1;
            if (!this.n1) {
                if (!this.v1.l()) {
                    c51Var.i(nza.Z0(false, ob6.a0(null, null, 2131746808, ob6.E(this.v1.a(), ',')), this.z1), z3, true);
                } else {
                    c51Var.i(ob6.M0(2131746809, null), z3, true);
                }
            } else {
                c51Var.i(ob6.M0(2131746810, null), z3, true);
            }
            F0(z3);
        }
        if (z4) {
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            di0.h();
            sb.append(di0.f("USD", 2, (long) (this.v1.c() * uc7.s1(this.a).k4.A3.i * 1.0E-5d * 100.0d), false));
            this.s1.c(sb, z3, true);
        }
        if (z && z4) {
            String b = this.v1.b();
            this.p1.setText(b);
            this.p1.setSelection(b.length());
        }
    }

    @Override
    public final boolean U(float f, float f2) {
        ie0 ie0Var;
        if (this.y1 && (ie0Var = this.l1) != null && f >= ie0Var.getX() && f <= ie0Var.getX() + ie0Var.getWidth() && f2 >= ie0Var.getY() && f2 <= ie0Var.getY() + ie0Var.getHeight()) {
            return false;
        }
        return super.U(f, f2);
    }

    @Override
    public final void d0(float f) {
        super.d0(f);
        E0();
    }

    @Override
    public final void show() {
        super.show();
        hl.d3(new z96(this, (byte) 27), 50L);
    }

    @Override
    public final void x() {
        this.A1 = true;
        E0();
    }
}
