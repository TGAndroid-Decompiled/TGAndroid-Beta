package ch;

import org.telegram.ui.Components.gb0;
public final class t implements Runnable {
    public final int f5520a;
    public final b0 f5521b;

    public t(b0 b0Var, int i7) {
        this.f5520a = i7;
        this.f5521b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f5520a) {
            case 0:
                this.f5521b.f5297a.invalidate();
                return;
            default:
                b0 b0Var = this.f5521b;
                ai.k0 k0Var = b0Var.f5299c;
                if (k0Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(k0Var);
                    } else {
                        try {
                            b0Var.f5298b.removeView(k0Var);
                        } catch (Exception unused) {
                        }
                    }
                    gb0 gb0Var = b0Var.f5310p;
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
