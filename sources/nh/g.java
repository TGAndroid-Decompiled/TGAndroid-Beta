package nh;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.mq;
import org.telegram.ui.ix;
public final class g extends mq {
    public final Drawable B;
    public final Drawable C;
    public final ix D;
    public int f15324y;

    public g(ix ixVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.D = ixVar;
        this.B = drawable3;
        this.C = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        ix ixVar = this.D;
        int i12 = ixVar.f15737b;
        if (i12 == 0) {
            i10 = org.telegram.ui.ActionBar.j6.f20151s8;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.M8;
        }
        int f10 = ixVar.f(i10);
        if (this.f15324y != f10) {
            this.f15324y = f10;
            if (i12 == 0) {
                i11 = org.telegram.ui.ActionBar.j6.A8;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.P8;
            }
            int d = i0.a.d(0.1f, ixVar.f(i11), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.B.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.C.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
