package fg;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class t0 extends LimitPreviewView {
    public final u0 f6554j0;

    public t0(u0 u0Var, Context context, int i10, int i11, int i12, float f10, g6 g6Var) {
        super(context, i10, i11, i12, f10, g6Var);
        this.f6554j0 = u0Var;
    }

    @Override
    public final void invalidate() {
        if (this.f6554j0.f6574e.f6583c0) {
            return;
        }
        super.invalidate();
    }
}
