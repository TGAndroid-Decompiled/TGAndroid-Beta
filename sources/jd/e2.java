package jd;
public final class e2 extends od.t implements Runnable {
    public final long f11470e;

    public e2(long j10, sc.c cVar) {
        super(cVar, cVar.getContext());
        this.f11470e = j10;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.f11470e + ')';
    }

    @Override
    public final void run() {
        e0.j(this.f11443c);
        i(new d2("Timed out waiting for " + this.f11470e + " ms", this));
    }
}
