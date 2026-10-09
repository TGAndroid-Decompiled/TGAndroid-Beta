package gf;
public final class b implements Runnable {
    public final int f10516a;
    public final Runnable f10517b;

    public b(int i10, Runnable runnable) {
        this.f10516a = i10;
        this.f10517b = runnable;
    }

    @Override
    public final void run() {
        this.f10517b.run();
    }
}
