package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class wb implements Runnable {
    public final int f26279a;
    public final xb f26280b;
    public final long f26281c;
    public final long d;

    public wb(xb xbVar, long j3, long j10, int i7) {
        this.f26279a = i7;
        this.f26280b = xbVar;
        this.f26281c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f26279a) {
            case 0:
                xb xbVar = this.f26280b;
                ConcurrentHashMap concurrentHashMap = xbVar.f26452i.f22634u;
                String str = xbVar.f26446a;
                long j3 = this.f26281c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.h3(new wb(xbVar, j3, j10, 1));
                return;
            default:
                xb xbVar2 = this.f26280b;
                qs.f(xbVar2.h).k(141, xbVar2.f26446a, Long.valueOf(this.f26281c), Long.valueOf(this.d));
                return;
        }
    }
}
