package of;
public final class b implements Runnable {
    public final int f21853a;
    public final Runnable f21854b;

    public b(int i7, Runnable runnable) {
        this.f21853a = i7;
        this.f21854b = runnable;
    }

    @Override
    public final void run() {
        this.f21854b.run();
    }
}
