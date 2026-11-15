package n2;
public final class r implements Runnable {
    public final int f20846a;
    public final k8.a f20847b;
    public final s0 f20848c;

    public r(k8.a aVar, s0 s0Var, int i7) {
        this.f20846a = i7;
        this.f20847b = aVar;
        this.f20848c = s0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f20846a;
        s0 s0Var = this.f20848c;
        k8.a aVar = this.f20847b;
        switch (i7) {
            case 0:
                String str = h2.l0.f13471a;
                m2.e eVar = ((l2.z) ((s) aVar.f17789c)).f19233a.f18980s;
                m2.a U = eVar.U();
                eVar.V(U, 1032, new m2.c(U, s0Var, 20));
                return;
            default:
                String str2 = h2.l0.f13471a;
                m2.e eVar2 = ((l2.z) ((s) aVar.f17789c)).f19233a.f18980s;
                m2.a U2 = eVar2.U();
                eVar2.V(U2, 1031, new m2.c(U2, s0Var, 3));
                return;
        }
    }
}
