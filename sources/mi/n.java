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
    public final LinearInterpolator f18549i;
    public final DecelerateInterpolator f18550j;
    public final float f18551k;
    public int f18552l;
    public int f18553m;
    public final int f18554n;
    public final float f18555o;
    public int f18556p;

    public n(Context context, int i10) {
        this.f18549i = new LinearInterpolator();
        this.f18550j = new DecelerateInterpolator(1.5f);
        this.f18552l = 0;
        this.f18553m = 0;
        this.f18555o = 1.0f;
        this.f18551k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f18554n = i10;
    }

    @Override
    public final PointF a(int i10) {
        p0 p0Var = this.f47679c;
        if (p0Var instanceof c0) {
            return ((c0) p0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, z0 z0Var) {
        if (this.f47678b.f3084x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f18552l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f18552l = i13;
        int i15 = this.f18553m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f18553m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f47677a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                a1.b(a2);
                this.f18552l = (int) (a2.x * 10000.0f);
                this.f18553m = (int) (a2.y * 10000.0f);
                z0Var.b((int) (this.f18552l * 1.2f), (int) (this.f18553m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f18551k)) * 1.2f), this.f18549i);
                return;
            }
            z0Var.d = this.f47677a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f18553m = 0;
        this.f18552l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.z0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: mi.n.g(android.view.View, s4.z0):void");
    }

    public n(Context context, int i10, float f7) {
        this.f18549i = new LinearInterpolator();
        this.f18550j = new DecelerateInterpolator(1.5f);
        this.f18552l = 0;
        this.f18553m = 0;
        this.f18555o = f7;
        this.f18551k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f7;
        this.f18554n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
