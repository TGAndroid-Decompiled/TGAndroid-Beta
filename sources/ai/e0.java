package ai;

import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class e0 implements View.OnKeyListener {
    public final int f1183a;
    public final FrameLayout f1184b;

    public e0(int i7, FrameLayout frameLayout) {
        this.f1183a = i7;
        this.f1184b = frameLayout;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.h1 h1Var;
        switch (this.f1183a) {
            case 0:
                bi.x0 x0Var = (bi.x0) this.f1184b;
                if (i7 != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    x0Var.c(null);
                }
                return true;
            case 1:
                bi.x0 x0Var2 = (bi.x0) this.f1184b;
                if (i7 != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    x0Var2.c(null);
                }
                return true;
            case 2:
                bi.x0 x0Var3 = (bi.x0) this.f1184b;
                if (i7 != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    x0Var3.c(null);
                }
                return true;
            default:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.f1184b;
                r0Var.getClass();
                if (i7 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && (h1Var = r0Var.d) != null && h1Var.isShowing()) {
                    r0Var.d.d(true);
                    return true;
                }
                return false;
        }
    }
}
