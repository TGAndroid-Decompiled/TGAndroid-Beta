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
    public final LinearInterpolator f20101i;
    public final DecelerateInterpolator f20102j;
    public final float f20103k;
    public int f20104l;
    public int f20105m;
    public final int f20106n;
    public final float f20107o;
    public int f20108p;

    public m(Context context, int i7) {
        this.f20101i = new LinearInterpolator();
        this.f20102j = new DecelerateInterpolator(1.5f);
        this.f20104l = 0;
        this.f20105m = 0;
        this.f20107o = 1.0f;
        this.f20103k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f20106n = i7;
    }

    @Override
    public final PointF a(int i7) {
        n0 n0Var = this.f57098c;
        if (n0Var instanceof b0) {
            return ((b0) n0Var).E0(i7);
        }
        return null;
    }

    @Override
    public final void d(int i7, int i10, y0 y0Var) {
        if (this.f57097b.f2873y.r() == 0) {
            h();
            return;
        }
        int i11 = this.f20104l;
        int i12 = i11 - i7;
        int i13 = 0;
        if (i11 * i12 <= 0) {
            i12 = 0;
        }
        this.f20104l = i12;
        int i14 = this.f20105m;
        int i15 = i14 - i10;
        if (i14 * i15 > 0) {
            i13 = i15;
        }
        this.f20105m = i13;
        if (i12 == 0 && i13 == 0) {
            PointF a10 = a(this.f57096a);
            if (a10 != null && (a10.x != 0.0f || a10.y != 0.0f)) {
                z0.b(a10);
                this.f20104l = (int) (a10.x * 10000.0f);
                this.f20105m = (int) (a10.y * 10000.0f);
                y0Var.b((int) (this.f20104l * 1.2f), (int) (this.f20105m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f20103k)) * 1.2f), this.f20101i);
                return;
            }
            y0Var.d = this.f57096a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f20105m = 0;
        this.f20104l = 0;
    }

    @Override
    public final void g(android.view.View r8, v4.y0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: mi.m.g(android.view.View, v4.y0):void");
    }

    public m(Context context, int i7, float f10) {
        this.f20101i = new LinearInterpolator();
        this.f20102j = new DecelerateInterpolator(1.5f);
        this.f20104l = 0;
        this.f20105m = 0;
        this.f20107o = f10;
        this.f20103k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f10;
        this.f20106n = i7;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
