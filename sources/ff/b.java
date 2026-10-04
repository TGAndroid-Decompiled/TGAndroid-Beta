package ff;
public final class b implements Runnable {
    public final int f9844a;
    public final Runnable f9845b;

    public b(int i10, Runnable runnable) {
        this.f9844a = i10;
        this.f9845b = runnable;
    }

    @Override
    public final void run() {
        this.f9845b.run();
    }
}
