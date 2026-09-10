package ff;
public final class b implements Runnable {
    public final int f7944a;
    public final Runnable f7945b;

    public b(int i10, Runnable runnable) {
        this.f7944a = i10;
        this.f7945b = runnable;
    }

    @Override
    public final void run() {
        this.f7945b.run();
    }
}
