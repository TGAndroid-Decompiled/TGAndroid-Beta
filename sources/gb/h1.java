package gb;
public final class h1 {
    public static final g1 Companion = new Object();
    public final long f13346a;
    public final long f13347b;
    public final long f13348c;

    public h1(int i7, long j3, long j10, long j11) {
        if (1 != (i7 & 1)) {
            oe.k.a(i7, 1, f1.f13335a.d());
            throw null;
        }
        this.f13346a = j3;
        this.f13347b = (i7 & 2) == 0 ? 1000 * j3 : j10;
        if ((i7 & 4) == 0) {
            this.f13348c = j3 / 1000;
        } else {
            this.f13348c = j11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h1) && this.f13346a == ((h1) obj).f13346a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f13346a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.f13346a + ')';
    }

    public h1(long j3) {
        this.f13346a = j3;
        long j10 = 1000;
        this.f13347b = j3 * j10;
        this.f13348c = j3 / j10;
    }
}
