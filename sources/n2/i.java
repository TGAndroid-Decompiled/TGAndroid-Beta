package n2;
public final class i implements Runnable {
    public final int f16539a;
    public final k f16540b;
    public final Object f16541c;

    public i(k kVar, l lVar, int i10) {
        this.f16539a = i10;
        this.f16540b = kVar;
        this.f16541c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f16539a) {
            case 0:
                k kVar = this.f16540b;
                this.f16541c.g(kVar.f16544a, kVar.f16545b);
                return;
            case 1:
                k kVar2 = this.f16540b;
                this.f16541c.i(kVar2.f16544a, kVar2.f16545b);
                return;
            default:
                k kVar3 = this.f16540b;
                this.f16541c.k(kVar3.f16544a, kVar3.f16545b);
                return;
        }
    }
}
