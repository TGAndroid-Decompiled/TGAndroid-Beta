package ai;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
public final class l2 extends org.telegram.ui.Components.e5 {
    public final m2 N;

    public l2(m2 m2Var, ViewGroup viewGroup, int i3) {
        super(i3, viewGroup);
        this.N = m2Var;
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
