package ld;
public final class e2 extends qd.s implements Runnable {
    public final long f12306e;

    public e2(long j10, uc.c cVar) {
        super(cVar, cVar.getContext());
        this.f12306e = j10;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.f12306e + ')';
    }

    @Override
    public final void run() {
        e0.j(this.f12279c);
        i(new d2("Timed out waiting for " + this.f12306e + " ms", this));
    }
}
