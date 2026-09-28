package ff;
public final class b implements Runnable {
    public final int f9044a;
    public final Runnable f9045b;

    public b(int i10, Runnable runnable) {
        this.f9044a = i10;
        this.f9045b = runnable;
    }

    @Override
    public final void run() {
        this.f9045b.run();
    }
}
