package jg;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.z4;
import org.telegram.ui.Components.ek;
import org.telegram.ui.ss;
import org.telegram.ui.w50;
import org.telegram.ui.x50;
public final class q1 extends TimerTask {
    public final int f17659a;
    public final Object f17660b;
    public final Object f17661c;

    public q1(int i7, Object obj, Object obj2) {
        this.f17659a = i7;
        this.f17661c = obj;
        this.f17660b = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17659a) {
            case 0:
                s1 s1Var = (s1) this.f17661c;
                try {
                    s1Var.f17681n.cancel();
                    s1Var.f17681n = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                s1Var.getClass();
                org.telegram.messenger.g0.g3(new hi.c(26, s1Var, (String) this.f17660b));
                return;
            case 1:
                synchronized (((MediaController) this.f17661c).f22778x1) {
                    org.telegram.messenger.g0.g3(new z4(25, this, (gj) this.f17660b));
                }
                return;
            case 2:
                try {
                    ((Timer) ((ek) this.f17661c).h).cancel();
                    ((ek) this.f17661c).h = null;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                Utilities.f22812g.c(new ss(0, (ek) this.f17661c, (String) this.f17660b));
                return;
            default:
                x50 x50Var = (x50) this.f17661c;
                try {
                    x50Var.f53638f.cancel();
                    x50Var.f53638f = null;
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                org.telegram.messenger.g0.g3(new w50(this, (String) this.f17660b, 0));
                return;
        }
    }
}
