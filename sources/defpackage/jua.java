package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class jua extends Drawable {
    public final float a;
    public final Paint b;

    public jua(float f, int i) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.a = f;
        paint.setColor(i);
    }

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = hl.P;
        rectF.set(getBounds());
        Paint paint = this.b;
        float f = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
        hl.P(canvas, rectF, f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
