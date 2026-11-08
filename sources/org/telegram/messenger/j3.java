package org.telegram.messenger;
public final class j3 implements Runnable {
    public final int f23496a;
    public final r3 f23497b;

    public j3(r3 r3Var, int i7) {
        this.f23496a = i7;
        this.f23497b = r3Var;
    }

    @Override
    public final void run() {
        int i7 = this.f23496a;
        r3 r3Var = this.f23497b;
        switch (i7) {
            case 0:
                qs.f(r3Var.C.f21765a).k(166, Long.valueOf(r3Var.f25223c), Long.valueOf(r3Var.f25222b.f26966id), Boolean.FALSE);
                return;
            case 1:
                r3Var.E = false;
                r3Var.d();
                qs.f(r3Var.C.f21765a).k(172, new Object[0]);
                return;
            default:
                r3Var.M = null;
                if (r3Var.I != 0 && System.currentTimeMillis() - r3Var.I >= 1500) {
                    if (r2.f25212a) {
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
