package bg;
public final class q {
    public final p f3364a;
    public long f3365b;
    public boolean f3366c;
    public final a3.f d = new a3.f(this, 13);

    public q(p pVar) {
        this.f3364a = pVar;
    }

    public final void a(long j3) {
        if (this.f3366c && this.f3365b == j3) {
            return;
        }
        this.f3365b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f3366c = true;
        a3.f fVar = this.d;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.i3(fVar, 1000L);
    }

    public final void b() {
        this.f3366c = false;
        org.telegram.messenger.g0.r(this.d);
    }
}
