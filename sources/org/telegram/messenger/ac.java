package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class ac implements Runnable {
    public final int f21413a;
    public final bc f21414b;
    public final long f21415c;
    public final long d;

    public ac(bc bcVar, long j3, long j10, int i7) {
        this.f21413a = i7;
        this.f21414b = bcVar;
        this.f21415c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f21413a) {
            case 0:
                bc bcVar = this.f21414b;
                ConcurrentHashMap concurrentHashMap = bcVar.h.f22657u;
                String str = bcVar.f21640a.f25754e;
                long j3 = this.f21415c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.h3(new ac(bcVar, j3, j10, 1));
                return;
            default:
                ub ubVar = this.f21414b.f21640a;
                qs.f(ubVar.f25763o).k(141, ubVar.f25754e, Long.valueOf(this.f21415c), Long.valueOf(this.d));
                return;
        }
    }
}
