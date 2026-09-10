package bi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.tp;
public final class h4 extends tp {
    public final int d;
    public final ViewGroup e;

    public h4(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, 21, f6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((j4) this.e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.r2) this.e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.i) this.e).invalidate();
                return;
        }
    }

    public h4(j4 j4Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 24, f6Var);
        this.d = 0;
        this.e = j4Var;
    }
}
