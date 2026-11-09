package da;
public final class g0 extends t1 {
    public final String f8356a;
    public final String f8357b;
    public final String f8358c;

    public g0(String str, String str2, String str3) {
        this.f8356a = str;
        this.f8357b = str2;
        this.f8358c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            g0 g0Var = (g0) ((t1) obj);
            if (this.f8356a.equals(g0Var.f8356a) && this.f8357b.equals(g0Var.f8357b) && this.f8358c.equals(g0Var.f8358c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8356a.hashCode() ^ 1000003) * 1000003) ^ this.f8357b.hashCode()) * 1000003) ^ this.f8358c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f8356a);
        sb2.append(", libraryName=");
        sb2.append(this.f8357b);
        sb2.append(", buildId=");
        return a8.p0.s(sb2, this.f8358c, "}");
    }
}
