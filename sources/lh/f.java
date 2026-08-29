package lh;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.jq;
import org.telegram.ui.xw;
public final class f extends jq {
    public final Drawable A;
    public final Drawable B;
    public final xw C;
    public int f15587y;

    public f(xw xwVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.C = xwVar;
        this.A = drawable3;
        this.B = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        xw xwVar = this.C;
        int i12 = xwVar.f16044b;
        if (i12 == 0) {
            i10 = org.telegram.ui.ActionBar.g6.f23329s8;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.M8;
        }
        int f9 = xwVar.f(i10);
        if (this.f15587y != f9) {
            this.f15587y = f9;
            if (i12 == 0) {
                i11 = org.telegram.ui.ActionBar.g6.A8;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.P8;
            }
            int d = i0.a.d(0.1f, xwVar.f(i11), f9);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.A.setColorFilter(new PorterDuffColorFilter(d, mode));
            this.B.setColorFilter(new PorterDuffColorFilter(f9, mode));
        }
        super.draw(canvas);
    }
}
