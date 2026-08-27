package ne;

public final class b implements Runnable {

    public final int f18517a;

    public final Runnable f18518b;

    public b(int i10, Runnable runnable) {
        this.f18517a = i10;
        this.f18518b = runnable;
    }

    @Override
    public final void run() {
        this.f18518b.run();
    }
}
