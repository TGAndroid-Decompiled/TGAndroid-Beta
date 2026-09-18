package ff;
public final class b implements Runnable {
    public final int f9062a;
    public final Runnable f9063b;

    public b(int i10, Runnable runnable) {
        this.f9062a = i10;
        this.f9063b = runnable;
    }

    @Override
    public final void run() {
        this.f9063b.run();
    }
}
