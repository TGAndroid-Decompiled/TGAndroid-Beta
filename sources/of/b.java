package of;
public final class b implements Runnable {
    public final int f21850a;
    public final Runnable f21851b;

    public b(int i7, Runnable runnable) {
        this.f21850a = i7;
        this.f21851b = runnable;
    }

    @Override
    public final void run() {
        this.f21851b.run();
    }
}
