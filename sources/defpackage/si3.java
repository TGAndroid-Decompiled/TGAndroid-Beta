package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class si3 extends Drawable {
    public final byte a;
    public Paint b;
    public RectF c;

    public si3(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.c = new RectF();
                this.b = new Paint(1);
                return;
            default:
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                RectF rectF = this.c;
                rectF.set(getBounds());
                rectF.inset(0.0f, (rectF.height() - gl.L(28.0f)) / 2.0f);
                canvas.drawRoundRect(rectF, gl.L(14.0f), gl.L(14.0f), this.b);
                return;
            case 1:
                RectF rectF2 = this.c;
                rectF2.set(0.0f, 0.0f, gl.L(30.0f), gl.L(30.0f));
                canvas.drawRoundRect(rectF2, gl.N(8.0f), gl.N(8.0f), this.b);
                return;
            default:
                RectF rectF3 = this.c;
                rectF3.set(getBounds());
                float height = rectF3.height() * 0.2f;
                canvas.drawRoundRect(rectF3, height, height, this.b);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -2;
            case 1:
            default:
                return -3;
        }
    }

    @Override
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(i);
                return;
            case 1:
                this.b.setAlpha(i);
                return;
            default:
                this.b.setAlpha(i);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
            case 1:
                return;
            default:
                this.b.setColorFilter(colorFilter);
                return;
        }
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    public si3(int i) {
        this.a = (byte) 1;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new RectF();
        paint.setAlpha(45);
        paint.setColor(i);
    }
}
