package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class bc implements Runnable {
    public final int f14753a;
    public final cc f14754b;
    public final long f14755c;
    public final long d;

    public bc(cc ccVar, long j10, long j11, int i10) {
        this.f14753a = i10;
        this.f14754b = ccVar;
        this.f14755c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f14753a) {
            case 0:
                cc ccVar = this.f14754b;
                ConcurrentHashMap concurrentHashMap = ccVar.h.f15870u;
                String str = ccVar.f14974a.e;
                long j10 = this.f14755c;
                long j11 = this.d;
                concurrentHashMap.put(str, new long[]{j10, j11});
                i0.g3(new bc(ccVar, j10, j11, 1));
                return;
            default:
                vb vbVar = this.f14754b.f14974a;
                zs.f(vbVar.f18498o).k(141, vbVar.e, Long.valueOf(this.f14755c), Long.valueOf(this.d));
                return;
        }
    }
}
