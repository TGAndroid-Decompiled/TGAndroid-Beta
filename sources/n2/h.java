package n2;
public final class h implements Runnable {
    public final int f16261a;
    public final j f16262b;
    public final Object f16263c;

    public h(j jVar, k kVar, int i10) {
        this.f16261a = i10;
        this.f16262b = jVar;
        this.f16263c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f16261a) {
            case 0:
                j jVar = this.f16262b;
                this.f16263c.g(jVar.f16266a, jVar.f16267b);
                return;
            case 1:
                j jVar2 = this.f16262b;
                this.f16263c.i(jVar2.f16266a, jVar2.f16267b);
                return;
            default:
                j jVar3 = this.f16262b;
                this.f16263c.k(jVar3.f16266a, jVar3.f16267b);
                return;
        }
    }
}
