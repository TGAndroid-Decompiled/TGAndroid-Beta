package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
public final class ub implements Runnable {
    public final int f27140a;
    public final vb f27141b;
    public final long f27142c;
    public final long d;

    public ub(vb vbVar, long j3, long j10, int i7) {
        this.f27140a = i7;
        this.f27141b = vbVar;
        this.f27142c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f27140a) {
            case 0:
                vb vbVar = this.f27141b;
                ConcurrentHashMap concurrentHashMap = vbVar.f27345i.f23694u;
                String str = vbVar.f27339a;
                long j3 = this.f27142c;
                long j10 = this.d;
                concurrentHashMap.put(str, new long[]{j3, j10});
                g0.g3(new ub(vbVar, j3, j10, 1));
                return;
            default:
                vb vbVar2 = this.f27141b;
                ks.f(vbVar2.h).k(141, vbVar2.f27339a, Long.valueOf(this.f27142c), Long.valueOf(this.d));
                return;
        }
    }
}
