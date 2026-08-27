package id;

public final class f2 extends nd.s implements Runnable {

    public final long f11149e;

    public f2(long j10, rc.c cVar) {
        super(cVar, cVar.getContext());
        this.f11149e = j10;
    }

    @Override
    public final String C() {
        return super.C() + "(timeMillis=" + this.f11149e + ')';
    }

    @Override
    public final void run() {
        f0.j(this.f11117c);
        i(new e2("Timed out waiting for " + this.f11149e + " ms", this));
    }
}
