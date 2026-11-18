package jg;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.z4;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.w50;
import org.telegram.ui.x50;
public final class q1 extends TimerTask {
    public final int f17631a;
    public final Object f17632b;
    public final Object f17633c;

    public q1(int i7, Object obj, Object obj2) {
        this.f17631a = i7;
        this.f17633c = obj;
        this.f17632b = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17631a) {
            case 0:
                s1 s1Var = (s1) this.f17633c;
                try {
                    s1Var.f17653n.cancel();
                    s1Var.f17653n = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                s1Var.getClass();
                org.telegram.messenger.g0.g3(new hi.r1(24, s1Var, (String) this.f17632b));
                return;
            case 1:
                synchronized (((MediaController) this.f17633c).f22747x1) {
                    org.telegram.messenger.g0.g3(new z4(25, this, (fj) this.f17632b));
                }
                return;
            case 2:
                try {
                    ((Timer) ((ck) this.f17633c).h).cancel();
                    ((ck) this.f17633c).h = null;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                Utilities.f22781g.c(new hn0(28, (ck) this.f17633c, (String) this.f17632b));
                return;
            default:
                x50 x50Var = (x50) this.f17633c;
                try {
                    x50Var.f53593f.cancel();
                    x50Var.f53593f = null;
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                org.telegram.messenger.g0.g3(new w50(this, (String) this.f17632b, 0));
                return;
        }
    }
}
