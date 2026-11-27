package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
public final class cn5 implements Runnable {
    public final byte a;
    public final dn5 b;
    public final long c;
    public final long d;

    public cn5(dn5 dn5Var, long j, long j2, byte b) {
        this.a = b;
        this.b = dn5Var;
        this.c = j;
        this.d = j2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                dn5 dn5Var = this.b;
                ConcurrentHashMap concurrentHashMap = dn5Var.h.u;
                String str = dn5Var.a.e;
                long j = this.c;
                long j2 = this.d;
                concurrentHashMap.put(str, new long[]{j, j2});
                hl.c3(new cn5(dn5Var, j, j2, (byte) 1));
                return;
            default:
                wm5 wm5Var = this.b.a;
                jn7.f(wm5Var.o).k(142, wm5Var.e, Long.valueOf(this.c), Long.valueOf(this.d));
                return;
        }
    }
}
