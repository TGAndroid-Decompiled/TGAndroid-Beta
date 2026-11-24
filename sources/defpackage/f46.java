package defpackage;

import android.content.Context;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class f46 extends LimitPreviewView {
    public final g46 q0;

    public f46(g46 g46Var, Context context, int i, int i2, int i3, float f, ylb ylbVar) {
        super(context, i, i2, i3, f, ylbVar);
        this.q0 = g46Var;
    }

    @Override
    public final void invalidate() {
        if (this.q0.e.a2) {
            return;
        }
        super.invalidate();
    }
}
