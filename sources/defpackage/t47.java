package defpackage;

import android.view.ViewPropertyAnimator;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class t47 extends fx0 {
    public boolean A1;
    public final ge0 l1;
    public final boolean m1;
    public final boolean n1;
    public final er7 o1;
    public final EditTextBoldCursor p1;
    public final ps0 q1;
    public final u41 r1;
    public final hn s1;
    public final nj t1;
    public final nj u1;
    public nj v1;
    public long w1;
    public int x1;
    public boolean y1;
    public final cm2[] z1;

    public t47(android.content.Context r38, int r39, long r40, defpackage.u47 r42, defpackage.mu1 r43, defpackage.wjb r44, int r45, defpackage.p8c r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t47.<init>(android.content.Context, int, long, u47, mu1, wjb, int, p8c):void");
    }

    public static String F0(long j) {
        if (j <= 0) {
            return k96.M0(2131746899, null);
        }
        String x = k96.x(j, true);
        if (!x.isEmpty()) {
            return Character.toUpperCase(x.charAt(0)) + x.substring(1);
        }
        return x;
    }

    public final void D0() {
        boolean z;
        float f;
        boolean z2 = this.A1;
        ge0 ge0Var = this.l1;
        if (z2 && !this.J && ge0Var != null && this.b.getY() > gl.L(32.0f)) {
            z = true;
        } else {
            z = false;
        }
        if (this.y1 != z) {
            this.y1 = z;
            if (ge0Var != null) {
                ge0Var.setEnabled(z);
                ge0Var.setClickable(z);
                ViewPropertyAnimator animate = ge0Var.animate();
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
                ug8.s(scaleY, f3, 180L);
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
        u41 u41Var = this.r1;
        if (u41Var.e0 != z2) {
            u41Var.setEnabled(z2);
            u41Var.setClickable(z2);
            float f = 0.6f;
            if (z) {
                ViewPropertyAnimator animate = u41Var.animate();
                if (z2) {
                    f = 1.0f;
                }
                ug8.s(animate, f, 180L);
                return;
            }
            if (z2) {
                f = 1.0f;
            }
            u41Var.setAlpha(f);
        }
    }

    public final void G0(nj njVar, boolean z, boolean z2, boolean z3) {
        int i;
        boolean z4;
        boolean z5;
        float f;
        nj njVar2 = this.v1;
        int i2 = this.x1;
        this.x1 = 0;
        if (njVar != null) {
            this.v1 = njVar;
            i = 0;
        } else {
            njVar = nj.j(0L, oj.a);
            this.v1 = njVar;
            i = this.x1 | 1;
            this.x1 = i;
        }
        if (this.u1.b < njVar.b) {
            this.x1 = i | 4;
        }
        if (!njVar.l() && this.t1.b > this.v1.b) {
            this.x1 |= 2;
        }
        if (!z2 && njVar2.b == this.v1.b) {
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
            er7 er7Var = this.o1;
            if (this.x1 == 0) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            er7Var.a(f);
            er7 er7Var2 = this.o1;
            int i3 = this.x1;
            if ((i3 & 4) != 0) {
                er7Var2.setText(k96.a0(null, null, 2131744177, this.u1.g()));
            } else if ((i3 & 2) != 0) {
                er7Var2.setText(k96.a0(null, null, 2131744176, this.t1.g()));
            } else {
                er7Var2.setText(k96.M0(2131746884, null));
            }
        }
        if (z4 || z5) {
            u41 u41Var = this.r1;
            if (!this.n1) {
                if (!this.v1.l()) {
                    u41Var.i(jva.Y0(false, k96.a0(null, null, 2131746888, k96.E(this.v1.a(), ',')), this.z1), z3, true);
                } else {
                    u41Var.i(k96.M0(2131746889, null), z3, true);
                }
            } else {
                u41Var.i(k96.M0(2131746890, null), z3, true);
            }
            E0(z3);
        }
        if (z4) {
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            ci0.h();
            sb.append(ci0.f("USD", 2, (long) (this.v1.c() * na7.q1(this.a).k4.s3.i * 1.0E-5d * 100.0d), false));
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
        ge0 ge0Var;
        if (this.y1 && (ge0Var = this.l1) != null && f >= ge0Var.getX() && f <= ge0Var.getX() + ge0Var.getWidth() && f2 >= ge0Var.getY() && f2 <= ge0Var.getY() + ge0Var.getHeight()) {
            return false;
        }
        return super.U(f, f2);
    }

    @Override
    public final void d0(float f) {
        super.d0(f);
        D0();
    }

    @Override
    public final void show() {
        super.show();
        gl.e3(new vl6(this, (byte) 14), 50L);
    }

    @Override
    public final void x() {
        this.A1 = true;
        D0();
    }
}
