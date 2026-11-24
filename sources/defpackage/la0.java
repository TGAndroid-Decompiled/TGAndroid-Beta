package defpackage;
public final class la0 {
    public final long a;
    public final long b;
    public final long c;

    public la0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof la0) {
            la0 la0Var = (la0) obj;
            if (this.a == la0Var.a && this.b == la0Var.b && this.c == la0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        return ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.a);
        sb.append(", elapsedRealtime=");
        sb.append(this.b);
        sb.append(", uptimeMillis=");
        return ls6.p(sb, this.c, "}");
    }
}
