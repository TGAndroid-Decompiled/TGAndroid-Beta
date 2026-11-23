package hi;
public final class y8 implements Runnable {
    public final int f15734a;
    public final ta f15735b;
    public final Runnable f15736c;

    public y8(ta taVar, Runnable runnable, int i7) {
        this.f15734a = i7;
        this.f15735b = taVar;
        this.f15736c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15734a) {
            case 0:
                this.f15736c.run();
                this.f15735b.o0();
                return;
            default:
                ta taVar = this.f15735b;
                taVar.e(false);
                org.telegram.messenger.g0.r(taVar.f15414h2);
                taVar.f15414h2 = null;
                taVar.T1 = false;
                this.f15736c.run();
                return;
        }
    }
}
