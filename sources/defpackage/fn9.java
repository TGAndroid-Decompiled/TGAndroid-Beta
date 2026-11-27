package defpackage;

import android.os.Handler;
import j$.util.Objects;
public final class fn9 implements Runnable {
    public final byte a;
    public final on9 b;
    public final cp9 c;
    public final long d;

    public fn9(on9 on9Var, cp9 cp9Var, long j, byte b) {
        this.a = b;
        this.b = on9Var;
        this.c = cp9Var;
        this.d = j;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                on9 on9Var = this.b;
                on9Var.c.post(new fn9(on9Var, this.c, this.d, (byte) 1));
                return;
            default:
                on9 on9Var2 = this.b;
                cp9 cp9Var = this.c;
                long j = this.d;
                if (on9Var2.U && on9Var2.F == cp9Var) {
                    sn9 sn9Var = on9Var2.j;
                    sn9Var.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + on9.x(j));
                    jp9 jp9Var = (jp9) on9Var2.k.b;
                    Handler handler = jp9Var.i;
                    kj4 kj4Var = jp9Var.d;
                    Objects.requireNonNull(kj4Var);
                    handler.post(new v59(kj4Var, (byte) 17));
                    return;
                }
                return;
        }
    }
}
