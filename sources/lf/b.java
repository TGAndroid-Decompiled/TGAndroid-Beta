package lf;
public final class b implements Runnable {
    public final int f18217a;
    public final Runnable f18218b;

    public b(int i3, Runnable runnable) {
        this.f18217a = i3;
        this.f18218b = runnable;
    }

    @Override
    public final void run() {
        this.f18218b.run();
    }
}
