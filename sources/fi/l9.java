package fi;

import android.content.Context;
import android.view.View;
public final class l9 extends tg.m0 {
    public final m9 R;

    public l9(m9 m9Var, Context context, float f10) {
        super(context, f10);
        this.R = m9Var;
    }

    @Override
    public final void invalidate() {
        View view = this.R.f12048c;
        if (view != null) {
            view.invalidate();
        }
    }
}
