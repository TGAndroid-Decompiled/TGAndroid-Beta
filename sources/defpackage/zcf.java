package defpackage;
public final class zcf extends vbf implements Runnable {
    public final Runnable n;

    public zcf(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override
    public final String a() {
        return tb4.y("task=[", this.n.toString(), "]");
    }

    @Override
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e) {
            if (vbf.f.f(this, null, new obf(e))) {
                vbf.g(this);
            }
            throw e;
        }
    }
}
