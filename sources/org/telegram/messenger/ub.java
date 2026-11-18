package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class ub implements Runnable {
    public final int f27142a;
    public final vb f27143b;
    public final long f27144c;
    public final long d;

    public ub(vb vbVar, long j3, long j10, int i7) {
        this.f27142a = i7;
        this.f27143b = vbVar;
        this.f27144c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f27142a) {
            case 0:
                vb vbVar = this.f27143b;
                ConcurrentHashMap concurrentHashMap = vbVar.f27347i.f23697u;
                String str = vbVar.f27341a;
                long j3 = this.f27144c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.g3(new ub(vbVar, j3, j10, 1));
                return;
            default:
                vb vbVar2 = this.f27143b;
                ks.f(vbVar2.h).k(141, vbVar2.f27341a, Long.valueOf(this.f27144c), Long.valueOf(this.d));
                return;
        }
    }
}
