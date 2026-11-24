package defpackage;
public final class x90 {
    public final String a;
    public final long b;
    public final long c;

    public x90(long j, String str, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x90) {
            x90 x90Var = (x90) obj;
            if (this.a.equals(x90Var.a) && this.b == x90Var.b && this.c == x90Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        return ls6.p(sb, this.c, "}");
    }
}
