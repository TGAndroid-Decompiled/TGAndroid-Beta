package di;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import bi.wc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.wr;
public final class k0 extends Drawable {
    public final Paint f6720a = new Paint(1);
    public final RectF f6721b = new RectF();
    public final int f6722c;
    public final Path d;
    public boolean e;
    public int f6723f;
    public final d6 f6724g;
    public final d6 h;

    public k0(int i10) {
        Path path = new Path();
        this.d = path;
        wc wcVar = new wc(this, 12);
        wr wrVar = wr.h;
        this.f6724g = new d6(wcVar, 320L, wrVar, 0);
        this.h = new d6(new wc(this, 12), 320L, wrVar, 0);
        this.f6722c = i10;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f6721b;
        rectF.set(bounds);
        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int i10 = this.f6722c;
        Paint paint = this.f6720a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        float e = this.f6724g.e(this.e);
        float dp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.h.d(this.f6723f, false);
        if (e > 0.0f) {
            canvas.save();
            canvas.translate(dp, com.google.android.gms.internal.vision.e2.z(1.0f, e, AndroidUtilities.dp(6.16f), AndroidUtilities.dp(8.0f)));
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
