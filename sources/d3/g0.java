package d3;

import h2.l0;
public final class g0 implements Runnable {
    public final int f7691a;
    public final wf.b f7692b;
    public final l2.d f7693c;

    public g0(wf.b bVar, l2.d dVar, int i7) {
        this.f7691a = i7;
        this.f7692b = bVar;
        this.f7693c = dVar;
    }

    @Override
    public final void run() {
        switch (this.f7691a) {
            case 0:
                wf.b bVar = this.f7692b;
                l2.d dVar = this.f7693c;
                String str = l0.f13786a;
                m2.d dVar2 = ((l2.z) ((h0) bVar.f59673c)).f19600a.f19347s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1015, new m2.c(U, dVar, 8));
                return;
            default:
                wf.b bVar2 = this.f7692b;
                l2.d dVar3 = this.f7693c;
                synchronized (dVar3) {
                }
                String str2 = l0.f13786a;
                l2.f0 f0Var = ((l2.z) ((h0) bVar2.f59673c)).f19600a;
                m2.d dVar4 = f0Var.f19347s;
                m2.a S = dVar4.S((x2.g0) dVar4.d.f344e);
                dVar4.V(S, 1020, new ki.e(S, dVar3, 12));
                f0Var.S = null;
                return;
        }
    }
}
