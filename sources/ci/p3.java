package ci;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.op;
public final class p3 extends op {
    public final int d;
    public final ViewGroup e;

    public p3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, 21, d6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((r3) this.e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.r2) this.e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.e).invalidate();
                return;
        }
    }

    public p3(r3 r3Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 24, d6Var);
        this.d = 0;
        this.e = r3Var;
    }
}
