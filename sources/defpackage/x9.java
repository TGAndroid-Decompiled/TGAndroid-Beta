package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class x9 extends Drawable {
    public final byte a;
    public int b;
    public Object c;

    public x9(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                return;
            default:
                this.b = 255;
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                return;
            default:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, (Paint) this.c);
                return;
        }
    }

    @Override
    public final int getAlpha() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.getAlpha();
        }
    }

    @Override
    public final ColorFilter getColorFilter() {
        switch (this.a) {
            case 0:
                return (ColorFilter) this.c;
            default:
                return super.getColorFilter();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return this.b;
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return this.b;
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -1;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                this.b = i;
                return;
            default:
                ((Paint) this.c).setAlpha(i);
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                this.c = colorFilter;
                return;
            default:
                return;
        }
    }

    private final void a(Canvas canvas) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
