package og;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Components.eq;
public final class f0 extends b9 {
    public Drawable D;
    public int E;
    public boolean F;
    public final p6 f14196x;
    public ColorDrawable f14197y;

    public f0(Context context, p6 p6Var) {
        super(context, p6Var);
        this.f14196x = p6Var;
    }

    public void setBackground(boolean z10) {
        int i10;
        Context context = getContext();
        if (z10) {
            i10 = 2131231231;
        } else {
            i10 = 2131231230;
        }
        int i11 = t6.f20892b7;
        p6 p6Var = this.f14196x;
        Drawable X0 = t6.X0(context, i10, t6.w0(i11, p6Var));
        ColorDrawable colorDrawable = new ColorDrawable(t6.w0(t6.f20872a7, p6Var));
        this.f14197y = colorDrawable;
        this.D = X0;
        eq eqVar = new eq(colorDrawable, X0, 0, 0);
        eqVar.f25847x = true;
        setBackground(eqVar);
    }

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.f14197y;
            p6 p6Var = this.f14196x;
            if (colorDrawable != null) {
                colorDrawable.setColor(t6.w0(t6.f20872a7, p6Var));
            }
            if (this.D != null) {
                int w02 = t6.w0(t6.f20892b7, p6Var);
                if (w02 != this.E || !this.F) {
                    this.E = w02;
                    this.F = true;
                    this.D.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
