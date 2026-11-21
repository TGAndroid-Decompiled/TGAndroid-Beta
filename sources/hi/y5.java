package hi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.nr;
public final class y5 {
    public final c0 f15787a;
    public boolean f15788b;
    public x5 f15789c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 f15790e;
    public final org.telegram.ui.Components.d6 f15791f;
    public final org.telegram.ui.Components.d6[] f15792g;
    public final org.telegram.ui.Components.d6[] h;
    public final Paint f15793i;
    public final Path f15794j;

    public y5(c0 c0Var) {
        Paint paint = new Paint(1);
        this.f15793i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f));
        this.f15794j = new Path();
        this.f15787a = c0Var;
        nr nrVar = nr.f37957g;
        this.d = new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 320L, nrVar);
        this.f15790e = new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar);
        this.f15791f = new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar);
        this.f15792g = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar)};
        this.h = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, c0Var, 0L, 160L, nrVar)};
    }

    public final void a(x5 x5Var) {
        if (x5Var != null) {
            this.f15789c = x5Var;
        }
        boolean z10 = false;
        if (x5Var != null) {
            float f10 = x5Var.d;
            float f11 = x5Var.f15749c;
            PointF[] pointFArr = x5Var.f15748b;
            if (!this.f15788b) {
                this.f15790e.e(true, f11);
                this.f15791f.e(true, f10);
                for (int i7 = 0; i7 < Math.min(4, pointFArr.length); i7++) {
                    this.f15792g[i7].e(true, pointFArr[i7].x - f11);
                    this.h[i7].e(true, pointFArr[i7].y - f10);
                }
            }
        }
        if (x5Var != null) {
            z10 = true;
        }
        this.f15788b = z10;
        this.f15787a.run();
    }
}
