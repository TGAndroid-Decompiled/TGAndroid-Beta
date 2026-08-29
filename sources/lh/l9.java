package lh;

import android.content.Context;
import android.view.View;
public final class l9 extends bg.n1 {
    public final m9 M;

    public l9(m9 m9Var, Context context, float f9) {
        super(context, f9);
        this.M = m9Var;
    }

    @Override
    public final void invalidate() {
        View view = this.M.f15946c;
        if (view != null) {
            view.invalidate();
        }
    }
}
