package hi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.fp;
public final class y2 extends fp {
    public final int d;
    public final ViewGroup f15415e;

    public y2(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(21, context, e6Var);
        this.d = i7;
        this.f15415e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((z2) this.f15415e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.t2) this.f15415e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.f15415e).invalidate();
                return;
        }
    }

    public y2(z2 z2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(24, context, e6Var);
        this.d = 0;
        this.f15415e = z2Var;
    }
}
