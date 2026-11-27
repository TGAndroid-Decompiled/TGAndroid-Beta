package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class lp9 extends Drawable {
    public static Paint c;
    public final byte a;
    public Paint b;

    public lp9(byte b) {
        this.a = b;
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY() - hl.L(1.0f), (getBounds().width() - hl.L(8.0f)) / 2.0f, this.b);
                return;
            default:
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), Math.max(bounds.width(), bounds.height()) / 2, this.b);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return 0;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(i);
                return;
            default:
                return;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
    }

    private final void a(int i) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    private final void c(ColorFilter colorFilter) {
    }
}
