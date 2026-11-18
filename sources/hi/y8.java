package hi;
public final class y8 implements Runnable {
    public final int f15781a;
    public final ta f15782b;
    public final Runnable f15783c;

    public y8(ta taVar, Runnable runnable, int i7) {
        this.f15781a = i7;
        this.f15782b = taVar;
        this.f15783c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15781a) {
            case 0:
                this.f15783c.run();
                this.f15782b.o0();
                return;
            default:
                ta taVar = this.f15782b;
                taVar.e(false);
                org.telegram.messenger.g0.r(taVar.f15450h2);
                taVar.f15450h2 = null;
                taVar.T1 = false;
                this.f15783c.run();
                return;
        }
    }
}
