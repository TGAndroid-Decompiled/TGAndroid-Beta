package ci;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.yq;
import org.telegram.ui.vw;
public final class h extends yq {
    public final Drawable E;
    public final Drawable F;
    public final vw G;
    public int f5378y;

    public h(vw vwVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = vwVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        vw vwVar = this.G;
        int i12 = vwVar.f5813b;
        if (i12 == 0) {
            i10 = org.telegram.ui.ActionBar.k6.f21462s8;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.M8;
        }
        int f7 = vwVar.f(i10);
        if (this.f5378y != f7) {
            this.f5378y = f7;
            if (i12 == 0) {
                i11 = org.telegram.ui.ActionBar.k6.A8;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.P8;
            }
            int f10 = i0.a.f(0.1f, vwVar.f(i11), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(f10, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
