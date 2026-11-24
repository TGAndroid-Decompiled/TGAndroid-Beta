package defpackage;

import android.widget.FrameLayout;
public final class z01 implements Runnable {
    public final byte a;
    public final m21 b;

    public z01(m21 m21Var, byte b) {
        this.a = b;
        this.b = m21Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        m21 m21Var = this.b;
        switch (b) {
            case 0:
                m21Var.b();
                return;
            case 1:
                FrameLayout frameLayout = m21Var.h;
                q11 q11Var = m21Var.e;
                i11 i11Var = m21Var.p;
                if (i11Var != null && !q11Var.top) {
                    i11Var.b(0.0f);
                    m21Var.p.c(m21Var);
                }
                q11Var.transitionRunningExit = false;
                q11Var.onExitTransitionEnd();
                q11Var.onHide();
                frameLayout.removeView(m21Var.f);
                frameLayout.removeOnLayoutChangeListener(m21Var.c);
                q11Var.onDetach();
                Runnable runnable = m21Var.v;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                FrameLayout frameLayout2 = m21Var.h;
                frameLayout2.removeView(m21Var.f);
                frameLayout2.removeOnLayoutChangeListener(m21Var.c);
                return;
        }
    }
}
