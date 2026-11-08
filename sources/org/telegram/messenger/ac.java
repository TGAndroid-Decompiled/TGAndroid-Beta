package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class ac implements Runnable {
    public final int f21408a;
    public final bc f21409b;
    public final long f21410c;
    public final long d;

    public ac(bc bcVar, long j3, long j10, int i7) {
        this.f21408a = i7;
        this.f21409b = bcVar;
        this.f21410c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21408a) {
            case 0:
                bc bcVar = this.f21409b;
                ConcurrentHashMap concurrentHashMap = bcVar.h.f22653u;
                String str = bcVar.f21635a.f25750e;
                long j3 = this.f21410c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.h3(new ac(bcVar, j3, j10, 1));
                return;
            default:
                ub ubVar = this.f21409b.f21635a;
                qs.f(ubVar.f25759o).k(141, ubVar.f25750e, Long.valueOf(this.f21410c), Long.valueOf(this.d));
                return;
        }
    }
}
