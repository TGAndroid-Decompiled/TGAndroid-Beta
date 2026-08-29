package nh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.hp;
public final class h3 extends hp {
    public final int d;
    public final ViewGroup f17838e;

    public h3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, 21, c6Var);
        this.d = i10;
        this.f17838e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((j3) this.f17838e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.p2) this.f17838e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.i) this.f17838e).invalidate();
                return;
        }
    }

    public h3(j3 j3Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 24, c6Var);
        this.d = 0;
        this.f17838e = j3Var;
    }
}
