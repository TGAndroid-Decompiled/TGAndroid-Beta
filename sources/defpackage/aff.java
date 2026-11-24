package defpackage;
public final class aff extends wdf implements Runnable {
    public final Runnable n;

    public aff(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override
    public final String a() {
        return kt6.o("task=[", this.n.toString(), "]");
    }

    @Override
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e) {
            if (wdf.f.f(this, null, new pdf(e))) {
                wdf.g(this);
            }
            throw e;
        }
    }
}
