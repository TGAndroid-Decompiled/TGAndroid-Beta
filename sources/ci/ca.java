package ci;

import android.content.Context;
import android.view.View;
public final class ca extends rg.s0 {
    public final da Q;

    public ca(da daVar, Context context, float f7) {
        super(context, f7);
        this.Q = daVar;
    }

    @Override
    public final void invalidate() {
        View view = this.Q.f5273c;
        if (view != null) {
            view.invalidate();
        }
    }
}
