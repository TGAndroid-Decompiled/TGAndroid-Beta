package n2;
public final class i implements Runnable {
    public final int f15129a;
    public final k f15130b;
    public final Object f15131c;

    public i(k kVar, l lVar, int i10) {
        this.f15129a = i10;
        this.f15130b = kVar;
        this.f15131c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f15129a) {
            case 0:
                k kVar = this.f15130b;
                this.f15131c.g(kVar.f15134a, kVar.f15135b);
                return;
            case 1:
                k kVar2 = this.f15130b;
                this.f15131c.i(kVar2.f15134a, kVar2.f15135b);
                return;
            default:
                k kVar3 = this.f15130b;
                this.f15131c.k(kVar3.f15134a, kVar3.f15135b);
                return;
        }
    }
}
