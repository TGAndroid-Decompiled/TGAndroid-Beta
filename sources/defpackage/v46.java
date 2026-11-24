package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public class v46 extends q69 {
    public static final boolean q;
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    static {
        boolean z = e21.a;
        q = true;
    }

    public v46(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i, int i2, p69 p69Var) {
        PointF pointF;
        if (this.b.y.r() == 0) {
            h();
        } else if (q && (pointF = this.k) != null && (pointF.x * i < 0.0f || pointF.y * i2 < 0.0f)) {
            dq9.m("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        } else {
            int i3 = this.o;
            int i4 = i3 - i;
            int i5 = 0;
            if (i3 * i4 <= 0) {
                i4 = 0;
            }
            this.o = i4;
            int i6 = this.p;
            int i7 = i6 - i2;
            if (i6 * i7 > 0) {
                i5 = i7;
            }
            this.p = i5;
            if (i4 == 0 && i5 == 0) {
                q(p69Var);
            }
        }
    }

    @Override
    public final void f() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    @Override
    public void g(View view, p69 p69Var) {
        int j = j(o(), view);
        int k = k(p(), view);
        int m = m((int) Math.sqrt((k * k) + (j * j)));
        if (m > 0) {
            p69Var.b(-j, -k, m, this.j);
        }
    }

    public int i(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                u36.j("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                return 0;
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    public final int j(int i, View view) {
        f69 f69Var = this.c;
        if (f69Var != null && f69Var.d()) {
            g69 g69Var = (g69) view.getLayoutParams();
            return i(f69.w(view) - ((ViewGroup.MarginLayoutParams) g69Var).leftMargin, f69.x(view) + ((ViewGroup.MarginLayoutParams) g69Var).rightMargin, f69Var.C(), f69Var.m - f69Var.D(), i);
        }
        return 0;
    }

    public int k(int i, View view) {
        f69 f69Var = this.c;
        if (f69Var != null && f69Var.e()) {
            g69 g69Var = (g69) view.getLayoutParams();
            return i(f69.y(view) - ((ViewGroup.MarginLayoutParams) g69Var).topMargin, f69.v(view) + ((ViewGroup.MarginLayoutParams) g69Var).bottomMargin, f69Var.E(), f69Var.n - f69Var.B(), i);
        }
        return 0;
    }

    public float l(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int m(int i) {
        return (int) Math.ceil(n(i) / 0.3356d);
    }

    public int n(int i) {
        float abs = Math.abs(i);
        if (!this.m) {
            this.n = l(this.l);
            this.m = true;
        }
        return (int) Math.ceil(abs * this.n);
    }

    public final int o() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                if (f > 0.0f) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public int p() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                if (f > 0.0f) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public void q(p69 p69Var) {
        PointF a = a(this.a);
        if (a != null && (a.x != 0.0f || a.y != 0.0f)) {
            q69.b(a);
            this.k = a;
            this.o = (int) (a.x * 10000.0f);
            this.p = (int) (a.y * 10000.0f);
            p69Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.i);
            return;
        }
        p69Var.d = this.a;
        h();
    }
}
