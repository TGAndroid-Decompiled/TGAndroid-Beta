package e3;

import java.util.Set;
public final class b {
    public final long f5080a;
    public final long f5081b;
    public final Set f5082c;

    public b(long j10, long j11, Set set) {
        this.f5080a = j10;
        this.f5081b = j11;
        this.f5082c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f5080a == bVar.f5080a && this.f5081b == bVar.f5081b && this.f5082c.equals(bVar.f5082c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f5080a;
        long j11 = this.f5081b;
        return this.f5082c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f5080a + ", maxAllowedDelay=" + this.f5081b + ", flags=" + this.f5082c + "}";
    }
}
