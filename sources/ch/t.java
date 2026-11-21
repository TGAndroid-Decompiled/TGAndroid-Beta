package ch;

import org.telegram.ui.Components.hb0;
public final class t implements Runnable {
    public final int f5546a;
    public final b0 f5547b;

    public t(b0 b0Var, int i7) {
        this.f5546a = i7;
        this.f5547b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f5546a) {
            case 0:
                this.f5547b.f5323a.invalidate();
                return;
            default:
                b0 b0Var = this.f5547b;
                ai.l0 l0Var = b0Var.f5325c;
                if (l0Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(l0Var);
                    } else {
                        try {
                            b0Var.f5324b.removeView(l0Var);
                        } catch (Exception unused) {
                        }
                    }
                    hb0 hb0Var = b0Var.f5336p;
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
