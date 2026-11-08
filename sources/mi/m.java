package mi;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import v4.b0;
import v4.n0;
import v4.y0;
import v4.z0;
public class m extends z0 {
    public final LinearInterpolator f20104i;
    public final DecelerateInterpolator f20105j;
    public final float f20106k;
    public int f20107l;
    public int f20108m;
    public final int f20109n;
    public final float f20110o;
    public int f20111p;

    public m(Context context, int i7) {
        this.f20104i = new LinearInterpolator();
        this.f20105j = new DecelerateInterpolator(1.5f);
        this.f20107l = 0;
        this.f20108m = 0;
        this.f20110o = 1.0f;
        this.f20106k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f20109n = i7;
    }

    @Override
    public final PointF a(int i7) {
        n0 n0Var = this.f57215c;
        if (n0Var instanceof b0) {
            return ((b0) n0Var).E0(i7);
        }
        return null;
    }

    @Override
    public final void d(int i7, int i10, y0 y0Var) {
        if (this.f57214b.f2873y.r() == 0) {
            h();
            return;
        }
        int i11 = this.f20107l;
        int i12 = i11 - i7;
        int i13 = 0;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.f20107l = i12;
        int i14 = this.f20108m;
        int i15 = i14 - i10;
        if (i14 * i15 > 0) {
            i13 = i15;
        }
        this.f20108m = i13;
        if (i12 == 0 && i13 == 0) {
            PointF a10 = a(this.f57213a);
            if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
                z0.b(a10);
                this.f20107l = (int) (a10.x * 10000.0f);
                this.f20108m = (int) (a10.y * 10000.0f);
                y0Var.b((int) (this.f20107l * 1.2f), (int) (this.f20108m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f20106k)) * 1.2f), this.f20104i);
                return;
            }
            y0Var.d = this.f57213a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f20108m = 0;
        this.f20107l = 0;
    }

    @Override
    public final void g(android.view.View r8, v4.y0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: mi.m.g(android.view.View, v4.y0):void");
    }

    public m(Context context, int i7, float f10) {
        this.f20104i = new LinearInterpolator();
        this.f20105j = new DecelerateInterpolator(1.5f);
        this.f20107l = 0;
        this.f20108m = 0;
        this.f20110o = f10;
        this.f20106k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f10;
        this.f20109n = i7;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
