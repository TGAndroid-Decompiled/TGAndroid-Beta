package ii;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public final class b2 extends Drawable {
    public final Paint f12238a;
    public final org.telegram.ui.Components.e6 f12239b;
    public boolean f12240c;
    public int d;

    public b2(int i10) {
        Paint paint = new Paint(1);
        this.f12238a = paint;
        this.f12239b = new org.telegram.ui.Components.e6(new i2.h0(this, 5), 420L, tr.h, 0);
        this.d = 255;
        paint.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        float e7 = this.f12239b.e(this.f12240c);
        if (e7 <= 0.0f) {
            return;
        }
        Paint paint = this.f12238a;
        paint.setAlpha((int) (this.d * e7));
        paint.setShadowLayer(AndroidUtilities.dp(12.0f) * e7, 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.i6.l1(e7, 805306368));
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
        this.f12238a.setColorFilter(colorFilter);
    }
}
