package defpackage;
public final class ch7 extends q2 implements Runnable {
    public final Runnable n;

    public ch7(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override
    public final String j() {
        return "task=[" + this.n + "]";
    }

    @Override
    public final void run() {
        try {
            this.n.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
