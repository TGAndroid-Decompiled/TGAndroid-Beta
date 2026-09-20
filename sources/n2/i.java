package n2;
public final class i implements Runnable {
    public final int f15124a;
    public final k f15125b;
    public final Object f15126c;

    public i(k kVar, l lVar, int i10) {
        this.f15124a = i10;
        this.f15125b = kVar;
        this.f15126c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f15124a) {
            case 0:
                k kVar = this.f15125b;
                this.f15126c.g(kVar.f15129a, kVar.f15130b);
                return;
            case 1:
                k kVar2 = this.f15125b;
                this.f15126c.i(kVar2.f15129a, kVar2.f15130b);
                return;
            default:
                k kVar3 = this.f15125b;
                this.f15126c.k(kVar3.f15129a, kVar3.f15130b);
                return;
        }
    }
}
