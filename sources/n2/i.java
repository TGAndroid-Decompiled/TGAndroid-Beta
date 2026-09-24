package n2;
public final class i implements Runnable {
    public final int f15113a;
    public final k f15114b;
    public final Object f15115c;

    public i(k kVar, l lVar, int i10) {
        this.f15113a = i10;
        this.f15114b = kVar;
        this.f15115c = lVar;
    }

    @Override
    public final void run() {
        switch (this.f15113a) {
            case 0:
                k kVar = this.f15114b;
                this.f15115c.g(kVar.f15118a, kVar.f15119b);
                return;
            case 1:
                k kVar2 = this.f15114b;
                this.f15115c.i(kVar2.f15118a, kVar2.f15119b);
                return;
            default:
                k kVar3 = this.f15114b;
                this.f15115c.k(kVar3.f15118a, kVar3.f15119b);
                return;
        }
    }
}
