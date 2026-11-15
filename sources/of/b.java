package of;
public final class b implements Runnable {
    public final int f21462a;
    public final Runnable f21463b;

    public b(int i7, Runnable runnable) {
        this.f21462a = i7;
        this.f21463b = runnable;
    }

    @Override
    public final void run() {
        this.f21463b.run();
    }
}
