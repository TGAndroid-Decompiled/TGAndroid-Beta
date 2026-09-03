package eg;

import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.mq;
public final class s2 extends mq {
    public final u2 f5494y;

    public s2(u2 u2Var, j0.a aVar, Drawable drawable) {
        super(aVar, drawable);
        this.f5494y = u2Var;
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        u2 u2Var = this.f5494y;
        if (u2Var.d) {
            super.setBounds(i10, (int) (i11 - u2Var.J), i12, i13);
        } else {
            super.setBounds(i10, i11, i12, (int) (i13 + u2Var.J));
        }
    }
}
