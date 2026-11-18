package of;
public final class b implements Runnable {
    public final int f21825a;
    public final Runnable f21826b;

    public b(int i7, Runnable runnable) {
        this.f21825a = i7;
        this.f21826b = runnable;
    }

    @Override
    public final void run() {
        this.f21826b.run();
    }
}
