package hi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.nr;
public final class z5 {
    public final a0 f15803a;
    public boolean f15804b;
    public y5 f15805c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 f15806e;
    public final org.telegram.ui.Components.d6 f15807f;
    public final org.telegram.ui.Components.d6[] f15808g;
    public final org.telegram.ui.Components.d6[] h;
    public final Paint f15809i;
    public final Path f15810j;

    public z5(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f15809i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f));
        this.f15810j = new Path();
        this.f15803a = a0Var;
        nr nrVar = nr.f37918g;
        this.d = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 320L, nrVar);
        this.f15806e = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, nrVar);
        this.f15807f = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, nrVar);
        this.f15808g = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, nrVar)};
        this.h = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, nrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, nrVar)};
    }

    public final void a(y5 y5Var) {
        if (y5Var != null) {
            this.f15805c = y5Var;
        }
        boolean z10 = false;
        if (y5Var != null) {
            float f10 = y5Var.d;
            float f11 = y5Var.f15725c;
            PointF[] pointFArr = y5Var.f15724b;
            if (!this.f15804b) {
                this.f15806e.e(true, f11);
                this.f15807f.e(true, f10);
                for (int i7 = 0; i7 < Math.min(4, pointFArr.length); i7++) {
                    this.f15808g[i7].e(true, pointFArr[i7].x - f11);
                    this.h[i7].e(true, pointFArr[i7].y - f10);
                }
            }
        }
        if (y5Var != null) {
            z10 = true;
        }
        this.f15804b = z10;
        this.f15803a.run();
    }
}
