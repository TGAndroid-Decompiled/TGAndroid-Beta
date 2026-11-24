package defpackage;
public final class x90 extends d03 {
    public final String a;
    public final String b;
    public final long c;

    public x90(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d03) {
            x90 x90Var = (x90) ((d03) obj);
            if (this.a.equals(x90Var.a) && this.b.equals(x90Var.b) && this.c == x90Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return kt6.q(sb, this.c, "}");
    }
}
