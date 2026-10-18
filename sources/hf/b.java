package hf;
public final class b implements Runnable {
    public final int f11785a;
    public final Runnable f11786b;

    public b(int i10, Runnable runnable) {
        this.f11785a = i10;
        this.f11786b = runnable;
    }

    @Override
    public final void run() {
        this.f11786b.run();
    }
}
