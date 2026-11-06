package ch;

import bi.x5;
import org.telegram.ui.Components.ob0;
public final class s implements Runnable {
    public final int f6396a;
    public final b0 f6397b;

    public s(b0 b0Var, int i7) {
        this.f6396a = i7;
        this.f6397b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f6396a) {
            case 0:
                this.f6397b.f6183a.invalidate();
                return;
            default:
                b0 b0Var = this.f6397b;
                x5 x5Var = b0Var.f6185c;
                if (x5Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(x5Var);
                    } else {
                        try {
                            b0Var.f6184b.removeView(x5Var);
                        } catch (Exception unused) {
                        }
                    }
                    ob0 ob0Var = b0Var.f6196p;
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
