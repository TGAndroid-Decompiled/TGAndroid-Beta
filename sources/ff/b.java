package ff;
public final class b implements Runnable {
    public final int f9845a;
    public final Runnable f9846b;

    public b(int i10, Runnable runnable) {
        this.f9845a = i10;
        this.f9846b = runnable;
    }

    @Override
    public final void run() {
        this.f9846b.run();
    }
}
