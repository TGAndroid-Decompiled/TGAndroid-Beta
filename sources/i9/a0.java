package i9;
public final class a0 extends h implements Runnable {
    public final Runnable f11890n;

    public a0(Runnable runnable) {
        runnable.getClass();
        this.f11890n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f11890n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f11890n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
