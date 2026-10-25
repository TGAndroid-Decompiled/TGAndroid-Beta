package ce;
public final class f2 extends he.s implements Runnable {
    public final long e;

    public f2(long j10, ld.c cVar) {
        super(cVar, cVar.getContext());
        this.e = j10;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.e + ')';
    }

    @Override
    public final void run() {
        f0.j(this.f6200c);
        i(new e2("Timed out waiting for " + this.e + " ms", this));
    }
}
