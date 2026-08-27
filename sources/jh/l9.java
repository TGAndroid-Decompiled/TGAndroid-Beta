package jh;

import android.content.Context;
import android.view.View;

public final class l9 extends zf.r0 {
    public final m9 M;

    public l9(m9 m9Var, Context context, float f10) {
        super(context, f10);
        this.M = m9Var;
    }

    @Override
    public final void invalidate() {
        View view = this.M.f13671c;
        if (view != null) {
            view.invalidate();
        }
    }
}
