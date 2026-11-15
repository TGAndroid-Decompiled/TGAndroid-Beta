package bg;
public final class q {
    public final p f3320a;
    public long f3321b;
    public boolean f3322c;
    public final a3.f d = new a3.f(this, 16);

    public q(p pVar) {
        this.f3320a = pVar;
    }

    public final void a(long j3) {
        if (this.f3322c && this.f3321b == j3) {
            return;
        }
        this.f3321b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f3322c = true;
        a3.f fVar = this.d;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.i3(fVar, 1000L);
    }

    public final void b() {
        this.f3322c = false;
        org.telegram.messenger.g0.r(this.d);
    }
}
