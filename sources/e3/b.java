package e3;

import java.util.Set;
public final class b {
    public final long f5086a;
    public final long f5087b;
    public final Set f5088c;

    public b(long j10, long j11, Set set) {
        this.f5086a = j10;
        this.f5087b = j11;
        this.f5088c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f5086a == bVar.f5086a && this.f5087b == bVar.f5087b && this.f5088c.equals(bVar.f5088c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f5086a;
        long j11 = this.f5087b;
        return this.f5088c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f5086a + ", maxAllowedDelay=" + this.f5087b + ", flags=" + this.f5088c + "}";
    }
}
