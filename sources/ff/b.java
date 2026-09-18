package ff;
public final class b implements Runnable {
    public final int f9061a;
    public final Runnable f9062b;

    public b(int i10, Runnable runnable) {
        this.f9061a = i10;
        this.f9062b = runnable;
    }

    @Override
    public final void run() {
        this.f9062b.run();
    }
}
