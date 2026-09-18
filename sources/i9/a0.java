package i9;
public final class a0 extends h implements Runnable {
    public final Runnable f11025n;

    public a0(Runnable runnable) {
        runnable.getClass();
        this.f11025n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f11025n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f11025n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
