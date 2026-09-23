package ai;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.qq;
import org.telegram.ui.ix;
public final class o extends qq {
    public final Drawable E;
    public final Drawable F;
    public final ix G;
    public int f1324y;

    public o(ix ixVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = ixVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        ix ixVar = this.G;
        int i12 = ixVar.f546b;
        if (i12 == 0) {
            i10 = org.telegram.ui.ActionBar.h6.f19065s8;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.M8;
        }
        int f7 = ixVar.f(i10);
        if (this.f1324y != f7) {
            this.f1324y = f7;
            if (i12 == 0) {
                i11 = org.telegram.ui.ActionBar.h6.A8;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.P8;
            }
            int d = i0.a.d(0.1f, ixVar.f(i11), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
