package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.gr;
public final class h2 extends Drawable {
    public boolean f3053c;
    public final Paint f3051a = new Paint(1);
    public final org.telegram.ui.Components.t5 f3052b = new org.telegram.ui.Components.t5(new a3.d(this, 22), 420, gr.h, 0);
    public int d = 255;

    public h2(int i10) {
        a(i10);
    }

    public final void a(int i10) {
        this.f3051a.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        float d = this.f3052b.d(this.f3053c);
        if (d <= 0.0f) {
            return;
        }
        Paint paint = this.f3051a;
        paint.setAlpha((int) (this.d * d));
        paint.setShadowLayer(org.telegram.messenger.i0.L(12.0f) * d, 0.0f, org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.r1(d, 805306368));
        Rect bounds = getBounds();
        float L = org.telegram.messenger.i0.L(8.0f) * d;
        float L2 = org.telegram.messenger.i0.L(0.0f) * d;
        float L3 = org.telegram.messenger.i0.L(12.0f) * d;
        canvas.drawRoundRect(bounds.left + L, bounds.top + L2, bounds.right - L, (org.telegram.messenger.i0.L(6.0f) * d) + (bounds.bottom - L2), L3, L3, paint);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.d = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3051a.setColorFilter(colorFilter);
    }
}
