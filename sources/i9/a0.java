package i9;
public final class a0 extends h implements Runnable {
    public final Runnable f12043n;

    public a0(Runnable runnable) {
        runnable.getClass();
        this.f12043n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f12043n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f12043n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
