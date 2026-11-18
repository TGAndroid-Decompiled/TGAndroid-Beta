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
    public final int f17634a;
    public final Object f17635b;
    public final Object f17636c;

    public q1(int i7, Object obj, Object obj2) {
        this.f17634a = i7;
        this.f17636c = obj;
        this.f17635b = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17634a) {
            case 0:
                s1 s1Var = (s1) this.f17636c;
                try {
                    s1Var.f17656n.cancel();
                    s1Var.f17656n = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                s1Var.getClass();
                org.telegram.messenger.g0.g3(new hi.r1(24, s1Var, (String) this.f17635b));
                return;
            case 1:
                synchronized (((MediaController) this.f17636c).f22750x1) {
                    org.telegram.messenger.g0.g3(new z4(25, this, (fj) this.f17635b));
                }
                return;
            case 2:
                try {
                    ((Timer) ((ck) this.f17636c).h).cancel();
                    ((ck) this.f17636c).h = null;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                Utilities.f22784g.c(new hn0(28, (ck) this.f17636c, (String) this.f17635b));
                return;
            default:
                x50 x50Var = (x50) this.f17636c;
                try {
                    x50Var.f53642f.cancel();
                    x50Var.f53642f = null;
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                org.telegram.messenger.g0.g3(new w50(this, (String) this.f17635b, 0));
                return;
        }
    }
}
