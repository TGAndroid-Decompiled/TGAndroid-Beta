package defpackage;

import android.os.Handler;
public final class dn9 implements Runnable {
    public final byte a;
    public final on9 b;

    public dn9(on9 on9Var, byte b) {
        this.a = b;
        this.b = on9Var;
    }

    @Override
    public final void run() {
        xn9 xn9Var;
        rn9 rn9Var;
        boolean z;
        byte b = this.a;
        on9 on9Var = this.b;
        switch (b) {
            case 0:
                on9Var.U = false;
                on9Var.f();
                rn9 rn9Var2 = on9Var.w;
                if (rn9Var2 != null) {
                    long p = rn9Var2.p();
                    xn9 xn9Var2 = on9Var.v;
                    if (xn9Var2 != null && p != Long.MAX_VALUE) {
                        xn9Var2.q = Math.max(0L, p) * 1000;
                        Handler handler = xn9Var2.u;
                        if (handler != null) {
                            handler.removeCallbacks(xn9Var2.y0);
                        }
                    }
                }
                on9Var.j();
                rn9 rn9Var3 = on9Var.w;
                if (rn9Var3 != null) {
                    rn9Var3.u();
                    on9Var.w = null;
                }
                on9Var.Y = false;
                jp9 jp9Var = (jp9) on9Var.k.b;
                jp9Var.i.post(new uo9(jp9Var, (byte) 3));
                return;
            case 1:
                on9Var.G();
                return;
            case 2:
                on9Var.q();
                return;
            case 3:
                int w = on9Var.w();
                if (w != on9Var.B0 && (xn9Var = on9Var.v) != null) {
                    on9Var.B0 = w;
                    xn9Var.s0 = w;
                    Handler handler2 = xn9Var.u;
                    if (xn9Var.r0 && handler2 != null) {
                        handler2.post(new me7(xn9Var, w, (byte) 15));
                    }
                    sn9 sn9Var = on9Var.j;
                    sn9Var.b("display rotation applied: degrees=" + w);
                    return;
                }
                return;
            case 4:
                on9Var.a0();
                return;
            case 5:
                Handler handler3 = on9Var.n;
                if (handler3 != null) {
                    handler3.post(new dn9(on9Var, (byte) 6));
                    return;
                }
                return;
            case 6:
                if (on9Var.U && on9Var.z != null && (rn9Var = on9Var.w) != null) {
                    synchronized (rn9Var) {
                        z = rn9Var.E;
                    }
                    if (!z) {
                        try {
                            rn9 rn9Var4 = on9Var.w;
                            on9Var.x = rn9Var4;
                            Handler handler4 = on9Var.n;
                            if (handler4 != null) {
                                handler4.removeCallbacks(on9Var.k1);
                                handler4.postDelayed(on9Var.k1, 3000L);
                            }
                            rn9Var4.t(new hn9(on9Var, rn9Var4, (byte) 0), new hn9(on9Var, rn9Var4, (byte) 1));
                            sn9 sn9Var2 = on9Var.j;
                            sn9Var2.b("first camera frame received; audio startup requested: segmentElapsedMs=" + on9.x(on9Var.C0));
                            return;
                        } catch (RuntimeException e) {
                            on9Var.f();
                            on9Var.M(e);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 7:
                rn9 rn9Var5 = on9Var.x;
                if (on9Var.U && !on9Var.Y && rn9Var5 != null && on9Var.w == rn9Var5) {
                    on9Var.x = null;
                    on9Var.M(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            default:
                if (on9Var.k0 && on9Var.M > 0.0f) {
                    if (on9Var.U && !on9Var.V && on9Var.z != null && on9Var.l0) {
                        on9Var.v("zoom requested", null, 5);
                        return;
                    }
                    return;
                }
                on9Var.a();
                return;
        }
    }
}
