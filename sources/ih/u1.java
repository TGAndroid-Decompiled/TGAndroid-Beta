package ih;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
public final class u1 extends org.telegram.ui.Components.n5 {
    public final v1 I;

    public u1(v1 v1Var, ViewGroup viewGroup, int i10) {
        super(i10, viewGroup);
        this.I = v1Var;
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
