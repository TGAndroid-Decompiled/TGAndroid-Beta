package cg;
public final class p {
    public final o f4729a;
    public long f4730b;
    public boolean f4731c;
    public final ai.s d = new ai.s(this, 23);

    public p(o oVar) {
        this.f4729a = oVar;
    }

    public final void a(long j10) {
        if (this.f4731c && this.f4730b == j10) {
            return;
        }
        this.f4730b = j10;
        if (j10 <= 0) {
            b();
            return;
        }
        this.f4731c = true;
        ai.s sVar = this.d;
        org.telegram.messenger.g0.r(sVar);
        org.telegram.messenger.g0.i3(sVar, 1000L);
    }

    public final void b() {
        this.f4731c = false;
        org.telegram.messenger.g0.r(this.d);
    }
}
