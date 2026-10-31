package j9;
public final class c0 extends h implements Runnable {
    public final Runnable f9739n;

    public c0(Runnable runnable) {
        runnable.getClass();
        this.f9739n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f9739n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f9739n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
