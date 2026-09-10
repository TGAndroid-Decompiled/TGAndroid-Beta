package i9;
public final class a0 extends h implements Runnable {
    public final Runnable f10506n;

    public a0(Runnable runnable) {
        runnable.getClass();
        this.f10506n = runnable;
    }

    @Override
    public final String k() {
        return "task=[" + this.f10506n + "]";
    }

    @Override
    public final void run() {
        try {
            this.f10506n.run();
        } catch (Throwable th2) {
            n(th2);
            throw th2;
        }
    }
}
