package j9;
public final class c0 extends h implements Runnable {
    public final Runnable f14327n;

    public c0(Runnable runnable) {
        runnable.getClass();
        this.f14327n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f14327n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f14327n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
