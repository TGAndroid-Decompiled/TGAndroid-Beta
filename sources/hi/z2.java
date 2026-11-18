package hi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.mp;
public final class z2 extends mp {
    public final int d;
    public final ViewGroup f15806e;

    public z2(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(21, context, i6Var);
        this.d = i7;
        this.f15806e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((a3) this.f15806e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.u2) this.f15806e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.f15806e).invalidate();
                return;
        }
    }

    public z2(a3 a3Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(24, context, i6Var);
        this.d = 0;
        this.f15806e = a3Var;
    }
}
