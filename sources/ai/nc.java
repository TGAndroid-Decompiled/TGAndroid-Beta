package ai;

import android.content.Context;
import android.view.View;
public final class nc extends qg.s0 {
    public final oc Q;

    public nc(oc ocVar, Context context, float f7) {
        super(context, f7);
        this.Q = ocVar;
    }

    @Override
    public final void invalidate() {
        View view = this.Q.f1557c;
        if (view != null) {
            view.invalidate();
        }
    }
}
