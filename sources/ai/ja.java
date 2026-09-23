package ai;

import android.content.Context;
import android.view.View;
public final class ja extends e6 {
    public final ka f1053e4;

    public ja(ka kaVar, Context context, jc jcVar, b6 b6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, jcVar, b6Var, d6Var);
        this.f1053e4 = kaVar;
    }

    @Override
    public final boolean K0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.f1053e4.f1153g.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (i0.f975c) {
            i0.f974b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (i0.f975c) {
            i0.f974b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
