package d3;

import h2.m0;
public final class f0 implements Runnable {
    public final int f8007a = 0;
    public final wf.b f8008b;
    public final long f8009c;
    public final int d;

    public f0(wf.b bVar, int i7, long j3) {
        this.f8008b = bVar;
        this.d = i7;
        this.f8009c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f8007a;
        int i10 = this.d;
        long j3 = this.f8009c;
        wf.b bVar = this.f8008b;
        switch (i7) {
            case 0:
                String str = m0.f14112a;
                m2.e eVar = ((l2.c0) ((h0) bVar.f57668c)).f17772a.f17882s;
                m2.a S = eVar.S((x2.g0) eVar.d.f338e);
                eVar.V(S, 1018, new m2.c(S, i10, j3));
                return;
            default:
                String str2 = m0.f14112a;
                m2.e eVar2 = ((l2.c0) ((h0) bVar.f57668c)).f17772a.f17882s;
                m2.a S2 = eVar2.S((x2.g0) eVar2.d.f338e);
                eVar2.V(S2, 1021, new m2.c(S2, j3, i10));
                return;
        }
    }

    public f0(wf.b bVar, long j3, int i7) {
        this.f8008b = bVar;
        this.f8009c = j3;
        this.d = i7;
    }
}
