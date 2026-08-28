package f2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.BuildVars;
public class n0 extends m1 {
    public static final boolean f5460q = BuildVars.DEBUG_VERSION;
    public PointF f5463k;
    public final DisplayMetrics f5464l;
    public float f5466n;
    public final LinearInterpolator f5461i = new LinearInterpolator();
    public final DecelerateInterpolator f5462j = new DecelerateInterpolator();
    public boolean f5465m = false;
    public int f5467o = 0;
    public int f5468p = 0;

    public n0(Context context) {
        this.f5464l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i9, int i10, l1 l1Var) {
        PointF pointF;
        if (this.f5444b.f1368x.r() == 0) {
            h();
        } else if (f5460q && (pointF = this.f5463k) != null && (pointF.x * i9 < 0.0f || pointF.y * i10 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        } else {
            int i11 = this.f5467o;
            int i12 = i11 - i9;
            int i13 = 0;
            if (i11 * i12 <= 0) {
                i12 = 0;
            }
            this.f5467o = i12;
            int i14 = this.f5468p;
            int i15 = i14 - i10;
            if (i14 * i15 > 0) {
                i13 = i15;
            }
            this.f5468p = i13;
            if (i12 == 0 && i13 == 0) {
                q(l1Var);
            }
        }
    }

    @Override
    public final void f() {
        this.f5468p = 0;
        this.f5467o = 0;
        this.f5463k = null;
    }

    @Override
    public void g(View view, l1 l1Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            l1Var.b(-j10, -k10, m10, this.f5462j);
        }
    }

    public int i(int i9, int i10, int i11, int i12, int i13) {
        if (i13 != -1) {
            if (i13 != 0) {
                if (i13 == 1) {
                    return i12 - i10;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i14 = i11 - i9;
            if (i14 > 0) {
                return i14;
            }
            int i15 = i12 - i10;
            if (i15 < 0) {
                return i15;
            }
            return 0;
        }
        return i11 - i9;
    }

    public final int j(int i9, View view) {
        z0 z0Var = this.f5445c;
        if (z0Var != null && z0Var.d()) {
            a1 a1Var = (a1) view.getLayoutParams();
            return i(z0.x(view) - ((ViewGroup.MarginLayoutParams) a1Var).leftMargin, z0.y(view) + ((ViewGroup.MarginLayoutParams) a1Var).rightMargin, z0Var.D(), z0Var.f5572m - z0Var.E(), i9);
        }
        return 0;
    }

    public int k(int i9, View view) {
        z0 z0Var = this.f5445c;
        if (z0Var != null && z0Var.e()) {
            a1 a1Var = (a1) view.getLayoutParams();
            return i(z0.z(view) - ((ViewGroup.MarginLayoutParams) a1Var).topMargin, z0.v(view) + ((ViewGroup.MarginLayoutParams) a1Var).bottomMargin, z0Var.F(), z0Var.f5573n - z0Var.C(), i9);
        }
        return 0;
    }

    public float l(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int m(int i9) {
        return (int) Math.ceil(n(i9) / 0.3356d);
    }

    public int n(int i9) {
        float abs = Math.abs(i9);
        if (!this.f5465m) {
            this.f5466n = l(this.f5464l);
            this.f5465m = true;
        }
        return (int) Math.ceil(abs * this.f5466n);
    }

    public final int o() {
        PointF pointF = this.f5463k;
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
        PointF pointF = this.f5463k;
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

    public void q(l1 l1Var) {
        PointF a2 = a(this.f5443a);
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            m1.b(a2);
            this.f5463k = a2;
            this.f5467o = (int) (a2.x * 10000.0f);
            this.f5468p = (int) (a2.y * 10000.0f);
            l1Var.b((int) (this.f5467o * 1.2f), (int) (this.f5468p * 1.2f), (int) (n(10000) * 1.2f), this.f5461i);
            return;
        }
        l1Var.d = this.f5443a;
        h();
    }

    @Override
    public final void e() {
    }
}
