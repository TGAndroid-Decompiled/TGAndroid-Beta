package ii;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import s4.c0;
import s4.o0;
import s4.x0;
import s4.y0;
public class o extends y0 {
    public final LinearInterpolator f10687i;
    public final DecelerateInterpolator f10688j;
    public final float f10689k;
    public int f10690l;
    public int f10691m;
    public final int f10692n;
    public final float f10693o;
    public int f10694p;

    public o(Context context, int i10) {
        this.f10687i = new LinearInterpolator();
        this.f10688j = new DecelerateInterpolator(1.5f);
        this.f10690l = 0;
        this.f10691m = 0;
        this.f10693o = 1.0f;
        this.f10689k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f10692n = i10;
    }

    @Override
    public final PointF a(int i10) {
        o0 o0Var = this.f41762c;
        if (o0Var instanceof c0) {
            return ((c0) o0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, x0 x0Var) {
        if (this.f41761b.f1560x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f10690l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f10690l = i13;
        int i15 = this.f10691m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f10691m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f41760a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                y0.b(a2);
                this.f10690l = (int) (a2.x * 10000.0f);
                this.f10691m = (int) (a2.y * 10000.0f);
                x0Var.b((int) (this.f10690l * 1.2f), (int) (this.f10691m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f10689k)) * 1.2f), this.f10687i);
                return;
            }
            x0Var.d = this.f41760a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f10691m = 0;
        this.f10690l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.x0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: ii.o.g(android.view.View, s4.x0):void");
    }

    public o(Context context, int i10, float f7) {
        this.f10687i = new LinearInterpolator();
        this.f10688j = new DecelerateInterpolator(1.5f);
        this.f10690l = 0;
        this.f10691m = 0;
        this.f10693o = f7;
        this.f10689k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f7;
        this.f10692n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
