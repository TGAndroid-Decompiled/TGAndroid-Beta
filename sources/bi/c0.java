package bi;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.l80;
public final class c0 implements Runnable {
    public final int f3480a;
    public final hi.m3 f3481b;

    public c0(hi.m3 m3Var, int i7) {
        this.f3480a = i7;
        this.f3481b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f3480a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f3481b);
                return;
            case 1:
                org.telegram.messenger.g0.E2(this.f3481b);
                return;
            case 2:
                org.telegram.messenger.g0.E2(this.f3481b);
                return;
            case 3:
                this.f3481b.A();
                return;
            default:
                this.f3481b.getClass();
                return;
        }
    }

    public c0(hi.m3 m3Var, l80 l80Var, ClickableSpan clickableSpan) {
        this.f3480a = 4;
        this.f3481b = m3Var;
    }
}
