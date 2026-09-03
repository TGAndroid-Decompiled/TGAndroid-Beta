package oh;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.pq;
import org.telegram.ui.hx;
public final class f extends pq {
    public final Drawable B;
    public final Drawable C;
    public final hx D;
    public int f17046y;

    public f(hx hxVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.D = hxVar;
        this.B = drawable3;
        this.C = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        hx hxVar = this.D;
        int i12 = hxVar.f17578b;
        if (i12 == 0) {
            i10 = org.telegram.ui.ActionBar.k6.f21932s8;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.M8;
        }
        int f10 = hxVar.f(i10);
        if (this.f17046y != f10) {
            this.f17046y = f10;
            if (i12 == 0) {
                i11 = org.telegram.ui.ActionBar.k6.A8;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.P8;
            }
            int d = i0.a.d(0.1f, hxVar.f(i11), f10);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.B.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.C.setColorFilter(new PorterDuffColorFilter(f10, mode));
        }
        super.draw(canvas);
    }
}
