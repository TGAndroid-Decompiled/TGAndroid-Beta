package m9;
public final class c0 extends h implements Runnable {
    public final Runnable f21018n;

    public c0(Runnable runnable) {
        runnable.getClass();
        this.f21018n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f21018n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f21018n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
