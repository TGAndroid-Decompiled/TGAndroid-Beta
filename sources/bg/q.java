package bg;
public final class q {
    public final p f3317a;
    public long f3318b;
    public boolean f3319c;
    public final a3.f d = new a3.f(this, 16);

    public q(p pVar) {
        this.f3317a = pVar;
    }

    public final void a(long j3) {
        if (this.f3319c && this.f3318b == j3) {
            return;
        }
        this.f3318b = j3;
        if (j3 <= 0) {
            b();
            return;
        }
        this.f3319c = true;
        a3.f fVar = this.d;
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.i3(fVar, 1000L);
    }

    public final void b() {
        this.f3319c = false;
        org.telegram.messenger.g0.r(this.d);
    }
}
