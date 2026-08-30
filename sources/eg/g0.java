package eg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
public final class g0 extends c1 {
    public final v0 M;

    public g0(v0 v0Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.M = v0Var;
    }

    @Override
    public final void invalidate() {
        if (this.M.f5536c0) {
            return;
        }
        super.invalidate();
    }
}
