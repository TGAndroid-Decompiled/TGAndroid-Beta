package jh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class t4 extends Drawable {
    public final float f12838a;
    public final Paint f12839b;

    public t4(float f9, int i10) {
        Paint paint = new Paint(1);
        this.f12839b = paint;
        this.f12838a = f9;
        paint.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        Paint paint = this.f12839b;
        float f9 = this.f12838a;
        canvas.drawRoundRect(rectF, f9, f9, paint);
        AndroidUtilities.drawStroke(canvas, rectF, f9);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
