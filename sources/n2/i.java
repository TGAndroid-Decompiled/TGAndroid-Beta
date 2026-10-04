package n2;
public final class i implements Runnable {
    public final int f16538a;
    public final k f16539b;
    public final Object f16540c;

    public i(k kVar, l lVar, int i10) {
        this.f16538a = i10;
        this.f16539b = kVar;
        this.f16540c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f16538a) {
            case 0:
                k kVar = this.f16539b;
                this.f16540c.g(kVar.f16543a, kVar.f16544b);
                return;
            case 1:
                k kVar2 = this.f16539b;
                this.f16540c.i(kVar2.f16543a, kVar2.f16544b);
                return;
            default:
                k kVar3 = this.f16539b;
                this.f16540c.k(kVar3.f16543a, kVar3.f16544b);
                return;
        }
    }
}
