package bi;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
public final class x2 extends org.telegram.ui.Components.m5 {
    public final y2 N;

    public x2(y2 y2Var, ViewGroup viewGroup, int i7) {
        super(i7, viewGroup);
        this.N = y2Var;
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
