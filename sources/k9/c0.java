package k9;
public final class c0 extends h implements Runnable {
    public final Runnable f16466n;

    public c0(Runnable runnable) {
        runnable.getClass();
        this.f16466n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f16466n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f16466n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
