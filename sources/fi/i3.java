package fi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.zp;
public final class i3 extends zp {
    public final int d;
    public final ViewGroup e;

    public i3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, 21, u6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((k3) this.e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.p2) this.e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.i) this.e).invalidate();
                return;
        }
    }

    public i3(k3 k3Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 24, u6Var);
        this.d = 0;
        this.e = k3Var;
    }
}
