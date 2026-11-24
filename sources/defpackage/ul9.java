package defpackage;

import android.os.Handler;
public final class ul9 implements Runnable {
    public final byte a;
    public final bm9 b;
    public final em9 c;

    public ul9(bm9 bm9Var, em9 em9Var, byte b) {
        this.a = b;
        this.b = bm9Var;
        this.c = em9Var;
    }

    @Override
    public final void run() {
        km9 km9Var;
        switch (this.a) {
            case 0:
                bm9 bm9Var = this.b;
                ul9 ul9Var = new ul9(bm9Var, this.c, (byte) 3);
                Handler handler = bm9Var.n;
                if (handler != null) {
                    handler.post(ul9Var);
                    return;
                }
                return;
            case 1:
                bm9 bm9Var2 = this.b;
                ul9 ul9Var2 = new ul9(bm9Var2, this.c, (byte) 2);
                Handler handler2 = bm9Var2.n;
                if (handler2 != null) {
                    handler2.post(ul9Var2);
                    return;
                }
                return;
            case 2:
                bm9 bm9Var3 = this.b;
                em9 em9Var = this.c;
                if (bm9Var3.U && !bm9Var3.Y && bm9Var3.w == em9Var) {
                    bm9Var3.f();
                    if (bm9Var3.f0 == 0) {
                        bm9Var3.f0 = em9Var.e;
                    }
                    fm9 fm9Var = bm9Var3.j;
                    fm9Var.b("common A/V start completed: segmentElapsedMs=" + bm9.x(bm9Var3.C0));
                    un9 un9Var = (un9) bm9Var3.k.b;
                    un9Var.i.post(new in9(un9Var, (byte) 2));
                    return;
                }
                return;
            default:
                bm9 bm9Var4 = this.b;
                em9 em9Var2 = this.c;
                if (bm9Var4.U && !bm9Var4.Y && bm9Var4.w == em9Var2 && bm9Var4.z != null && (km9Var = bm9Var4.v) != null) {
                    try {
                        long j = em9Var2.F;
                        if (j > 0) {
                            km9Var.p = j;
                            km9Var.Q = -1L;
                            km9Var.R = 0L;
                            km9Var.S = -1L;
                            km9Var.q = Long.MAX_VALUE;
                            km9Var.t0 = true;
                            fm9 fm9Var2 = bm9Var4.j;
                            fm9Var2.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + bm9.x(bm9Var4.C0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e) {
                        bm9Var4.f();
                        bm9Var4.M(e);
                        return;
                    }
                }
                return;
        }
    }
}
