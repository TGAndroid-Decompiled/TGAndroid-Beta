package ff;
public final class b implements Runnable {
    public final int f9059a;
    public final Runnable f9060b;

    public b(int i10, Runnable runnable) {
        this.f9059a = i10;
        this.f9060b = runnable;
    }

    @Override
    public final void run() {
        this.f9060b.run();
    }
}
