package hf;
public final class b implements Runnable {
    public final int f11782a;
    public final Runnable f11783b;

    public b(int i10, Runnable runnable) {
        this.f11782a = i10;
        this.f11783b = runnable;
    }

    @Override
    public final void run() {
        this.f11783b.run();
    }
}
