package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class ub implements Runnable {
    public final int f27244a;
    public final vb f27245b;
    public final long f27246c;
    public final long d;

    public ub(vb vbVar, long j3, long j10, int i7) {
        this.f27244a = i7;
        this.f27245b = vbVar;
        this.f27246c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f27244a) {
            case 0:
                vb vbVar = this.f27245b;
                ConcurrentHashMap concurrentHashMap = vbVar.f27441i.f23799u;
                String str = vbVar.f27435a;
                long j3 = this.f27246c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.g3(new ub(vbVar, j3, j10, 1));
                return;
            default:
                vb vbVar2 = this.f27245b;
                ks.f(vbVar2.h).k(141, vbVar2.f27435a, Long.valueOf(this.f27246c), Long.valueOf(this.d));
                return;
        }
    }
}
