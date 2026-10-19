package ei;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class u6 {
    public final a0 f9892a;
    public boolean f9893b;
    public t6 f9894c;
    public final org.telegram.ui.Components.f6 d;
    public final org.telegram.ui.Components.f6 e;
    public final org.telegram.ui.Components.f6 f9895f;
    public final org.telegram.ui.Components.f6[] f9896g;
    public final org.telegram.ui.Components.f6[] h;
    public final Paint f9897i;
    public final Path f9898j;

    public u6(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f9897i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f9898j = new Path();
        this.f9892a = a0Var;
        bs bsVar = bs.f25013g;
        this.d = new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 320L, bsVar);
        this.e = new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar);
        this.f9895f = new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar);
        this.f9896g = new org.telegram.ui.Components.f6[]{new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar), new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar), new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar), new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar)};
        this.h = new org.telegram.ui.Components.f6[]{new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar), new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar), new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar), new org.telegram.ui.Components.f6(0.0f, a0Var, 0L, 160L, bsVar)};
    }

    public final void a(t6 t6Var) {
        if (t6Var != null) {
            this.f9894c = t6Var;
        }
        boolean z10 = false;
        if (t6Var != null) {
            float f7 = t6Var.d;
            float f10 = t6Var.f9853c;
            PointF[] pointFArr = t6Var.f9852b;
            if (!this.f9893b) {
                this.e.d(f10, true);
                this.f9895f.d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.f9896g[i10].d(pointFArr[i10].x - f10, true);
                    this.h[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        if (t6Var != null) {
            z10 = true;
        }
        this.f9893b = z10;
        this.f9892a.run();
    }
}
