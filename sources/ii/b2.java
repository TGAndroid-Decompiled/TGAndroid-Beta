package ii;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.js;
public final class b2 extends Drawable {
    public final Paint f12282a;
    public final org.telegram.ui.Components.g6 f12283b;
    public boolean f12284c;
    public int d;

    public b2(int i10) {
        Paint paint = new Paint(1);
        this.f12282a = paint;
        this.f12283b = new org.telegram.ui.Components.g6(new i2.h0(this, 5), 420L, js.h, 0);
        this.d = 255;
        paint.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        float e7 = this.f12283b.e(this.f12284c);
        if (e7 <= 0.0f) {
            return;
        }
        Paint paint = this.f12282a;
        paint.setAlpha((int) (this.d * e7));
        paint.setShadowLayer(AndroidUtilities.dp(12.0f) * e7, 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.m1(e7, 805306368));
        Rect bounds = getBounds();
        float dp = AndroidUtilities.dp(8.0f) * e7;
        float dp2 = AndroidUtilities.dp(0.0f) * e7;
        float dp3 = AndroidUtilities.dp(12.0f) * e7;
        canvas.drawRoundRect(bounds.left + dp, bounds.top + dp2, bounds.right - dp, (AndroidUtilities.dp(6.0f) * e7) + (bounds.bottom - dp2), dp3, dp3, paint);
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
        this.f12282a.setColorFilter(colorFilter);
    }
}
