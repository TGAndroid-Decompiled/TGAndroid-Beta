package d3;

import h2.l0;
import kg.x1;
public final class g0 implements Runnable {
    public final int f7717a;
    public final wf.b f7718b;
    public final l2.d f7719c;

    public g0(wf.b bVar, l2.d dVar, int i7) {
        this.f7717a = i7;
        this.f7718b = bVar;
        this.f7719c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f7717a) {
            case 0:
                wf.b bVar = this.f7718b;
                l2.d dVar = this.f7719c;
                String str = l0.f13812a;
                m2.d dVar2 = ((l2.z) ((h0) bVar.f59712c)).f19625a.f19372s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1015, new m2.c(U, dVar, 8));
                return;
            default:
                wf.b bVar2 = this.f7718b;
                l2.d dVar3 = this.f7719c;
                synchronized (dVar3) {
                }
                String str2 = l0.f13812a;
                l2.f0 f0Var = ((l2.z) ((h0) bVar2.f59712c)).f19625a;
                m2.d dVar4 = f0Var.f19372s;
                m2.a S = dVar4.S((x2.g0) dVar4.d.f344e);
                dVar4.V(S, 1020, new x1(S, dVar3, 13));
                f0Var.S = null;
                return;
        }
    }
}
