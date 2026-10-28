package jf;
public final class b implements Runnable {
    public final int f15613a;
    public final Runnable f15614b;

    public b(int i10, Runnable runnable) {
        this.f15613a = i10;
        this.f15614b = runnable;
    }

    @Override
    public final void run() {
        this.f15614b.run();
    }
}
