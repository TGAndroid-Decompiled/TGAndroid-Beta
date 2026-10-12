package hf;
public final class b implements Runnable {
    public final int f10474a;
    public final Runnable f10475b;

    public b(int i10, Runnable runnable) {
        this.f10474a = i10;
        this.f10475b = runnable;
    }

    @Override
    public final void run() {
        this.f10475b.run();
    }
}
