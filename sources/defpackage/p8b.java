package defpackage;

import android.content.Context;
import android.view.View;
public final class p8b extends hb6 {
    public final q8b R;

    public p8b(q8b q8bVar, Context context, float f) {
        super(context, f);
        this.R = q8bVar;
    }

    @Override
    public final void invalidate() {
        View view = this.R.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
