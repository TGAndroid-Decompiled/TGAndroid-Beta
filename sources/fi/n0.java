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
    public ec f12318a;
    public final Path f12319b;
    public final Paint f12320c;
    public long d;
    public final org.telegram.ui.Components.d6 f12321e;
    public final q0 f12322f;

    public n0(q0 q0Var, Context context) {
        super(context);
        this.f12322f = q0Var;
        this.f12319b = new Path();
        this.f12320c = new Paint(1);
        this.d = 0L;
        this.f12321e = new org.telegram.ui.Components.d6(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f12319b;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        q0 q0Var = this.f12322f;
        s0 s0Var = q0Var.f12489f;
        if (s0Var != null) {
            int b10 = t.b(s0Var.f12551a, s0Var.b(), 3);
            s0 s0Var2 = q0Var.f12489f;
            int b11 = t.b(s0Var2.f12551a, s0Var2.b(), 5);
            canvas.drawColor(b10);
            long j3 = this.d;
            s0 s0Var3 = q0Var.f12489f;
            int i7 = (j3 > s0Var3.f12552b ? 1 : (j3 == s0Var3.f12552b ? 0 : -1));
            org.telegram.ui.Components.d6 d6Var = this.f12321e;
            if (i7 != 0) {
                d6Var.e(true, s0Var3.a());
            }
            float e10 = d6Var.e(false, q0Var.f12489f.a());
            this.d = q0Var.f12489f.f12552b;
            Paint paint = this.f12320c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * e10, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f12318a == null) {
            this.f12318a = new ec(1, 250);
        }
        this.f12318a.f(0, 0, getWidth(), getHeight());
        ec ecVar = this.f12318a;
        ecVar.h = 30.0f;
        ecVar.d();
        this.f12318a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
