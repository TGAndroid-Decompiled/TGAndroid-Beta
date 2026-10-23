package j9;
public final class c0 extends h implements Runnable {
    public final Runnable f14377n;

    public c0(Runnable runnable) {
        runnable.getClass();
        this.f14377n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f14377n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f14377n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
