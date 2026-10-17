package li;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import s4.b0;
import s4.n0;
import s4.w0;
import s4.x0;
public class n extends x0 {
    public final LinearInterpolator f16131i;
    public final DecelerateInterpolator f16132j;
    public final float f16133k;
    public int f16134l;
    public int f16135m;
    public final int f16136n;
    public final float f16137o;
    public int f16138p;

    public n(Context context, int i10) {
        this.f16131i = new LinearInterpolator();
        this.f16132j = new DecelerateInterpolator(1.5f);
        this.f16134l = 0;
        this.f16135m = 0;
        this.f16137o = 1.0f;
        this.f16133k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f16136n = i10;
    }

    @Override
    public final PointF a(int i10) {
        n0 n0Var = this.f46081c;
        if (n0Var instanceof b0) {
            return ((b0) n0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, w0 w0Var) {
        if (this.f46080b.f3634x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f16134l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f16134l = i13;
        int i15 = this.f16135m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f16135m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f46079a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                x0.b(a2);
                this.f16134l = (int) (a2.x * 10000.0f);
                this.f16135m = (int) (a2.y * 10000.0f);
                w0Var.b((int) (this.f16134l * 1.2f), (int) (this.f16135m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f16133k)) * 1.2f), this.f16131i);
                return;
            }
            w0Var.d = this.f46079a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f16135m = 0;
        this.f16134l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.w0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: li.n.g(android.view.View, s4.w0):void");
    }

    public n(Context context, int i10, float f7) {
        this.f16131i = new LinearInterpolator();
        this.f16132j = new DecelerateInterpolator(1.5f);
        this.f16134l = 0;
        this.f16135m = 0;
        this.f16137o = f7;
        this.f16133k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f7;
        this.f16136n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
