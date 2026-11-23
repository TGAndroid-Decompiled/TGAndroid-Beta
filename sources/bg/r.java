package bg;
public final class r {
    public final q f3298a;
    public long f3299b;
    public boolean f3300c;
    public final a3.f d = new a3.f(this, 16);

    public r(q qVar) {
        this.f3298a = qVar;
    }

    public final void a(long j3) {
        if (this.f3300c && this.f3299b == j3) {
            return;
        }
        this.f3299b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f3300c = true;
        a3.f fVar = this.d;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.h3(fVar, 1000L);
    }

    public final void b() {
        this.f3300c = false;
        org.telegram.messenger.g0.r(this.d);
    }
}
