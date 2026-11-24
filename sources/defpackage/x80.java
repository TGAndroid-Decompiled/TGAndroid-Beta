package defpackage;
public final class x80 extends sy2 {
    public final String a;
    public final String b;
    public final long c;

    public x80(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sy2) {
            x80 x80Var = (x80) ((sy2) obj);
            if (this.a.equals(x80Var.a) && this.b.equals(x80Var.b) && this.c == x80Var.c) {
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
        return ls6.p(sb, this.c, "}");
    }
}
