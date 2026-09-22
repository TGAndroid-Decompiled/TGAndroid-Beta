package ei;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import ci.uc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.qr;
public final class h0 extends Drawable {
    public final Paint f8368a = new Paint(1);
    public final RectF f8369b = new RectF();
    public final int f8370c;
    public final Path d;
    public boolean e;
    public int f8371f;
    public final d6 f8372g;
    public final d6 h;

    public h0(int i10) {
        Path path = new Path();
        this.d = path;
        uc ucVar = new uc(this, 6);
        qr qrVar = qr.h;
        this.f8372g = new d6(ucVar, 320L, qrVar, 0);
        this.h = new d6(new uc(this, 6), 320L, qrVar, 0);
        this.f8370c = i10;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f8369b;
        rectF.set(bounds);
        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int i10 = this.f8370c;
        Paint paint = this.f8368a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        float e = this.f8372g.e(this.e);
        float dp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.h.d(this.f8371f, false);
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
