package defpackage;

import android.content.Context;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class i46 extends LimitPreviewView {
    public final j46 q0;

    public i46(j46 j46Var, Context context, int i, int i2, int i3, float f, vnb vnbVar) {
        super(context, i, i2, i3, f, vnbVar);
        this.q0 = j46Var;
    }

    @Override
    public final void invalidate() {
        if (this.q0.e.a2) {
            return;
        }
        super.invalidate();
    }
}
