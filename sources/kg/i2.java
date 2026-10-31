package kg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.eq;
public final class i2 extends eq {
    public final k2 D;

    public i2(k2 k2Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.D = k2Var;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        k2 k2Var = this.D;
        if (k2Var.d) {
            super.setBounds(i10, (int) (i11 - k2Var.M), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + k2Var.M));
        }
    }
}
