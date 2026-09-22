package n2;
public final class h implements Runnable {
    public final int f14898a;
    public final j f14899b;
    public final Object f14900c;

    public h(j jVar, k kVar, int i10) {
        this.f14898a = i10;
        this.f14899b = jVar;
        this.f14900c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f14898a) {
            case 0:
                j jVar = this.f14899b;
                this.f14900c.g(jVar.f14903a, jVar.f14904b);
                return;
            case 1:
                j jVar2 = this.f14899b;
                this.f14900c.i(jVar2.f14903a, jVar2.f14904b);
                return;
            default:
                j jVar3 = this.f14899b;
                this.f14900c.k(jVar3.f14903a, jVar3.f14904b);
                return;
        }
    }
}
