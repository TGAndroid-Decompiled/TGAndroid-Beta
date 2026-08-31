package f2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.BuildVars;
public class k0 extends i1 {
    public static final boolean f5843q = BuildVars.DEBUG_VERSION;
    public PointF f5846k;
    public final DisplayMetrics f5847l;
    public float f5849n;
    public final LinearInterpolator f5844i = new LinearInterpolator();
    public final DecelerateInterpolator f5845j = new DecelerateInterpolator();
    public boolean f5848m = false;
    public int f5850o = 0;
    public int f5851p = 0;

    public k0(Context context) {
        this.f5847l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i10, int i11, h1 h1Var) {
        PointF pointF;
        if (this.f5806b.f1349x.r() == 0) {
            h();
        } else if (f5843q && (pointF = this.f5846k) != null && (pointF.x * i10 < 0.0f || pointF.y * i11 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        } else {
            int i12 = this.f5850o;
            int i13 = i12 - i10;
            int i14 = 0;
            if (i12 * i13 <= 0) {
                i13 = 0;
            }
            this.f5850o = i13;
            int i15 = this.f5851p;
            int i16 = i15 - i11;
            if (i15 * i16 > 0) {
                i14 = i16;
            }
            this.f5851p = i14;
            if (i13 == 0 && i14 == 0) {
                q(h1Var);
            }
        }
    }

    @Override
    public final void f() {
        this.f5851p = 0;
        this.f5850o = 0;
        this.f5846k = null;
    }

    @Override
    public void g(View view, h1 h1Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m9 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m9 > 0) {
            h1Var.b(-j10, -k10, m9, this.f5845j);
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
        w0 w0Var = this.f5807c;
        if (w0Var != null && w0Var.d()) {
            x0 x0Var = (x0) view.getLayoutParams();
            return i(w0.x(view) - ((ViewGroup.MarginLayoutParams) x0Var).leftMargin, w0.y(view) + ((ViewGroup.MarginLayoutParams) x0Var).rightMargin, w0Var.D(), w0Var.f5950m - w0Var.E(), i10);
        }
        return 0;
    }

    public int k(int i10, View view) {
        w0 w0Var = this.f5807c;
        if (w0Var != null && w0Var.e()) {
            x0 x0Var = (x0) view.getLayoutParams();
            return i(w0.z(view) - ((ViewGroup.MarginLayoutParams) x0Var).topMargin, w0.v(view) + ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin, w0Var.F(), w0Var.f5951n - w0Var.C(), i10);
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
        if (!this.f5848m) {
            this.f5849n = l(this.f5847l);
            this.f5848m = true;
        }
        return (int) Math.ceil(abs * this.f5849n);
    }

    public final int o() {
        PointF pointF = this.f5846k;
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
        PointF pointF = this.f5846k;
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

    public void q(h1 h1Var) {
        PointF a2 = a(this.f5805a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            i1.b(a2);
            this.f5846k = a2;
            this.f5850o = (int) (a2.x * 10000.0f);
            this.f5851p = (int) (a2.y * 10000.0f);
            h1Var.b((int) (this.f5850o * 1.2f), (int) (this.f5851p * 1.2f), (int) (n(10000) * 1.2f), this.f5844i);
            return;
        }
        h1Var.d = this.f5805a;
        h();
    }

    @Override
    public final void e() {
    }
}
