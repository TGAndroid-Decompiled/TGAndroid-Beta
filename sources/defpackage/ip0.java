package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class ip0 extends Drawable {
    public final Paint a = new Paint(1);
    public final RectF b = new RectF();
    public final int c;
    public final Path d;
    public boolean e;
    public int f;
    public final mm g;
    public final mm h;

    public ip0(int i) {
        Path path = new Path();
        this.d = path;
        pz pzVar = new pz(this, (byte) 18);
        k43 k43Var = k43.h;
        this.g = new mm(pzVar, 320L, k43Var, 0);
        this.h = new mm(new pz(this, (byte) 18), 320L, k43Var, 0);
        this.c = i;
        path.moveTo(-hl.L(6.5f), 0.0f);
        path.lineTo(hl.L(6.5f), 0.0f);
        path.lineTo(0.0f, -hl.L(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.b;
        rectF.set(bounds);
        rectF.inset(hl.L(8.0f), hl.L(8.0f));
        float f = this.c;
        Paint paint = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
        float d = this.g.d(this.e);
        float L = (rectF.right + hl.L(8.0f)) - this.h.e(false, this.f);
        if (d > 0.0f) {
            canvas.save();
            canvas.translate(L, qd4.A(1.0f, d, hl.L(6.16f), hl.L(8.0f)));
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
