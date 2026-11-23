package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class vb implements Runnable {
    public final int f27303a;
    public final wb f27304b;
    public final long f27305c;
    public final long d;

    public vb(wb wbVar, long j3, long j10, int i7) {
        this.f27303a = i7;
        this.f27304b = wbVar;
        this.f27305c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f27303a) {
            case 0:
                wb wbVar = this.f27304b;
                ConcurrentHashMap concurrentHashMap = wbVar.f27678i.f23867u;
                String str = wbVar.f27672a;
                long j3 = this.f27305c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.g3(new vb(wbVar, j3, j10, 1));
                return;
            default:
                wb wbVar2 = this.f27304b;
                ls.f(wbVar2.h).k(141, wbVar2.f27672a, Long.valueOf(this.f27305c), Long.valueOf(this.d));
                return;
        }
    }
}
