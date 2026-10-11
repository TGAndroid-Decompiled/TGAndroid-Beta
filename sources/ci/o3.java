package ci;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.dq;
public final class o3 extends dq {
    public final int d;
    public final ViewGroup f5674e;

    public o3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, 21, d6Var);
        this.d = i10;
        this.f5674e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((q3) this.f5674e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.s2) this.f5674e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.f5674e).invalidate();
                return;
        }
    }

    public o3(q3 q3Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 24, d6Var);
        this.d = 0;
        this.f5674e = q3Var;
    }
}
