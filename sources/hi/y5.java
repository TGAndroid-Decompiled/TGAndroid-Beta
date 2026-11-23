package hi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.nr;
public final class y5 {
    public final c0 f15790a;
    public boolean f15791b;
    public x5 f15792c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 f15793e;
    public final org.telegram.ui.Components.d6 f15794f;
    public final org.telegram.ui.Components.d6[] f15795g;
    public final org.telegram.ui.Components.d6[] h;
    public final Paint f15796i;
    public final Path f15797j;

    public y5(c0 c0Var) {
        Paint paint = new Paint(1);
        this.f15796i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f));
        this.f15797j = new Path();
        this.f15790a = c0Var;
        nr nrVar = nr.f37961g;
        this.d = new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 320L, nrVar);
        this.f15793e = new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar);
        this.f15794f = new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar);
        this.f15795g = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar)};
        this.h = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar)};
    }

    public final void a(x5 x5Var) {
        if (x5Var != null) {
            this.f15792c = x5Var;
        }
        boolean z10 = false;
        if (x5Var != null) {
            float f10 = x5Var.d;
            float f11 = x5Var.f15752c;
            PointF[] pointFArr = x5Var.f15751b;
            if (!this.f15791b) {
                this.f15793e.e(true, f11);
                this.f15794f.e(true, f10);
                for (int i7 = 0; i7 < Math.min(4, pointFArr.length); i7++) {
                    this.f15795g[i7].e(true, pointFArr[i7].x - f11);
                    this.h[i7].e(true, pointFArr[i7].y - f10);
                }
            }
        }
        if (x5Var != null) {
            z10 = true;
        }
        this.f15791b = z10;
        this.f15790a.run();
    }
}
