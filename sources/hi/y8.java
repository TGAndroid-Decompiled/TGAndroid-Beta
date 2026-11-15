package hi;
public final class y8 implements Runnable {
    public final int f15432a;
    public final sa f15433b;
    public final Runnable f15434c;

    public y8(sa saVar, Runnable runnable, int i7) {
        this.f15432a = i7;
        this.f15433b = saVar;
        this.f15434c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15432a) {
            case 0:
                this.f15434c.run();
                this.f15433b.o0();
                return;
            default:
                sa saVar = this.f15433b;
                saVar.e(false);
                org.telegram.messenger.g0.r(saVar.f15062h2);
                saVar.f15062h2 = null;
                saVar.T1 = false;
                this.f15434c.run();
                return;
        }
    }
}
