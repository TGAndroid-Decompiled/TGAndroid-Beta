package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import di.bc;
public final class o0 extends LinearLayout {
    public bc f12098a;
    public final Path f12099b;
    public final Paint f12100c;
    public long d;
    public final org.telegram.ui.Components.u5 f12101e;
    public final r0 f12102f;

    public o0(r0 r0Var, Context context) {
        super(context);
        this.f12102f = r0Var;
        this.f12099b = new Path();
        this.f12100c = new Paint(1);
        this.d = 0L;
        this.f12101e = new org.telegram.ui.Components.u5(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f12099b;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        r0 r0Var = this.f12102f;
        t0 t0Var = r0Var.f12256f;
        if (t0Var != null) {
            int b10 = t.b(t0Var.f12346a, t0Var.b(), 3);
            t0 t0Var2 = r0Var.f12256f;
            int b11 = t.b(t0Var2.f12346a, t0Var2.b(), 5);
            canvas.drawColor(b10);
            long j3 = this.d;
            t0 t0Var3 = r0Var.f12256f;
            int i7 = (j3 > t0Var3.f12347b ? 1 : (j3 == t0Var3.f12347b ? 0 : -1));
            org.telegram.ui.Components.u5 u5Var = this.f12101e;
            if (i7 != 0) {
                u5Var.e(true, t0Var3.a());
            }
            float e10 = u5Var.e(false, r0Var.f12256f.a());
            this.d = r0Var.f12256f.f12347b;
            Paint paint = this.f12100c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * e10, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f12098a == null) {
            this.f12098a = new bc(1, 250);
        }
        this.f12098a.f(0, 0, getWidth(), getHeight());
        bc bcVar = this.f12098a;
        bcVar.h = 30.0f;
        bcVar.d();
        this.f12098a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
