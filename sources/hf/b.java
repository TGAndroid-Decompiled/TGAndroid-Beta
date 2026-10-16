package hf;
public final class b implements Runnable {
    public final int f10478a;
    public final Runnable f10479b;

    public b(int i10, Runnable runnable) {
        this.f10478a = i10;
        this.f10479b = runnable;
    }

    @Override
    public final void run() {
        this.f10479b.run();
    }
}
