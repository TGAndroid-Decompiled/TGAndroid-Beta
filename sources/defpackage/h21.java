package defpackage;

import android.widget.FrameLayout;
public final class h21 implements Runnable {
    public final byte a;
    public final u31 b;

    public h21(u31 u31Var, byte b) {
        this.a = b;
        this.b = u31Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        u31 u31Var = this.b;
        switch (b) {
            case 0:
                u31Var.b();
                return;
            case 1:
                FrameLayout frameLayout = u31Var.h;
                y21 y21Var = u31Var.e;
                q21 q21Var = u31Var.q;
                if (q21Var != null && !y21Var.top) {
                    q21Var.b(0.0f);
                    u31Var.q.c(u31Var);
                }
                y21Var.transitionRunningExit = false;
                y21Var.onExitTransitionEnd();
                y21Var.onHide();
                frameLayout.removeView(u31Var.f);
                frameLayout.removeOnLayoutChangeListener(u31Var.c);
                y21Var.onDetach();
                Runnable runnable = u31Var.w;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                FrameLayout frameLayout2 = u31Var.h;
                frameLayout2.removeView(u31Var.f);
                frameLayout2.removeOnLayoutChangeListener(u31Var.c);
                return;
        }
    }
}
