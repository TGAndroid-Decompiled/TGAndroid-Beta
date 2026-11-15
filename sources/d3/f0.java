package d3;

import h2.l0;
public final class f0 implements Runnable {
    public final int f7398a = 0;
    public final wf.b f7399b;
    public final long f7400c;
    public final int d;

    public f0(wf.b bVar, int i7, long j3) {
        this.f7399b = bVar;
        this.d = i7;
        this.f7400c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f7398a;
        int i10 = this.d;
        long j3 = this.f7400c;
        wf.b bVar = this.f7399b;
        switch (i7) {
            case 0:
                String str = l0.f13471a;
                m2.e eVar = ((l2.z) ((h0) bVar.f59108c)).f19233a.f18980s;
                m2.a S = eVar.S((x2.f0) eVar.d.f344e);
                eVar.V(S, 1018, new li.p(S, i10, j3));
                return;
            default:
                String str2 = l0.f13471a;
                m2.e eVar2 = ((l2.z) ((h0) bVar.f59108c)).f19233a.f18980s;
                m2.a S2 = eVar2.S((x2.f0) eVar2.d.f344e);
                eVar2.V(S2, 1021, new li.p(S2, j3, i10));
                return;
        }
    }

    public f0(wf.b bVar, long j3, int i7) {
        this.f7399b = bVar;
        this.f7400c = j3;
        this.d = i7;
    }
}
