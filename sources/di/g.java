package di;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xp;
import org.telegram.ui.sv;
public final class g extends xp {
    public int D;
    public final Drawable E;
    public final Drawable F;
    public final sv G;

    public g(sv svVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = svVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        int i10;
        sv svVar = this.G;
        int i11 = svVar.f9533b;
        if (i11 == 0) {
            i7 = org.telegram.ui.ActionBar.m6.f28170s8;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.M8;
        }
        int f10 = svVar.f(i7);
        if (this.D != f10) {
            this.D = f10;
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.m6.A8;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.P8;
            }
            int f11 = i0.a.f(0.1f, svVar.f(i10), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(f11, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
