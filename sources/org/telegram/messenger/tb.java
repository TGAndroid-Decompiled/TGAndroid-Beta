package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class tb implements Runnable {
    public final int f25493a;
    public final ub f25494b;
    public final long f25495c;
    public final long d;

    public tb(ub ubVar, long j10, long j11, int i3) {
        this.f25493a = i3;
        this.f25494b = ubVar;
        this.f25495c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f25493a) {
            case 0:
                ub ubVar = this.f25494b;
                ConcurrentHashMap concurrentHashMap = ubVar.h.f26775u;
                String str = ubVar.f25667a.f24343e;
                long j10 = this.f25495c;
                long j11 = this.d;
                concurrentHashMap.put(str, new long[]{j10, j11});
                g0.h3(new tb(ubVar, j10, j11, 1));
                return;
            default:
                nb nbVar = this.f25494b.f25667a;
                hs.f(nbVar.f24352o).k(141, nbVar.f24343e, Long.valueOf(this.f25495c), Long.valueOf(this.d));
                return;
        }
    }
}
