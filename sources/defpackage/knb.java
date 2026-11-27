package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class knb extends Drawable {
    public final int a;
    public final int b;

    public knb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.a;
        int i2 = this.b;
        canvas.drawCircle((bounds.centerX() - i) + i2, bounds.centerY(), (Math.max(bounds.width(), bounds.height()) / 2) + i + i2, aob.z);
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
