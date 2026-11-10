package ch;

import bi.x5;
import org.telegram.ui.Components.ob0;
public final class s implements Runnable {
    public final int f6399a;
    public final b0 f6400b;

    public s(b0 b0Var, int i7) {
        this.f6399a = i7;
        this.f6400b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f6399a) {
            case 0:
                this.f6400b.f6186a.invalidate();
                return;
            default:
                b0 b0Var = this.f6400b;
                x5 x5Var = b0Var.f6188c;
                if (x5Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(x5Var);
                    } else {
                        try {
                            b0Var.f6187b.removeView(x5Var);
                        } catch (Exception unused) {
                        }
                    }
                    ob0 ob0Var = b0Var.f6199p;
                    if (ob0Var != null) {
                        ob0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
