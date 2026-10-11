package gf;
public final class b implements Runnable {
    public final int f10515a;
    public final Runnable f10516b;

    public b(int i10, Runnable runnable) {
        this.f10515a = i10;
        this.f10516b = runnable;
    }

    @Override
    public final void run() {
        this.f10516b.run();
    }
}
