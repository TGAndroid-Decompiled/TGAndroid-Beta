package di;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class p5 extends Drawable {
    public final float f9507a;
    public final Paint f9508b;

    public p5(float f10, int i7) {
        Paint paint = new Paint(1);
        this.f9508b = paint;
        this.f9507a = f10;
        paint.setColor(i7);
    }

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        Paint paint = this.f9508b;
        float f10 = this.f9507a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        org.telegram.messenger.g0.P(canvas, rectF, f10);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
