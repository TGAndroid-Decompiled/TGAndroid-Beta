package n2;
public final class i implements Runnable {
    public final int f16543a;
    public final k f16544b;
    public final Object f16545c;

    public i(k kVar, l lVar, int i10) {
        this.f16543a = i10;
        this.f16544b = kVar;
        this.f16545c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f16543a) {
            case 0:
                k kVar = this.f16544b;
                this.f16545c.g(kVar.f16548a, kVar.f16549b);
                return;
            case 1:
                k kVar2 = this.f16544b;
                this.f16545c.i(kVar2.f16548a, kVar2.f16549b);
                return;
            default:
                k kVar3 = this.f16544b;
                this.f16545c.k(kVar3.f16548a, kVar3.f16549b);
                return;
        }
    }
}
