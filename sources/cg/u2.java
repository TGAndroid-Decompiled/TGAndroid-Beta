package cg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.jq;
public final class u2 extends jq {
    public final w2 f3395y;

    public u2(w2 w2Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.f3395y = w2Var;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        w2 w2Var = this.f3395y;
        if (w2Var.d) {
            super.setBounds(i10, (int) (i11 - w2Var.I), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + w2Var.I));
        }
    }
}
