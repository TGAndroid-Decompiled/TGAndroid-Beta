package ae;
public final class g2 extends fe.s implements Runnable {
    public final long f462e;

    public g2(long j3, jd.c cVar) {
        super(cVar, cVar.getContext());
        this.f462e = j3;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.f462e + ')';
    }

    @Override
    public final void run() {
        g0.j(this.f424c);
        i(new f2("Timed out waiting for " + this.f462e + " ms", this));
    }
}
