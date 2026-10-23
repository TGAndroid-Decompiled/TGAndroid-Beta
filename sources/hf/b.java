package hf;
public final class b implements Runnable {
    public final int f11809a;
    public final Runnable f11810b;

    public b(int i10, Runnable runnable) {
        this.f11809a = i10;
        this.f11810b = runnable;
    }

    @Override
    public final void run() {
        this.f11810b.run();
    }
}
