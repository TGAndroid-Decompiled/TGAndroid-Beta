package jg;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.messenger.y4;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.oj;
import org.telegram.ui.v50;
import org.telegram.ui.w50;
public final class q1 extends TimerTask {
    public final int f16893a;
    public final Object f16894b;
    public final Object f16895c;

    public q1(int i7, Object obj, Object obj2) {
        this.f16893a = i7;
        this.f16895c = obj;
        this.f16894b = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16893a) {
            case 0:
                s1 s1Var = (s1) this.f16895c;
                try {
                    s1Var.f16916n.cancel();
                    s1Var.f16916n = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                s1Var.getClass();
                org.telegram.messenger.g0.h3(new ha.b(14, s1Var, (String) this.f16894b));
                return;
            case 1:
                synchronized (((MediaController) this.f16895c).f21298w1) {
                    org.telegram.messenger.g0.h3(new y4(25, this, (ij) this.f16894b));
                }
                return;
            case 2:
                try {
                    ((Timer) ((oj) this.f16895c).h).cancel();
                    ((oj) this.f16895c).h = null;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                Utilities.f21335g.c(new k51(8, (oj) this.f16895c, (String) this.f16894b));
                return;
            default:
                w50 w50Var = (w50) this.f16895c;
                try {
                    w50Var.f50961f.cancel();
                    w50Var.f50961f = null;
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                org.telegram.messenger.g0.h3(new v50(this, (String) this.f16894b, 0));
                return;
        }
    }
}
