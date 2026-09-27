package n2;
public final class h implements Runnable {
    public final int f15163a;
    public final j f15164b;
    public final Object f15165c;

    public h(j jVar, k kVar, int i10) {
        this.f15163a = i10;
        this.f15164b = jVar;
        this.f15165c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f15163a) {
            case 0:
                j jVar = this.f15164b;
                this.f15165c.g(jVar.f15168a, jVar.f15169b);
                return;
            case 1:
                j jVar2 = this.f15164b;
                this.f15165c.i(jVar2.f15168a, jVar2.f15169b);
                return;
            default:
                j jVar3 = this.f15164b;
                this.f15165c.k(jVar3.f15168a, jVar3.f15169b);
                return;
        }
    }
}
