package ch;

import bi.x5;
import org.telegram.ui.Components.pb0;
public final class s implements Runnable {
    public final int f6394a;
    public final b0 f6395b;

    public s(b0 b0Var, int i7) {
        this.f6394a = i7;
        this.f6395b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f6394a) {
            case 0:
                this.f6395b.f6181a.invalidate();
                return;
            default:
                b0 b0Var = this.f6395b;
                x5 x5Var = b0Var.f6183c;
                if (x5Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(x5Var);
                    } else {
                        try {
                            b0Var.f6182b.removeView(x5Var);
                        } catch (Exception unused) {
                        }
                    }
                    pb0 pb0Var = b0Var.f6194p;
                    if (pb0Var != null) {
                        pb0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
