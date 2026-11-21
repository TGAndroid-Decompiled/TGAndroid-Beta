package hi;
public final class x8 implements Runnable {
    public final int f15758a;
    public final sa f15759b;
    public final Runnable f15760c;

    public x8(sa saVar, Runnable runnable, int i7) {
        this.f15758a = i7;
        this.f15759b = saVar;
        this.f15760c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15758a) {
            case 0:
                this.f15760c.run();
                this.f15759b.o0();
                return;
            default:
                sa saVar = this.f15759b;
                saVar.e(false);
                org.telegram.messenger.g0.r(saVar.f15408h2);
                saVar.f15408h2 = null;
                saVar.T1 = false;
                this.f15760c.run();
                return;
        }
    }
}
