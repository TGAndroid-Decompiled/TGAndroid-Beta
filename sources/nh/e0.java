package nh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.y5;

public final class e0 extends Drawable {

    public final Paint f18657a = new Paint(1);

    public final RectF f18658b = new RectF();

    public final int f18659c;
    public final Path d;

    public boolean f18660e;

    public int f18661f;

    public final y5 f18662g;
    public final y5 h;

    public e0(int i10) {
        Path path = new Path();
        this.d = path;
        kh.c cVar = new kh.c(this, 29);
        er erVar = er.h;
        this.f18662g = new y5(cVar, 320L, erVar, 0);
        this.h = new y5(new kh.c(this, 29), 320L, erVar, 0);
        this.f18659c = i10;
        path.moveTo(-AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(AndroidUtilities.dp(6.5f), 0.0f);
        path.lineTo(0.0f, -AndroidUtilities.dp(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f18658b;
        rectF.set(bounds);
        rectF.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int i10 = this.f18659c;
        Paint paint = this.f18657a;
        canvas.drawRoundRect(rectF, i10, i10, paint);
        float fE = this.f18662g.e(this.f18660e);
        float fDp = (rectF.right + AndroidUtilities.dp(8.0f)) - this.h.d(this.f18661f, false);
        if (fE > 0.0f) {
            canvas.save();
            canvas.translate(fDp, com.google.android.recaptcha.internal.a.z(1.0f, fE, AndroidUtilities.dp(6.16f), AndroidUtilities.dp(8.0f)));
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
