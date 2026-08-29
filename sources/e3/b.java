package e3;

import java.util.Set;
public final class b {
    public final long f5800a;
    public final long f5801b;
    public final Set f5802c;

    public b(long j10, long j11, Set set) {
        this.f5800a = j10;
        this.f5801b = j11;
        this.f5802c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f5800a == bVar.f5800a && this.f5801b == bVar.f5801b && this.f5802c.equals(bVar.f5802c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f5800a;
        long j11 = this.f5801b;
        return this.f5802c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f5800a + ", maxAllowedDelay=" + this.f5801b + ", flags=" + this.f5802c + "}";
    }
}
