package fi;

import android.content.Context;
import android.view.View;
public final class i9 extends tg.m0 {
    public final j9 R;

    public i9(j9 j9Var, Context context, float f10) {
        super(context, f10);
        this.R = j9Var;
    }

    @Override
    public final void invalidate() {
        View view = this.R.f12175c;
        if (view != null) {
            view.invalidate();
        }
    }
}
