package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
public class u26 extends o49 {
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
        boolean z = w01.a;
        q = true;
    }

    public u26(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i, int i2, n49 n49Var) {
        PointF pointF;
        if (this.b.y.r() == 0) {
            h();
        } else if (q && (pointF = this.k) != null && (pointF.x * i < 0.0f || pointF.y * i2 < 0.0f)) {
            sc8.j("Scroll happened in the opposite direction of the target. Some calculations are wrong");
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
                q(n49Var);
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
    public void g(View view, n49 n49Var) {
        int j = j(o(), view);
        int k = k(p(), view);
        int m = m((int) Math.sqrt((k * k) + (j * j)));
        if (m > 0) {
            n49Var.b(-j, -k, m, this.j);
        }
    }

    public int i(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                w26.j("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
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
        d49 d49Var = this.c;
        if (d49Var != null && d49Var.d()) {
            e49 e49Var = (e49) view.getLayoutParams();
            return i(d49.w(view) - ((ViewGroup.MarginLayoutParams) e49Var).leftMargin, d49.x(view) + ((ViewGroup.MarginLayoutParams) e49Var).rightMargin, d49Var.C(), d49Var.m - d49Var.D(), i);
        }
        return 0;
    }

    public int k(int i, View view) {
        d49 d49Var = this.c;
        if (d49Var != null && d49Var.e()) {
            e49 e49Var = (e49) view.getLayoutParams();
            return i(d49.y(view) - ((ViewGroup.MarginLayoutParams) e49Var).topMargin, d49.v(view) + ((ViewGroup.MarginLayoutParams) e49Var).bottomMargin, d49Var.E(), d49Var.n - d49Var.B(), i);
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

    public void q(n49 n49Var) {
        PointF a = a(this.a);
        if (a != null && (a.x != 0.0f || a.y != 0.0f)) {
            o49.b(a);
            this.k = a;
            this.o = (int) (a.x * 10000.0f);
            this.p = (int) (a.y * 10000.0f);
            n49Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.i);
            return;
        }
        n49Var.d = this.a;
        h();
    }
}
