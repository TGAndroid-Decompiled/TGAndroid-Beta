package bi;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
public final class b3 extends org.telegram.ui.Components.n5 {
    public final c3 N;

    public b3(c3 c3Var, ViewGroup viewGroup, int i7) {
        super(i7, viewGroup);
        this.N = c3Var;
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
