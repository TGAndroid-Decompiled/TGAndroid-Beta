package eg;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class t0 extends LimitPreviewView {
    public final u0 f5498j0;

    public t0(u0 u0Var, Context context, int i10, int i11, int i12, float f10, f6 f6Var) {
        super(context, i10, i11, i12, f10, f6Var);
        this.f5498j0 = u0Var;
    }

    @Override
    public final void invalidate() {
        if (this.f5498j0.e.f5525c0) {
            return;
        }
        super.invalidate();
    }
}
