package bi;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
public final class d2 extends org.telegram.ui.Components.e5 {
    public final e2 N;

    public d2(e2 e2Var, ViewGroup viewGroup, int i7) {
        super(i7, viewGroup);
        this.N = e2Var;
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
