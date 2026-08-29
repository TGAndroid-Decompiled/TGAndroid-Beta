package cg;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class t0 extends LimitPreviewView {
    public final u0 f3375i0;

    public t0(u0 u0Var, Context context, int i10, int i11, int i12, float f9, c6 c6Var) {
        super(context, i10, i11, i12, f9, c6Var);
        this.f3375i0 = u0Var;
    }

    @Override
    public final void invalidate() {
        if (this.f3375i0.f3394e.f3402b0) {
            return;
        }
        super.invalidate();
    }
}
