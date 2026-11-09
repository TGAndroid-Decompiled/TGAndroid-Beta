package fi;

import org.telegram.messenger.c20;
import org.telegram.ui.LaunchActivity;
public final class j9 implements Runnable {
    public final int f12242a;
    public final c20 f12243b;

    public j9(c20 c20Var, int i7) {
        this.f12242a = i7;
        this.f12243b = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f12242a) {
            case 0:
                this.f12243b.a(LaunchActivity.T());
                return;
            case 1:
                org.telegram.messenger.g0.h3(new j9(this.f12243b, 3));
                return;
            case 2:
                this.f12243b.a(null);
                return;
            default:
                this.f12243b.a(null);
                return;
        }
    }
}
