package gh;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public final class x1 extends org.telegram.ui.Components.i5 {
    public final y1 I;

    public x1(y1 y1Var, ViewGroup viewGroup, int i10) {
        super(i10, viewGroup);
        this.I = y1Var;
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
