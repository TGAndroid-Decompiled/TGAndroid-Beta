package c3;

import java.util.Set;
public final class b {
    public final long f2280a;
    public final long f2281b;
    public final Set f2282c;

    public b(long j10, long j11, Set set) {
        this.f2280a = j10;
        this.f2281b = j11;
        this.f2282c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f2280a == bVar.f2280a && this.f2281b == bVar.f2281b && this.f2282c.equals(bVar.f2282c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f2280a;
        long j11 = this.f2281b;
        return this.f2282c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f2280a + ", maxAllowedDelay=" + this.f2281b + ", flags=" + this.f2282c + "}";
    }
}
