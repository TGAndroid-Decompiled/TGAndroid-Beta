package org.telegram.messenger;
public final class j3 implements Runnable {
    public final int f23633a;
    public final r3 f23634b;

    public j3(r3 r3Var, int i3) {
        this.f23633a = i3;
        this.f23634b = r3Var;
    }

    @Override
    public final void run() {
        int i3 = this.f23633a;
        r3 r3Var = this.f23634b;
        switch (i3) {
            case 0:
                hs.f(r3Var.C.f21919a).k(166, Long.valueOf(r3Var.f25050c), Long.valueOf(r3Var.f25049b.f27011id), Boolean.FALSE);
                return;
            case 1:
                r3Var.E = false;
                r3Var.d();
                hs.f(r3Var.C.f21919a).k(172, new Object[0]);
                return;
            default:
                r3Var.M = null;
                if (r3Var.I != 0 && System.currentTimeMillis() - r3Var.I >= 1500) {
                    if (r2.f25040a) {
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
