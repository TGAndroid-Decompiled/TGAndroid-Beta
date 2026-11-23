package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class vb implements Runnable {
    public final int f27339a;
    public final wb f27340b;
    public final long f27341c;
    public final long d;

    public vb(wb wbVar, long j3, long j10, int i7) {
        this.f27339a = i7;
        this.f27340b = wbVar;
        this.f27341c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f27339a) {
            case 0:
                wb wbVar = this.f27340b;
                ConcurrentHashMap concurrentHashMap = wbVar.f27714i.f23903u;
                String str = wbVar.f27708a;
                long j3 = this.f27341c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.g3(new vb(wbVar, j3, j10, 1));
                return;
            default:
                wb wbVar2 = this.f27340b;
                ls.f(wbVar2.h).k(141, wbVar2.f27708a, Long.valueOf(this.f27341c), Long.valueOf(this.d));
                return;
        }
    }
}
