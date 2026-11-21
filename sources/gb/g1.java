package gb;
public final class g1 {
    public static final f1 Companion = new Object();
    public final long f13372a;
    public final long f13373b;
    public final long f13374c;

    public g1(int i7, long j3, long j10, long j11) {
        if (1 != (i7 & 1)) {
            oe.k.a(i7, 1, e1.f13363a.d());
            throw null;
        }
        this.f13372a = j3;
        this.f13373b = (i7 & 2) == 0 ? 1000 * j3 : j10;
        if ((i7 & 4) == 0) {
            this.f13374c = j3 / 1000;
        } else {
            this.f13374c = j11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g1) && this.f13372a == ((g1) obj).f13372a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f13372a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.f13372a + ')';
    }

    public g1(long j3) {
        this.f13372a = j3;
        long j10 = 1000;
        this.f13373b = j3 * j10;
        this.f13374c = j3 / j10;
    }
}
