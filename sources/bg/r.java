package bg;
public final class r {
    public final q f3347a;
    public long f3348b;
    public boolean f3349c;
    public final a3.f d = new a3.f(this, 17);

    public r(q qVar) {
        this.f3347a = qVar;
    }

    public final void a(long j3) {
        if (this.f3349c && this.f3348b == j3) {
            return;
        }
        this.f3348b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f3349c = true;
        a3.f fVar = this.d;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.h3(fVar, 1000L);
    }

    public final void b() {
        this.f3349c = false;
        org.telegram.messenger.g0.r(this.d);
    }
}
