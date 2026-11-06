package m9;
public final class c0 extends h implements Runnable {
    public final Runnable f19964n;

    public c0(Runnable runnable) {
        runnable.getClass();
        this.f19964n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f19964n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f19964n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
