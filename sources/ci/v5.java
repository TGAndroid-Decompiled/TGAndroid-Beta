package ci;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class v5 extends Drawable {
    public final float f6180a;
    public final Paint f6181b;

    public v5(float f10, int i3) {
        Paint paint = new Paint(1);
        this.f6181b = paint;
        this.f6180a = f10;
        paint.setColor(i3);
    }

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        Paint paint = this.f6181b;
        float f10 = this.f6180a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        org.telegram.messenger.g0.P(canvas, rectF, f10);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
