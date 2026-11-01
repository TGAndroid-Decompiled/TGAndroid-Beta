package org.telegram.messenger;
public final class o3 implements Runnable {
    public final int f17381a;
    public final u3 f17382b;

    public o3(u3 u3Var, int i10) {
        this.f17381a = i10;
        this.f17382b = u3Var;
    }

    @Override
    public final void run() {
        int i10 = this.f17381a;
        u3 u3Var = this.f17382b;
        switch (i10) {
            case 0:
                at.f(u3Var.C.f15043a).k(166, Long.valueOf(u3Var.f18362c), Long.valueOf(u3Var.f18361b.f19804id), Boolean.FALSE);
                return;
            case 1:
                u3Var.E = false;
                u3Var.d();
                at.f(u3Var.C.f15043a).k(172, new Object[0]);
                return;
            default:
                u3Var.M = null;
                if (u3Var.I != 0 && System.currentTimeMillis() - u3Var.I >= 1500) {
                    if (v2.f18578a) {
                        f8.b("QUEUE GROUP CALL UPDATES WAIT TIMEOUT - CHECK QUEUE");
                    }
                    u3Var.r();
                }
                if (!u3Var.H.isEmpty()) {
                    o3 o3Var = new o3(u3Var, 2);
                    u3Var.M = o3Var;
                    i0.h3(o3Var, 1000L);
                    return;
                }
                return;
        }
    }
}
