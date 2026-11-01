package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class k1 extends View {
    public final Paint f10078a;
    public float f10079b;

    public k1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f10078a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f10078a;
        canvas.drawLine((getWidth() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-5.33f, -4.0f, this.f10079b)), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(5.33f, 0.0f, this.f10079b)), (getWidth() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(5.33f, 3.0f, this.f10079b)), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-5.33f, -7.0f, this.f10079b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(5.33f, 3.0f, this.f10079b)), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(5.33f, 7.0f, this.f10079b)), (getWidth() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-5.33f, -4.0f, this.f10079b)), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-5.33f, 0.0f, this.f10079b)), paint);
    }

    public void setProgress(float f7) {
        this.f10079b = f7;
        invalidate();
    }
}
