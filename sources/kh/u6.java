package kh;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
public final class u6 {
    public final b0 f16146a;
    public boolean f16147b;
    public t6 f16148c;
    public final org.telegram.ui.Components.y5 d;
    public final org.telegram.ui.Components.y5 f16149e;
    public final org.telegram.ui.Components.y5 f16150f;
    public final org.telegram.ui.Components.y5[] f16151g;
    public final org.telegram.ui.Components.y5[] h;
    public final Paint f16152i;
    public final Path f16153j;

    public u6(b0 b0Var) {
        Paint paint = new Paint(1);
        this.f16152i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f16153j = new Path();
        this.f16146a = b0Var;
        gr grVar = gr.f28845g;
        this.d = new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 320L, grVar);
        this.f16149e = new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, grVar);
        this.f16150f = new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, grVar);
        this.f16151g = new org.telegram.ui.Components.y5[]{new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, grVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, grVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, grVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, grVar)};
        this.h = new org.telegram.ui.Components.y5[]{new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, grVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, grVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, grVar), new org.telegram.ui.Components.y5(0.0f, b0Var, 0L, 160L, grVar)};
    }

    public final void a(t6 t6Var) {
        if (t6Var != null) {
            this.f16148c = t6Var;
        }
        boolean z10 = false;
        if (t6Var != null) {
            float f10 = t6Var.d;
            float f11 = t6Var.f16091c;
            PointF[] pointFArr = t6Var.f16090b;
            if (!this.f16147b) {
                this.f16149e.d(f11, true);
                this.f16150f.d(f10, true);
                for (int i9 = 0; i9 < Math.min(4, pointFArr.length); i9++) {
                    this.f16151g[i9].d(pointFArr[i9].x - f11, true);
                    this.h[i9].d(pointFArr[i9].y - f10, true);
                }
            }
        }
        if (t6Var != null) {
            z10 = true;
        }
        this.f16147b = z10;
        this.f16146a.run();
    }
}
