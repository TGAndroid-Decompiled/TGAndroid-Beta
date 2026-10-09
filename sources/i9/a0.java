package i9;
public final class a0 extends h implements Runnable {
    public final Runnable f12045n;

    public a0(Runnable runnable) {
        runnable.getClass();
        this.f12045n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f12045n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f12045n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
