package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class rjb extends Drawable {
    public final RectF a = new RectF();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;

    public rjb(int i, int i2, int i3, int i4, float f) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.a;
        rectF.set(bounds);
        rectF.left += this.b;
        rectF.top += this.c;
        rectF.right -= this.d;
        rectF.bottom -= this.e;
        float f = this.f;
        canvas.drawRoundRect(rectF, f, f, bkb.z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
