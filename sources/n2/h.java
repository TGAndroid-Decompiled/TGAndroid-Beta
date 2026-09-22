package n2;
public final class h implements Runnable {
    public final int f15137a;
    public final j f15138b;
    public final Object f15139c;

    public h(j jVar, k kVar, int i10) {
        this.f15137a = i10;
        this.f15138b = jVar;
        this.f15139c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f15137a) {
            case 0:
                j jVar = this.f15138b;
                this.f15139c.g(jVar.f15142a, jVar.f15143b);
                return;
            case 1:
                j jVar2 = this.f15138b;
                this.f15139c.i(jVar2.f15142a, jVar2.f15143b);
                return;
            default:
                j jVar3 = this.f15138b;
                this.f15139c.k(jVar3.f15142a, jVar3.f15143b);
                return;
        }
    }
}
