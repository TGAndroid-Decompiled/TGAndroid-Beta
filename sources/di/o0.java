package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import bi.ud;
public final class o0 extends LinearLayout {
    public ud f9440a;
    public final Path f9441b;
    public final Paint f9442c;
    public long d;
    public final org.telegram.ui.Components.w5 f9443e;
    public final r0 f9444f;

    public o0(r0 r0Var, Context context) {
        super(context);
        this.f9444f = r0Var;
        this.f9441b = new Path();
        this.f9442c = new Paint(1);
        this.d = 0L;
        this.f9443e = new org.telegram.ui.Components.w5(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f9441b;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        r0 r0Var = this.f9444f;
        t0 t0Var = r0Var.f9677f;
        if (t0Var != null) {
            int b10 = t.b(t0Var.f9773a, t0Var.b(), 3);
            t0 t0Var2 = r0Var.f9677f;
            int b11 = t.b(t0Var2.f9773a, t0Var2.b(), 5);
            canvas.drawColor(b10);
            long j3 = this.d;
            t0 t0Var3 = r0Var.f9677f;
            int i7 = (j3 > t0Var3.f9774b ? 1 : (j3 == t0Var3.f9774b ? 0 : -1));
            org.telegram.ui.Components.w5 w5Var = this.f9443e;
            if (i7 != 0) {
                w5Var.e(true, t0Var3.a());
            }
            float e10 = w5Var.e(false, r0Var.f9677f.a());
            this.d = r0Var.f9677f.f9774b;
            Paint paint = this.f9442c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * e10, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f9440a == null) {
            this.f9440a = new ud(1, 250);
        }
        this.f9440a.f(0, 0, getWidth(), getHeight());
        ud udVar = this.f9440a;
        udVar.h = 30.0f;
        udVar.d();
        this.f9440a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
