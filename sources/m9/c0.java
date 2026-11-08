package m9;
public final class c0 extends h implements Runnable {
    public final Runnable f19967n;

    public c0(Runnable runnable) {
        runnable.getClass();
        this.f19967n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f19967n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f19967n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
