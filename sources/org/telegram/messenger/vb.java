package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class vb implements Runnable {
    public final int f26954a;
    public final wb f26955b;
    public final long f26956c;
    public final long d;

    public vb(wb wbVar, long j3, long j10, int i7) {
        this.f26954a = i7;
        this.f26955b = wbVar;
        this.f26956c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f26954a) {
            case 0:
                wb wbVar = this.f26955b;
                ConcurrentHashMap concurrentHashMap = wbVar.f27327i.f23481u;
                String str = wbVar.f27321a;
                long j3 = this.f26956c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.h3(new vb(wbVar, j3, j10, 1));
                return;
            default:
                wb wbVar2 = this.f26955b;
                ns.f(wbVar2.h).k(141, wbVar2.f27321a, Long.valueOf(this.f26956c), Long.valueOf(this.d));
                return;
        }
    }
}
