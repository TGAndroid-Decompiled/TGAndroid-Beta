package of;
public final class b implements Runnable {
    public final int f20944a;
    public final Runnable f20945b;

    public b(int i7, Runnable runnable) {
        this.f20944a = i7;
        this.f20945b = runnable;
    }

    @Override
    public final void run() {
        this.f20945b.run();
    }
}
