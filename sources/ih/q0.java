package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import gh.bb;
import org.telegram.messenger.AndroidUtilities;
public final class q0 extends LinearLayout {
    public bb f11990a;
    public final Path f11991b;
    public final Paint f11992c;
    public long d;
    public final org.telegram.ui.Components.y5 f11993e;
    public final t0 f11994f;

    public q0(t0 t0Var, Context context) {
        super(context);
        this.f11994f = t0Var;
        this.f11991b = new Path();
        this.f11992c = new Paint(1);
        this.d = 0L;
        this.f11993e = new org.telegram.ui.Components.y5(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f11991b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        t0 t0Var = this.f11994f;
        v0 v0Var = t0Var.f12146f;
        if (v0Var != null) {
            int b10 = u.b(v0Var.f12220a, v0Var.b(), 3);
            v0 v0Var2 = t0Var.f12146f;
            int b11 = u.b(v0Var2.f12220a, v0Var2.b(), 5);
            canvas.drawColor(b10);
            long j10 = this.d;
            v0 v0Var3 = t0Var.f12146f;
            long j11 = v0Var3.f12221b;
            org.telegram.ui.Components.y5 y5Var = this.f11993e;
            if (j10 != j11) {
                y5Var.d(v0Var3.a(), true);
            }
            float d = y5Var.d(t0Var.f12146f.a(), false);
            this.d = t0Var.f12146f.f12221b;
            Paint paint = this.f11992c;
            paint.setColor(b11);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * d, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f11990a == null) {
            this.f11990a = new bb(1, 250);
        }
        this.f11990a.f(0, 0, getWidth(), getHeight());
        bb bbVar = this.f11990a;
        bbVar.h = 30.0f;
        bbVar.d();
        this.f11990a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
