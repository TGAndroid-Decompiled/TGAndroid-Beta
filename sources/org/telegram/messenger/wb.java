package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class wb implements Runnable {
    public final int f26271a;
    public final xb f26272b;
    public final long f26273c;
    public final long d;

    public wb(xb xbVar, long j3, long j10, int i7) {
        this.f26271a = i7;
        this.f26272b = xbVar;
        this.f26273c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f26271a) {
            case 0:
                xb xbVar = this.f26272b;
                ConcurrentHashMap concurrentHashMap = xbVar.f26444i.f22627u;
                String str = xbVar.f26438a;
                long j3 = this.f26273c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.h3(new wb(xbVar, j3, j10, 1));
                return;
            default:
                xb xbVar2 = this.f26272b;
                qs.f(xbVar2.h).k(141, xbVar2.f26438a, Long.valueOf(this.f26273c), Long.valueOf(this.d));
                return;
        }
    }
}
