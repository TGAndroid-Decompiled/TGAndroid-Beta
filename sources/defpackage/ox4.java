package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
public final class ox4 extends ul {
    public final px4 N;

    public ox4(px4 px4Var, ViewGroup viewGroup, int i) {
        super(i, viewGroup);
        this.N = px4Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.N;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
