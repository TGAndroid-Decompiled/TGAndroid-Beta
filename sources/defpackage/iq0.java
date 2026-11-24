package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class iq0 extends Drawable {
    public final Paint a = new Paint(1);
    public final RectF b = new RectF();
    public final int c;
    public final Path d;
    public boolean e;
    public int f;
    public final ln g;
    public final ln h;

    public iq0(int i) {
        Path path = new Path();
        this.d = path;
        f00 f00Var = new f00(this, (byte) 19);
        d53 d53Var = d53.h;
        this.g = new ln(f00Var, 320L, d53Var, 0);
        this.h = new ln(new f00(this, (byte) 19), 320L, d53Var, 0);
        this.c = i;
        path.moveTo(-gm.L(6.5f), 0.0f);
        path.lineTo(gm.L(6.5f), 0.0f);
        path.lineTo(0.0f, -gm.L(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.b;
        rectF.set(bounds);
        rectF.inset(gm.L(8.0f), gm.L(8.0f));
        float f = this.c;
        Paint paint = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
        float d = this.g.d(this.e);
        float L = (rectF.right + gm.L(8.0f)) - this.h.e(false, this.f);
        if (d > 0.0f) {
            canvas.save();
            canvas.translate(L, td4.A(1.0f, d, gm.L(6.16f), gm.L(8.0f)));
            canvas.drawPath(this.d, paint);
            canvas.restore();
        }
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
