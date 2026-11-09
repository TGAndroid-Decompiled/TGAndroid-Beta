package fi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.wo;
public final class a3 extends wo {
    public final int d;
    public final ViewGroup f11591e;

    public a3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(21, context, g6Var);
        this.d = i7;
        this.f11591e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((b3) this.f11591e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.t2) this.f11591e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.g) this.f11591e).invalidate();
                return;
        }
    }

    public a3(b3 b3Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(24, context, g6Var);
        this.d = 0;
        this.f11591e = b3Var;
    }
}
