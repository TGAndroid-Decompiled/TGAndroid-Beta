package aa;
public final class d0 extends h1 {
    public final String f1059a;
    public final String f1060b;
    public final String f1061c;

    public d0(String str, String str2, String str3) {
        this.f1059a = str;
        this.f1060b = str2;
        this.f1061c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            d0 d0Var = (d0) ((h1) obj);
            if (this.f1059a.equals(d0Var.f1059a) && this.f1060b.equals(d0Var.f1060b) && this.f1061c.equals(d0Var.f1061c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1059a.hashCode() ^ 1000003) * 1000003) ^ this.f1060b.hashCode()) * 1000003) ^ this.f1061c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f1059a);
        sb2.append(", libraryName=");
        sb2.append(this.f1060b);
        sb2.append(", buildId=");
        return a1.g.s(sb2, this.f1061c, "}");
    }
}
