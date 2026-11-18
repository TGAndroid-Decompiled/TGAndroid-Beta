package m9;
public final class c0 extends h implements Runnable {
    public final Runnable f20925n;

    public c0(Runnable runnable) {
        runnable.getClass();
        this.f20925n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f20925n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f20925n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
