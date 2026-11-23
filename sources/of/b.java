package of;
public final class b implements Runnable {
    public final int f21919a;
    public final Runnable f21920b;

    public b(int i7, Runnable runnable) {
        this.f21919a = i7;
        this.f21920b = runnable;
    }

    @Override
    public final void run() {
        this.f21920b.run();
    }
}
