package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
public final class lhb extends mhb {
    public Drawable E;
    public int F;
    public boolean G;
    public final wjb x;
    public ColorDrawable y;

    public lhb(Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.x = wjbVar;
    }

    public void setBackground(boolean z) {
        int i;
        Context context = getContext();
        if (z) {
            i = 2131231233;
        } else {
            i = 2131231232;
        }
        int i2 = bkb.a7;
        wjb wjbVar = this.x;
        Drawable V0 = bkb.V0(context, i, bkb.v0(i2, wjbVar));
        ColorDrawable colorDrawable = new ColorDrawable(bkb.v0(bkb.Z6, wjbVar));
        this.y = colorDrawable;
        this.E = V0;
        fm2 fm2Var = new fm2(colorDrawable, V0, 0, 0);
        fm2Var.x = true;
        setBackground(fm2Var);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.y;
            wjb wjbVar = this.x;
            if (colorDrawable != null) {
                colorDrawable.setColor(bkb.v0(bkb.Z6, wjbVar));
            }
            if (this.E != null) {
                int v0 = bkb.v0(bkb.a7, wjbVar);
                if (v0 != this.F || !this.G) {
                    this.F = v0;
                    this.G = true;
                    this.E.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
