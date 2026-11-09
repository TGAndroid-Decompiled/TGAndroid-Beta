package d3;

import h2.m0;
public final class g0 implements Runnable {
    public final int f8014a;
    public final wf.b f8015b;
    public final l2.d f8016c;

    public g0(wf.b bVar, l2.d dVar, int i7) {
        this.f8014a = i7;
        this.f8015b = bVar;
        this.f8016c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f8014a) {
            case 0:
                wf.b bVar = this.f8015b;
                l2.d dVar = this.f8016c;
                String str = m0.f14112a;
                m2.e eVar = ((l2.c0) ((h0) bVar.f57668c)).f17772a.f17882s;
                m2.a U = eVar.U();
                eVar.V(U, 1015, new m2.d(U, dVar, 1));
                return;
            default:
                wf.b bVar2 = this.f8015b;
                l2.d dVar2 = this.f8016c;
                synchronized (dVar2) {
                }
                String str2 = m0.f14112a;
                l2.i0 i0Var = ((l2.c0) ((h0) bVar2.f57668c)).f17772a;
                m2.e eVar2 = i0Var.f17882s;
                m2.a S = eVar2.S((x2.g0) eVar2.d.f338e);
                eVar2.V(S, 1020, new l2.x(S, dVar2, 15));
                i0Var.S = null;
                return;
        }
    }
}
