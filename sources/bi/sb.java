package bi;

import android.content.Context;
import android.view.View;
public final class sb extends rg.u0 {
    public final tb Q;

    public sb(tb tbVar, Context context, float f7) {
        super(context, f7);
        this.Q = tbVar;
    }

    @Override
    public final void invalidate() {
        View view = this.Q.f3766c;
        if (view != null) {
            view.invalidate();
        }
    }
}
