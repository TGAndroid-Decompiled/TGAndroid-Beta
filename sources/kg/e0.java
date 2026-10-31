package kg;

import android.content.Context;
import org.telegram.ui.ActionBar.p6;
public final class e0 extends x0 {
    public final q0 R;

    public e0(q0 q0Var, Context context, p6 p6Var) {
        super(context, p6Var, true);
        this.R = q0Var;
    }

    @Override
    public final void invalidate() {
        if (this.R.X1) {
            return;
        }
        super.invalidate();
    }
}
