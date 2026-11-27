package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class gm7 extends Drawable {
    public final Paint a;
    public final RectF b;
    public final float c;
    public float d;

    public gm7(int i, float f) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new RectF();
        paint.setColor(i);
        this.c = f;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.b;
        rectF.set(bounds);
        float f = this.d;
        float f2 = this.c;
        canvas.drawRoundRect(rectF, f2 * f, f2 * f, this.a);
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void setAlpha(int i) {
        this.d = i / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
