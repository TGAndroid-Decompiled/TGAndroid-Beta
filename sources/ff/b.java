package ff;
public final class b implements Runnable {
    public final int f9468a;
    public final Runnable f9469b;

    public b(int i10, Runnable runnable) {
        this.f9468a = i10;
        this.f9469b = runnable;
    }

    @Override
    public final void run() {
        this.f9469b.run();
    }
}
