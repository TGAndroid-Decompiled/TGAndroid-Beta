package fi;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oq;
import org.telegram.ui.tv;
public final class g extends oq {
    public int E;
    public final Drawable F;
    public final Drawable G;
    public final tv H;

    public g(tv tvVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.H = tvVar;
        this.F = drawable3;
        this.G = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        int i10;
        tv tvVar = this.H;
        int i11 = tvVar.f12451b;
        if (i11 == 0) {
            i7 = org.telegram.ui.ActionBar.m6.f29658s8;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.M8;
        }
        int f10 = tvVar.f(i7);
        if (this.E != f10) {
            this.E = f10;
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.m6.A8;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.P8;
            }
            int f11 = i0.a.f(0.1f, tvVar.f(i10), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.F.setColorFilter(new PorterDuffColorFilter(f11, mode));
            this.G.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
