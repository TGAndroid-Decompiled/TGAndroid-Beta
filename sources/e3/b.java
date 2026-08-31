package e3;

import java.util.Set;
public final class b {
    public final long f4916a;
    public final long f4917b;
    public final Set f4918c;

    public b(long j10, long j11, Set set) {
        this.f4916a = j10;
        this.f4917b = j11;
        this.f4918c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f4916a == bVar.f4916a && this.f4917b == bVar.f4917b && this.f4918c.equals(bVar.f4918c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f4916a;
        long j11 = this.f4917b;
        return this.f4918c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f4916a + ", maxAllowedDelay=" + this.f4917b + ", flags=" + this.f4918c + "}";
    }
}
