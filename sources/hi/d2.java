package hi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;
public final class d2 extends Drawable {
    public final Paint f9515a;
    public final org.telegram.ui.Components.d6 f9516b;
    public boolean f9517c;
    public int d;

    public d2(int i10) {
        Paint paint = new Paint(1);
        this.f9515a = paint;
        this.f9516b = new org.telegram.ui.Components.d6(new gg.v1(this, 7), 420L, wr.h, 0);
        this.d = 255;
        paint.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        float e = this.f9516b.e(this.f9517c);
        if (e <= 0.0f) {
            return;
        }
        Paint paint = this.f9515a;
        paint.setAlpha((int) (this.d * e));
        paint.setShadowLayer(AndroidUtilities.dp(12.0f) * e, 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.l1(e, 805306368));
        Rect bounds = getBounds();
        float dp = AndroidUtilities.dp(8.0f) * e;
        float dp2 = AndroidUtilities.dp(0.0f) * e;
        float dp3 = AndroidUtilities.dp(12.0f) * e;
        canvas.drawRoundRect(bounds.left + dp, bounds.top + dp2, bounds.right - dp, (AndroidUtilities.dp(6.0f) * e) + (bounds.bottom - dp2), dp3, dp3, paint);
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
        this.f9515a.setColorFilter(colorFilter);
    }
}
