package nh;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public final class i6 {
    public final a0 f17885a;
    public boolean f17886b;
    public h6 f17887c;
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 f17888e;
    public final org.telegram.ui.Components.d6 f17889f;
    public final org.telegram.ui.Components.d6[] f17890g;
    public final org.telegram.ui.Components.d6[] h;
    public final Paint f17891i;
    public final Path f17892j;

    public i6(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f17891i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f17892j = new Path();
        this.f17885a = a0Var;
        jr jrVar = jr.f29801g;
        this.d = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 320L, jrVar);
        this.f17888e = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar);
        this.f17889f = new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar);
        this.f17890g = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar)};
        this.h = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar), new org.telegram.ui.Components.d6(0.0f, a0Var, 0L, 160L, jrVar)};
    }

    public final void a(h6 h6Var) {
        if (h6Var != null) {
            this.f17887c = h6Var;
        }
        boolean z10 = false;
        if (h6Var != null) {
            float f9 = h6Var.d;
            float f10 = h6Var.f17846c;
            PointF[] pointFArr = h6Var.f17845b;
            if (!this.f17886b) {
                this.f17888e.d(f10, true);
                this.f17889f.d(f9, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.f17890g[i10].d(pointFArr[i10].x - f10, true);
                    this.h[i10].d(pointFArr[i10].y - f9, true);
                }
            }
        }
        if (h6Var != null) {
            z10 = true;
        }
        this.f17886b = z10;
        this.f17885a.run();
    }
}
