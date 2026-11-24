package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
public final class zm5 implements Runnable {
    public final byte a;
    public final an5 b;
    public final long c;
    public final long d;

    public zm5(an5 an5Var, long j, long j2, byte b) {
        this.a = b;
        this.b = an5Var;
        this.c = j;
        this.d = j2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                an5 an5Var = this.b;
                ConcurrentHashMap concurrentHashMap = an5Var.h.u;
                String str = an5Var.a.e;
                long j = this.c;
                long j2 = this.d;
                concurrentHashMap.put(str, new long[]{j, j2});
                gm.c3(new zm5(an5Var, j, j2, (byte) 1));
                return;
            default:
                tm5 tm5Var = this.b.a;
                nm7.f(tm5Var.o).k(142, tm5Var.e, Long.valueOf(this.c), Long.valueOf(this.d));
                return;
        }
    }
}
