package ei;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.vp;
public final class k3 extends vp {
    public final int d;
    public final ViewGroup e;

    public k3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, 21, g6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((m3) this.e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.q2) this.e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.i) this.e).invalidate();
                return;
        }
    }

    public k3(m3 m3Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 24, g6Var);
        this.d = 0;
        this.e = m3Var;
    }
}
