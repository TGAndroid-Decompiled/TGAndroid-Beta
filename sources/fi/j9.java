package fi;

import org.telegram.messenger.c20;
import org.telegram.ui.LaunchActivity;
public final class j9 implements Runnable {
    public final int f12245a;
    public final c20 f12246b;

    public j9(c20 c20Var, int i7) {
        this.f12245a = i7;
        this.f12246b = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f12245a) {
            case 0:
                this.f12246b.a(LaunchActivity.T());
                return;
            case 1:
                org.telegram.messenger.g0.h3(new j9(this.f12246b, 3));
                return;
            case 2:
                this.f12246b.a(null);
                return;
            default:
                this.f12246b.a(null);
                return;
        }
    }
}
