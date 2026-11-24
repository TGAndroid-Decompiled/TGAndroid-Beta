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
    public final lm g;
    public final lm h;

    public ip0(int i) {
        Path path = new Path();
        this.d = path;
        oz ozVar = new oz(this, (byte) 17);
        s33 s33Var = s33.h;
        this.g = new lm(ozVar, 320L, s33Var, 0);
        this.h = new lm(new oz(this, (byte) 17), 320L, s33Var, 0);
        this.c = i;
        path.moveTo(-gl.L(6.5f), 0.0f);
        path.lineTo(gl.L(6.5f), 0.0f);
        path.lineTo(0.0f, -gl.L(6.16f));
        path.close();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        RectF rectF = this.b;
        rectF.set(bounds);
        rectF.inset(gl.L(8.0f), gl.L(8.0f));
        float f = this.c;
        Paint paint = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
        float d = this.g.d(this.e);
        float L = (rectF.right + gl.L(8.0f)) - this.h.e(false, this.f);
        if (d > 0.0f) {
            canvas.save();
            canvas.translate(L, tb4.A(1.0f, d, gl.L(6.16f), gl.L(8.0f)));
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
