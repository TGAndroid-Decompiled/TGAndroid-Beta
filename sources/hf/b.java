package hf;
public final class b implements Runnable {
    public final int f11783a;
    public final Runnable f11784b;

    public b(int i10, Runnable runnable) {
        this.f11783a = i10;
        this.f11784b = runnable;
    }

    @Override
    public final void run() {
        this.f11784b.run();
    }
}
