package ci;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import s4.a0;
import s4.n0;
import s4.x0;
import s4.y0;
public class p extends y0 {
    public final LinearInterpolator f4246i;
    public final DecelerateInterpolator f4247j;
    public final float f4248k;
    public int f4249l;
    public int f4250m;
    public final int f4251n;
    public final float f4252o;
    public int f4253p;

    public p(Context context, int i10) {
        this.f4246i = new LinearInterpolator();
        this.f4247j = new DecelerateInterpolator(1.5f);
        this.f4249l = 0;
        this.f4250m = 0;
        this.f4252o = 1.0f;
        this.f4248k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f4251n = i10;
    }

    @Override
    public final PointF a(int i10) {
        n0 n0Var = this.f48047c;
        if (n0Var instanceof a0) {
            return ((a0) n0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, x0 x0Var) {
        if (this.f48046b.f1924y.r() == 0) {
            h();
            return;
        }
        int i12 = this.f4249l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f4249l = i13;
        int i15 = this.f4250m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f4250m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f48045a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                y0.b(a2);
                this.f4249l = (int) (a2.x * 10000.0f);
                this.f4250m = (int) (a2.y * 10000.0f);
                x0Var.b((int) (this.f4249l * 1.2f), (int) (this.f4250m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f4248k)) * 1.2f), this.f4246i);
                return;
            }
            x0Var.d = this.f48045a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f4250m = 0;
        this.f4249l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.x0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: ci.p.g(android.view.View, s4.x0):void");
    }

    public p(Context context, int i10, float f7) {
        this.f4246i = new LinearInterpolator();
        this.f4247j = new DecelerateInterpolator(1.5f);
        this.f4249l = 0;
        this.f4250m = 0;
        this.f4252o = f7;
        this.f4248k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f7;
        this.f4251n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
