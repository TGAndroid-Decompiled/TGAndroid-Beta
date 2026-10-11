package n2;
public final class h implements Runnable {
    public final int f16559a;
    public final j f16560b;
    public final Object f16561c;

    public h(j jVar, k kVar, int i10) {
        this.f16559a = i10;
        this.f16560b = jVar;
        this.f16561c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f16559a) {
            case 0:
                j jVar = this.f16560b;
                this.f16561c.g(jVar.f16564a, jVar.f16565b);
                return;
            case 1:
                j jVar2 = this.f16560b;
                this.f16561c.i(jVar2.f16564a, jVar2.f16565b);
                return;
            default:
                j jVar3 = this.f16560b;
                this.f16561c.k(jVar3.f16564a, jVar3.f16565b);
                return;
        }
    }
}
