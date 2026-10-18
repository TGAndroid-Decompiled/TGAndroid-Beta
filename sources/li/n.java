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
    public final LinearInterpolator f16138i;
    public final DecelerateInterpolator f16139j;
    public final float f16140k;
    public int f16141l;
    public int f16142m;
    public final int f16143n;
    public final float f16144o;
    public int f16145p;

    public n(Context context, int i10) {
        this.f16138i = new LinearInterpolator();
        this.f16139j = new DecelerateInterpolator(1.5f);
        this.f16141l = 0;
        this.f16142m = 0;
        this.f16144o = 1.0f;
        this.f16140k = 25.0f / context.getResources().getDisplayMetrics().densityDpi;
        this.f16143n = i10;
    }

    @Override
    public final PointF a(int i10) {
        n0 n0Var = this.f46101c;
        if (n0Var instanceof b0) {
            return ((b0) n0Var).E0(i10);
        }
        return null;
    }

    @Override
    public final void d(int i10, int i11, w0 w0Var) {
        if (this.f46100b.f3635x.r() == 0) {
            h();
            return;
        }
        int i12 = this.f16141l;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f16141l = i13;
        int i15 = this.f16142m;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f16142m = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a2 = a(this.f46099a);
            if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                x0.b(a2);
                this.f16141l = (int) (a2.x * 10000.0f);
                this.f16142m = (int) (a2.y * 10000.0f);
                w0Var.b((int) (this.f16141l * 1.2f), (int) (this.f16142m * 1.2f), (int) (((int) Math.ceil(Math.abs(10000) * this.f16140k)) * 1.2f), this.f16138i);
                return;
            }
            w0Var.d = this.f46099a;
            h();
        }
    }

    @Override
    public final void f() {
        this.f16142m = 0;
        this.f16141l = 0;
    }

    @Override
    public final void g(android.view.View r8, s4.w0 r9) {
        throw new UnsupportedOperationException("Method not decompiled: li.n.g(android.view.View, s4.w0):void");
    }

    public n(Context context, int i10, float f7) {
        this.f16138i = new LinearInterpolator();
        this.f16139j = new DecelerateInterpolator(1.5f);
        this.f16141l = 0;
        this.f16142m = 0;
        this.f16144o = f7;
        this.f16140k = (25.0f / context.getResources().getDisplayMetrics().densityDpi) * f7;
        this.f16143n = i10;
    }

    @Override
    public void e() {
    }

    public void i() {
    }
}
