package f2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.BuildVars;
public class k0 extends j1 {
    public static final boolean f6383q = BuildVars.DEBUG_VERSION;
    public PointF f6386k;
    public final DisplayMetrics f6387l;
    public float f6389n;
    public final LinearInterpolator f6384i = new LinearInterpolator();
    public final DecelerateInterpolator f6385j = new DecelerateInterpolator();
    public boolean f6388m = false;
    public int f6390o = 0;
    public int f6391p = 0;

    public k0(Context context) {
        this.f6387l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i10, int i11, i1 i1Var) {
        PointF pointF;
        if (this.f6374b.f1858x.r() == 0) {
            h();
        } else if (f6383q && (pointF = this.f6386k) != null && (pointF.x * i10 < 0.0f || pointF.y * i11 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        } else {
            int i12 = this.f6390o;
            int i13 = i12 - i10;
            int i14 = 0;
            if (i12 * i13 <= 0) {
                i13 = 0;
            }
            this.f6390o = i13;
            int i15 = this.f6391p;
            int i16 = i15 - i11;
            if (i15 * i16 > 0) {
                i14 = i16;
            }
            this.f6391p = i14;
            if (i13 == 0 && i14 == 0) {
                q(i1Var);
            }
        }
    }

    @Override
    public final void f() {
        this.f6391p = 0;
        this.f6390o = 0;
        this.f6386k = null;
    }

    @Override
    public void g(View view, i1 i1Var) {
        int j10 = j(o(), view);
        int k9 = k(p(), view);
        int m10 = m((int) Math.sqrt((k9 * k9) + (j10 * j10)));
        if (m10 > 0) {
            i1Var.b(-j10, -k9, m10, this.f6385j);
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
        w0 w0Var = this.f6375c;
        if (w0Var != null && w0Var.d()) {
            x0 x0Var = (x0) view.getLayoutParams();
            return i(w0.x(view) - ((ViewGroup.MarginLayoutParams) x0Var).leftMargin, w0.y(view) + ((ViewGroup.MarginLayoutParams) x0Var).rightMargin, w0Var.D(), w0Var.f6506m - w0Var.E(), i10);
        }
        return 0;
    }

    public int k(int i10, View view) {
        w0 w0Var = this.f6375c;
        if (w0Var != null && w0Var.e()) {
            x0 x0Var = (x0) view.getLayoutParams();
            return i(w0.z(view) - ((ViewGroup.MarginLayoutParams) x0Var).topMargin, w0.v(view) + ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin, w0Var.F(), w0Var.f6507n - w0Var.C(), i10);
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
        if (!this.f6388m) {
            this.f6389n = l(this.f6387l);
            this.f6388m = true;
        }
        return (int) Math.ceil(abs * this.f6389n);
    }

    public final int o() {
        PointF pointF = this.f6386k;
        if (pointF != null) {
            float f9 = pointF.x;
            if (f9 != 0.0f) {
                if (f9 > 0.0f) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public int p() {
        PointF pointF = this.f6386k;
        if (pointF != null) {
            float f9 = pointF.y;
            if (f9 != 0.0f) {
                if (f9 > 0.0f) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public void q(i1 i1Var) {
        PointF a2 = a(this.f6373a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            j1.b(a2);
            this.f6386k = a2;
            this.f6390o = (int) (a2.x * 10000.0f);
            this.f6391p = (int) (a2.y * 10000.0f);
            i1Var.b((int) (this.f6390o * 1.2f), (int) (this.f6391p * 1.2f), (int) (n(10000) * 1.2f), this.f6384i);
            return;
        }
        i1Var.d = this.f6373a;
        h();
    }

    @Override
    public final void e() {
    }
}
