package ch;

import org.telegram.ui.Components.wa0;
public final class s implements Runnable {
    public final int f5228a;
    public final b0 f5229b;

    public s(b0 b0Var, int i7) {
        this.f5228a = i7;
        this.f5229b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f5228a) {
            case 0:
                this.f5229b.f5008a.invalidate();
                return;
            default:
                b0 b0Var = this.f5229b;
                ai.j0 j0Var = b0Var.f5010c;
                if (j0Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(j0Var);
                    } else {
                        try {
                            b0Var.f5009b.removeView(j0Var);
                        } catch (Exception unused) {
                        }
                    }
                    wa0 wa0Var = b0Var.f5021p;
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
