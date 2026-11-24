package defpackage;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class ox2 extends TimerTask {
    public final byte a;
    public final Object b;
    public final Object c;

    public ox2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ((Timer) ((v22) this.c).h).cancel();
                    ((v22) this.c).h = null;
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                Utilities.g.c(new gu2((v22) this.c, (String) this.b, (byte) 4));
                return;
            case 1:
                dq5 dq5Var = (dq5) this.c;
                try {
                    dq5Var.f.cancel();
                    dq5Var.f = null;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                gl.d3(new cq5(this, (String) this.b, (byte) 0));
                return;
            case 2:
                synchronized (((MediaController) this.c).x1) {
                    gl.d3(new oh6(this, (k27) this.b, (byte) 6));
                }
                return;
            default:
                sr9 sr9Var = (sr9) this.c;
                try {
                    sr9Var.n.cancel();
                    sr9Var.n = null;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
                sr9Var.getClass();
                gl.d3(new tj9(sr9Var, (String) this.b, (byte) 11));
                return;
        }
    }
}
