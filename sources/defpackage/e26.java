package defpackage;

import android.content.Context;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class e26 extends LimitPreviewView {
    public final f26 q0;

    public e26(f26 f26Var, Context context, int i, int i2, int i3, float f, wjb wjbVar) {
        super(context, i, i2, i3, f, wjbVar);
        this.q0 = f26Var;
    }

    @Override
    public final void invalidate() {
        if (this.q0.e.a2) {
            return;
        }
        super.invalidate();
    }
}
