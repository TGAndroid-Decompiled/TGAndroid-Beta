package fi;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.fq;
import org.telegram.ui.qv;
public final class g extends fq {
    public int E;
    public final Drawable F;
    public final Drawable G;
    public final qv H;

    public g(qv qvVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.H = qvVar;
        this.F = drawable3;
        this.G = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        int i10;
        qv qvVar = this.H;
        int i11 = qvVar.f12186b;
        if (i11 == 0) {
            i7 = org.telegram.ui.ActionBar.j6.f29129s8;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.M8;
        }
        int f10 = qvVar.f(i7);
        if (this.E != f10) {
            this.E = f10;
            if (i11 == 0) {
                i10 = org.telegram.ui.ActionBar.j6.A8;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.P8;
            }
            int f11 = i0.a.f(0.1f, qvVar.f(i10), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.F.setColorFilter(new PorterDuffColorFilter(f11, mode));
            this.G.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
