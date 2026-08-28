package ih;

import android.content.Context;
import android.view.View;
public final class q7 extends i4 {
    public final r7 f12003a4;

    public q7(r7 r7Var, Context context, m9 m9Var, f4 f4Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, m9Var, f4Var, b6Var);
        this.f12003a4 = r7Var;
    }

    @Override
    public final boolean K0() {
        if (getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.f12003a4.f12075g.getCurrentItem()) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        if (v.f12218c) {
            v.f12217b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i9, int i10, int i11, int i12) {
        if (v.f12218c) {
            v.f12217b.add(this);
        } else {
            super.invalidate(i9, i10, i11, i12);
        }
    }
}
