package hi;
public final class s9 implements Runnable {
    public final int f15405a;
    public final nb f15406b;
    public final Runnable f15407c;

    public s9(nb nbVar, Runnable runnable, int i7) {
        this.f15405a = i7;
        this.f15406b = nbVar;
        this.f15407c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15405a) {
            case 0:
                this.f15407c.run();
                this.f15406b.o0();
                return;
            default:
                nb nbVar = this.f15406b;
                nbVar.e(false);
                org.telegram.messenger.g0.r(nbVar.f15081h2);
                nbVar.f15081h2 = null;
                nbVar.T1 = false;
                this.f15407c.run();
                return;
        }
    }
}
