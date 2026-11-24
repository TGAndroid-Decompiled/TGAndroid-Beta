package defpackage;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class yy2 extends TimerTask {
    public final byte a;
    public final Object b;
    public final Object c;

    public yy2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ((Timer) ((h42) this.c).h).cancel();
                    ((h42) this.c).h = null;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                Utilities.g.c(new mv2((h42) this.c, (String) this.b, (byte) 5));
                return;
            case 1:
                bs5 bs5Var = (bs5) this.c;
                try {
                    bs5Var.f.cancel();
                    bs5Var.f = null;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
                gm.c3(new as5(this, (String) this.b, (byte) 0));
                return;
            case 2:
                synchronized (((MediaController) this.c).x1) {
                    gm.c3(new lj6(this, (k47) this.b, (byte) 7));
                }
                return;
            default:
                ut9 ut9Var = (ut9) this.c;
                try {
                    ut9Var.n.cancel();
                    ut9Var.n = null;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
                ut9Var.getClass();
                gm.c3(new il9(ut9Var, (String) this.b, (byte) 13));
                return;
        }
    }
}
