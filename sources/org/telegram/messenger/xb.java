package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class xb implements Runnable {
    public final int f19236a;
    public final yb f19237b;
    public final long f19238c;
    public final long d;

    public xb(yb ybVar, long j10, long j11, int i10) {
        this.f19236a = i10;
        this.f19237b = ybVar;
        this.f19238c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19236a) {
            case 0:
                yb ybVar = this.f19237b;
                ConcurrentHashMap concurrentHashMap = ybVar.f19354i.f15870u;
                String str = ybVar.f19349a;
                long j10 = this.f19238c;
                long j11 = this.d;
                concurrentHashMap.put(str, new long[]{j10, j11});
                i0.g3(new xb(ybVar, j10, j11, 1));
                return;
            default:
                yb ybVar2 = this.f19237b;
                zs.f(ybVar2.h).k(141, ybVar2.f19349a, Long.valueOf(this.f19238c), Long.valueOf(this.d));
                return;
        }
    }
}
