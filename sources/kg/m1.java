package kg;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.y4;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.nj;
import org.telegram.ui.Components.p11;
import org.telegram.ui.p50;
import org.telegram.ui.q50;
public final class m1 extends TimerTask {
    public final int f17098a;
    public final Object f17099b;
    public final Object f17100c;

    public m1(int i3, Object obj, Object obj2) {
        this.f17098a = i3;
        this.f17100c = obj;
        this.f17099b = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17098a) {
            case 0:
                o1 o1Var = (o1) this.f17100c;
                try {
                    o1Var.f17129n.cancel();
                    o1Var.f17129n = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                o1Var.getClass();
                org.telegram.messenger.g0.h3(new ii.e(15, o1Var, (String) this.f17099b));
                return;
            case 1:
                synchronized (((MediaController) this.f17100c).f21355x1) {
                    org.telegram.messenger.g0.h3(new y4(25, this, (zi) this.f17099b));
                }
                return;
            case 2:
                try {
                    ((Timer) ((nj) this.f17100c).h).cancel();
                    ((nj) this.f17100c).h = null;
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                Utilities.f21389g.c(new p11(13, (nj) this.f17100c, (String) this.f17099b));
                return;
            default:
                q50 q50Var = (q50) this.f17100c;
                try {
                    q50Var.f48754f.cancel();
                    q50Var.f48754f = null;
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
                org.telegram.messenger.g0.h3(new p50(this, (String) this.f17099b, 0));
                return;
        }
    }
}
