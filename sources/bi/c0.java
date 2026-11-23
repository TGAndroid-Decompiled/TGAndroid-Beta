package bi;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.n80;
public final class c0 implements Runnable {
    public final int f3452a;
    public final hi.l3 f3453b;

    public c0(hi.l3 l3Var, int i7) {
        this.f3452a = i7;
        this.f3453b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f3452a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f3453b);
                return;
            case 1:
                org.telegram.messenger.g0.E2(this.f3453b);
                return;
            case 2:
                org.telegram.messenger.g0.E2(this.f3453b);
                return;
            case 3:
                this.f3453b.A();
                return;
            default:
                this.f3453b.getClass();
                return;
        }
    }

    public c0(hi.l3 l3Var, n80 n80Var, ClickableSpan clickableSpan) {
        this.f3452a = 4;
        this.f3453b = l3Var;
    }
}
