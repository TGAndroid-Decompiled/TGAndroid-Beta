package org.telegram.messenger;
public final class o3 implements Runnable {
    public final int f17219a;
    public final u3 f17220b;

    public o3(u3 u3Var, int i10) {
        this.f17219a = i10;
        this.f17220b = u3Var;
    }

    @Override
    public final void run() {
        int i10 = this.f17219a;
        u3 u3Var = this.f17220b;
        switch (i10) {
            case 0:
                zs.f(u3Var.C.f14863a).k(166, Long.valueOf(u3Var.f18229c), Long.valueOf(u3Var.f18228b.f19803id), Boolean.FALSE);
                return;
            case 1:
                u3Var.E = false;
                u3Var.d();
                zs.f(u3Var.C.f14863a).k(172, new Object[0]);
                return;
            default:
                u3Var.M = null;
                if (u3Var.I != 0 && System.currentTimeMillis() - u3Var.I >= 1500) {
                    if (v2.f18448a) {
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
