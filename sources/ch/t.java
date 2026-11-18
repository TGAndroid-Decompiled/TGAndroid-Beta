package ch;

import org.telegram.ui.Components.gb0;
public final class t implements Runnable {
    public final int f5517a;
    public final b0 f5518b;

    public t(b0 b0Var, int i7) {
        this.f5517a = i7;
        this.f5518b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f5517a) {
            case 0:
                this.f5518b.f5294a.invalidate();
                return;
            default:
                b0 b0Var = this.f5518b;
                ai.k0 k0Var = b0Var.f5296c;
                if (k0Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(k0Var);
                    } else {
                        try {
                            b0Var.f5295b.removeView(k0Var);
                        } catch (Exception unused) {
                        }
                    }
                    gb0 gb0Var = b0Var.f5307p;
                    if (gb0Var != null) {
                        gb0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
