package ai;

import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class d0 implements View.OnKeyListener {
    public final int f1176a;
    public final FrameLayout f1177b;

    public d0(int i7, FrameLayout frameLayout) {
        this.f1176a = i7;
        this.f1177b = frameLayout;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        switch (this.f1176a) {
            case 0:
                bi.x0 x0Var = (bi.x0) this.f1177b;
                if (i7 != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    x0Var.c(null);
                }
                return true;
            case 1:
                bi.x0 x0Var2 = (bi.x0) this.f1177b;
                if (i7 != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    x0Var2.c(null);
                }
                return true;
            case 2:
                bi.x0 x0Var3 = (bi.x0) this.f1177b;
                if (i7 != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    x0Var3.c(null);
                }
                return true;
            default:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f1177b;
                q0Var.getClass();
                if (i7 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && (g1Var = q0Var.d) != null && g1Var.isShowing()) {
                    q0Var.d.d(true);
                    return true;
                }
                return false;
        }
    }
}
