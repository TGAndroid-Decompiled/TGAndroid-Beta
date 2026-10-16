package di;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
public final class d7 {
    public final a0 f6828a;
    public boolean f6829b;
    public c7 f6830c;
    public final org.telegram.ui.Components.g6 d;
    public final org.telegram.ui.Components.g6 e;
    public final org.telegram.ui.Components.g6 f6831f;
    public final org.telegram.ui.Components.g6[] f6832g;
    public final org.telegram.ui.Components.g6[] h;
    public final Paint f6833i;
    public final Path f6834j;

    public d7(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f6833i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
        this.f6834j = new Path();
        this.f6828a = a0Var;
        es esVar = es.f24466g;
        this.d = new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 320L, esVar);
        this.e = new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar);
        this.f6831f = new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar);
        this.f6832g = new org.telegram.ui.Components.g6[]{new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar)};
        this.h = new org.telegram.ui.Components.g6[]{new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar), new org.telegram.ui.Components.g6(0.0f, a0Var, 0L, 160L, esVar)};
    }

    public final void a(c7 c7Var) {
        if (c7Var != null) {
            this.f6830c = c7Var;
        }
        boolean z10 = false;
        if (c7Var != null) {
            float f7 = c7Var.d;
            float f10 = c7Var.f6713c;
            PointF[] pointFArr = c7Var.f6712b;
            if (!this.f6829b) {
                this.e.d(f10, true);
                this.f6831f.d(f7, true);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.f6832g[i10].d(pointFArr[i10].x - f10, true);
                    this.h[i10].d(pointFArr[i10].y - f7, true);
                }
            }
        }
        if (c7Var != null) {
            z10 = true;
        }
        this.f6829b = z10;
        this.f6828a.run();
    }
}
