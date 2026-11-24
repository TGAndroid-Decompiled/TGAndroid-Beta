package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class qy8 extends Drawable {
    public final byte a;
    public final byte b;
    public final ry8 c;

    public qy8(ry8 ry8Var, int i, int i2) {
        this.c = ry8Var;
        this.a = i;
        this.b = i2;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = gl.Q;
        int centerX = getBounds().centerX();
        float f = this.a;
        int L = centerX - (gl.L(f) / 2);
        int centerY = getBounds().centerY();
        float f2 = this.b;
        rect.set(L, centerY - (gl.L(f2) / 2), (gl.L(f) / 2) + getBounds().centerX(), (gl.L(f2) / 2) + getBounds().centerY());
        ry8 ry8Var = this.c;
        ry8Var.c.j0(rect);
        ry8Var.c.h(canvas, null);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.c.c.setAlpha(i / 255.0f);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.c.p1 = colorFilter;
    }
}
