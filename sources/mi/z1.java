package mi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xq;
public final class z1 extends Drawable {
    public boolean f20084c;
    public final Paint f20082a = new Paint(1);
    public final org.telegram.ui.Components.u5 f20083b = new org.telegram.ui.Components.u5(new lg.n(this, 14), 420, xq.h, 0);
    public int d = 255;

    public z1(int i3) {
        a(i3);
    }

    public final void a(int i3) {
        this.f20082a.setColor(i3);
    }

    @Override
    public final void draw(Canvas canvas) {
        float d = this.f20083b.d(this.f20084c);
        if (d <= 0.0f) {
            return;
        }
        Paint paint = this.f20082a;
        paint.setAlpha((int) (this.d * d));
        paint.setShadowLayer(org.telegram.messenger.g0.L(12.0f) * d, 0.0f, org.telegram.messenger.g0.L(3.0f), k6.r1(d, 805306368));
        Rect bounds = getBounds();
        float L = org.telegram.messenger.g0.L(8.0f) * d;
        float L2 = org.telegram.messenger.g0.L(0.0f) * d;
        float L3 = org.telegram.messenger.g0.L(12.0f) * d;
        canvas.drawRoundRect(bounds.left + L, bounds.top + L2, bounds.right - L, (org.telegram.messenger.g0.L(6.0f) * d) + (bounds.bottom - L2), L3, L3, paint);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.d = i3;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20082a.setColorFilter(colorFilter);
    }
}
