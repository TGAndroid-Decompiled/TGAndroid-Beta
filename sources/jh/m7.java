package jh;

import android.content.Context;
import android.view.View;

public final class m7 extends e4 {

    public final n7 f13657a4;

    public m7(n7 n7Var, Context context, i9 i9Var, b4 b4Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i9Var, b4Var, c6Var);
        this.f13657a4 = n7Var;
    }

    @Override
    public final boolean K0() {
        return getParent() != null && ((Integer) ((View) getParent()).getTag()).intValue() == this.f13657a4.f13705g.getCurrentItem();
    }

    @Override
    public final void invalidate() {
        if (t.f13983c) {
            t.f13982b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (t.f13983c) {
            t.f13982b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
