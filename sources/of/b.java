package of;
public final class b implements Runnable {
    public final int f20939a;
    public final Runnable f20940b;

    public b(int i7, Runnable runnable) {
        this.f20939a = i7;
        this.f20940b = runnable;
    }

    @Override
    public final void run() {
        this.f20940b.run();
    }
}
