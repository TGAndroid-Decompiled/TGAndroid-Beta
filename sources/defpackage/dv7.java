package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class dv7 extends View {
    public final Paint a;
    public float b;

    public dv7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(hl.L(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.a;
        canvas.drawLine((getWidth() / 2.0f) + hl.L(hl.R1(-5.33f, -4.0f, this.b)), (getHeight() / 2.0f) + hl.L(hl.R1(5.33f, 0.0f, this.b)), (getWidth() / 2.0f) + hl.L(hl.R1(5.33f, 3.0f, this.b)), (getHeight() / 2.0f) + hl.L(hl.R1(-5.33f, -7.0f, this.b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + hl.L(hl.R1(5.33f, 3.0f, this.b)), (getHeight() / 2.0f) + hl.L(hl.R1(5.33f, 7.0f, this.b)), (getWidth() / 2.0f) + hl.L(hl.R1(-5.33f, -4.0f, this.b)), (getHeight() / 2.0f) + hl.L(hl.R1(-5.33f, 0.0f, this.b)), paint);
    }

    public void setProgress(float f) {
        this.b = f;
        invalidate();
    }
}
