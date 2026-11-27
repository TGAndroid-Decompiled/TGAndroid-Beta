package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
public final class j2a extends h21 {
    public int c;

    @Override
    public final void updateColors() {
        super.updateColors();
        try {
            int themedColor = getThemedColor(aob.yj);
            de0 de0Var = this.a;
            if (de0Var != null && themedColor != this.c) {
                this.c = themedColor;
                de0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
