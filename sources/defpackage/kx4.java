package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
public final class kx4 extends tm {
    public final lx4 N;

    public kx4(lx4 lx4Var, ViewGroup viewGroup, int i) {
        super(i, viewGroup);
        this.N = lx4Var;
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
