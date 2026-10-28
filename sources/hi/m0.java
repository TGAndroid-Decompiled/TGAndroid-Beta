package hi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import fi.ua;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
public final class m0 extends Drawable {
    public final Paint f13091a = new Paint(1);
    public final RectF f13092b = new RectF();
    public final int f13093c;
    public final Path d;
    public boolean e;
    public int f13094f;
    public final h6 f13095g;
    public final h6 h;

    public m0(int i10) {
        Path path = new Path();
        this.d = path;
        ua uaVar = new ua(this, 7);
        ds dsVar = ds.h;
        this.f13095g = new h6(uaVar, 320L, dsVar, 0);
        this.h = new h6(new ua(this, 7), 320L, dsVar, 0);
        this.f13093c = i10;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f13092b;
        rectF.set(bounds);
        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int i10 = this.f13093c;
        Paint paint = this.f13091a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        float e = this.f13095g.e(this.e);
        float dp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.h.d(this.f13094f, false);
        if (e > 0.0f) {
            canvas.save();
            canvas.translate(dp, c3.h0.z(1.0f, e, AndroidUtilities.dp(6.16f), AndroidUtilities.dp(8.0f)));
            canvas.drawPath(this.d, paint);
            canvas.restore();
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
