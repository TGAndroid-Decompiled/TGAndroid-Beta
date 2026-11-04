package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import ci.lc;
public final class q0 extends LinearLayout {
    public lc f10794a;
    public final Path f10795b;
    public final Paint f10796c;
    public long d;
    public final org.telegram.ui.Components.u5 f10797e;
    public final t0 f10798f;

    public q0(t0 t0Var, Context context) {
        super(context);
        this.f10798f = t0Var;
        this.f10795b = new Path();
        this.f10796c = new Paint(1);
        this.d = 0L;
        this.f10797e = new org.telegram.ui.Components.u5(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f10795b;
        path.rewind();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        t0 t0Var = this.f10798f;
        v0 v0Var = t0Var.f11036f;
        if (v0Var != null) {
            int b10 = u.b(v0Var.f11105a, v0Var.b(), 3);
            v0 v0Var2 = t0Var.f11036f;
            int b11 = u.b(v0Var2.f11105a, v0Var2.b(), 5);
            canvas.drawColor(b10);
            long j10 = this.d;
            v0 v0Var3 = t0Var.f11036f;
            int i3 = (j10 > v0Var3.f11106b ? 1 : (j10 == v0Var3.f11106b ? 0 : -1));
            org.telegram.ui.Components.u5 u5Var = this.f10797e;
            if (i3 != 0) {
                u5Var.e(true, v0Var3.a());
            }
            float e10 = u5Var.e(false, t0Var.f11036f.a());
            this.d = t0Var.f11036f.f11106b;
            Paint paint = this.f10796c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * e10, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f10794a == null) {
            this.f10794a = new lc(1, 250);
        }
        this.f10794a.f(0, 0, getWidth(), getHeight());
        lc lcVar = this.f10794a;
        lcVar.h = 30.0f;
        lcVar.d();
        this.f10794a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
