package defpackage;

import android.os.Handler;
public final class sj9 implements Runnable {
    public final byte a;
    public final ak9 b;
    public final dk9 c;

    public sj9(ak9 ak9Var, dk9 dk9Var, byte b) {
        this.a = b;
        this.b = ak9Var;
        this.c = dk9Var;
    }

    @Override
    public final void run() {
        jk9 jk9Var;
        switch (this.a) {
            case 0:
                ak9 ak9Var = this.b;
                sj9 sj9Var = new sj9(ak9Var, this.c, (byte) 3);
                Handler handler = ak9Var.n;
                if (handler != null) {
                    handler.post(sj9Var);
                    return;
                }
                return;
            case 1:
                ak9 ak9Var2 = this.b;
                sj9 sj9Var2 = new sj9(ak9Var2, this.c, (byte) 2);
                Handler handler2 = ak9Var2.n;
                if (handler2 != null) {
                    handler2.post(sj9Var2);
                    return;
                }
                return;
            case 2:
                ak9 ak9Var3 = this.b;
                dk9 dk9Var = this.c;
                if (ak9Var3.U && !ak9Var3.Y && ak9Var3.w == dk9Var) {
                    ak9Var3.f();
                    if (ak9Var3.f0 == 0) {
                        ak9Var3.f0 = dk9Var.e;
                    }
                    ek9 ek9Var = ak9Var3.j;
                    ek9Var.b("common A/V start completed: segmentElapsedMs=" + ak9.x(ak9Var3.C0));
                    ul9 ul9Var = (ul9) ak9Var3.k.b;
                    ul9Var.i.post(new il9(ul9Var, (byte) 2));
                    return;
                }
                return;
            default:
                ak9 ak9Var4 = this.b;
                dk9 dk9Var2 = this.c;
                if (ak9Var4.U && !ak9Var4.Y && ak9Var4.w == dk9Var2 && ak9Var4.z != null && (jk9Var = ak9Var4.v) != null) {
                    try {
                        long j = dk9Var2.F;
                        if (j > 0) {
                            jk9Var.p = j;
                            jk9Var.Q = -1L;
                            jk9Var.R = 0L;
                            jk9Var.S = -1L;
                            jk9Var.q = Long.MAX_VALUE;
                            jk9Var.t0 = true;
                            ek9 ek9Var2 = ak9Var4.j;
                            ek9Var2.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + ak9.x(ak9Var4.C0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e) {
                        ak9Var4.f();
                        ak9Var4.M(e);
                        return;
                    }
                }
                return;
        }
    }
}
