package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public final class z78 extends o49 {
    public final float k;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator(1.5f);
    public int l = 0;
    public int m = 0;

    public z78(Context context) {
        this.k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
    }

    @Override
    public final PointF a(int i) {
        d49 d49Var = this.c;
        if (d49Var instanceof t26) {
            return ((t26) d49Var).D0(i);
        }
        return null;
    }

    @Override
    public final void d(int i, int i2, n49 n49Var) {
        if (this.b.y.r() == 0) {
            h();
            return;
        }
        int i3 = this.l;
        int i4 = i3 - i;
        int i5 = 0;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.l = i4;
        int i6 = this.m;
        int i7 = i6 - i2;
        if (i6 * i7 > 0) {
            i5 = i7;
        }
        this.m = i5;
        if (i4 == 0 && i5 == 0) {
            PointF a = a(this.a);
            if (a != null && (a.x != 0.0f || a.y != 0.0f)) {
                o49.b(a);
                this.l = (int) (a.x * 10000.0f);
                this.m = (int) (a.y * 10000.0f);
                n49Var.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (((int) Math.ceil(10000.0f * this.k)) * 1.2f), this.i);
                return;
            }
            n49Var.d = this.a;
            h();
        }
    }

    @Override
    public final void f() {
        this.m = 0;
        this.l = 0;
    }

    @Override
    public final void g(android.view.View r8, defpackage.n49 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z78.g(android.view.View, n49):void");
    }

    @Override
    public final void e() {
    }
}
