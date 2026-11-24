package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class xm9 extends FrameLayout {
    public final Paint a;
    public final xo8 b;
    public final RectF c;
    public final float d;
    public float e;

    public xm9(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        xo8 xo8Var = new xo8(this, (byte) 1);
        this.b = xo8Var;
        this.c = new RectF();
        this.d = (gm.L(3.0f) * 0.5f) + gm.L(5.0f);
        a(paint, 0.2f);
        a(xo8Var, 1.0f);
        setWillNotDraw(false);
    }

    public static void a(Paint paint, float f) {
        paint.setColor(-1);
        paint.setAlpha(Math.round(f * 255.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f = this.d;
        RectF rectF = this.c;
        rectF.set(f, f, getWidth() - f, getHeight() - f);
        canvas.drawOval(rectF, this.a);
        canvas.drawArc(rectF, -90.0f, this.e * 360.0f, false, this.b);
    }

    public Paint getPaint() {
        return this.b;
    }

    public void setProgress(float f) {
        float max = Math.max(0.0f, Math.min(1.0f, f));
        if (this.e == max) {
            return;
        }
        this.e = max;
        invalidate();
    }
}
