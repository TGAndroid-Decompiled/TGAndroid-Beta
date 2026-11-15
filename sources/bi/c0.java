package bi;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.a80;
public final class c0 implements Runnable {
    public final int f3405a;
    public final hi.l3 f3406b;

    public c0(hi.l3 l3Var, int i7) {
        this.f3405a = i7;
        this.f3406b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f3405a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f3406b);
                return;
            case 1:
                org.telegram.messenger.g0.E2(this.f3406b);
                return;
            case 2:
                org.telegram.messenger.g0.E2(this.f3406b);
                return;
            case 3:
                this.f3406b.z();
                return;
            default:
                this.f3406b.getClass();
                return;
        }
    }

    public c0(hi.l3 l3Var, a80 a80Var, ClickableSpan clickableSpan) {
        this.f3405a = 4;
        this.f3406b = l3Var;
    }
}
