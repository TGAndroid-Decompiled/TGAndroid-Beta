package gb;
public final class g1 {
    public static final f1 Companion = new Object();
    public final long f13346a;
    public final long f13347b;
    public final long f13348c;

    public g1(int i7, long j3, long j10, long j11) {
        if (1 != (i7 & 1)) {
            oe.k.a(i7, 1, e1.f13337a.d());
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
        if ((obj instanceof g1) && this.f13346a == ((g1) obj).f13346a) {
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

    public g1(long j3) {
        this.f13346a = j3;
        long j10 = 1000;
        this.f13347b = j3 * j10;
        this.f13348c = j3 / j10;
    }
}
