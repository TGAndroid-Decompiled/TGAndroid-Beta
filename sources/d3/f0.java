package d3;

import h2.m0;
public final class f0 implements Runnable {
    public final int f8009a = 0;
    public final wf.b f8010b;
    public final long f8011c;
    public final int d;

    public f0(wf.b bVar, int i7, long j3) {
        this.f8010b = bVar;
        this.d = i7;
        this.f8011c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f8009a;
        int i10 = this.d;
        long j3 = this.f8011c;
        wf.b bVar = this.f8010b;
        switch (i7) {
            case 0:
                String str = m0.f14112a;
                m2.e eVar = ((l2.c0) ((h0) bVar.f57563c)).f17771a.f17881s;
                m2.a S = eVar.S((x2.g0) eVar.d.f338e);
                eVar.V(S, 1018, new m2.c(S, i10, j3));
                return;
            default:
                String str2 = m0.f14112a;
                m2.e eVar2 = ((l2.c0) ((h0) bVar.f57563c)).f17771a.f17881s;
                m2.a S2 = eVar2.S((x2.g0) eVar2.d.f338e);
                eVar2.V(S2, 1021, new m2.c(S2, j3, i10));
                return;
        }
    }

    public f0(wf.b bVar, long j3, int i7) {
        this.f8010b = bVar;
        this.f8011c = j3;
        this.d = i7;
    }
}
