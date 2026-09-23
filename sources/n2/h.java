package n2;
public final class h implements Runnable {
    public final int f14875a;
    public final j f14876b;
    public final Object f14877c;

    public h(j jVar, k kVar, int i10) {
        this.f14875a = i10;
        this.f14876b = jVar;
        this.f14877c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f14875a) {
            case 0:
                j jVar = this.f14876b;
                this.f14877c.g(jVar.f14880a, jVar.f14881b);
                return;
            case 1:
                j jVar2 = this.f14876b;
                this.f14877c.i(jVar2.f14880a, jVar2.f14881b);
                return;
            default:
                j jVar3 = this.f14876b;
                this.f14877c.k(jVar3.f14880a, jVar3.f14881b);
                return;
        }
    }
}
