package hi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import fi.v9;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
public final class c0 extends Drawable {
    public final Paint f14578a = new Paint(1);
    public final RectF f14579b = new RectF();
    public final int f14580c;
    public final Path d;
    public boolean f14581e;
    public int f14582f;
    public final v5 f14583g;
    public final v5 h;

    public c0(int i7) {
        Path path = new Path();
        this.d = path;
        v9 v9Var = new v9(this, 10);
        wq wqVar = wq.h;
        this.f14583g = new v5(v9Var, 320L, wqVar, 0);
        this.h = new v5(new v9(this, 10), 320L, wqVar, 0);
        this.f14580c = i7;
        path.moveTo(-org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.g0.L(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f14579b;
        rectF.set(bounds);
        rectF.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        int i7 = this.f14580c;
        Paint paint = this.f14578a;
        canvas.drawRoundRect(rectF, i7, i7, paint);
        float d = this.f14583g.d(this.f14581e);
        float L = (rectF.right + org.telegram.messenger.g0.L(8.0f)) - this.h.e(false, this.f14582f);
        if (d > 0.0f) {
            canvas.save();
            canvas.translate(L, com.google.android.recaptcha.internal.a.z(1.0f, d, org.telegram.messenger.g0.L(6.16f), org.telegram.messenger.g0.L(8.0f)));
            canvas.drawPath(this.d, paint);
            canvas.restore();
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
