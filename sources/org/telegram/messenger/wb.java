package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class wb implements Runnable {
    public final int f26282a;
    public final xb f26283b;
    public final long f26284c;
    public final long d;

    public wb(xb xbVar, long j3, long j10, int i7) {
        this.f26282a = i7;
        this.f26283b = xbVar;
        this.f26284c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f26282a) {
            case 0:
                xb xbVar = this.f26283b;
                ConcurrentHashMap concurrentHashMap = xbVar.f26462i.f22653u;
                String str = xbVar.f26456a;
                long j3 = this.f26284c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.h3(new wb(xbVar, j3, j10, 1));
                return;
            default:
                xb xbVar2 = this.f26283b;
                qs.f(xbVar2.h).k(141, xbVar2.f26456a, Long.valueOf(this.f26284c), Long.valueOf(this.d));
                return;
        }
    }
}
