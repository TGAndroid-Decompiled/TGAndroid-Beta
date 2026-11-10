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
    public ud f9423a;
    public final Path f9424b;
    public final Paint f9425c;
    public long d;
    public final org.telegram.ui.Components.v5 f9426e;
    public final r0 f9427f;

    public o0(r0 r0Var, Context context) {
        super(context);
        this.f9427f = r0Var;
        this.f9424b = new Path();
        this.f9425c = new Paint(1);
        this.d = 0L;
        this.f9426e = new org.telegram.ui.Components.v5(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f9424b;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        r0 r0Var = this.f9427f;
        t0 t0Var = r0Var.f9669f;
        if (t0Var != null) {
            int b10 = t.b(t0Var.f9772a, t0Var.b(), 3);
            t0 t0Var2 = r0Var.f9669f;
            int b11 = t.b(t0Var2.f9772a, t0Var2.b(), 5);
            canvas.drawColor(b10);
            long j3 = this.d;
            t0 t0Var3 = r0Var.f9669f;
            int i7 = (j3 > t0Var3.f9773b ? 1 : (j3 == t0Var3.f9773b ? 0 : -1));
            org.telegram.ui.Components.v5 v5Var = this.f9426e;
            if (i7 != 0) {
                v5Var.e(true, t0Var3.a());
            }
            float e10 = v5Var.e(false, r0Var.f9669f.a());
            this.d = r0Var.f9669f.f9773b;
            Paint paint = this.f9425c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * e10, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f9423a == null) {
            this.f9423a = new ud(1, 250);
        }
        this.f9423a.f(0, 0, getWidth(), getHeight());
        ud udVar = this.f9423a;
        udVar.h = 30.0f;
        udVar.d();
        this.f9423a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
