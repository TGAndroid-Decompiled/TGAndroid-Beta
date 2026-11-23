package jg;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.z4;
import org.telegram.ui.Components.dk;
import org.telegram.ui.w50;
import org.telegram.ui.x50;
public final class q1 extends TimerTask {
    public final int f17727a;
    public final Object f17728b;
    public final Object f17729c;

    public q1(int i7, Object obj, Object obj2) {
        this.f17727a = i7;
        this.f17729c = obj;
        this.f17728b = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17727a) {
            case 0:
                s1 s1Var = (s1) this.f17729c;
                try {
                    s1Var.f17749n.cancel();
                    s1Var.f17749n = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                s1Var.getClass();
                org.telegram.messenger.g0.g3(new hi.c(28, s1Var, (String) this.f17728b));
                return;
            case 1:
                synchronized (((MediaController) this.f17729c).f22845x1) {
                    org.telegram.messenger.g0.g3(new z4(25, this, (fj) this.f17728b));
                }
                return;
            case 2:
                try {
                    ((Timer) ((dk) this.f17729c).h).cancel();
                    ((dk) this.f17729c).h = null;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                Utilities.f22879g.c(new org.telegram.ui.Components.voip.o(4, (dk) this.f17729c, (String) this.f17728b));
                return;
            default:
                x50 x50Var = (x50) this.f17729c;
                try {
                    x50Var.f53859f.cancel();
                    x50Var.f53859f = null;
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                org.telegram.messenger.g0.g3(new w50(this, (String) this.f17728b, 0));
                return;
        }
    }
}
