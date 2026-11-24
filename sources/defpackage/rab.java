package defpackage;

import android.content.Context;
import android.view.View;
public final class rab extends gd6 {
    public final sab R;

    public rab(sab sabVar, Context context, float f) {
        super(context, f);
        this.R = sabVar;
    }

    @Override
    public final void invalidate() {
        View view = this.R.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
