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
    public final LinearInterpolator f14263i;
    public final DecelerateInterpolator f14264j;
    public final float f14265k;
    public int f14266l;
    public int f14267m;
    public final int f14268n;
    public final float f14269o;
    public int f14270p;

    public o(Context context, int i10) {
        this.f14263i = new LinearInterpolator();
        this.f14264j = new DecelerateInterpolator(1.5f);
        this.f14266l = 0;
        this.f14267m = 0;
        this.f14269o = 1.0f;
        this.f14265k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f14268n = i10;
    }

    @Override
    public final PointF a(int i10) {
        p0 p0Var = this.f48060c;
        if (p0Var instanceof d0) {
            return ((d0) p0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, y0 y0Var) {
        if (this.f48059b.f3167x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f14266l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f14266l = i13;
        int i15 = this.f14267m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f14267m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f48058a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                z0.b(a2);
                this.f14266l = (int) (a2.x * 10000.0f);
                this.f14267m = (int) (a2.y * 10000.0f);
                y0Var.b((int) (this.f14266l * 1.2f), (int) (this.f14267m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f14265k)) * 1.2f), this.f14263i);
                return;
            }
            y0Var.d = this.f48058a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f14267m = 0;
        this.f14266l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.y0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: ji.o.g(android.view.View, s4.y0):void");
    }

    public o(Context context, int i10, float f7) {
        this.f14263i = new LinearInterpolator();
        this.f14264j = new DecelerateInterpolator(1.5f);
        this.f14266l = 0;
        this.f14267m = 0;
        this.f14269o = f7;
        this.f14265k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f7;
        this.f14268n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
