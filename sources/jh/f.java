package jh;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.dq;
import org.telegram.ui.yw;

public final class f extends dq {
    public final Drawable A;
    public final Drawable B;
    public final yw C;

    public int f13315y;

    public f(yw ywVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.C = ywVar;
        this.A = drawable3;
        this.B = drawable4;
    }

    @Override
    public final void draw(Canvas canvas) {
        yw ywVar = this.C;
        int i10 = ywVar.f13773b;
        int iF = ywVar.f(i10 == 0 ? org.telegram.ui.ActionBar.g6.f23322s8 : org.telegram.ui.ActionBar.g6.M8);
        if (this.f13315y != iF) {
            this.f13315y = iF;
            int iD = i0.b.d(0.1f, ywVar.f(i10 == 0 ? org.telegram.ui.ActionBar.g6.A8 : org.telegram.ui.ActionBar.g6.P8), iF);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.A.setColorFilter(new PorterDuffColorFilter(iD, mode));
            this.B.setColorFilter(new PorterDuffColorFilter(iF, mode));
        }
        super.draw(canvas);
    }
}
