package n2;
public final class i implements Runnable {
    public final int f16548a;
    public final k f16549b;
    public final Object f16550c;

    public i(k kVar, l lVar, int i10) {
        this.f16548a = i10;
        this.f16549b = kVar;
        this.f16550c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f16548a) {
            case 0:
                k kVar = this.f16549b;
                this.f16550c.g(kVar.f16553a, kVar.f16554b);
                return;
            case 1:
                k kVar2 = this.f16549b;
                this.f16550c.i(kVar2.f16553a, kVar2.f16554b);
                return;
            default:
                k kVar3 = this.f16549b;
                this.f16550c.k(kVar3.f16553a, kVar3.f16554b);
                return;
        }
    }
}
