package hi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.er;
public final class a6 {
    public final a0 f13874a;
    public boolean f13875b;
    public z5 f13876c;
    public final org.telegram.ui.Components.u5 d;
    public final org.telegram.ui.Components.u5 f13877e;
    public final org.telegram.ui.Components.u5 f13878f;
    public final org.telegram.ui.Components.u5[] f13879g;
    public final org.telegram.ui.Components.u5[] h;
    public final Paint f13880i;
    public final Path f13881j;

    public a6(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f13880i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f));
        this.f13881j = new Path();
        this.f13874a = a0Var;
        er erVar = er.f34420g;
        this.d = new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 320L, erVar);
        this.f13877e = new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar);
        this.f13878f = new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar);
        this.f13879g = new org.telegram.ui.Components.u5[]{new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar)};
        this.h = new org.telegram.ui.Components.u5[]{new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, erVar)};
    }

    public final void a(z5 z5Var) {
        if (z5Var != null) {
            this.f13876c = z5Var;
        }
        boolean z10 = false;
        if (z5Var != null) {
            float f10 = z5Var.d;
            float f11 = z5Var.f15505c;
            PointF[] pointFArr = z5Var.f15504b;
            if (!this.f13875b) {
                this.f13877e.e(true, f11);
                this.f13878f.e(true, f10);
                for (int i7 = 0; i7 < Math.min(4, pointFArr.length); i7++) {
                    this.f13879g[i7].e(true, pointFArr[i7].x - f11);
                    this.h[i7].e(true, pointFArr[i7].y - f10);
                }
            }
        }
        if (z5Var != null) {
            z10 = true;
        }
        this.f13875b = z10;
        this.f13874a.run();
    }
}
