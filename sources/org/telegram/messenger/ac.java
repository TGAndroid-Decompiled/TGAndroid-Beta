package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class ac implements Runnable {
    public final int f21410a;
    public final bc f21411b;
    public final long f21412c;
    public final long d;

    public ac(bc bcVar, long j3, long j10, int i7) {
        this.f21410a = i7;
        this.f21411b = bcVar;
        this.f21412c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21410a) {
            case 0:
                bc bcVar = this.f21411b;
                ConcurrentHashMap concurrentHashMap = bcVar.h.f22634u;
                String str = bcVar.f21608a.f25744e;
                long j3 = this.f21412c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.h3(new ac(bcVar, j3, j10, 1));
                return;
            default:
                ub ubVar = this.f21411b.f21608a;
                qs.f(ubVar.f25753o).k(141, ubVar.f25744e, Long.valueOf(this.f21412c), Long.valueOf(this.d));
                return;
        }
    }
}
