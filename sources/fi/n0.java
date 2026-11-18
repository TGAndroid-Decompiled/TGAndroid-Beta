package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import di.ec;
public final class n0 extends LinearLayout {
    public ec f12283a;
    public final Path f12284b;
    public final Paint f12285c;
    public long d;
    public final org.telegram.ui.Components.c6 f12286e;
    public final q0 f12287f;

    public n0(q0 q0Var, Context context) {
        super(context);
        this.f12287f = q0Var;
        this.f12284b = new Path();
        this.f12285c = new Paint(1);
        this.d = 0L;
        this.f12286e = new org.telegram.ui.Components.c6(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f12284b;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        q0 q0Var = this.f12287f;
        s0 s0Var = q0Var.f12452f;
        if (s0Var != null) {
            int b10 = t.b(s0Var.f12514a, s0Var.b(), 3);
            s0 s0Var2 = q0Var.f12452f;
            int b11 = t.b(s0Var2.f12514a, s0Var2.b(), 5);
            canvas.drawColor(b10);
            long j3 = this.d;
            s0 s0Var3 = q0Var.f12452f;
            int i7 = (j3 > s0Var3.f12515b ? 1 : (j3 == s0Var3.f12515b ? 0 : -1));
            org.telegram.ui.Components.c6 c6Var = this.f12286e;
            if (i7 != 0) {
                c6Var.e(true, s0Var3.a());
            }
            float e10 = c6Var.e(false, q0Var.f12452f.a());
            this.d = q0Var.f12452f.f12515b;
            Paint paint = this.f12285c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * e10, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f12283a == null) {
            this.f12283a = new ec(1, 250);
        }
        this.f12283a.f(0, 0, getWidth(), getHeight());
        ec ecVar = this.f12283a;
        ecVar.h = 30.0f;
        ecVar.d();
        this.f12283a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
