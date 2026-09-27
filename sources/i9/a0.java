package i9;
public final class a0 extends h implements Runnable {
    public final Runnable f11015n;

    public a0(Runnable runnable) {
        runnable.getClass();
        this.f11015n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f11015n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f11015n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
