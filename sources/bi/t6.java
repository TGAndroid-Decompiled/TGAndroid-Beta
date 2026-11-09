package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class t6 extends Drawable {
    public final float f4747a;
    public final Paint f4748b;

    public t6(float f10, int i7) {
        Paint paint = new Paint(1);
        this.f4748b = paint;
        this.f4747a = f10;
        paint.setColor(i7);
    }

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getBounds());
        Paint paint = this.f4748b;
        float f10 = this.f4747a;
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
