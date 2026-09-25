package n2;
public final class i implements Runnable {
    public final int f15128a;
    public final k f15129b;
    public final Object f15130c;

    public i(k kVar, l lVar, int i10) {
        this.f15128a = i10;
        this.f15129b = kVar;
        this.f15130c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f15128a) {
            case 0:
                k kVar = this.f15129b;
                this.f15130c.g(kVar.f15133a, kVar.f15134b);
                return;
            case 1:
                k kVar2 = this.f15129b;
                this.f15130c.i(kVar2.f15133a, kVar2.f15134b);
                return;
            default:
                k kVar3 = this.f15129b;
                this.f15130c.k(kVar3.f15133a, kVar3.f15134b);
                return;
        }
    }
}
