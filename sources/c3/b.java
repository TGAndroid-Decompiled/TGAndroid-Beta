package c3;

import java.util.Set;

public final class b {

    public final long f2418a;

    public final long f2419b;

    public final Set f2420c;

    public b(long j10, long j11, Set set) {
        this.f2418a = j10;
        this.f2419b = j11;
        this.f2420c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f2418a == bVar.f2418a && this.f2419b == bVar.f2419b && this.f2420c.equals(bVar.f2420c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f2418a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f2419b;
        return this.f2420c.hashCode() ^ ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f2418a + ", maxAllowedDelay=" + this.f2419b + ", flags=" + this.f2420c + "}";
    }
}
