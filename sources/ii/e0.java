package ii;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import gi.f6;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
public final class e0 extends Drawable {
    public final Paint f14907a = new Paint(1);
    public final RectF f14908b = new RectF();
    public final int f14909c;
    public final Path d;
    public boolean f14910e;
    public int f14911f;
    public final u5 f14912g;
    public final u5 h;

    public e0(int i3) {
        Path path = new Path();
        this.d = path;
        f6 f6Var = new f6(this, 14);
        xq xqVar = xq.h;
        this.f14912g = new u5(f6Var, 320L, xqVar, 0);
        this.h = new u5(new f6(this, 14), 320L, xqVar, 0);
        this.f14909c = i3;
        path.moveTo(-org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.g0.L(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f14908b;
        rectF.set(bounds);
        rectF.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        int i3 = this.f14909c;
        Paint paint = this.f14907a;
        canvas.drawRoundRect(rectF, i3, i3, paint);
        float d = this.f14912g.d(this.f14910e);
        float L = (rectF.right + org.telegram.messenger.g0.L(8.0f)) - this.h.e(false, this.f14911f);
        if (d > 0.0f) {
            canvas.save();
            canvas.translate(L, com.google.android.recaptcha.internal.a.y(1.0f, d, org.telegram.messenger.g0.L(6.16f), org.telegram.messenger.g0.L(8.0f)));
            canvas.drawPath(this.d, paint);
            canvas.restore();
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
