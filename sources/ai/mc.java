package ai;

import android.content.Context;
import android.view.View;
public final class mc extends qg.v0 {
    public final nc Q;

    public mc(nc ncVar, Context context, float f7) {
        super(context, f7);
        this.Q = ncVar;
    }

    @Override
    public final void invalidate() {
        View view = this.Q.f1319c;
        if (view != null) {
            view.invalidate();
        }
    }
}
