package lh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.bp;

public final class j3 extends bp {
    public final int d;

    public final ViewGroup f16173e;

    public j3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, 21, c6Var);
        this.d = i10;
        this.f16173e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((l3) this.f16173e).invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.p2) this.f16173e).invalidate();
                break;
            default:
                super.invalidate();
                ((org.telegram.ui.web.i) this.f16173e).invalidate();
                break;
        }
    }

    public j3(l3 l3Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 24, c6Var);
        this.d = 0;
        this.f16173e = l3Var;
    }
}
