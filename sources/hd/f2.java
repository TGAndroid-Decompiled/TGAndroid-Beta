package hd;
public final class f2 extends md.s implements Runnable {
    public final long f10440e;

    public f2(long j10, qc.c cVar) {
        super(cVar, cVar.getContext());
        this.f10440e = j10;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.f10440e + ')';
    }

    @Override
    public final void run() {
        f0.j(this.f10408c);
        i(new e2("Timed out waiting for " + this.f10440e + " ms", this));
    }
}
