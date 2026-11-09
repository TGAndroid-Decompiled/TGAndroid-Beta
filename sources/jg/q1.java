package jg;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ij;
import org.telegram.messenger.x4;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.oj;
import org.telegram.ui.x50;
import org.telegram.ui.y50;
public final class q1 extends TimerTask {
    public final int f16896a;
    public final Object f16897b;
    public final Object f16898c;

    public q1(int i7, Object obj, Object obj2) {
        this.f16896a = i7;
        this.f16898c = obj;
        this.f16897b = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16896a) {
            case 0:
                s1 s1Var = (s1) this.f16898c;
                try {
                    s1Var.f16919n.cancel();
                    s1Var.f16919n = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                s1Var.getClass();
                org.telegram.messenger.g0.h3(new ha.b(14, s1Var, (String) this.f16897b));
                return;
            case 1:
                synchronized (((MediaController) this.f16898c).f21301w1) {
                    org.telegram.messenger.g0.h3(new x4(25, this, (ij) this.f16897b));
                }
                return;
            case 2:
                try {
                    ((Timer) ((oj) this.f16898c).h).cancel();
                    ((oj) this.f16898c).h = null;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                Utilities.f21338g.c(new m51(8, (oj) this.f16898c, (String) this.f16897b));
                return;
            default:
                y50 y50Var = (y50) this.f16898c;
                try {
                    y50Var.f51913f.cancel();
                    y50Var.f51913f = null;
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                org.telegram.messenger.g0.h3(new x50(this, (String) this.f16897b, 0));
                return;
        }
    }
}
