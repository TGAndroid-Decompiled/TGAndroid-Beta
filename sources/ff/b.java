package ff;
public final class b implements Runnable {
    public final int f9047a;
    public final Runnable f9048b;

    public b(int i10, Runnable runnable) {
        this.f9047a = i10;
        this.f9048b = runnable;
    }

    @Override
    public final void run() {
        this.f9048b.run();
    }
}
