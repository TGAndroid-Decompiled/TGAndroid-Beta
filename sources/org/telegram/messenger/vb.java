package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class vb implements Runnable {
    public final int f26953a;
    public final wb f26954b;
    public final long f26955c;
    public final long d;

    public vb(wb wbVar, long j3, long j10, int i7) {
        this.f26953a = i7;
        this.f26954b = wbVar;
        this.f26955c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f26953a) {
            case 0:
                wb wbVar = this.f26954b;
                ConcurrentHashMap concurrentHashMap = wbVar.f27328i.f23478u;
                String str = wbVar.f27322a;
                long j3 = this.f26955c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.h3(new vb(wbVar, j3, j10, 1));
                return;
            default:
                wb wbVar2 = this.f26954b;
                ns.f(wbVar2.h).k(141, wbVar2.f27322a, Long.valueOf(this.f26955c), Long.valueOf(this.d));
                return;
        }
    }
}
