package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class vg9 extends Drawable {
    public boolean c;
    public final Paint a = new Paint(1);
    public final mm b = new mm(new v59(this, (byte) 7), 420, k43.h, 0);
    public int d = 255;

    public vg9(int i) {
        a(i);
    }

    public final void a(int i) {
        this.a.setColor(i);
    }

    @Override
    public final void draw(Canvas canvas) {
        float d = this.b.d(this.c);
        if (d <= 0.0f) {
            return;
        }
        Paint paint = this.a;
        paint.setAlpha((int) (this.d * d));
        paint.setShadowLayer(hl.L(12.0f) * d, 0.0f, hl.L(3.0f), aob.p1(d, 805306368));
        Rect bounds = getBounds();
        float L = hl.L(8.0f) * d;
        float L2 = hl.L(0.0f) * d;
        float L3 = hl.L(12.0f) * d;
        canvas.drawRoundRect(bounds.left + L, bounds.top + L2, bounds.right - L, (hl.L(6.0f) * d) + (bounds.bottom - L2), L3, L3, paint);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.d = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
