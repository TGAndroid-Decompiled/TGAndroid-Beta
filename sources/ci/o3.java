package ci;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.fq;
public final class o3 extends fq {
    public final int d;
    public final ViewGroup f5673e;

    public o3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, 21, c6Var);
        this.d = i10;
        this.f5673e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((q3) this.f5673e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.s2) this.f5673e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.f5673e).invalidate();
                return;
        }
    }

    public o3(q3 q3Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 24, c6Var);
        this.d = 0;
        this.f5673e = q3Var;
    }
}
