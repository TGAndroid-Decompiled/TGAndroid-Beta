package jg;

import hi.h4;
import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.x4;
import org.telegram.ui.Components.vj;
import org.telegram.ui.u50;
import org.telegram.ui.v50;
public final class q1 extends TimerTask {
    public final int f17248a;
    public final Object f17249b;
    public final Object f17250c;

    public q1(int i7, Object obj, Object obj2) {
        this.f17248a = i7;
        this.f17250c = obj;
        this.f17249b = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17248a) {
            case 0:
                s1 s1Var = (s1) this.f17250c;
                try {
                    s1Var.f17270n.cancel();
                    s1Var.f17270n = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                s1Var.getClass();
                org.telegram.messenger.g0.h3(new h4(21, s1Var, (String) this.f17249b));
                return;
            case 1:
                synchronized (((MediaController) this.f17250c).f22384x1) {
                    org.telegram.messenger.g0.h3(new x4(25, this, (gj) this.f17249b));
                }
                return;
            case 2:
                try {
                    ((Timer) ((vj) this.f17250c).h).cancel();
                    ((vj) this.f17250c).h = null;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                Utilities.f22418g.c(new org.telegram.ui.Components.voip.u(3, (vj) this.f17250c, (String) this.f17249b));
                return;
            default:
                v50 v50Var = (v50) this.f17250c;
                try {
                    v50Var.f52135f.cancel();
                    v50Var.f52135f = null;
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                org.telegram.messenger.g0.h3(new u50(this, (String) this.f17249b, 0));
                return;
        }
    }
}
