package n2;
public final class h implements Runnable {
    public final int f16513a;
    public final j f16514b;
    public final Object f16515c;

    public h(j jVar, k kVar, int i10) {
        this.f16513a = i10;
        this.f16514b = jVar;
        this.f16515c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f16513a) {
            case 0:
                j jVar = this.f16514b;
                this.f16515c.g(jVar.f16518a, jVar.f16519b);
                return;
            case 1:
                j jVar2 = this.f16514b;
                this.f16515c.i(jVar2.f16518a, jVar2.f16519b);
                return;
            default:
                j jVar3 = this.f16514b;
                this.f16515c.k(jVar3.f16518a, jVar3.f16519b);
                return;
        }
    }
}
