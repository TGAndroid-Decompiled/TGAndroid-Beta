package defpackage;
public final class e80 extends gy2 {
    public final String a;
    public final String b;
    public final String c;

    public e80(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gy2) {
            e80 e80Var = (e80) ((gy2) obj);
            if (this.a.equals(e80Var.a) && this.b.equals(e80Var.b) && this.c.equals(e80Var.c)) {
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
        return b00.j(sb, this.c, "}");
    }
}
