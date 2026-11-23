package hi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.lp;
public final class h3 extends lp {
    public final int d;
    public final ViewGroup f14577e;

    public h3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(21, context, i6Var);
        this.d = i7;
        this.f14577e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((i3) this.f14577e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.u2) this.f14577e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.f14577e).invalidate();
                return;
        }
    }

    public h3(i3 i3Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(24, context, i6Var);
        this.d = 0;
        this.f14577e = i3Var;
    }
}
