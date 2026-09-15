package ff;
public final class b implements Runnable {
    public final int f9057a;
    public final Runnable f9058b;

    public b(int i10, Runnable runnable) {
        this.f9057a = i10;
        this.f9058b = runnable;
    }

    @Override
    public final void run() {
        this.f9058b.run();
    }
}
