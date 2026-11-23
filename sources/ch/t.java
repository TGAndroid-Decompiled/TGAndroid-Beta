package ch;

import org.telegram.ui.Components.hb0;
public final class t implements Runnable {
    public final int f5512a;
    public final b0 f5513b;

    public t(b0 b0Var, int i7) {
        this.f5512a = i7;
        this.f5513b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f5512a) {
            case 0:
                this.f5513b.f5289a.invalidate();
                return;
            default:
                b0 b0Var = this.f5513b;
                ai.g0 g0Var = b0Var.f5291c;
                if (g0Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(g0Var);
                    } else {
                        try {
                            b0Var.f5290b.removeView(g0Var);
                        } catch (Exception unused) {
                        }
                    }
                    hb0 hb0Var = b0Var.f5302p;
                    if (hb0Var != null) {
                        hb0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
