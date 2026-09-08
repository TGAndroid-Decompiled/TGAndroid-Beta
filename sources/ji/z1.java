package ji;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class z1 extends Drawable {
    public final Paint f14397a;
    public final org.telegram.ui.Components.e6 f14398b;
    public boolean f14399c;
    public int d;

    public z1(int i10) {
        Paint paint = new Paint(1);
        this.f14397a = paint;
        this.f14398b = new org.telegram.ui.Components.e6(new ig.t0(this, 10), 420L, pr.h, 0);
        this.d = 255;
        paint.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        float e7 = this.f14398b.e(this.f14399c);
        if (e7 <= 0.0f) {
            return;
        }
        Paint paint = this.f14397a;
        paint.setAlpha((int) (this.d * e7));
        paint.setShadowLayer(AndroidUtilities.dp(12.0f) * e7, 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.l1(e7, 805306368));
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
        this.f14397a.setColorFilter(colorFilter);
    }
}
