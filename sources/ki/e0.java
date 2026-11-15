package ki;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.u5;
public final class e0 extends Drawable {
    public final Paint f18273a = new Paint(1);
    public final RectF f18274b = new RectF();
    public final int f18275c;
    public final Path d;
    public boolean f18276e;
    public int f18277f;
    public final u5 f18278g;
    public final u5 h;

    public e0(int i7) {
        Path path = new Path();
        this.d = path;
        kg.j1 j1Var = new kg.j1(this, 2);
        er erVar = er.h;
        this.f18278g = new u5(j1Var, 320L, erVar, 0);
        this.h = new u5(new kg.j1(this, 2), 320L, erVar, 0);
        this.f18275c = i7;
        path.moveTo(-org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.g0.L(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f18274b;
        rectF.set(bounds);
        rectF.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        int i7 = this.f18275c;
        Paint paint = this.f18273a;
        canvas.drawRoundRect(rectF, i7, i7, paint);
        float d = this.f18278g.d(this.f18276e);
        float L = (rectF.right + org.telegram.messenger.g0.L(8.0f)) - this.h.e(false, this.f18277f);
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
