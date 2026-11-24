package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
public final class vk5 implements Runnable {
    public final byte a;
    public final wk5 b;
    public final long c;
    public final long d;

    public vk5(wk5 wk5Var, long j, long j2, byte b) {
        this.a = b;
        this.b = wk5Var;
        this.c = j;
        this.d = j2;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                wk5 wk5Var = this.b;
                ConcurrentHashMap concurrentHashMap = wk5Var.i.u;
                String str = wk5Var.a;
                long j = this.c;
                long j2 = this.d;
                concurrentHashMap.put(str, new long[]{j, j2});
                gl.c3(new vk5(wk5Var, j, j2, (byte) 1));
                return;
            default:
                wk5 wk5Var2 = this.b;
                kk7.f(wk5Var2.h).k(141, wk5Var2.a, Long.valueOf(this.c), Long.valueOf(this.d));
                return;
        }
    }
}
