package defpackage;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class q75 extends Paint {
    public final g95 a;

    public q75(g95 g95Var) {
        this.a = g95Var;
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
