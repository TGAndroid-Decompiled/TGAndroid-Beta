package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
public final class hlb extends ilb {
    public Drawable E;
    public int F;
    public boolean G;
    public final vnb x;
    public ColorDrawable y;

    public hlb(Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.x = vnbVar;
    }

    public void setBackground(boolean z) {
        int i;
        Context context = getContext();
        if (z) {
            i = 2131231233;
        } else {
            i = 2131231232;
        }
        int i2 = aob.b7;
        vnb vnbVar = this.x;
        Drawable V0 = aob.V0(context, i, aob.v0(i2, vnbVar));
        ColorDrawable colorDrawable = new ColorDrawable(aob.v0(aob.a7, vnbVar));
        this.y = colorDrawable;
        this.E = V0;
        zm2 zm2Var = new zm2(colorDrawable, V0, 0, 0);
        zm2Var.x = true;
        setBackground(zm2Var);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.y;
            vnb vnbVar = this.x;
            if (colorDrawable != null) {
                colorDrawable.setColor(aob.v0(aob.a7, vnbVar));
            }
            if (this.E != null) {
                int v0 = aob.v0(aob.b7, vnbVar);
                if (v0 != this.F || !this.G) {
                    this.F = v0;
                    this.G = true;
                    this.E.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
