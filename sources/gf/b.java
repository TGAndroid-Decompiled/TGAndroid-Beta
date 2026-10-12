package gf;
public final class b implements Runnable {
    public final int f10514a;
    public final Runnable f10515b;

    public b(int i10, Runnable runnable) {
        this.f10514a = i10;
        this.f10515b = runnable;
    }

    @Override
    public final void run() {
        this.f10515b.run();
    }
}
