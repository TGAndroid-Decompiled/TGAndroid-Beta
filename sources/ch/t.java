package ch;

import org.telegram.ui.Components.hb0;
public final class t implements Runnable {
    public final int f5549a;
    public final b0 f5550b;

    public t(b0 b0Var, int i7) {
        this.f5549a = i7;
        this.f5550b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f5549a) {
            case 0:
                this.f5550b.f5326a.invalidate();
                return;
            default:
                b0 b0Var = this.f5550b;
                ai.l0 l0Var = b0Var.f5328c;
                if (l0Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(l0Var);
                    } else {
                        try {
                            b0Var.f5327b.removeView(l0Var);
                        } catch (Exception unused) {
                        }
                    }
                    hb0 hb0Var = b0Var.f5339p;
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
