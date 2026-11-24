package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
public final class mjb extends njb {
    public Drawable E;
    public int F;
    public boolean G;
    public final ylb x;
    public ColorDrawable y;

    public mjb(Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.x = ylbVar;
    }

    public void setBackground(boolean z) {
        int i;
        Context context = getContext();
        if (z) {
            i = 2131231234;
        } else {
            i = 2131231233;
        }
        int i2 = cmb.a7;
        ylb ylbVar = this.x;
        Drawable V0 = cmb.V0(context, i, cmb.v0(i2, ylbVar));
        ColorDrawable colorDrawable = new ColorDrawable(cmb.v0(cmb.Z6, ylbVar));
        this.y = colorDrawable;
        this.E = V0;
        sn2 sn2Var = new sn2(colorDrawable, V0, 0, 0);
        sn2Var.x = true;
        setBackground(sn2Var);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.y;
            ylb ylbVar = this.x;
            if (colorDrawable != null) {
                colorDrawable.setColor(cmb.v0(cmb.Z6, ylbVar));
            }
            if (this.E != null) {
                int v0 = cmb.v0(cmb.a7, ylbVar);
                if (v0 != this.F || !this.G) {
                    this.F = v0;
                    this.G = true;
                    this.E.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
