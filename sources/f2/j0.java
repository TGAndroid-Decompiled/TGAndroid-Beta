package f2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.BuildVars;
public class j0 extends h1 {
    public static final boolean f5757q = BuildVars.DEBUG_VERSION;
    public PointF f5760k;
    public final DisplayMetrics f5761l;
    public float f5763n;
    public final LinearInterpolator f5758i = new LinearInterpolator();
    public final DecelerateInterpolator f5759j = new DecelerateInterpolator();
    public boolean f5762m = false;
    public int f5764o = 0;
    public int f5765p = 0;

    public j0(Context context) {
        this.f5761l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i10, int i11, g1 g1Var) {
        PointF pointF;
        if (this.f5724b.f1250x.r() == 0) {
            h();
        } else if (f5757q && (pointF = this.f5760k) != null && (pointF.x * i10 < 0.0f || pointF.y * i11 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        } else {
            int i12 = this.f5764o;
            int i13 = i12 - i10;
            int i14 = 0;
            if (i12 * i13 <= 0) {
                i13 = 0;
            }
            this.f5764o = i13;
            int i15 = this.f5765p;
            int i16 = i15 - i11;
            if (i15 * i16 > 0) {
                i14 = i16;
            }
            this.f5765p = i14;
            if (i13 == 0 && i14 == 0) {
                q(g1Var);
            }
        }
    }

    @Override
    public final void f() {
        this.f5765p = 0;
        this.f5764o = 0;
        this.f5760k = null;
    }

    @Override
    public void g(View view, g1 g1Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m9 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m9 > 0) {
            g1Var.b(-j10, -k10, m9, this.f5759j);
        }
    }

    public int i(int i10, int i11, int i12, int i13, int i14) {
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    return i13 - i11;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        }
        return i12 - i10;
    }

    public final int j(int i10, View view) {
        v0 v0Var = this.f5725c;
        if (v0Var != null && v0Var.d()) {
            w0 w0Var = (w0) view.getLayoutParams();
            return i(v0.x(view) - ((ViewGroup.MarginLayoutParams) w0Var).leftMargin, v0.y(view) + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin, v0Var.D(), v0Var.f5856m - v0Var.E(), i10);
        }
        return 0;
    }

    public int k(int i10, View view) {
        v0 v0Var = this.f5725c;
        if (v0Var != null && v0Var.e()) {
            w0 w0Var = (w0) view.getLayoutParams();
            return i(v0.z(view) - ((ViewGroup.MarginLayoutParams) w0Var).topMargin, v0.v(view) + ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin, v0Var.F(), v0Var.f5857n - v0Var.C(), i10);
        }
        return 0;
    }

    public float l(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int m(int i10) {
        return (int) Math.ceil(n(i10) / 0.3356d);
    }

    public int n(int i10) {
        float abs = Math.abs(i10);
        if (!this.f5762m) {
            this.f5763n = l(this.f5761l);
            this.f5762m = true;
        }
        return (int) Math.ceil(abs * this.f5763n);
    }

    public final int o() {
        PointF pointF = this.f5760k;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 != 0.0f) {
                if (f10 > 0.0f) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public int p() {
        PointF pointF = this.f5760k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                if (f10 > 0.0f) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public void q(g1 g1Var) {
        PointF a2 = a(this.f5723a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            h1.b(a2);
            this.f5760k = a2;
            this.f5764o = (int) (a2.x * 10000.0f);
            this.f5765p = (int) (a2.y * 10000.0f);
            g1Var.b((int) (this.f5764o * 1.2f), (int) (this.f5765p * 1.2f), (int) (n(10000) * 1.2f), this.f5758i);
            return;
        }
        g1Var.d = this.f5723a;
        h();
    }

    @Override
    public final void e() {
    }
}
