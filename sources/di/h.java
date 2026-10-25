package di;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ar;
import org.telegram.ui.qw;
public final class h extends ar {
    public final Drawable E;
    public final Drawable F;
    public final qw G;
    public int f8603y;

    public h(qw qwVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = qwVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        qw qwVar = this.G;
        int i12 = qwVar.f9073b;
        if (i12 == 0) {
            i10 = org.telegram.ui.ActionBar.y6.f23634s8;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.M8;
        }
        int f7 = qwVar.f(i10);
        if (this.f8603y != f7) {
            this.f8603y = f7;
            if (i12 == 0) {
                i11 = org.telegram.ui.ActionBar.y6.A8;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.P8;
            }
            int f10 = i0.a.f(0.1f, qwVar.f(i11), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(f10, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
