package d3;

import h2.l0;
public final class g0 implements Runnable {
    public final int f7405a;
    public final wf.b f7406b;
    public final l2.d f7407c;

    public g0(wf.b bVar, l2.d dVar, int i7) {
        this.f7405a = i7;
        this.f7406b = bVar;
        this.f7407c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f7405a) {
            case 0:
                wf.b bVar = this.f7406b;
                l2.d dVar = this.f7407c;
                String str = l0.f13471a;
                m2.e eVar = ((l2.z) ((h0) bVar.f59108c)).f19233a.f18980s;
                m2.a U = eVar.U();
                eVar.V(U, 1015, new m2.c(U, dVar, 7));
                return;
            default:
                wf.b bVar2 = this.f7406b;
                l2.d dVar2 = this.f7407c;
                synchronized (dVar2) {
                }
                String str2 = l0.f13471a;
                l2.f0 f0Var = ((l2.z) ((h0) bVar2.f59108c)).f19233a;
                m2.e eVar2 = f0Var.f18980s;
                m2.a S = eVar2.S((x2.f0) eVar2.d.f344e);
                eVar2.V(S, 1020, new ki.e(S, dVar2, 11));
                f0Var.S = null;
                return;
        }
    }
}
