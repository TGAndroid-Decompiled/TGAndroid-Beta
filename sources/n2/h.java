package n2;
public final class h implements Runnable {
    public final int f16517a;
    public final j f16518b;
    public final Object f16519c;

    public h(j jVar, k kVar, int i10) {
        this.f16517a = i10;
        this.f16518b = jVar;
        this.f16519c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f16517a) {
            case 0:
                j jVar = this.f16518b;
                this.f16519c.g(jVar.f16522a, jVar.f16523b);
                return;
            case 1:
                j jVar2 = this.f16518b;
                this.f16519c.i(jVar2.f16522a, jVar2.f16523b);
                return;
            default:
                j jVar3 = this.f16518b;
                this.f16519c.k(jVar3.f16522a, jVar3.f16523b);
                return;
        }
    }
}
