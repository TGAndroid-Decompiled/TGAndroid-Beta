package n2;
public final class h implements Runnable {
    public final int f13456a;
    public final j f13457b;
    public final Object f13458c;

    public h(j jVar, k kVar, int i10) {
        this.f13456a = i10;
        this.f13457b = jVar;
        this.f13458c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f13456a) {
            case 0:
                j jVar = this.f13457b;
                this.f13458c.E(jVar.f13461a, jVar.f13462b);
                return;
            default:
                j jVar2 = this.f13457b;
                this.f13458c.J(jVar2.f13461a, jVar2.f13462b);
                return;
        }
    }
}
