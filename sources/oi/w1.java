package oi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lr;
public final class w1 extends Drawable {
    public boolean f22433c;
    public final Paint f22431a = new Paint(1);
    public final org.telegram.ui.Components.c6 f22432b = new org.telegram.ui.Components.c6(new kg.j0(this, 29), 420, lr.h, 0);
    public int d = 255;

    public w1(int i7) {
        a(i7);
    }

    public final void a(int i7) {
        this.f22431a.setColor(i7);
    }

    @Override
    public final void draw(Canvas canvas) {
        float d = this.f22432b.d(this.f22433c);
        if (d <= 0.0f) {
            return;
        }
        Paint paint = this.f22431a;
        paint.setAlpha((int) (this.d * d));
        paint.setShadowLayer(org.telegram.messenger.g0.L(12.0f) * d, 0.0f, org.telegram.messenger.g0.L(3.0f), n6.r1(d, 805306368));
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
        this.f22431a.setColorFilter(colorFilter);
    }
}
