package hi;
public final class y8 implements Runnable {
    public final int f15778a;
    public final ta f15779b;
    public final Runnable f15780c;

    public y8(ta taVar, Runnable runnable, int i7) {
        this.f15778a = i7;
        this.f15779b = taVar;
        this.f15780c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15778a) {
            case 0:
                this.f15780c.run();
                this.f15779b.o0();
                return;
            default:
                ta taVar = this.f15779b;
                taVar.e(false);
                org.telegram.messenger.g0.r(taVar.f15447h2);
                taVar.f15447h2 = null;
                taVar.T1 = false;
                this.f15780c.run();
                return;
        }
    }
}
