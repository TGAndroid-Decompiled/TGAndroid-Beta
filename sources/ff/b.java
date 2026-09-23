package ff;
public final class b implements Runnable {
    public final int f9045a;
    public final Runnable f9046b;

    public b(int i10, Runnable runnable) {
        this.f9045a = i10;
        this.f9046b = runnable;
    }

    @Override
    public final void run() {
        this.f9046b.run();
    }
}
