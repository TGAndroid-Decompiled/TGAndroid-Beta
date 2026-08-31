package fg;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
public final class g0 extends b1 {
    public final v0 M;

    public g0(v0 v0Var, Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.M = v0Var;
    }

    @Override
    public final void invalidate() {
        if (this.M.f6583c0) {
            return;
        }
        super.invalidate();
    }
}
