package bi;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.l80;
public final class c0 implements Runnable {
    public final int f3449a;
    public final hi.m3 f3450b;

    public c0(hi.m3 m3Var, int i7) {
        this.f3449a = i7;
        this.f3450b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f3449a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f3450b);
                return;
            case 1:
                org.telegram.messenger.g0.E2(this.f3450b);
                return;
            case 2:
                org.telegram.messenger.g0.E2(this.f3450b);
                return;
            case 3:
                this.f3450b.A();
                return;
            default:
                this.f3450b.getClass();
                return;
        }
    }

    public c0(hi.m3 m3Var, l80 l80Var, ClickableSpan clickableSpan) {
        this.f3449a = 4;
        this.f3450b = m3Var;
    }
}
