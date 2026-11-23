package bi;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
public final class d3 extends org.telegram.ui.Components.m5 {
    public final e3 N;

    public d3(e3 e3Var, ViewGroup viewGroup, int i7) {
        super(i7, viewGroup);
        this.N = e3Var;
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
