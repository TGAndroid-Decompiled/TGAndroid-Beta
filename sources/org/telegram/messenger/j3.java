package org.telegram.messenger;
public final class j3 implements Runnable {
    public final int f23475a;
    public final r3 f23476b;

    public j3(r3 r3Var, int i7) {
        this.f23475a = i7;
        this.f23476b = r3Var;
    }

    @Override
    public final void run() {
        int i7 = this.f23475a;
        r3 r3Var = this.f23476b;
        switch (i7) {
            case 0:
                qs.f(r3Var.C.f21729a).k(166, Long.valueOf(r3Var.f25210c), Long.valueOf(r3Var.f25209b.f26963id), Boolean.FALSE);
                return;
            case 1:
                r3Var.E = false;
                r3Var.d();
                qs.f(r3Var.C.f21729a).k(172, new Object[0]);
                return;
            default:
                r3Var.M = null;
                if (r3Var.I != 0 && System.currentTimeMillis() - r3Var.I >= 1500) {
                    if (r2.f25199a) {
                        a8.b("QUEUE GROUP CALL UPDATES WAIT TIMEOUT - CHECK QUEUE");
                    }
                    r3Var.r();
                }
                if (!r3Var.H.isEmpty()) {
                    j3 j3Var = new j3(r3Var, 2);
                    r3Var.M = j3Var;
                    g0.i3(j3Var, 1000L);
                    return;
                }
                return;
        }
    }
}
