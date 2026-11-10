package fi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.wq;
public final class b6 {
    public final a0 f11686a;
    public boolean f11687b;
    public a6 f11688c;
    public final org.telegram.ui.Components.v5 d;
    public final org.telegram.ui.Components.v5 f11689e;
    public final org.telegram.ui.Components.v5 f11690f;
    public final org.telegram.ui.Components.v5[] f11691g;
    public final org.telegram.ui.Components.v5[] h;
    public final Paint f11692i;
    public final Path f11693j;

    public b6(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f11692i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f));
        this.f11693j = new Path();
        this.f11686a = a0Var;
        wq wqVar = wq.f40047g;
        this.d = new org.telegram.ui.Components.v5(0.0f, a0Var, 0L, 320L, wqVar);
        this.f11689e = new org.telegram.ui.Components.v5(0.0f, a0Var, 0L, 160L, wqVar);
        this.f11690f = new org.telegram.ui.Components.v5(0.0f, a0Var, 0L, 160L, wqVar);
        this.f11691g = new org.telegram.ui.Components.v5[]{new org.telegram.ui.Components.v5(0.0f, a0Var, 0L, 160L, wqVar), new org.telegram.ui.Components.v5(0.0f, a0Var, 0L, 160L, wqVar), new org.telegram.ui.Components.v5(0.0f, a0Var, 0L, 160L, wqVar), new org.telegram.ui.Components.v5(0.0f, a0Var, 0L, 160L, wqVar)};
        this.h = new org.telegram.ui.Components.v5[]{new org.telegram.ui.Components.v5(0.0f, a0Var, 0L, 160L, wqVar), new org.telegram.ui.Components.v5(0.0f, a0Var, 0L, 160L, wqVar), new org.telegram.ui.Components.v5(0.0f, a0Var, 0L, 160L, wqVar), new org.telegram.ui.Components.v5(0.0f, a0Var, 0L, 160L, wqVar)};
    }

    public final void a(a6 a6Var) {
        if (a6Var != null) {
            this.f11688c = a6Var;
        }
        boolean z9 = false;
        if (a6Var != null) {
            float f10 = a6Var.d;
            float f11 = a6Var.f11613c;
            PointF[] pointFArr = a6Var.f11612b;
            if (!this.f11687b) {
                this.f11689e.e(true, f11);
                this.f11690f.e(true, f10);
                for (int i7 = 0; i7 < Math.min(4, pointFArr.length); i7++) {
                    this.f11691g[i7].e(true, pointFArr[i7].x - f11);
                    this.h[i7].e(true, pointFArr[i7].y - f10);
                }
            }
        }
        if (a6Var != null) {
            z9 = true;
        }
        this.f11687b = z9;
        this.f11686a.run();
    }
}
