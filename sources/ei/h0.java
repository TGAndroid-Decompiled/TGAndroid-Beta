package ei;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import ci.rc;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
public final class h0 extends Drawable {
    public final Paint f9085a = new Paint(1);
    public final RectF f9086b = new RectF();
    public final int f9087c;
    public final Path d;
    public boolean f9088e;
    public int f9089f;
    public final g6 f9090g;
    public final g6 h;

    public h0(int i10) {
        Path path = new Path();
        this.d = path;
        rc rcVar = new rc(this, 6);
        is isVar = is.h;
        this.f9090g = new g6(rcVar, 320L, isVar, 0);
        this.h = new g6(new rc(this, 6), 320L, isVar, 0);
        this.f9087c = i10;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f9086b;
        rectF.set(bounds);
        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int i10 = this.f9087c;
        Paint paint = this.f9085a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        float e7 = this.f9090g.e(this.f9088e);
        float dp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.h.d(this.f9089f, false);
        if (e7 > 0.0f) {
            canvas.save();
            canvas.translate(dp, com.google.android.gms.internal.vision.e2.y(1.0f, e7, AndroidUtilities.dp(6.16f), AndroidUtilities.dp(8.0f)));
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
