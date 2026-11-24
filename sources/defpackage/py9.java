package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class py9 extends y11 {
    public int c;

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            int themedColor = getThemedColor(bkb.xj);
            be0 be0Var = this.a;
            if (be0Var != null && themedColor != this.c) {
                this.c = themedColor;
                be0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
