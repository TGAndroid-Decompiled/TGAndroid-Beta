package ei;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.xp;
import org.telegram.ui.mv;
public final class h extends xp {
    public int E;
    public final Drawable F;
    public final Drawable G;
    public final mv H;

    public h(mv mvVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.H = mvVar;
        this.F = drawable3;
        this.G = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i3;
        int i10;
        mv mvVar = this.H;
        int i11 = mvVar.f10824b;
        if (i11 == 0) {
            i3 = org.telegram.ui.ActionBar.k6.f28160s8;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.M8;
        }
        int f10 = mvVar.f(i3);
        if (this.E != f10) {
            this.E = f10;
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.k6.A8;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.P8;
            }
            int f11 = i0.a.f(0.1f, mvVar.f(i10), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.F.setColorFilter(new PorterDuffColorFilter(f11, mode));
            this.G.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
