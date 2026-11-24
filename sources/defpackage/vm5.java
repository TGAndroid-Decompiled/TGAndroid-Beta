package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
public final class vm5 implements Runnable {
    public final byte a;
    public final wm5 b;
    public final long c;
    public final long d;

    public vm5(wm5 wm5Var, long j, long j2, byte b) {
        this.a = b;
        this.b = wm5Var;
        this.c = j;
        this.d = j2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                wm5 wm5Var = this.b;
                ConcurrentHashMap concurrentHashMap = wm5Var.i.u;
                String str = wm5Var.a;
                long j = this.c;
                long j2 = this.d;
                concurrentHashMap.put(str, new long[]{j, j2});
                gm.c3(new vm5(wm5Var, j, j2, (byte) 1));
                return;
            default:
                wm5 wm5Var2 = this.b;
                nm7.f(wm5Var2.h).k(142, wm5Var2.a, Long.valueOf(this.c), Long.valueOf(this.d));
                return;
        }
    }
}
