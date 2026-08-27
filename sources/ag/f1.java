package ag;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.Premium.LimitPreviewView;

public final class f1 extends LimitPreviewView {

    public final g1 f374i0;

    public f1(g1 g1Var, Context context, int i10, int i11, int i12, float f10, c6 c6Var) {
        super(context, i10, i11, i12, f10, c6Var);
        this.f374i0 = g1Var;
    }

    @Override
    public final void invalidate() {
        if (this.f374i0.f389e.f430b0) {
            return;
        }
        super.invalidate();
    }
}
