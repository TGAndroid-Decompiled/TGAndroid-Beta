package ih;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.fq;
import org.telegram.ui.vw;
public final class h extends fq {
    public final Drawable A;
    public final Drawable B;
    public final vw C;
    public int f11494y;

    public h(vw vwVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.C = vwVar;
        this.A = drawable3;
        this.B = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i9;
        int i10;
        vw vwVar = this.C;
        int i11 = vwVar.f12020b;
        if (i11 == 0) {
            i9 = org.telegram.ui.ActionBar.f6.f23269s8;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.M8;
        }
        int f10 = vwVar.f(i9);
        if (this.f11494y != f10) {
            this.f11494y = f10;
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.f6.A8;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.P8;
            }
            int d = i0.a.d(0.1f, vwVar.f(i10), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.A.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.B.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
