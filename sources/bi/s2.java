package bi;

import android.text.style.ClickableSpan;
import org.telegram.ui.Components.y70;
public final class s2 implements Runnable {
    public final int f4664a;
    public final fi.m3 f4665b;

    public s2(fi.m3 m3Var, int i7) {
        this.f4664a = i7;
        this.f4665b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f4664a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f4665b);
                return;
            case 1:
                org.telegram.messenger.g0.E2(this.f4665b);
                return;
            case 2:
                this.f4665b.z();
                return;
            case 3:
                this.f4665b.getClass();
                return;
            default:
                org.telegram.messenger.g0.E2(this.f4665b);
                return;
        }
    }

    public s2(fi.m3 m3Var, y70 y70Var, ClickableSpan clickableSpan) {
        this.f4664a = 3;
        this.f4665b = m3Var;
    }
}
