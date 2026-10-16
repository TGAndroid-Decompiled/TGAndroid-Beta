package ki;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import s4.b0;
import s4.n0;
import s4.w0;
import s4.x0;
public class o extends x0 {
    public final LinearInterpolator f14347i;
    public final DecelerateInterpolator f14348j;
    public final float f14349k;
    public int f14350l;
    public int f14351m;
    public final int f14352n;
    public final float f14353o;
    public int f14354p;

    public o(Context context, int i10) {
        this.f14347i = new LinearInterpolator();
        this.f14348j = new DecelerateInterpolator(1.5f);
        this.f14350l = 0;
        this.f14351m = 0;
        this.f14353o = 1.0f;
        this.f14349k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f14352n = i10;
    }

    @Override
    public final PointF a(int i10) {
        n0 n0Var = this.f44981c;
        if (n0Var instanceof b0) {
            return ((b0) n0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, w0 w0Var) {
        if (this.f44980b.f2021x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f14350l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f14350l = i13;
        int i15 = this.f14351m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f14351m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f44979a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                x0.b(a2);
                this.f14350l = (int) (a2.x * 10000.0f);
                this.f14351m = (int) (a2.y * 10000.0f);
                w0Var.b((int) (this.f14350l * 1.2f), (int) (this.f14351m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f14349k)) * 1.2f), this.f14347i);
                return;
            }
            w0Var.d = this.f44979a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f14351m = 0;
        this.f14350l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.w0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: ki.o.g(android.view.View, s4.w0):void");
    }

    public o(Context context, int i10, float f7) {
        this.f14347i = new LinearInterpolator();
        this.f14348j = new DecelerateInterpolator(1.5f);
        this.f14350l = 0;
        this.f14351m = 0;
        this.f14353o = f7;
        this.f14349k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f7;
        this.f14352n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
