package of;
public final class b implements Runnable {
    public final int f21828a;
    public final Runnable f21829b;

    public b(int i7, Runnable runnable) {
        this.f21828a = i7;
        this.f21829b = runnable;
    }

    @Override
    public final void run() {
        this.f21829b.run();
    }
}
