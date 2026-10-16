package bi;

import android.content.Context;
import android.view.View;
public final class vb extends rg.u0 {
    public final wb Q;

    public vb(wb wbVar, Context context, float f7) {
        super(context, f7);
        this.Q = wbVar;
    }

    @Override
    public final void invalidate() {
        View view = this.Q.f3942c;
        if (view != null) {
            view.invalidate();
        }
    }
}
