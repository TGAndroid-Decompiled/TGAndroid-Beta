package ci;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.qp;
public final class p3 extends qp {
    public final int d;
    public final ViewGroup f5698e;

    public p3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, 21, d6Var);
        this.d = i10;
        this.f5698e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((r3) this.f5698e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.s2) this.f5698e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.f5698e).invalidate();
                return;
        }
    }

    public p3(r3 r3Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 24, d6Var);
        this.d = 0;
        this.f5698e = r3Var;
    }
}
