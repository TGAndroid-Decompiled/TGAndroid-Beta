package fi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
public final class r6 {
    public final a0 f11547a;
    public boolean f11548b;
    public q6 f11549c;
    public final org.telegram.ui.Components.h6 d;
    public final org.telegram.ui.Components.h6 e;
    public final org.telegram.ui.Components.h6 f11550f;
    public final org.telegram.ui.Components.h6[] f11551g;
    public final org.telegram.ui.Components.h6[] h;
    public final Paint f11552i;
    public final Path f11553j;

    public r6(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f11552i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f11553j = new Path();
        this.f11547a = a0Var;
        ds dsVar = ds.f27531g;
        this.d = new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 320L, dsVar);
        this.e = new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar);
        this.f11550f = new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar);
        this.f11551g = new org.telegram.ui.Components.h6[]{new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar), new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar), new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar), new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar)};
        this.h = new org.telegram.ui.Components.h6[]{new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar), new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar), new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar), new org.telegram.ui.Components.h6(0.0f, a0Var, 0L, 160L, dsVar)};
    }

    public final void a(q6 q6Var) {
        if (q6Var != null) {
            this.f11549c = q6Var;
        }
        boolean z10 = false;
        if (q6Var != null) {
            float f7 = q6Var.d;
            float f10 = q6Var.f11487c;
            PointF[] pointFArr = q6Var.f11486b;
            if (!this.f11548b) {
                this.e.d(f10, true);
                this.f11550f.d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.f11551g[i10].d(pointFArr[i10].x - f10, true);
                    this.h[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        if (q6Var != null) {
            z10 = true;
        }
        this.f11548b = z10;
        this.f11547a.run();
    }
}
