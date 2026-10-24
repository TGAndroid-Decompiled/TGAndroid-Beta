package ei;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zr;
public final class u6 {
    public final a0 f9908a;
    public boolean f9909b;
    public t6 f9910c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public final org.telegram.ui.Components.d6 f9911f;
    public final org.telegram.ui.Components.d6[] f9912g;
    public final org.telegram.ui.Components.d6[] h;
    public final Paint f9913i;
    public final Path f9914j;

    public u6(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f9913i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f9914j = new Path();
        this.f9908a = a0Var;
        zr zrVar = zr.f33338g;
        this.d = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 320L, zrVar);
        this.e = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, zrVar);
        this.f9911f = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, zrVar);
        this.f9912g = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, zrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, zrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, zrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, zrVar)};
        this.h = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, zrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, zrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, zrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, zrVar)};
    }

    public final void a(t6 t6Var) {
        if (t6Var != null) {
            this.f9910c = t6Var;
        }
        boolean z10 = false;
        if (t6Var != null) {
            float f7 = t6Var.d;
            float f10 = t6Var.f9869c;
            PointF[] pointFArr = t6Var.f9868b;
            if (!this.f9909b) {
                this.e.d(f10, true);
                this.f9911f.d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.f9912g[i10].d(pointFArr[i10].x - f10, true);
                    this.h[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        if (t6Var != null) {
            z10 = true;
        }
        this.f9909b = z10;
        this.f9908a.run();
    }
}
