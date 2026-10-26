package k2;
public final class u implements Runnable {
    public final int f16279a;
    public final rf.b f16280b;
    public final v0 f16281c;

    public u(rf.b bVar, v0 v0Var, int i10) {
        this.f16279a = i10;
        this.f16280b = bVar;
        this.f16281c = v0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f16279a;
        v0 v0Var = this.f16281c;
        rf.b bVar = this.f16280b;
        switch (i10) {
            case 0:
                String str = e2.n0.f9692a;
                j2.e eVar = ((i2.d0) ((v) bVar.f47336c)).f13509a.f13614s;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1032, new j2.d(p10, v0Var, 20));
                return;
            default:
                String str2 = e2.n0.f9692a;
                j2.e eVar2 = ((i2.d0) ((v) bVar.f47336c)).f13509a.f13614s;
                j2.a p11 = eVar2.p();
                eVar2.q(p11, 1031, new j2.d(p11, v0Var, 3));
                return;
        }
    }
}
