package n2;
public final class h implements Runnable {
    public final int f14910a;
    public final j f14911b;
    public final Object f14912c;

    public h(j jVar, k kVar, int i10) {
        this.f14910a = i10;
        this.f14911b = jVar;
        this.f14912c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f14910a) {
            case 0:
                j jVar = this.f14911b;
                this.f14912c.g(jVar.f14915a, jVar.f14916b);
                return;
            case 1:
                j jVar2 = this.f14911b;
                this.f14912c.i(jVar2.f14915a, jVar2.f14916b);
                return;
            default:
                j jVar3 = this.f14911b;
                this.f14912c.k(jVar3.f14915a, jVar3.f14916b);
                return;
        }
    }
}
