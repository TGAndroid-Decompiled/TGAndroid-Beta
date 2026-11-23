package hi;
public final class x8 implements Runnable {
    public final int f15761a;
    public final sa f15762b;
    public final Runnable f15763c;

    public x8(sa saVar, Runnable runnable, int i7) {
        this.f15761a = i7;
        this.f15762b = saVar;
        this.f15763c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15761a) {
            case 0:
                this.f15763c.run();
                this.f15762b.o0();
                return;
            default:
                sa saVar = this.f15762b;
                saVar.e(false);
                org.telegram.messenger.g0.r(saVar.f15411h2);
                saVar.f15411h2 = null;
                saVar.T1 = false;
                this.f15763c.run();
                return;
        }
    }
}
