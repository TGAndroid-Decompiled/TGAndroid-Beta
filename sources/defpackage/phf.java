package defpackage;
public final class phf extends lgf implements Runnable {
    public final Runnable n;

    public phf(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override
    public final String a() {
        return qd4.y("task=[", this.n.toString(), "]");
    }

    @Override
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e) {
            if (lgf.f.f(this, null, new egf(e))) {
                lgf.g(this);
            }
            throw e;
        }
    }
}
