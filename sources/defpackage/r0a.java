package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class r0a extends g31 {
    public int c;

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            int themedColor = getThemedColor(cmb.xj);
            bf0 bf0Var = this.a;
            if (bf0Var != null && themedColor != this.c) {
                this.c = themedColor;
                bf0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
