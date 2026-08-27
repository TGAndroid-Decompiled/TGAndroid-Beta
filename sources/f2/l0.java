package f2;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.BuildVars;

public class l0 extends k1 {

    public static final boolean f5748q = BuildVars.DEBUG_VERSION;

    public PointF f5751k;

    public final DisplayMetrics f5752l;

    public float f5754n;

    public final LinearInterpolator f5749i = new LinearInterpolator();

    public final DecelerateInterpolator f5750j = new DecelerateInterpolator();

    public boolean f5753m = false;

    public int f5755o = 0;

    public int f5756p = 0;

    public l0(Context context) {
        this.f5752l = context.getResources().getDisplayMetrics();
    }

    @Override
    public final void d(int i10, int i11, j1 j1Var) {
        PointF pointF;
        if (this.f5732b.f1864x.r() == 0) {
            h();
            return;
        }
        if (f5748q && (pointF = this.f5751k) != null && (pointF.x * i10 < 0.0f || pointF.y * i11 < 0.0f)) {
            throw new IllegalStateException("Scroll happened in the opposite direction of the target. Some calculations are wrong");
        }
        int i12 = this.f5755o;
        int i13 = i12 - i10;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f5755o = i13;
        int i14 = this.f5756p;
        int i15 = i14 - i11;
        int i16 = i14 * i15 > 0 ? i15 : 0;
        this.f5756p = i16;
        if (i13 == 0 && i16 == 0) {
            q(j1Var);
        }
    }

    @Override
    public final void f() {
        this.f5756p = 0;
        this.f5755o = 0;
        this.f5751k = null;
    }

    @Override
    public void g(View view, j1 j1Var) {
        int iJ = j(o(), view);
        int iK = k(p(), view);
        int iM = m((int) Math.sqrt((iK * iK) + (iJ * iJ)));
        if (iM > 0) {
            j1Var.b(-iJ, -iK, iM, this.f5750j);
        }
    }

    public int i(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
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

    public final int j(int i10, View view) {
        x0 x0Var = this.f5733c;
        if (x0Var == null || !x0Var.d()) {
            return 0;
        }
        y0 y0Var = (y0) view.getLayoutParams();
        return i(x0.x(view) - ((ViewGroup.MarginLayoutParams) y0Var).leftMargin, x0.y(view) + ((ViewGroup.MarginLayoutParams) y0Var).rightMargin, x0Var.D(), x0Var.f5862m - x0Var.E(), i10);
    }

    public int k(int i10, View view) {
        x0 x0Var = this.f5733c;
        if (x0Var == null || !x0Var.e()) {
            return 0;
        }
        y0 y0Var = (y0) view.getLayoutParams();
        return i(x0.z(view) - ((ViewGroup.MarginLayoutParams) y0Var).topMargin, x0.v(view) + ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin, x0Var.F(), x0Var.f5863n - x0Var.C(), i10);
    }

    public float l(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int m(int i10) {
        return (int) Math.ceil(((double) n(i10)) / 0.3356d);
    }

    public int n(int i10) {
        float fAbs = Math.abs(i10);
        if (!this.f5753m) {
            this.f5754n = l(this.f5752l);
            this.f5753m = true;
        }
        return (int) Math.ceil(fAbs * this.f5754n);
    }

    public final int o() {
        PointF pointF = this.f5751k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.x;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    public int p() {
        PointF pointF = this.f5751k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.y;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    public void q(j1 j1Var) {
        PointF pointFA = a(this.f5731a);
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            j1Var.d = this.f5731a;
            h();
            return;
        }
        k1.b(pointFA);
        this.f5751k = pointFA;
        this.f5755o = (int) (pointFA.x * 10000.0f);
        this.f5756p = (int) (pointFA.y * 10000.0f);
        j1Var.b((int) (this.f5755o * 1.2f), (int) (this.f5756p * 1.2f), (int) (n(10000) * 1.2f), this.f5749i);
    }

    @Override
    public final void e() {
    }
}
