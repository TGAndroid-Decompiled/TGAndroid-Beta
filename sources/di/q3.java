package di;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.mp;
public final class q3 extends mp {
    public final int d;
    public final ViewGroup f7976e;

    public q3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, 21, f6Var);
        this.d = i10;
        this.f7976e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((s3) this.f7976e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.r2) this.f7976e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.i) this.f7976e).invalidate();
                return;
        }
    }

    public q3(s3 s3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 24, f6Var);
        this.d = 0;
        this.f7976e = s3Var;
    }
}
