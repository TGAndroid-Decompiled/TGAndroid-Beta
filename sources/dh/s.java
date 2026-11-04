package dh;

import org.telegram.ui.Components.jb0;
public final class s implements Runnable {
    public final int f9151a;
    public final a0 f9152b;

    public s(a0 a0Var, int i3) {
        this.f9151a = i3;
        this.f9152b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f9151a) {
            case 0:
                this.f9152b.f8931a.invalidate();
                return;
            default:
                a0 a0Var = this.f9152b;
                ai.c0 c0Var = a0Var.f8933c;
                if (c0Var.getParent() != null) {
                    if (a0Var.d) {
                        org.telegram.messenger.g0.E2(c0Var);
                    } else {
                        try {
                            a0Var.f8932b.removeView(c0Var);
                        } catch (Exception unused) {
                        }
                    }
                    jb0 jb0Var = a0Var.f8944p;
                    if (jb0Var != null) {
                        jb0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
