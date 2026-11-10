package da;
public final class g0 extends t1 {
    public final String f8361a;
    public final String f8362b;
    public final String f8363c;

    public g0(String str, String str2, String str3) {
        this.f8361a = str;
        this.f8362b = str2;
        this.f8363c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            g0 g0Var = (g0) ((t1) obj);
            if (this.f8361a.equals(g0Var.f8361a) && this.f8362b.equals(g0Var.f8362b) && this.f8363c.equals(g0Var.f8363c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8361a.hashCode() ^ 1000003) * 1000003) ^ this.f8362b.hashCode()) * 1000003) ^ this.f8363c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f8361a);
        sb2.append(", libraryName=");
        sb2.append(this.f8362b);
        sb2.append(", buildId=");
        return a8.p0.s(sb2, this.f8363c, "}");
    }
}
