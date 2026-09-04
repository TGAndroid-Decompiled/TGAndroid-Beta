package bi;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.oq;
import org.telegram.ui.lx;
public final class k extends oq {
    public final Drawable E;
    public final Drawable F;
    public final lx G;
    public int f3181y;

    public k(lx lxVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = lxVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        lx lxVar = this.G;
        int i12 = lxVar.f3848b;
        if (i12 == 0) {
            i10 = org.telegram.ui.ActionBar.j6.f20937s8;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.M8;
        }
        int f7 = lxVar.f(i10);
        if (this.f3181y != f7) {
            this.f3181y = f7;
            if (i12 == 0) {
                i11 = org.telegram.ui.ActionBar.j6.A8;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.P8;
            }
            int d = i0.a.d(0.1f, lxVar.f(i11), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
