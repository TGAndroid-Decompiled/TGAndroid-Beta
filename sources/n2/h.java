package n2;
public final class h implements Runnable {
    public final int f18619a;
    public final j f18620b;
    public final Object f18621c;

    public h(j jVar, k kVar, int i10) {
        this.f18619a = i10;
        this.f18620b = jVar;
        this.f18621c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f18619a) {
            case 0:
                j jVar = this.f18620b;
                this.f18621c.g(jVar.f18624a, jVar.f18625b);
                return;
            default:
                j jVar2 = this.f18620b;
                this.f18621c.i(jVar2.f18624a, jVar2.f18625b);
                return;
        }
    }
}
