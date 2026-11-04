package gi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.wo;
public final class y2 extends wo {
    public final int d;
    public final ViewGroup f13921e;

    public y2(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(21, context, e6Var);
        this.d = i3;
        this.f13921e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((z2) this.f13921e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.t2) this.f13921e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.i) this.f13921e).invalidate();
                return;
        }
    }

    public y2(z2 z2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(24, context, e6Var);
        this.d = 0;
        this.f13921e = z2Var;
    }
}
