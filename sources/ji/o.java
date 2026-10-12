package ji;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import s4.d0;
import s4.p0;
import s4.y0;
import s4.z0;
public class o extends z0 {
    public final LinearInterpolator f14264i;
    public final DecelerateInterpolator f14265j;
    public final float f14266k;
    public int f14267l;
    public int f14268m;
    public final int f14269n;
    public final float f14270o;
    public int f14271p;

    public o(Context context, int i10) {
        this.f14264i = new LinearInterpolator();
        this.f14265j = new DecelerateInterpolator(1.5f);
        this.f14267l = 0;
        this.f14268m = 0;
        this.f14270o = 1.0f;
        this.f14266k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f14269n = i10;
    }

    @Override
    public final PointF a(int i10) {
        p0 p0Var = this.f48068c;
        if (p0Var instanceof d0) {
            return ((d0) p0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, y0 y0Var) {
        if (this.f48067b.f3167x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f14267l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f14267l = i13;
        int i15 = this.f14268m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f14268m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f48066a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                z0.b(a2);
                this.f14267l = (int) (a2.x * 10000.0f);
                this.f14268m = (int) (a2.y * 10000.0f);
                y0Var.b((int) (this.f14267l * 1.2f), (int) (this.f14268m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f14266k)) * 1.2f), this.f14264i);
                return;
            }
            y0Var.d = this.f48066a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f14268m = 0;
        this.f14267l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.y0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: ji.o.g(android.view.View, s4.y0):void");
    }

    public o(Context context, int i10, float f7) {
        this.f14264i = new LinearInterpolator();
        this.f14265j = new DecelerateInterpolator(1.5f);
        this.f14267l = 0;
        this.f14268m = 0;
        this.f14270o = f7;
        this.f14266k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f7;
        this.f14269n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
