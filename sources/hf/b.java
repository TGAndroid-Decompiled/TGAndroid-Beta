package hf;
public final class b implements Runnable {
    public final int f11784a;
    public final Runnable f11785b;

    public b(int i10, Runnable runnable) {
        this.f11784a = i10;
        this.f11785b = runnable;
    }

    @Override
    public final void run() {
        this.f11785b.run();
    }
}
