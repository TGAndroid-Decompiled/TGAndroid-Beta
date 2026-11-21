package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class ub implements Runnable {
    public final int f27168a;
    public final vb f27169b;
    public final long f27170c;
    public final long d;

    public ub(vb vbVar, long j3, long j10, int i7) {
        this.f27168a = i7;
        this.f27169b = vbVar;
        this.f27170c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f27168a) {
            case 0:
                vb vbVar = this.f27169b;
                ConcurrentHashMap concurrentHashMap = vbVar.f27373i.f23722u;
                String str = vbVar.f27367a;
                long j3 = this.f27170c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.g3(new ub(vbVar, j3, j10, 1));
                return;
            default:
                vb vbVar2 = this.f27169b;
                ks.f(vbVar2.h).k(141, vbVar2.f27367a, Long.valueOf(this.f27170c), Long.valueOf(this.d));
                return;
        }
    }
}
