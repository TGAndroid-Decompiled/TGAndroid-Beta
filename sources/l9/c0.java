package l9;
public final class c0 extends h implements Runnable {
    public final Runnable f18135n;

    public c0(Runnable runnable) {
        runnable.getClass();
        this.f18135n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f18135n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f18135n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
