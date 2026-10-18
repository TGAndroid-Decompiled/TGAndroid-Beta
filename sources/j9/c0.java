package j9;
public final class c0 extends h implements Runnable {
    public final Runnable f14334n;

    public c0(Runnable runnable) {
        runnable.getClass();
        this.f14334n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f14334n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f14334n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
