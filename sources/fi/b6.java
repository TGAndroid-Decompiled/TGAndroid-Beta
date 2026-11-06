package fi;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.xq;
public final class b6 {
    public final a0 f11681a;
    public boolean f11682b;
    public a6 f11683c;
    public final org.telegram.ui.Components.w5 d;
    public final org.telegram.ui.Components.w5 f11684e;
    public final org.telegram.ui.Components.w5 f11685f;
    public final org.telegram.ui.Components.w5[] f11686g;
    public final org.telegram.ui.Components.w5[] h;
    public final Paint f11687i;
    public final Path f11688j;

    public b6(a0 a0Var) {
        Paint paint = new Paint(1);
        this.f11687i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.0804527E9f, 0.0f, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(6.0f));
        this.f11688j = new Path();
        this.f11681a = a0Var;
        xq xqVar = xq.f40346g;
        this.d = new org.telegram.ui.Components.w5(0.0f, a0Var, 0L, 320L, xqVar);
        this.f11684e = new org.telegram.ui.Components.w5(0.0f, a0Var, 0L, 160L, xqVar);
        this.f11685f = new org.telegram.ui.Components.w5(0.0f, a0Var, 0L, 160L, xqVar);
        this.f11686g = new org.telegram.ui.Components.w5[]{new org.telegram.ui.Components.w5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.w5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.w5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.w5(0.0f, a0Var, 0L, 160L, xqVar)};
        this.h = new org.telegram.ui.Components.w5[]{new org.telegram.ui.Components.w5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.w5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.w5(0.0f, a0Var, 0L, 160L, xqVar), new org.telegram.ui.Components.w5(0.0f, a0Var, 0L, 160L, xqVar)};
    }

    public final void a(a6 a6Var) {
        if (a6Var != null) {
            this.f11683c = a6Var;
        }
        boolean z9 = false;
        if (a6Var != null) {
            float f10 = a6Var.d;
            float f11 = a6Var.f11608c;
            PointF[] pointFArr = a6Var.f11607b;
            if (!this.f11682b) {
                this.f11684e.e(true, f11);
                this.f11685f.e(true, f10);
                for (int i7 = 0; i7 < Math.min(4, pointFArr.length); i7++) {
                    this.f11686g[i7].e(true, pointFArr[i7].x - f11);
                    this.h[i7].e(true, pointFArr[i7].y - f10);
                }
            }
        }
        if (a6Var != null) {
            z9 = true;
        }
        this.f11682b = z9;
        this.f11681a.run();
    }
}
