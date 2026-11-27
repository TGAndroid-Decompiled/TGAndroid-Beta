package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
public final class hg3 extends zm2 {
    public int E;
    public final Drawable F;
    public final Drawable G;
    public final ii3 H;

    public hg3(ii3 ii3Var, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.H = ii3Var;
        this.F = drawable3;
        this.G = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        ii3 ii3Var = this.H;
        int i3 = ii3Var.b;
        if (i3 == 0) {
            i = aob.s8;
        } else {
            i = aob.M8;
        }
        int f = ii3Var.f(i);
        if (this.E != f) {
            this.E = f;
            if (i3 == 0) {
                i2 = aob.A8;
            } else {
                i2 = aob.P8;
            }
            int f2 = vm2.f(0.1f, ii3Var.f(i2), f);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.F.setColorFilter(new PorterDuffColorFilter(f2, mode));
            this.G.setColorFilter(new PorterDuffColorFilter(f, mode));
        }
        super.draw(canvas);
    }
}
