package ni;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import u4.b0;
import u4.o0;
import u4.y0;
import u4.z0;
public class m extends z0 {
    public final LinearInterpolator f20454i;
    public final DecelerateInterpolator f20455j;
    public final float f20456k;
    public int f20457l;
    public int f20458m;
    public final int f20459n;
    public final float f20460o;
    public int f20461p;

    public m(Context context, int i3) {
        this.f20454i = new LinearInterpolator();
        this.f20455j = new DecelerateInterpolator(1.5f);
        this.f20457l = 0;
        this.f20458m = 0;
        this.f20460o = 1.0f;
        this.f20456k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f20459n = i3;
    }

    @Override
    public final PointF a(int i3) {
        o0 o0Var = this.f55706c;
        if (o0Var instanceof b0) {
            return ((b0) o0Var).E0(i3);
        }
        return null;
    }

    @Override
    public final void d(int i3, int i10, y0 y0Var) {
        if (this.f55705b.f2305y.r() == 0) {
            h();
            return;
        }
        int i11 = this.f20457l;
        int i12 = i11 - i3;
        int i13 = 0;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.f20457l = i12;
        int i14 = this.f20458m;
        int i15 = i14 - i10;
        if (i14 * i15 > 0) {
            i13 = i15;
        }
        this.f20458m = i13;
        if (i12 == 0 && i13 == 0) {
            PointF a10 = a(this.f55704a);
            if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
                z0.b(a10);
                this.f20457l = (int) (a10.x * 10000.0f);
                this.f20458m = (int) (a10.y * 10000.0f);
                y0Var.b((int) (this.f20457l * 1.2f), (int) (this.f20458m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f20456k)) * 1.2f), this.f20454i);
                return;
            }
            y0Var.d = this.f55704a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f20458m = 0;
        this.f20457l = 0;
    }

    @Override
    public final void g(android.view.View r8, u4.y0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: ni.m.g(android.view.View, u4.y0):void");
    }

    public m(Context context, int i3, float f10) {
        this.f20454i = new LinearInterpolator();
        this.f20455j = new DecelerateInterpolator(1.5f);
        this.f20457l = 0;
        this.f20458m = 0;
        this.f20460o = f10;
        this.f20456k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f10;
        this.f20459n = i3;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
