package of;
public final class b implements Runnable {
    public final int f20936a;
    public final Runnable f20937b;

    public b(int i7, Runnable runnable) {
        this.f20936a = i7;
        this.f20937b = runnable;
    }

    @Override
    public final void run() {
        this.f20937b.run();
    }
}
