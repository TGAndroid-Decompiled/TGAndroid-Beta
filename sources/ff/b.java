package ff;
public final class b implements Runnable {
    public final int f9056a;
    public final Runnable f9057b;

    public b(int i10, Runnable runnable) {
        this.f9056a = i10;
        this.f9057b = runnable;
    }

    @Override
    public final void run() {
        this.f9057b.run();
    }
}
