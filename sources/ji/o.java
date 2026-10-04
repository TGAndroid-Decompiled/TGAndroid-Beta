package ji;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import s4.c0;
import s4.o0;
import s4.x0;
import s4.y0;
public class o extends y0 {
    public final LinearInterpolator f14229i;
    public final DecelerateInterpolator f14230j;
    public final float f14231k;
    public int f14232l;
    public int f14233m;
    public final int f14234n;
    public final float f14235o;
    public int f14236p;

    public o(Context context, int i10) {
        this.f14229i = new LinearInterpolator();
        this.f14230j = new DecelerateInterpolator(1.5f);
        this.f14232l = 0;
        this.f14233m = 0;
        this.f14235o = 1.0f;
        this.f14231k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f14234n = i10;
    }

    @Override
    public final PointF a(int i10) {
        o0 o0Var = this.f46694c;
        if (o0Var instanceof c0) {
            return ((c0) o0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, x0 x0Var) {
        if (this.f46693b.f3090x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f14232l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f14232l = i13;
        int i15 = this.f14233m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f14233m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f46692a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                y0.b(a2);
                this.f14232l = (int) (a2.x * 10000.0f);
                this.f14233m = (int) (a2.y * 10000.0f);
                x0Var.b((int) (this.f14232l * 1.2f), (int) (this.f14233m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f14231k)) * 1.2f), this.f14229i);
                return;
            }
            x0Var.d = this.f46692a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f14233m = 0;
        this.f14232l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.x0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: ji.o.g(android.view.View, s4.x0):void");
    }

    public o(Context context, int i10, float f7) {
        this.f14229i = new LinearInterpolator();
        this.f14230j = new DecelerateInterpolator(1.5f);
        this.f14232l = 0;
        this.f14233m = 0;
        this.f14235o = f7;
        this.f14231k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f7;
        this.f14234n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
