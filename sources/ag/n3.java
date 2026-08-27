package ag;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.dq;

public final class n3 extends dq {

    public final p3 f575y;

    public n3(p3 p3Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.f575y = p3Var;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        p3 p3Var = this.f575y;
        if (p3Var.d) {
            super.setBounds(i10, (int) (i11 - p3Var.I), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + p3Var.I));
        }
    }
}
