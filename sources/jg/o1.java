package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class o1 extends View {
    public final Paint f10123a;
    public float f10124b;

    public o1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f10123a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f10123a;
        canvas.drawLine((getWidth() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-6.7f, -7.0f, this.f10124b)), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(0.71f, 0.0f, this.f10124b)), (getWidth() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-2.45f, 7.0f, this.f10124b)), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(4.79f, 0.0f, this.f10124b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-2.45f, 0.0f, this.f10124b)), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(4.79f, 7.0f, this.f10124b)), (getWidth() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(6.59f, 0.0f, this.f10124b)), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-4.27f, -7.0f, this.f10124b)), paint);
    }

    public void setProgress(float f7) {
        this.f10124b = f7;
        invalidate();
    }
}
