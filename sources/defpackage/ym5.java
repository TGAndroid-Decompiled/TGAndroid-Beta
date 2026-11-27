package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
public final class ym5 implements Runnable {
    public final byte a;
    public final zm5 b;
    public final long c;
    public final long d;

    public ym5(zm5 zm5Var, long j, long j2, byte b) {
        this.a = b;
        this.b = zm5Var;
        this.c = j;
        this.d = j2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                zm5 zm5Var = this.b;
                ConcurrentHashMap concurrentHashMap = zm5Var.i.u;
                String str = zm5Var.a;
                long j = this.c;
                long j2 = this.d;
                concurrentHashMap.put(str, new long[]{j, j2});
                hl.c3(new ym5(zm5Var, j, j2, (byte) 1));
                return;
            default:
                zm5 zm5Var2 = this.b;
                jn7.f(zm5Var2.h).k(142, zm5Var2.a, Long.valueOf(this.c), Long.valueOf(this.d));
                return;
        }
    }
}
