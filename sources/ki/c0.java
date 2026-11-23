package ki;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
public final class c0 extends Drawable {
    public final Paint f18689a = new Paint(1);
    public final RectF f18690b = new RectF();
    public final int f18691c;
    public final Path d;
    public boolean f18692e;
    public int f18693f;
    public final c6 f18694g;
    public final c6 h;

    public c0(int i7) {
        Path path = new Path();
        this.d = path;
        kg.i0 i0Var = new kg.i0(this, 6);
        kr krVar = kr.h;
        this.f18694g = new c6(i0Var, 320L, krVar, 0);
        this.h = new c6(new kg.i0(this, 6), 320L, krVar, 0);
        this.f18691c = i7;
        path.moveTo(-org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(org.telegram.messenger.g0.L(6.5f), 0.0f);
        path.lineTo(0.0f, -org.telegram.messenger.g0.L(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.f18690b;
        rectF.set(bounds);
        rectF.inset(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        int i7 = this.f18691c;
        Paint paint = this.f18689a;
        canvas.drawRoundRect(rectF, i7, i7, paint);
        float d = this.f18694g.d(this.f18692e);
        float L = (rectF.right + org.telegram.messenger.g0.L(8.0f)) - this.h.e(false, this.f18693f);
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
