package fh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
public final class a2 extends org.telegram.ui.Components.i5 {
    public final b2 I;

    public a2(b2 b2Var, ViewGroup viewGroup, int i9) {
        super(i9, viewGroup);
        this.I = b2Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = this.I;
        if (drawable.getCallback() != null) {
            drawable.getCallback().invalidateDrawable(drawable);
        }
    }
}
