package n2;
public final class h implements Runnable {
    public final int f16422a;
    public final j f16423b;
    public final Object f16424c;

    public h(j jVar, k kVar, int i10) {
        this.f16422a = i10;
        this.f16423b = jVar;
        this.f16424c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f16422a) {
            case 0:
                j jVar = this.f16423b;
                this.f16424c.g(jVar.f16427a, jVar.f16428b);
                return;
            case 1:
                j jVar2 = this.f16423b;
                this.f16424c.i(jVar2.f16427a, jVar2.f16428b);
                return;
            default:
                j jVar3 = this.f16423b;
                this.f16424c.k(jVar3.f16427a, jVar3.f16428b);
                return;
        }
    }
}
