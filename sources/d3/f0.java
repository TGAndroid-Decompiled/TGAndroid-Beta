package d3;

import h2.l0;
public final class f0 implements Runnable {
    public final int f7676a = 0;
    public final wf.b f7677b;
    public final long f7678c;
    public final int d;

    public f0(wf.b bVar, int i7, long j3) {
        this.f7677b = bVar;
        this.d = i7;
        this.f7678c = j3;
    }

    @Override
    public final void run() {
        int i7 = this.f7676a;
        int i10 = this.d;
        long j3 = this.f7678c;
        wf.b bVar = this.f7677b;
        switch (i7) {
            case 0:
                String str = l0.f13778a;
                m2.d dVar = ((l2.z) ((h0) bVar.f59681c)).f19594a.f19341s;
                m2.a S = dVar.S((x2.g0) dVar.d.f344e);
                dVar.V(S, 1018, new li.c(S, i10, j3));
                return;
            default:
                String str2 = l0.f13778a;
                m2.d dVar2 = ((l2.z) ((h0) bVar.f59681c)).f19594a.f19341s;
                m2.a S2 = dVar2.S((x2.g0) dVar2.d.f344e);
                dVar2.V(S2, 1021, new li.c(S2, j3, i10));
                return;
        }
    }

    public f0(wf.b bVar, long j3, int i7) {
        this.f7677b = bVar;
        this.f7678c = j3;
        this.d = i7;
    }
}
