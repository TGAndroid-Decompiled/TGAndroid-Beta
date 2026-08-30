package lh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
public final class s4 extends Drawable {
    public final float f13066a;
    public final Paint f13067b;

    public s4(float f10, int i10) {
        Paint paint = new Paint(1);
        this.f13067b = paint;
        this.f13066a = f10;
        paint.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        Paint paint = this.f13067b;
        float f10 = this.f13066a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        AndroidUtilities.drawStroke(canvas, rectF, f10);
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
