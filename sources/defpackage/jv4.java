package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
public final class jv4 extends tl {
    public final kv4 N;

    public jv4(kv4 kv4Var, ViewGroup viewGroup, int i) {
        super(i, viewGroup);
        this.N = kv4Var;
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
