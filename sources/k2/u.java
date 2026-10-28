package k2;
public final class u implements Runnable {
    public final int f16278a;
    public final rf.b f16279b;
    public final v0 f16280c;

    public u(rf.b bVar, v0 v0Var, int i10) {
        this.f16278a = i10;
        this.f16279b = bVar;
        this.f16280c = v0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f16278a;
        v0 v0Var = this.f16280c;
        rf.b bVar = this.f16279b;
        switch (i10) {
            case 0:
                String str = e2.n0.f9691a;
                j2.e eVar = ((i2.d0) ((v) bVar.f47371c)).f13508a.f13613s;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1032, new j2.d(p10, v0Var, 20));
                return;
            default:
                String str2 = e2.n0.f9691a;
                j2.e eVar2 = ((i2.d0) ((v) bVar.f47371c)).f13508a.f13613s;
                j2.a p11 = eVar2.p();
                eVar2.q(p11, 1031, new j2.d(p11, v0Var, 3));
                return;
        }
    }
}
