package ci;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.np;
public final class q3 extends np {
    public final int d;
    public final ViewGroup e;

    public q3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, 21, f6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((s3) this.e).invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.s2) this.e).invalidate();
                return;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.e).invalidate();
                return;
        }
    }

    public q3(s3 s3Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 24, f6Var);
        this.d = 0;
        this.e = s3Var;
    }
}
