package db;
public final class h1 {
    public static final g1 Companion = new Object();
    public final long f8669a;
    public final long f8670b;
    public final long f8671c;

    public h1(int i3, long j10, long j11, long j12) {
        if (1 != (i3 & 1)) {
            le.k.a(i3, 1, f1.f8657a.d());
            throw null;
        }
        this.f8669a = j10;
        this.f8670b = (i3 & 2) == 0 ? 1000 * j10 : j11;
        if ((i3 & 4) == 0) {
            this.f8671c = j10 / 1000;
        } else {
            this.f8671c = j12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h1) && this.f8669a == ((h1) obj).f8669a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f8669a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public final String toString() {
        return "Time(ms=" + this.f8669a + ')';
    }

    public h1(long j10) {
        this.f8669a = j10;
        long j11 = 1000;
        this.f8670b = j10 * j11;
        this.f8671c = j10 / j11;
    }
}
