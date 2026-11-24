package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class qv2 extends m8 {
    public final tv2 o;

    public qv2(tv2 tv2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = tv2Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        xv2 xv2Var = this.o.a;
        xv2Var.k = null;
        xv2Var.K = false;
        if (xv2Var.R) {
            xv2Var.b();
        }
        View view = xv2Var.h;
        if (view != null) {
            if (view instanceof xya) {
                ((xya) view).setScaled(false);
            } else if (view instanceof uya) {
                ((uya) view).setScaled(false);
            } else if (view instanceof bw2) {
                ((bw2) view).setScaled(false);
            }
            xv2Var.h = null;
        }
    }
}
