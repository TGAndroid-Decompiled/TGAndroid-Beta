package n2;
public final class h implements Runnable {
    public final int f14900a;
    public final j f14901b;
    public final Object f14902c;

    public h(j jVar, k kVar, int i10) {
        this.f14900a = i10;
        this.f14901b = jVar;
        this.f14902c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f14900a) {
            case 0:
                j jVar = this.f14901b;
                this.f14902c.g(jVar.f14905a, jVar.f14906b);
                return;
            case 1:
                j jVar2 = this.f14901b;
                this.f14902c.i(jVar2.f14905a, jVar2.f14906b);
                return;
            default:
                j jVar3 = this.f14901b;
                this.f14902c.k(jVar3.f14905a, jVar3.f14906b);
                return;
        }
    }
}
