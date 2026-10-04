package ai;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.sq;
import org.telegram.ui.jx;
public final class o extends sq {
    public final Drawable E;
    public final Drawable F;
    public final jx G;
    public int f1432y;

    public o(jx jxVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = jxVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        jx jxVar = this.G;
        int i12 = jxVar.f595b;
        if (i12 == 0) {
            i10 = org.telegram.ui.ActionBar.i6.f21104s8;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.M8;
        }
        int f7 = jxVar.f(i10);
        if (this.f1432y != f7) {
            this.f1432y = f7;
            if (i12 == 0) {
                i11 = org.telegram.ui.ActionBar.i6.A8;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.P8;
            }
            int d = i0.a.d(0.1f, jxVar.f(i11), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
