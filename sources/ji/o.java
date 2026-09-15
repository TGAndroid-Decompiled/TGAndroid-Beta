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
    public final LinearInterpolator f13095i;
    public final DecelerateInterpolator f13096j;
    public final float f13097k;
    public int f13098l;
    public int f13099m;
    public final int f13100n;
    public final float f13101o;
    public int f13102p;

    public o(Context context, int i10) {
        this.f13095i = new LinearInterpolator();
        this.f13096j = new DecelerateInterpolator(1.5f);
        this.f13098l = 0;
        this.f13099m = 0;
        this.f13101o = 1.0f;
        this.f13097k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f13100n = i10;
    }

    @Override
    public final PointF a(int i10) {
        o0 o0Var = this.f42827c;
        if (o0Var instanceof c0) {
            return ((c0) o0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, x0 x0Var) {
        if (this.f42826b.f2863x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f13098l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f13098l = i13;
        int i15 = this.f13099m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f13099m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f42825a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                y0.b(a2);
                this.f13098l = (int) (a2.x * 10000.0f);
                this.f13099m = (int) (a2.y * 10000.0f);
                x0Var.b((int) (this.f13098l * 1.2f), (int) (this.f13099m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f13097k)) * 1.2f), this.f13095i);
                return;
            }
            x0Var.d = this.f42825a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f13099m = 0;
        this.f13098l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.x0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: ji.o.g(android.view.View, s4.x0):void");
    }

    public o(Context context, int i10, float f7) {
        this.f13095i = new LinearInterpolator();
        this.f13096j = new DecelerateInterpolator(1.5f);
        this.f13098l = 0;
        this.f13099m = 0;
        this.f13101o = f7;
        this.f13097k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f7;
        this.f13100n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
