package defpackage;

import android.os.Handler;
import j$.util.Objects;
public final class sl9 implements Runnable {
    public final byte a;
    public final bm9 b;
    public final nn9 c;
    public final long d;

    public sl9(bm9 bm9Var, nn9 nn9Var, long j, byte b) {
        this.a = b;
        this.b = bm9Var;
        this.c = nn9Var;
        this.d = j;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                bm9 bm9Var = this.b;
                bm9Var.c.post(new sl9(bm9Var, this.c, this.d, (byte) 1));
                return;
            default:
                bm9 bm9Var2 = this.b;
                nn9 nn9Var = this.c;
                long j = this.d;
                if (bm9Var2.U && bm9Var2.F == nn9Var) {
                    fm9 fm9Var = bm9Var2.j;
                    fm9Var.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + bm9.x(j));
                    un9 un9Var = (un9) bm9Var2.k.b;
                    Handler handler = un9Var.i;
                    lj4 lj4Var = un9Var.d;
                    Objects.requireNonNull(lj4Var);
                    handler.post(new kf9(lj4Var, (byte) 9));
                    return;
                }
                return;
        }
    }
}
