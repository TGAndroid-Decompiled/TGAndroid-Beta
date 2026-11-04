package gi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.xq;
public final class b6 {
    public final a0 f12450a;
    public boolean f12451b;
    public a6 f12452c;
    public final org.telegram.ui.Components.u5 d;
    public final org.telegram.ui.Components.u5 f12453e;
    public final org.telegram.ui.Components.u5 f12454f;
    public final org.telegram.ui.Components.u5[] f12455g;
    public final org.telegram.ui.Components.u5[] h;
    public final Paint f12456i;
    public final Path f12457j;

    public b6(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f12456i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f));
        this.f12457j = new Path();
        this.f12450a = a0Var;
        xq xqVar = xq.f40453g;
        this.d = new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 320L, xqVar);
        this.f12453e = new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar);
        this.f12454f = new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar);
        this.f12455g = new org.telegram.ui.Components.u5[]{new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar)};
        this.h = new org.telegram.ui.Components.u5[]{new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.u5(0.0f, a0Var, 0L, 160L, xqVar)};
    }

    public final void a(a6 a6Var) {
        if (a6Var != null) {
            this.f12452c = a6Var;
        }
        boolean z10 = false;
        if (a6Var != null) {
            float f10 = a6Var.d;
            float f11 = a6Var.f12392c;
            PointF[] pointFArr = a6Var.f12391b;
            if (!this.f12451b) {
                this.f12453e.e(true, f11);
                this.f12454f.e(true, f10);
                for (int i3 = 0; i3 < Math.min(4, pointFArr.length); i3++) {
                    this.f12455g[i3].e(true, pointFArr[i3].x - f11);
                    this.h[i3].e(true, pointFArr[i3].y - f10);
                }
            }
        }
        if (a6Var != null) {
            z10 = true;
        }
        this.f12451b = z10;
        this.f12450a.run();
    }
}
