package n2;
public final class h implements Runnable {
    public final int f18620a;
    public final j f18621b;
    public final Object f18622c;

    public h(j jVar, k kVar, int i10) {
        this.f18620a = i10;
        this.f18621b = jVar;
        this.f18622c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f18620a) {
            case 0:
                j jVar = this.f18621b;
                this.f18622c.g(jVar.f18625a, jVar.f18626b);
                return;
            default:
                j jVar2 = this.f18621b;
                this.f18622c.i(jVar2.f18625a, jVar2.f18626b);
                return;
        }
    }
}
