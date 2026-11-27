package defpackage;

import android.os.Handler;
public final class hn9 implements Runnable {
    public final byte a;
    public final on9 b;
    public final rn9 c;

    public hn9(on9 on9Var, rn9 rn9Var, byte b) {
        this.a = b;
        this.b = on9Var;
        this.c = rn9Var;
    }

    @Override
    public final void run() {
        xn9 xn9Var;
        switch (this.a) {
            case 0:
                on9 on9Var = this.b;
                hn9 hn9Var = new hn9(on9Var, this.c, (byte) 3);
                Handler handler = on9Var.n;
                if (handler != null) {
                    handler.post(hn9Var);
                    return;
                }
                return;
            case 1:
                on9 on9Var2 = this.b;
                hn9 hn9Var2 = new hn9(on9Var2, this.c, (byte) 2);
                Handler handler2 = on9Var2.n;
                if (handler2 != null) {
                    handler2.post(hn9Var2);
                    return;
                }
                return;
            case 2:
                on9 on9Var3 = this.b;
                rn9 rn9Var = this.c;
                if (on9Var3.U && !on9Var3.Y && on9Var3.w == rn9Var) {
                    on9Var3.f();
                    if (on9Var3.f0 == 0) {
                        on9Var3.f0 = rn9Var.e;
                    }
                    sn9 sn9Var = on9Var3.j;
                    sn9Var.b("common A/V start completed: segmentElapsedMs=" + on9.x(on9Var3.C0));
                    jp9 jp9Var = (jp9) on9Var3.k.b;
                    jp9Var.i.post(new uo9(jp9Var, (byte) 2));
                    return;
                }
                return;
            default:
                on9 on9Var4 = this.b;
                rn9 rn9Var2 = this.c;
                if (on9Var4.U && !on9Var4.Y && on9Var4.w == rn9Var2 && on9Var4.z != null && (xn9Var = on9Var4.v) != null) {
                    try {
                        long j = rn9Var2.F;
                        if (j > 0) {
                            xn9Var.p = j;
                            xn9Var.Q = -1L;
                            xn9Var.R = 0L;
                            xn9Var.S = -1L;
                            xn9Var.q = Long.MAX_VALUE;
                            xn9Var.t0 = true;
                            sn9 sn9Var2 = on9Var4.j;
                            sn9Var2.b("common A/V start armed; waiting for next camera frame: segmentElapsedMs=" + on9.x(on9Var4.C0));
                            return;
                        }
                        throw new IllegalArgumentException("Invalid recording time origin");
                    } catch (RuntimeException e) {
                        on9Var4.f();
                        on9Var4.M(e);
                        return;
                    }
                }
                return;
        }
    }
}
