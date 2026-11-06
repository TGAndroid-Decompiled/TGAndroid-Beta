package fi;

import org.telegram.messenger.c20;
import org.telegram.ui.LaunchActivity;
public final class k9 implements Runnable {
    public final int f12278a;
    public final c20 f12279b;

    public k9(c20 c20Var, int i7) {
        this.f12278a = i7;
        this.f12279b = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f12278a) {
            case 0:
                this.f12279b.a(LaunchActivity.T());
                return;
            case 1:
                org.telegram.messenger.g0.h3(new k9(this.f12279b, 3));
                return;
            case 2:
                this.f12279b.a(null);
                return;
            default:
                this.f12279b.a(null);
                return;
        }
    }
}
