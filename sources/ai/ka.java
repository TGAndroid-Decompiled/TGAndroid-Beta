package ai;

import android.content.Context;
import android.view.View;
public final class ka extends f6 {
    public final la f1248e4;

    public ka(la laVar, Context context, kc kcVar, c6 c6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, kcVar, c6Var, d6Var);
        this.f1248e4 = laVar;
    }

    @Override
    public final boolean K0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.f1248e4.f1363g.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (i0.f1120c) {
            i0.f1119b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (i0.f1120c) {
            i0.f1119b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
