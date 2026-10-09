package ae;
public final class g2 extends fe.s implements Runnable {
    public final long f460e;

    public g2(long j3, jd.c cVar) {
        super(cVar, cVar.getContext());
        this.f460e = j3;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.f460e + ')';
    }

    @Override
    public final void run() {
        g0.j(this.f422c);
        i(new f2("Timed out waiting for " + this.f460e + " ms", this));
    }
}
