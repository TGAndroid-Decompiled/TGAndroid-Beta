package jg;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.z4;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.w50;
import org.telegram.ui.x50;
public final class q1 extends TimerTask {
    public final int f17625a;
    public final Object f17626b;
    public final Object f17627c;

    public q1(int i7, Object obj, Object obj2) {
        this.f17625a = i7;
        this.f17627c = obj;
        this.f17626b = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17625a) {
            case 0:
                s1 s1Var = (s1) this.f17627c;
                try {
                    s1Var.f17647n.cancel();
                    s1Var.f17647n = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                s1Var.getClass();
                org.telegram.messenger.g0.g3(new hi.q1(24, s1Var, (String) this.f17626b));
                return;
            case 1:
                synchronized (((MediaController) this.f17627c).f22742x1) {
                    org.telegram.messenger.g0.g3(new z4(25, this, (gj) this.f17626b));
                }
                return;
            case 2:
                try {
                    ((Timer) ((ek) this.f17627c).h).cancel();
                    ((ek) this.f17627c).h = null;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                Utilities.f22776g.c(new jn0(28, (ek) this.f17627c, (String) this.f17626b));
                return;
            default:
                x50 x50Var = (x50) this.f17627c;
                try {
                    x50Var.f53560f.cancel();
                    x50Var.f53560f = null;
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                org.telegram.messenger.g0.g3(new w50(this, (String) this.f17626b, 0));
                return;
        }
    }
}
