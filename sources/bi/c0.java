package bi;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.k80;
public final class c0 implements Runnable {
    public final int f3425a;
    public final hi.u3 f3426b;

    public c0(hi.u3 u3Var, int i7) {
        this.f3425a = i7;
        this.f3426b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f3425a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f3426b);
                return;
            case 1:
                org.telegram.messenger.g0.E2(this.f3426b);
                return;
            case 2:
                org.telegram.messenger.g0.E2(this.f3426b);
                return;
            case 3:
                this.f3426b.A();
                return;
            default:
                this.f3426b.getClass();
                return;
        }
    }

    public c0(hi.u3 u3Var, k80 k80Var, ClickableSpan clickableSpan) {
        this.f3425a = 4;
        this.f3426b = u3Var;
    }
}
