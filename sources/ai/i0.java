package ai;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.t70;
public final class i0 implements Runnable {
    public final int f691a;
    public final gi.l3 f692b;

    public i0(gi.l3 l3Var, int i3) {
        this.f691a = i3;
        this.f692b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f691a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f692b);
                return;
            case 1:
                org.telegram.messenger.g0.E2(this.f692b);
                return;
            case 2:
                org.telegram.messenger.g0.E2(this.f692b);
                return;
            case 3:
                this.f692b.z();
                return;
            default:
                this.f692b.getClass();
                return;
        }
    }

    public i0(gi.l3 l3Var, t70 t70Var, ClickableSpan clickableSpan) {
        this.f691a = 4;
        this.f692b = l3Var;
    }
}
