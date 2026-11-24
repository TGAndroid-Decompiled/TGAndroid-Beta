package defpackage;

import java.util.Set;
public final class ka0 {
    public final long a;
    public final long b;
    public final Set c;

    public ka0(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ka0) {
            ka0 ka0Var = (ka0) obj;
            if (this.a == ka0Var.a && this.b == ka0Var.b && this.c.equals(ka0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
