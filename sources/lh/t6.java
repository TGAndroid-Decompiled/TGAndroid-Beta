package lh;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public final class t6 {

    public final b0 f16853a;

    public boolean f16854b;

    public s6 f16855c;
    public final org.telegram.ui.Components.y5 d;

    public final org.telegram.ui.Components.y5 f16856e;

    public final org.telegram.ui.Components.y5 f16857f;

    public final org.telegram.ui.Components.y5[] f16858g;
    public final org.telegram.ui.Components.y5[] h;

    public final Paint f16859i;

    public final Path f16860j;

    public t6(b0 b0Var) {
        Paint paint = new Paint(1);
        this.f16859i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f16860j = new Path();
        this.f16853a = b0Var;
        er erVar = er.f28123g;
        this.d = new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 320L, erVar);
        this.f16856e = new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar);
        this.f16857f = new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar);
        this.f16858g = new org.telegram.ui.Components.y5[]{new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar)};
        this.h = new org.telegram.ui.Components.y5[]{new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, erVar)};
    }

    public final void a(s6 s6Var) {
        if (s6Var != null) {
            this.f16855c = s6Var;
        }
        if (s6Var != null) {
            float f10 = s6Var.d;
            float f11 = s6Var.f16729c;
            PointF[] pointFArr = s6Var.f16728b;
            if (!this.f16854b) {
                this.f16856e.d(f11, true);
                this.f16857f.d(f10, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.f16858g[i10].d(pointFArr[i10].x - f11, true);
                    this.h[i10].d(pointFArr[i10].y - f10, true);
                }
            }
        }
        this.f16854b = s6Var != null;
        this.f16853a.run();
    }
}
