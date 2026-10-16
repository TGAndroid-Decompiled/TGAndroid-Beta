package j9;
public final class c0 extends h implements Runnable {
    public final Runnable f12920n;

    public c0(Runnable runnable) {
        runnable.getClass();
        this.f12920n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f12920n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f12920n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
