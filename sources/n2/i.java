package n2;
public final class i implements Runnable {
    public final int f15144a;
    public final k f15145b;
    public final Object f15146c;

    public i(k kVar, l lVar, int i10) {
        this.f15144a = i10;
        this.f15145b = kVar;
        this.f15146c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f15144a) {
            case 0:
                k kVar = this.f15145b;
                this.f15146c.g(kVar.f15149a, kVar.f15150b);
                return;
            case 1:
                k kVar2 = this.f15145b;
                this.f15146c.i(kVar2.f15149a, kVar2.f15150b);
                return;
            default:
                k kVar3 = this.f15145b;
                this.f15146c.k(kVar3.f15149a, kVar3.f15150b);
                return;
        }
    }
}
