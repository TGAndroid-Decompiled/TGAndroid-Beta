package ai;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.fr;
import org.telegram.ui.kx;
public final class o extends fr {
    public final Drawable E;
    public final Drawable F;
    public final kx G;
    public int f1502y;

    public o(kx kxVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = kxVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        kx kxVar = this.G;
        int i12 = kxVar.f662b;
        if (i12 == 0) {
            i10 = org.telegram.ui.ActionBar.i6.f21079s8;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.M8;
        }
        int f7 = kxVar.f(i10);
        if (this.f1502y != f7) {
            this.f1502y = f7;
            if (i12 == 0) {
                i11 = org.telegram.ui.ActionBar.i6.A8;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.P8;
            }
            int d = i0.a.d(0.1f, kxVar.f(i11), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
