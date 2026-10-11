package n2;
public final class h implements Runnable {
    public final int f16595a;
    public final j f16596b;
    public final Object f16597c;

    public h(j jVar, k kVar, int i10) {
        this.f16595a = i10;
        this.f16596b = jVar;
        this.f16597c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f16595a) {
            case 0:
                j jVar = this.f16596b;
                this.f16597c.g(jVar.f16600a, jVar.f16601b);
                return;
            case 1:
                j jVar2 = this.f16596b;
                this.f16597c.i(jVar2.f16600a, jVar2.f16601b);
                return;
            default:
                j jVar3 = this.f16596b;
                this.f16597c.k(jVar3.f16600a, jVar3.f16601b);
                return;
        }
    }
}
