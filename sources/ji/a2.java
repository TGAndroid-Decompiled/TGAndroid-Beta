package ji;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
public final class a2 extends Drawable {
    public final Paint f13124a;
    public final org.telegram.ui.Components.g6 f13125b;
    public boolean f13126c;
    public int d;

    public a2(int i10) {
        Paint paint = new Paint(1);
        this.f13124a = paint;
        this.f13125b = new org.telegram.ui.Components.g6(new ig.t0(this, 10), 420L, es.h, 0);
        this.d = 255;
        paint.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        float e = this.f13125b.e(this.f13126c);
        if (e <= 0.0f) {
            return;
        }
        Paint paint = this.f13124a;
        paint.setAlpha((int) (this.d * e));
        paint.setShadowLayer(AndroidUtilities.dp(12.0f) * e, 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.m1(e, 805306368));
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
        this.f13124a.setColorFilter(colorFilter);
    }
}
