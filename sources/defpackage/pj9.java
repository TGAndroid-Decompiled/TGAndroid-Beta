package defpackage;

import android.os.Handler;
public final class pj9 implements Runnable {
    public final byte a;
    public final ak9 b;

    public pj9(ak9 ak9Var, byte b) {
        this.a = b;
        this.b = ak9Var;
    }

    @Override
    public final void run() {
        jk9 jk9Var;
        dk9 dk9Var;
        boolean z;
        byte b = this.a;
        ak9 ak9Var = this.b;
        switch (b) {
            case 0:
                ak9Var.q();
                return;
            case 1:
                int w = ak9Var.w();
                if (w != ak9Var.B0 && (jk9Var = ak9Var.v) != null) {
                    ak9Var.B0 = w;
                    jk9Var.s0 = w;
                    Handler handler = jk9Var.u;
                    if (jk9Var.r0 && handler != null) {
                        handler.post(new on7(jk9Var, w, (byte) 12));
                    }
                    ek9 ek9Var = ak9Var.j;
                    ek9Var.b("display rotation applied: degrees=" + w);
                    return;
                }
                return;
            case 2:
                ak9Var.a0();
                return;
            case 3:
                Handler handler2 = ak9Var.n;
                if (handler2 != null) {
                    handler2.post(new pj9(ak9Var, (byte) 4));
                    return;
                }
                return;
            case 4:
                if (ak9Var.U && ak9Var.z != null && (dk9Var = ak9Var.w) != null) {
                    synchronized (dk9Var) {
                        z = dk9Var.E;
                    }
                    if (!z) {
                        try {
                            dk9 dk9Var2 = ak9Var.w;
                            ak9Var.x = dk9Var2;
                            Handler handler3 = ak9Var.n;
                            if (handler3 != null) {
                                handler3.removeCallbacks(ak9Var.k1);
                                handler3.postDelayed(ak9Var.k1, 3000L);
                            }
                            dk9Var2.t(new sj9(ak9Var, dk9Var2, (byte) 0), new sj9(ak9Var, dk9Var2, (byte) 1));
                            ek9 ek9Var2 = ak9Var.j;
                            ek9Var2.b("first camera frame received; audio startup requested: segmentElapsedMs=" + ak9.x(ak9Var.C0));
                            return;
                        } catch (RuntimeException e) {
                            ak9Var.f();
                            ak9Var.M(e);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                dk9 dk9Var3 = ak9Var.x;
                if (ak9Var.U && !ak9Var.Y && dk9Var3 != null && ak9Var.w == dk9Var3) {
                    ak9Var.x = null;
                    ak9Var.M(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                    return;
                }
                return;
            case 6:
                if (ak9Var.k0 && ak9Var.M > 0.0f) {
                    if (ak9Var.U && !ak9Var.V && ak9Var.z != null && ak9Var.l0) {
                        ak9Var.v("zoom requested", null, 5);
                        return;
                    }
                    return;
                }
                ak9Var.a();
                return;
            case 7:
                ak9Var.U = false;
                ak9Var.f();
                dk9 dk9Var4 = ak9Var.w;
                if (dk9Var4 != null) {
                    long p = dk9Var4.p();
                    jk9 jk9Var2 = ak9Var.v;
                    if (jk9Var2 != null && p != Long.MAX_VALUE) {
                        jk9Var2.q = Math.max(0L, p) * 1000;
                        Handler handler4 = jk9Var2.u;
                        if (handler4 != null) {
                            handler4.removeCallbacks(jk9Var2.y0);
                        }
                    }
                }
                ak9Var.j();
                dk9 dk9Var5 = ak9Var.w;
                if (dk9Var5 != null) {
                    dk9Var5.u();
                    ak9Var.w = null;
                }
                ak9Var.Y = false;
                ul9 ul9Var = (ul9) ak9Var.k.b;
                ul9Var.i.post(new il9(ul9Var, (byte) 3));
                return;
            case 8:
                ak9Var.G();
                return;
            default:
                ak9Var.a0();
                return;
        }
    }
}
