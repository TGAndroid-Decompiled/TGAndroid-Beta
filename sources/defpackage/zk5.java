package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
public final class zk5 implements Runnable {
    public final byte a;
    public final al5 b;
    public final long c;
    public final long d;

    public zk5(al5 al5Var, long j, long j2, byte b) {
        this.a = b;
        this.b = al5Var;
        this.c = j;
        this.d = j2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                al5 al5Var = this.b;
                ConcurrentHashMap concurrentHashMap = al5Var.h.u;
                String str = al5Var.a.e;
                long j = this.c;
                long j2 = this.d;
                concurrentHashMap.put(str, new long[]{j, j2});
                gl.d3(new zk5(al5Var, j, j2, (byte) 1));
                return;
            default:
                tk5 tk5Var = this.b.a;
                kk7.f(tk5Var.o).k(141, tk5Var.e, Long.valueOf(this.c), Long.valueOf(this.d));
                return;
        }
    }
}
