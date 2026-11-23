package d3;

import h2.l0;
import kg.f1;
public final class g0 implements Runnable {
    public final int f7682a;
    public final wf.b f7683b;
    public final l2.e f7684c;

    public g0(wf.b bVar, l2.e eVar, int i7) {
        this.f7682a = i7;
        this.f7683b = bVar;
        this.f7684c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f7682a) {
            case 0:
                wf.b bVar = this.f7683b;
                l2.e eVar = this.f7684c;
                String str = l0.f13778a;
                m2.d dVar = ((l2.a0) ((h0) bVar.f59801c)).f19342a.f19445s;
                m2.a U = dVar.U();
                dVar.V(U, 1015, new m2.c(U, eVar, 8));
                return;
            default:
                wf.b bVar2 = this.f7683b;
                l2.e eVar2 = this.f7684c;
                synchronized (eVar2) {
                }
                String str2 = l0.f13778a;
                l2.g0 g0Var = ((l2.a0) ((h0) bVar2.f59801c)).f19342a;
                m2.d dVar2 = g0Var.f19445s;
                m2.a S = dVar2.S((x2.g0) dVar2.d.f344e);
                dVar2.V(S, 1020, new f1(S, eVar2, 15));
                g0Var.S = null;
                return;
        }
    }
}
