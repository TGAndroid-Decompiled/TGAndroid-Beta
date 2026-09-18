package n2;
public final class i implements Runnable {
    public final int f15085a;
    public final k f15086b;
    public final Object f15087c;

    public i(k kVar, l lVar, int i10) {
        this.f15085a = i10;
        this.f15086b = kVar;
        this.f15087c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f15085a) {
            case 0:
                k kVar = this.f15086b;
                this.f15087c.g(kVar.f15090a, kVar.f15091b);
                return;
            case 1:
                k kVar2 = this.f15086b;
                this.f15087c.i(kVar2.f15090a, kVar2.f15091b);
                return;
            default:
                k kVar3 = this.f15086b;
                this.f15087c.k(kVar3.f15090a, kVar3.f15091b);
                return;
        }
    }
}
