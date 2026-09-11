package bi;

import android.content.Context;
import android.view.View;
public final class q9 extends o5 {
    public final r9 f3616e4;

    public q9(r9 r9Var, Context context, pb pbVar, l5 l5Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, pbVar, l5Var, f6Var);
        this.f3616e4 = r9Var;
    }

    @Override
    public final boolean K0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.f3616e4.f3664g.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (b0.f2786c) {
            b0.f2785b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (b0.f2786c) {
            b0.f2785b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
