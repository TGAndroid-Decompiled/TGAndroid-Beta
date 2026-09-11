package ki;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import s4.c0;
import s4.o0;
import s4.x0;
import s4.y0;
public class p extends y0 {
    public final LinearInterpolator f15035i;
    public final DecelerateInterpolator f15036j;
    public final float f15037k;
    public int f15038l;
    public int f15039m;
    public final int f15040n;
    public final float f15041o;
    public int f15042p;

    public p(Context context, int i10) {
        this.f15035i = new LinearInterpolator();
        this.f15036j = new DecelerateInterpolator(1.5f);
        this.f15038l = 0;
        this.f15039m = 0;
        this.f15041o = 1.0f;
        this.f15037k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f15040n = i10;
    }

    @Override
    public final PointF a(int i10) {
        o0 o0Var = this.f45908c;
        if (o0Var instanceof c0) {
            return ((c0) o0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, x0 x0Var) {
        if (this.f45907b.f1896x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f15038l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f15038l = i13;
        int i15 = this.f15039m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f15039m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f45906a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                y0.b(a2);
                this.f15038l = (int) (a2.x * 10000.0f);
                this.f15039m = (int) (a2.y * 10000.0f);
                x0Var.b((int) (this.f15038l * 1.2f), (int) (this.f15039m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f15037k)) * 1.2f), this.f15035i);
                return;
            }
            x0Var.d = this.f45906a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f15039m = 0;
        this.f15038l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.x0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: ki.p.g(android.view.View, s4.x0):void");
    }

    public p(Context context, int i10, float f7) {
        this.f15035i = new LinearInterpolator();
        this.f15036j = new DecelerateInterpolator(1.5f);
        this.f15038l = 0;
        this.f15039m = 0;
        this.f15041o = f7;
        this.f15037k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f7;
        this.f15040n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
