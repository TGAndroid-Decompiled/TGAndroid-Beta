package me;
public final class b implements Runnable {
    public final int f17681a;
    public final Runnable f17682b;

    public b(int i9, Runnable runnable) {
        this.f17681a = i9;
        this.f17682b = runnable;
    }

    @Override
    public final void run() {
        this.f17682b.run();
    }
}
