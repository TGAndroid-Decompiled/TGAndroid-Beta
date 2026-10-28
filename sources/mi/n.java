package mi;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import s4.a1;
import s4.c0;
import s4.p0;
import s4.z0;
public class n extends a1 {
    public final LinearInterpolator f18548i;
    public final DecelerateInterpolator f18549j;
    public final float f18550k;
    public int f18551l;
    public int f18552m;
    public final int f18553n;
    public final float f18554o;
    public int f18555p;

    public n(Context context, int i10) {
        this.f18548i = new LinearInterpolator();
        this.f18549j = new DecelerateInterpolator(1.5f);
        this.f18551l = 0;
        this.f18552m = 0;
        this.f18554o = 1.0f;
        this.f18550k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f18553n = i10;
    }

    @Override
    public final PointF a(int i10) {
        p0 p0Var = this.f47717c;
        if (p0Var instanceof c0) {
            return ((c0) p0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, z0 z0Var) {
        if (this.f47716b.f3084x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f18551l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f18551l = i13;
        int i15 = this.f18552m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f18552m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f47715a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                a1.b(a2);
                this.f18551l = (int) (a2.x * 10000.0f);
                this.f18552m = (int) (a2.y * 10000.0f);
                z0Var.b((int) (this.f18551l * 1.2f), (int) (this.f18552m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f18550k)) * 1.2f), this.f18548i);
                return;
            }
            z0Var.d = this.f47715a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f18552m = 0;
        this.f18551l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.z0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: mi.n.g(android.view.View, s4.z0):void");
    }

    public n(Context context, int i10, float f7) {
        this.f18548i = new LinearInterpolator();
        this.f18549j = new DecelerateInterpolator(1.5f);
        this.f18551l = 0;
        this.f18552m = 0;
        this.f18554o = f7;
        this.f18550k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f7;
        this.f18553n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
