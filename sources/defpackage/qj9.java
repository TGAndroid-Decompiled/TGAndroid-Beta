package defpackage;

import android.os.Handler;
import j$.util.Objects;
public final class qj9 implements Runnable {
    public final byte a;
    public final ak9 b;
    public final nl9 c;
    public final long d;

    public qj9(ak9 ak9Var, nl9 nl9Var, long j, byte b) {
        this.a = b;
        this.b = ak9Var;
        this.c = nl9Var;
        this.d = j;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                ak9 ak9Var = this.b;
                ak9Var.c.post(new qj9(ak9Var, this.c, this.d, (byte) 1));
                return;
            default:
                ak9 ak9Var2 = this.b;
                nl9 nl9Var = this.c;
                long j = this.d;
                if (ak9Var2.U && ak9Var2.F == nl9Var) {
                    ek9 ek9Var = ak9Var2.j;
                    ek9Var.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + ak9.x(j));
                    ul9 ul9Var = (ul9) ak9Var2.k.b;
                    Handler handler = ul9Var.i;
                    gi3 gi3Var = ul9Var.d;
                    Objects.requireNonNull(gi3Var);
                    handler.post(new zk9(gi3Var, (byte) 1));
                    return;
                }
                return;
        }
    }
}
