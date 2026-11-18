package hi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.lr;
public final class z5 {
    public final b0 f15812a;
    public boolean f15813b;
    public y5 f15814c;
    public final org.telegram.ui.Components.c6 d;
    public final org.telegram.ui.Components.c6 f15815e;
    public final org.telegram.ui.Components.c6 f15816f;
    public final org.telegram.ui.Components.c6[] f15817g;
    public final org.telegram.ui.Components.c6[] h;
    public final Paint f15818i;
    public final Path f15819j;

    public z5(b0 b0Var) {
        Paint paint = new Paint(1);
        this.f15818i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f));
        this.f15819j = new Path();
        this.f15812a = b0Var;
        lr lrVar = lr.f37209g;
        this.d = new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 320L, lrVar);
        this.f15815e = new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar);
        this.f15816f = new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar);
        this.f15817g = new org.telegram.ui.Components.c6[]{new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar), new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar), new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar), new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar)};
        this.h = new org.telegram.ui.Components.c6[]{new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar), new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar), new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar), new org.telegram.ui.Components.c6(0.0f, b0Var, 0L, 160L, lrVar)};
    }

    public final void a(y5 y5Var) {
        if (y5Var != null) {
            this.f15814c = y5Var;
        }
        boolean z10 = false;
        if (y5Var != null) {
            float f10 = y5Var.d;
            float f11 = y5Var.f15772c;
            PointF[] pointFArr = y5Var.f15771b;
            if (!this.f15813b) {
                this.f15815e.e(true, f11);
                this.f15816f.e(true, f10);
                for (int i7 = 0; i7 < Math.min(4, pointFArr.length); i7++) {
                    this.f15817g[i7].e(true, pointFArr[i7].x - f11);
                    this.h[i7].e(true, pointFArr[i7].y - f10);
                }
            }
        }
        if (y5Var != null) {
            z10 = true;
        }
        this.f15813b = z10;
        this.f15812a.run();
    }
}
