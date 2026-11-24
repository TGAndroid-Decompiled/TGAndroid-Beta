package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.ui.LaunchActivity;
public final class t75 extends TextView {
    public final RectF a;
    public final Paint b;

    public t75(LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = new RectF();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16711936);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), this.b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.b;
        paint.setColor(-16711936);
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), paint);
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
