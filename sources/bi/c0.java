package bi;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.a80;
public final class c0 implements Runnable {
    public final int f3402a;
    public final hi.l3 f3403b;

    public c0(hi.l3 l3Var, int i7) {
        this.f3402a = i7;
        this.f3403b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f3402a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f3403b);
                return;
            case 1:
                org.telegram.messenger.g0.E2(this.f3403b);
                return;
            case 2:
                org.telegram.messenger.g0.E2(this.f3403b);
                return;
            case 3:
                this.f3403b.z();
                return;
            default:
                this.f3403b.getClass();
                return;
        }
    }

    public c0(hi.l3 l3Var, a80 a80Var, ClickableSpan clickableSpan) {
        this.f3402a = 4;
        this.f3403b = l3Var;
    }
}
