package n2;
public final class r implements Runnable {
    public final int f21238a;
    public final k8.a f21239b;
    public final s0 f21240c;

    public r(k8.a aVar, s0 s0Var, int i7) {
        this.f21238a = i7;
        this.f21239b = aVar;
        this.f21240c = s0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f21238a;
        s0 s0Var = this.f21240c;
        k8.a aVar = this.f21239b;
        switch (i7) {
            case 0:
                String str = h2.l0.f13815a;
                m2.d dVar = ((l2.z) ((s) aVar.f18215c)).f19628a.f19375s;
                m2.a U = dVar.U();
                dVar.V(U, 1032, new m2.c(U, s0Var, 21));
                return;
            default:
                String str2 = h2.l0.f13815a;
                m2.d dVar2 = ((l2.z) ((s) aVar.f18215c)).f19628a.f19375s;
                m2.a U2 = dVar2.U();
                dVar2.V(U2, 1031, new m2.c(U2, s0Var, 4));
                return;
        }
    }
}
