package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import hh.bb;
import org.telegram.messenger.AndroidUtilities;

public final class o0 extends LinearLayout {

    public bb f13731a;

    public final Path f13732b;

    public final Paint f13733c;
    public long d;

    public final org.telegram.ui.Components.y5 f13734e;

    public final r0 f13735f;

    public o0(r0 r0Var, Context context) {
        super(context);
        this.f13735f = r0Var;
        this.f13732b = new Path();
        this.f13733c = new Paint(1);
        this.d = 0L;
        this.f13734e = new org.telegram.ui.Components.y5(this, 0L, 1000L, new LinearInterpolator());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Path path = this.f13732b;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        r0 r0Var = this.f13735f;
        t0 t0Var = r0Var.f13883f;
        if (t0Var != null) {
            int iB = s.b(t0Var.f13985a, t0Var.b(), 3);
            t0 t0Var2 = r0Var.f13883f;
            int iB2 = s.b(t0Var2.f13985a, t0Var2.b(), 5);
            canvas.drawColor(iB);
            long j10 = this.d;
            t0 t0Var3 = r0Var.f13883f;
            long j11 = t0Var3.f13986b;
            org.telegram.ui.Components.y5 y5Var = this.f13734e;
            if (j10 != j11) {
                y5Var.d(t0Var3.a(), true);
            }
            float fD = y5Var.d(r0Var.f13883f.a(), false);
            this.d = r0Var.f13883f.f13986b;
            Paint paint = this.f13733c;
            paint.setColor(iB2);
            paint.setAlpha(127);
            canvas2 = canvas;
            canvas2.drawRect(getWidth() * fD, 0.0f, getWidth(), getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        if (this.f13731a == null) {
            this.f13731a = new bb(1, 250);
        }
        this.f13731a.f(0, 0, getWidth(), getHeight());
        bb bbVar = this.f13731a;
        bbVar.h = 30.0f;
        bbVar.d();
        this.f13731a.b(canvas2, -1, 0.85f);
        invalidate();
        canvas2.restore();
        super.dispatchDraw(canvas2);
    }
}
