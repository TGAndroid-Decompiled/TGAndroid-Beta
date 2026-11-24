package defpackage;
public final class e90 extends rz2 {
    public final String a;
    public final String b;
    public final String c;

    public e90(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rz2) {
            e90 e90Var = (e90) ((rz2) obj);
            if (this.a.equals(e90Var.a) && this.b.equals(e90Var.b) && this.c.equals(e90Var.c)) {
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
        return b10.j(sb, this.c, "}");
    }
}
