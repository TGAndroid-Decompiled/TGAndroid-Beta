package n2;
public final class h implements Runnable {
    public final int f16395a;
    public final j f16396b;
    public final Object f16397c;

    public h(j jVar, k kVar, int i10) {
        this.f16395a = i10;
        this.f16396b = jVar;
        this.f16397c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f16395a) {
            case 0:
                j jVar = this.f16396b;
                this.f16397c.g(jVar.f16400a, jVar.f16401b);
                return;
            case 1:
                j jVar2 = this.f16396b;
                this.f16397c.i(jVar2.f16400a, jVar2.f16401b);
                return;
            default:
                j jVar3 = this.f16396b;
                this.f16397c.k(jVar3.f16400a, jVar3.f16401b);
                return;
        }
    }
}
