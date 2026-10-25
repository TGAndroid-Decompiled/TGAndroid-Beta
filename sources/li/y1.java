package li;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
public final class y1 extends Drawable {
    public boolean f17643c;
    public final Paint f17641a = new Paint(1);
    public final org.telegram.ui.Components.h6 f17642b = new org.telegram.ui.Components.h6(new k2.c(this, 7), 420, ds.h, 0);
    public int d = 255;

    public y1(int i10) {
        a(i10);
    }

    public final void a(int i10) {
        this.f17641a.setColor(i10);
    }

    @Override
    public final void draw(Canvas canvas) {
        float e = this.f17642b.e(this.f17643c);
        if (e <= 0.0f) {
            return;
        }
        Paint paint = this.f17641a;
        paint.setAlpha((int) (this.d * e));
        paint.setShadowLayer(AndroidUtilities.dp(12.0f) * e, 0.0f, AndroidUtilities.dp(3.0f), y6.o1(e, 805306368));
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
        this.f17641a.setColorFilter(colorFilter);
    }
}
