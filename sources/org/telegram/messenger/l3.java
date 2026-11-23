package org.telegram.messenger;
public final class l3 implements Runnable {
    public final int f25193a;
    public final t3 f25194b;

    public l3(t3 t3Var, int i7) {
        this.f25193a = i7;
        this.f25194b = t3Var;
    }

    @Override
    public final void run() {
        int i7 = this.f25193a;
        t3 t3Var = this.f25194b;
        switch (i7) {
            case 0:
                ls.f(t3Var.C.f23202a).k(166, Long.valueOf(t3Var.f26951c), Long.valueOf(t3Var.f26950b.f28444id), Boolean.FALSE);
                return;
            case 1:
                t3Var.E = false;
                t3Var.d();
                ls.f(t3Var.C.f23202a).k(172, new Object[0]);
                return;
            default:
                t3Var.M = null;
                if (t3Var.I != 0 && System.currentTimeMillis() - t3Var.I >= 1500) {
                    if (s2.f26730a) {
                        a8.b("QUEUE GROUP CALL UPDATES WAIT TIMEOUT - CHECK QUEUE");
                    }
                    t3Var.r();
                }
                if (!t3Var.H.isEmpty()) {
                    l3 l3Var = new l3(t3Var, 2);
                    t3Var.M = l3Var;
                    g0.h3(l3Var, 1000L);
                    return;
                }
                return;
        }
    }
}
