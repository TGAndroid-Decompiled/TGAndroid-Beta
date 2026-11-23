package ch;

import org.telegram.ui.Components.eb0;
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
                ai.h0 h0Var = b0Var.f5291c;
                if (h0Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(h0Var);
                    } else {
                        try {
                            b0Var.f5290b.removeView(h0Var);
                        } catch (Exception unused) {
                        }
                    }
                    eb0 eb0Var = b0Var.f5302p;
                    if (eb0Var != null) {
                        eb0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
