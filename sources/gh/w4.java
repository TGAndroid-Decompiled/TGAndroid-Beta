package gh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends Drawable {
    public final float f9092a;
    public final Paint f9093b;

    public w4(float f10, int i9) {
        Paint paint = new Paint(1);
        this.f9093b = paint;
        this.f9092a = f10;
        paint.setColor(i9);
    }

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        Paint paint = this.f9093b;
        float f10 = this.f9092a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        AndroidUtilities.drawStroke(canvas, rectF, f10);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
