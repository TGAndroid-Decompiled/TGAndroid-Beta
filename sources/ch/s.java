package ch;

import org.telegram.ui.Components.wa0;
public final class s implements Runnable {
    public final int f5231a;
    public final b0 f5232b;

    public s(b0 b0Var, int i7) {
        this.f5231a = i7;
        this.f5232b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f5231a) {
            case 0:
                this.f5232b.f5011a.invalidate();
                return;
            default:
                b0 b0Var = this.f5232b;
                ai.k0 k0Var = b0Var.f5013c;
                if (k0Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(k0Var);
                    } else {
                        try {
                            b0Var.f5012b.removeView(k0Var);
                        } catch (Exception unused) {
                        }
                    }
                    wa0 wa0Var = b0Var.f5024p;
                    if (wa0Var != null) {
                        wa0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
