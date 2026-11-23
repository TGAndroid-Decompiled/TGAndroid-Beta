package of;
public final class b implements Runnable {
    public final int f21819a;
    public final Runnable f21820b;

    public b(int i7, Runnable runnable) {
        this.f21819a = i7;
        this.f21820b = runnable;
    }

    @Override
    public final void run() {
        this.f21820b.run();
    }
}
