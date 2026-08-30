package kh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
public final class t1 extends org.telegram.ui.Components.j5 {
    public final u1 J;

    public t1(u1 u1Var, ViewGroup viewGroup, int i10) {
        super(i10, viewGroup);
        this.J = u1Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.J;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
