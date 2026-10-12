package j9;
public final class c0 extends h implements Runnable {
    public final Runnable f12916n;

    public c0(Runnable runnable) {
        runnable.getClass();
        this.f12916n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f12916n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f12916n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
