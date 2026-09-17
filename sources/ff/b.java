package ff;
public final class b implements Runnable {
    public final int f9496a;
    public final Runnable f9497b;

    public b(int i10, Runnable runnable) {
        this.f9496a = i10;
        this.f9497b = runnable;
    }

    @Override
    public final void run() {
        this.f9497b.run();
    }
}
