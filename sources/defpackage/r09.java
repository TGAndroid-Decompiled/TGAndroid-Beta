package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
public final class r09 extends Drawable {
    public final byte a;
    public final byte b;
    public final s09 c;

    public r09(s09 s09Var, int i, int i2) {
        this.c = s09Var;
        this.a = i;
        this.b = i2;
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect rect = gm.Q;
        int centerX = getBounds().centerX();
        float f = this.a;
        int L = centerX - (gm.L(f) / 2);
        int centerY = getBounds().centerY();
        float f2 = this.b;
        rect.set(L, centerY - (gm.L(f2) / 2), (gm.L(f) / 2) + getBounds().centerX(), (gm.L(f2) / 2) + getBounds().centerY());
        s09 s09Var = this.c;
        s09Var.c.j0(rect);
        s09Var.c.h(canvas, null);
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
