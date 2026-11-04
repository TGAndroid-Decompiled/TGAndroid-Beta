package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class pb implements Runnable {
    public final int f24720a;
    public final qb f24721b;
    public final long f24722c;
    public final long d;

    public pb(qb qbVar, long j10, long j11, int i3) {
        this.f24720a = i3;
        this.f24721b = qbVar;
        this.f24722c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f24720a) {
            case 0:
                qb qbVar = this.f24721b;
                ConcurrentHashMap concurrentHashMap = qbVar.f24873i.f26775u;
                String str = qbVar.f24867a;
                long j10 = this.f24722c;
                long j11 = this.d;
                concurrentHashMap.put(str, new long[]{j10, j11});
                g0.h3(new pb(qbVar, j10, j11, 1));
                return;
            default:
                qb qbVar2 = this.f24721b;
                hs.f(qbVar2.h).k(141, qbVar2.f24867a, Long.valueOf(this.f24722c), Long.valueOf(this.d));
                return;
        }
    }
}
