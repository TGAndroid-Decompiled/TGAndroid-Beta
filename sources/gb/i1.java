package gb;
public final class i1 {
    public static final h1 Companion = new Object();
    public final long f13713a;
    public final long f13714b;
    public final long f13715c;

    public i1(int i7, long j3, long j10, long j11) {
        if (1 != (i7 & 1)) {
            oe.k.a(i7, 1, g1.f13690a.d());
            throw null;
        }
        this.f13713a = j3;
        this.f13714b = (i7 & 2) == 0 ? 1000 * j3 : j10;
        if ((i7 & 4) == 0) {
            this.f13715c = j3 / 1000;
        } else {
            this.f13715c = j11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i1) && this.f13713a == ((i1) obj).f13713a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f13713a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.f13713a + ')';
    }

    public i1(long j3) {
        this.f13713a = j3;
        long j10 = 1000;
        this.f13714b = j3 * j10;
        this.f13715c = j3 / j10;
    }
}
