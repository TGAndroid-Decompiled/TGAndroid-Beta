package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class wb implements Runnable {
    public final int f26286a;
    public final xb f26287b;
    public final long f26288c;
    public final long d;

    public wb(xb xbVar, long j3, long j10, int i7) {
        this.f26286a = i7;
        this.f26287b = xbVar;
        this.f26288c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f26286a) {
            case 0:
                xb xbVar = this.f26287b;
                ConcurrentHashMap concurrentHashMap = xbVar.f26466i.f22657u;
                String str = xbVar.f26460a;
                long j3 = this.f26288c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.h3(new wb(xbVar, j3, j10, 1));
                return;
            default:
                xb xbVar2 = this.f26287b;
                qs.f(xbVar2.h).k(141, xbVar2.f26460a, Long.valueOf(this.f26288c), Long.valueOf(this.d));
                return;
        }
    }
}
