package hi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.kr;
public final class i6 {
    public final j0 f14676a;
    public boolean f14677b;
    public h6 f14678c;
    public final org.telegram.ui.Components.c6 d;
    public final org.telegram.ui.Components.c6 f14679e;
    public final org.telegram.ui.Components.c6 f14680f;
    public final org.telegram.ui.Components.c6[] f14681g;
    public final org.telegram.ui.Components.c6[] h;
    public final Paint f14682i;
    public final Path f14683j;

    public i6(j0 j0Var) {
        Paint paint = new Paint(1);
        this.f14682i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f));
        this.f14683j = new Path();
        this.f14676a = j0Var;
        kr krVar = kr.f36859g;
        this.d = new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 320L, krVar);
        this.f14679e = new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar);
        this.f14680f = new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar);
        this.f14681g = new org.telegram.ui.Components.c6[]{new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar), new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar), new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar), new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar)};
        this.h = new org.telegram.ui.Components.c6[]{new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar), new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar), new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar), new org.telegram.ui.Components.c6(0.0f, j0Var, 0L, 160L, krVar)};
    }

    public final void a(h6 h6Var) {
        if (h6Var != null) {
            this.f14678c = h6Var;
        }
        boolean z10 = false;
        if (h6Var != null) {
            float f10 = h6Var.d;
            float f11 = h6Var.f14585c;
            PointF[] pointFArr = h6Var.f14584b;
            if (!this.f14677b) {
                this.f14679e.e(true, f11);
                this.f14680f.e(true, f10);
                for (int i7 = 0; i7 < Math.min(4, pointFArr.length); i7++) {
                    this.f14681g[i7].e(true, pointFArr[i7].x - f11);
                    this.h[i7].e(true, pointFArr[i7].y - f10);
                }
            }
        }
        if (h6Var != null) {
            z10 = true;
        }
        this.f14677b = z10;
        this.f14676a.run();
    }
}
