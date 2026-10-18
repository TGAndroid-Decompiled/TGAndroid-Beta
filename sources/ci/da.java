package ci;

import android.content.Context;
import android.view.View;
public final class da extends rg.s0 {
    public final ea Q;

    public da(ea eaVar, Context context, float f7) {
        super(context, f7);
        this.Q = eaVar;
    }

    @Override
    public final void invalidate() {
        View view = this.Q.f5375c;
        if (view != null) {
            view.invalidate();
        }
    }
}
