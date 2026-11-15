package org.telegram.messenger;
public final class j3 implements Runnable {
    public final int f24515a;
    public final r3 f24516b;

    public j3(r3 r3Var, int i7) {
        this.f24515a = i7;
        this.f24516b = r3Var;
    }

    @Override
    public final void run() {
        int i7 = this.f24515a;
        r3 r3Var = this.f24516b;
        switch (i7) {
            case 0:
                ns.f(r3Var.C.f22778a).k(166, Long.valueOf(r3Var.f26209c), Long.valueOf(r3Var.f26208b.f28061id), Boolean.FALSE);
                return;
            case 1:
                r3Var.E = false;
                r3Var.d();
                ns.f(r3Var.C.f22778a).k(172, new Object[0]);
                return;
            default:
                r3Var.M = null;
                if (r3Var.I != 0 && System.currentTimeMillis() - r3Var.I >= 1500) {
                    if (r2.f26198a) {
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
