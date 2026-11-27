package defpackage;

import android.graphics.Paint;
import android.view.ViewGroup;
public final class u75 extends Paint {
    public final j95 a;

    public u75(j95 j95Var) {
        this.a = j95Var;
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
