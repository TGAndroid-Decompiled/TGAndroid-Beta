package d3;

import h2.l0;
import kg.y1;
public final class g0 implements Runnable {
    public final int f7683a;
    public final wf.b f7684b;
    public final l2.d f7685c;

    public g0(wf.b bVar, l2.d dVar, int i7) {
        this.f7683a = i7;
        this.f7684b = bVar;
        this.f7685c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f7683a) {
            case 0:
                wf.b bVar = this.f7684b;
                l2.d dVar = this.f7685c;
                String str = l0.f13778a;
                m2.d dVar2 = ((l2.z) ((h0) bVar.f59681c)).f19594a.f19341s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1015, new m2.c(U, dVar, 8));
                return;
            default:
                wf.b bVar2 = this.f7684b;
                l2.d dVar3 = this.f7685c;
                synchronized (dVar3) {
                }
                String str2 = l0.f13778a;
                l2.f0 f0Var = ((l2.z) ((h0) bVar2.f59681c)).f19594a;
                m2.d dVar4 = f0Var.f19341s;
                m2.a S = dVar4.S((x2.g0) dVar4.d.f344e);
                dVar4.V(S, 1020, new y1(S, dVar3, 13));
                f0Var.S = null;
                return;
        }
    }
}
