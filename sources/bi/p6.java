package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class p6 extends Drawable {
    public final float f5230a;
    public final Paint f5231b;

    public p6(float f7, int i10) {
        Paint paint = new Paint(1);
        this.f5231b = paint;
        this.f5230a = f7;
        paint.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        Paint paint = this.f5231b;
        float f7 = this.f5230a;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        AndroidUtilities.drawStroke(canvas, rectF, f7);
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
