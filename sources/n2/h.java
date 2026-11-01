package n2;
public final class h implements Runnable {
    public final int f13457a;
    public final j f13458b;
    public final Object f13459c;

    public h(j jVar, k kVar, int i10) {
        this.f13457a = i10;
        this.f13458b = jVar;
        this.f13459c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f13457a) {
            case 0:
                j jVar = this.f13458b;
                this.f13459c.E(jVar.f13462a, jVar.f13463b);
                return;
            default:
                j jVar2 = this.f13458b;
                this.f13459c.J(jVar2.f13462a, jVar2.f13463b);
                return;
        }
    }
}
