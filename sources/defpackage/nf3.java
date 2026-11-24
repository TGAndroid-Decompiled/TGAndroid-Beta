package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
public final class nf3 extends fm2 {
    public int E;
    public final Drawable F;
    public final Drawable G;
    public final oh3 H;

    public nf3(oh3 oh3Var, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.H = oh3Var;
        this.F = drawable3;
        this.G = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        oh3 oh3Var = this.H;
        int i3 = oh3Var.b;
        if (i3 == 0) {
            i = bkb.r8;
        } else {
            i = bkb.L8;
        }
        int f = oh3Var.f(i);
        if (this.E != f) {
            this.E = f;
            if (i3 == 0) {
                i2 = bkb.z8;
            } else {
                i2 = bkb.O8;
            }
            int f2 = bm2.f(0.1f, oh3Var.f(i2), f);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.F.setColorFilter(new PorterDuffColorFilter(f2, mode));
            this.G.setColorFilter(new PorterDuffColorFilter(f, mode));
        }
        super.draw(canvas);
    }
}
