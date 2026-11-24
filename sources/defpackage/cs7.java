package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class cs7 extends View {
    public final Paint a;
    public float b;

    public cs7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gl.L(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.a;
        canvas.drawLine((getWidth() / 2.0f) + gl.L(gl.R1(-6.7f, -7.0f, this.b)), (getHeight() / 2.0f) + gl.L(gl.R1(0.71f, 0.0f, this.b)), (getWidth() / 2.0f) + gl.L(gl.R1(-2.45f, 7.0f, this.b)), (getHeight() / 2.0f) + gl.L(gl.R1(4.79f, 0.0f, this.b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + gl.L(gl.R1(-2.45f, 0.0f, this.b)), (getHeight() / 2.0f) + gl.L(gl.R1(4.79f, 7.0f, this.b)), (getWidth() / 2.0f) + gl.L(gl.R1(6.59f, 0.0f, this.b)), (getHeight() / 2.0f) + gl.L(gl.R1(-4.27f, -7.0f, this.b)), paint);
    }

    public void setProgress(float f) {
        this.b = f;
        invalidate();
    }
}
