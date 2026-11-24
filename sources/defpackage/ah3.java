package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
public final class ah3 extends sn2 {
    public int E;
    public final Drawable F;
    public final Drawable G;
    public final aj3 H;

    public ah3(aj3 aj3Var, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.H = aj3Var;
        this.F = drawable3;
        this.G = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        aj3 aj3Var = this.H;
        int i3 = aj3Var.b;
        if (i3 == 0) {
            i = cmb.r8;
        } else {
            i = cmb.L8;
        }
        int f = aj3Var.f(i);
        if (this.E != f) {
            this.E = f;
            if (i3 == 0) {
                i2 = cmb.z8;
            } else {
                i2 = cmb.O8;
            }
            int f2 = on2.f(0.1f, aj3Var.f(i2), f);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.F.setColorFilter(new PorterDuffColorFilter(f2, mode));
            this.G.setColorFilter(new PorterDuffColorFilter(f, mode));
        }
        super.draw(canvas);
    }
}
