package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class cc implements Runnable {
    public final int f15135a;
    public final dc f15136b;
    public final long f15137c;
    public final long d;

    public cc(dc dcVar, long j10, long j11, int i10) {
        this.f15135a = i10;
        this.f15136b = dcVar;
        this.f15137c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f15135a) {
            case 0:
                dc dcVar = this.f15136b;
                ConcurrentHashMap concurrentHashMap = dcVar.h.f16263u;
                String str = dcVar.f15336a.e;
                long j10 = this.f15137c;
                long j11 = this.d;
                concurrentHashMap.put(str, new long[]{j10, j11});
                i0.g3(new cc(dcVar, j10, j11, 1));
                return;
            default:
                wb wbVar = this.f15136b.f15336a;
                at.f(wbVar.f19020o).k(141, wbVar.e, Long.valueOf(this.f15137c), Long.valueOf(this.d));
                return;
        }
    }
}
