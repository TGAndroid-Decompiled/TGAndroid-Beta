package defpackage;
public final class g80 extends bz2 {
    public final String a;
    public final String b;
    public final String c;

    public g80(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bz2) {
            g80 g80Var = (g80) ((bz2) obj);
            if (this.a.equals(g80Var.a) && this.b.equals(g80Var.b) && this.c.equals(g80Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.a);
        sb.append(", libraryName=");
        sb.append(this.b);
        sb.append(", buildId=");
        return c00.k(sb, this.c, "}");
    }
}
