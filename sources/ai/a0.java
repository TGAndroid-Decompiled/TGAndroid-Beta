package ai;

import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public final class a0 implements View.OnKeyListener {
    public final int f1115a;
    public final FrameLayout f1116b;

    public a0(int i7, FrameLayout frameLayout) {
        this.f1115a = i7;
        this.f1116b = frameLayout;
    }

    @Override
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        switch (this.f1115a) {
            case 0:
                bi.b1 b1Var = (bi.b1) this.f1116b;
                if (i7 != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    LinearLayout linearLayout = b1Var.f3394e;
                    if (linearLayout != null && !b1Var.O) {
                        b1Var.f3394e = null;
                        b1Var.h(linearLayout, false);
                    } else {
                        b1Var.c(null);
                    }
                }
                return true;
            case 1:
                bi.b1 b1Var2 = (bi.b1) this.f1116b;
                if (i7 != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    b1Var2.c(null);
                }
                return true;
            case 2:
                bi.b1 b1Var3 = (bi.b1) this.f1116b;
                if (i7 != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    b1Var3.c(null);
                }
                return true;
            case 3:
                bi.b1 b1Var4 = (bi.b1) this.f1116b;
                if (i7 != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    b1Var4.c(null);
                }
                return true;
            default:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f1116b;
                q0Var.getClass();
                if (i7 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && (g1Var = q0Var.d) != null && g1Var.isShowing()) {
                    q0Var.d.d(true);
                    return true;
                }
                return false;
        }
    }
}
