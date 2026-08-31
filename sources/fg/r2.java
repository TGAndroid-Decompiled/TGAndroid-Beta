package fg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.pq;
public final class r2 extends pq {
    public final t2 f6542y;

    public r2(t2 t2Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.f6542y = t2Var;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        t2 t2Var = this.f6542y;
        if (t2Var.d) {
            super.setBounds(i10, (int) (i11 - t2Var.J), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + t2Var.J));
        }
    }
}
