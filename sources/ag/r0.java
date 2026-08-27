package ag;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;

public final class r0 extends s1 {
    public final i1 L;

    public r0(i1 i1Var, Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.L = i1Var;
    }

    @Override
    public final void invalidate() {
        if (this.L.f430b0) {
            return;
        }
        super.invalidate();
    }
}
