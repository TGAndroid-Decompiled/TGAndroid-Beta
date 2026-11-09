package li;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.xq;
public final class y1 extends Drawable {
    public boolean f18997c;
    public final Paint f18995a = new Paint(1);
    public final org.telegram.ui.Components.w5 f18996b = new org.telegram.ui.Components.w5(new l2.a0(this, 6), 420, xq.h, 0);
    public int d = 255;

    public y1(int i7) {
        a(i7);
    }

    public final void a(int i7) {
        this.f18995a.setColor(i7);
    }

    @Override
    public final void draw(Canvas canvas) {
        float d = this.f18996b.d(this.f18997c);
        if (d <= 0.0f) {
            return;
        }
        Paint paint = this.f18995a;
        paint.setAlpha((int) (this.d * d));
        paint.setShadowLayer(org.telegram.messenger.g0.L(12.0f) * d, 0.0f, org.telegram.messenger.g0.L(3.0f), l6.r1(d, 805306368));
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
    public final void setAlpha(int i7) {
        this.d = i7;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f18995a.setColorFilter(colorFilter);
    }
}
