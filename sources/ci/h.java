package ci;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.zq;
import org.telegram.ui.tw;
public final class h extends zq {
    public final Drawable E;
    public final Drawable F;
    public final tw G;
    public int f5439y;

    public h(tw twVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = twVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        tw twVar = this.G;
        int i12 = twVar.f5868b;
        if (i12 == 0) {
            i10 = org.telegram.ui.ActionBar.h6.f21273s8;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.M8;
        }
        int f7 = twVar.f(i10);
        if (this.f5439y != f7) {
            this.f5439y = f7;
            if (i12 == 0) {
                i11 = org.telegram.ui.ActionBar.h6.A8;
            } else {
                i11 = org.telegram.ui.ActionBar.h6.P8;
            }
            int f10 = i0.a.f(0.1f, twVar.f(i11), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(f10, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
