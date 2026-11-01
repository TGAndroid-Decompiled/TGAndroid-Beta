package kg;

import android.content.Context;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class o0 extends LimitPreviewView {
    public final p0 f11209p0;

    public o0(p0 p0Var, Context context, int i10, int i11, int i12, float f7, p6 p6Var) {
        super(context, i10, i11, i12, f7, p6Var);
        this.f11209p0 = p0Var;
    }

    @Override
    public final void invalidate() {
        if (this.f11209p0.e.X1) {
            return;
        }
        super.invalidate();
    }
}
