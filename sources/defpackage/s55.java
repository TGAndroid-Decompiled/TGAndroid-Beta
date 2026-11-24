package defpackage;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class s55 extends Paint {
    public final h75 a;

    public s55(h75 h75Var) {
        this.a = h75Var;
    }

    @Override
    public final void setAlpha(int i) {
        super.setAlpha(i);
        ViewGroup viewGroup = this.a.b;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }
}
