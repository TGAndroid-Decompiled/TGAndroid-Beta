package hi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.op;
public final class y2 extends op {
    public final int d;
    public final ViewGroup f15787e;

    public y2(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(21, context, h6Var);
        this.d = i7;
        this.f15787e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((z2) this.f15787e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.u2) this.f15787e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.f15787e).invalidate();
                return;
        }
    }

    public y2(z2 z2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(24, context, h6Var);
        this.d = 0;
        this.f15787e = z2Var;
    }
}
