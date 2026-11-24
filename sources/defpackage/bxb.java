package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class bxb extends Drawable {
    public Paint a;
    public RectF b;

    @Override
    public final void draw(Canvas canvas) {
        RectF rectF = this.b;
        rectF.set(getBounds());
        rectF.inset(gl.L(1.0f), (rectF.height() - gl.L(28.0f)) / 2.0f);
        canvas.drawRoundRect(rectF, gl.L(14.0f), gl.L(14.0f), this.a);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
