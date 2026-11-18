package ki;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
public final class d0 extends Drawable {
    public final Paint f18619a = new Paint(1);
    public final RectF f18620b = new RectF();
    public final int f18621c;
    public final Path d;
    public boolean f18622e;
    public int f18623f;
    public final c6 f18624g;
    public final c6 h;

    public d0(int i7) {
        Path path = new Path();
        this.d = path;
        kg.j0 j0Var = new kg.j0(this, 6);
        lr lrVar = lr.h;
        this.f18624g = new c6(j0Var, 320L, lrVar, 0);
        this.h = new c6(new kg.j0(this, 6), 320L, lrVar, 0);
        this.f18621c = i7;
        path.moveTo(-org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.g0.L(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f18620b;
        rectF.set(bounds);
        rectF.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        int i7 = this.f18621c;
        Paint paint = this.f18619a;
        canvas.drawRoundRect(rectF, i7, i7, paint);
        float d = this.f18624g.d(this.f18622e);
        float L = (rectF.right + org.telegram.messenger.g0.L(8.0f)) - this.h.e(false, this.f18623f);
        if (d > 0.0f) {
            canvas.save();
            canvas.translate(L, com.google.android.gms.internal.vision.e2.z(1.0f, d, org.telegram.messenger.g0.L(6.16f), org.telegram.messenger.g0.L(8.0f)));
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
