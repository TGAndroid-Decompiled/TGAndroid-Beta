package ld;
public final class e2 extends qd.s implements Runnable {
    public final long e;

    public e2(long j10, uc.c cVar) {
        super(cVar, cVar.getContext());
        this.e = j10;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.e + ')';
    }

    @Override
    public final void run() {
        e0.j(this.f11857c);
        i(new d2("Timed out waiting for " + this.e + " ms", this));
    }
}
