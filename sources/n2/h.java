package n2;
public final class h implements Runnable {
    public final int f13729a;
    public final j f13730b;
    public final Object f13731c;

    public h(j jVar, k kVar, int i10) {
        this.f13729a = i10;
        this.f13730b = jVar;
        this.f13731c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f13729a) {
            case 0:
                j jVar = this.f13730b;
                this.f13731c.g(jVar.f13734a, jVar.f13735b);
                return;
            case 1:
                j jVar2 = this.f13730b;
                this.f13731c.i(jVar2.f13734a, jVar2.f13735b);
                return;
            default:
                j jVar3 = this.f13730b;
                this.f13731c.k(jVar3.f13734a, jVar3.f13735b);
                return;
        }
    }
}
