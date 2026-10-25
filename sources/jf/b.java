package jf;
public final class b implements Runnable {
    public final int f15614a;
    public final Runnable f15615b;

    public b(int i10, Runnable runnable) {
        this.f15614a = i10;
        this.f15615b = runnable;
    }

    @Override
    public final void run() {
        this.f15615b.run();
    }
}
