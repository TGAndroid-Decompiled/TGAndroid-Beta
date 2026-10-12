package n2;
public final class h implements Runnable {
    public final int f16262a;
    public final j f16263b;
    public final Object f16264c;

    public h(j jVar, k kVar, int i10) {
        this.f16262a = i10;
        this.f16263b = jVar;
        this.f16264c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f16262a) {
            case 0:
                j jVar = this.f16263b;
                this.f16264c.g(jVar.f16267a, jVar.f16268b);
                return;
            case 1:
                j jVar2 = this.f16263b;
                this.f16264c.i(jVar2.f16267a, jVar2.f16268b);
                return;
            default:
                j jVar3 = this.f16263b;
                this.f16264c.k(jVar3.f16267a, jVar3.f16268b);
                return;
        }
    }
}
