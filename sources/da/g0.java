package da;
public final class g0 extends t1 {
    public final String f8021a;
    public final String f8022b;
    public final String f8023c;

    public g0(String str, String str2, String str3) {
        this.f8021a = str;
        this.f8022b = str2;
        this.f8023c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            g0 g0Var = (g0) ((t1) obj);
            if (this.f8021a.equals(g0Var.f8021a) && this.f8022b.equals(g0Var.f8022b) && this.f8023c.equals(g0Var.f8023c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8021a.hashCode() ^ 1000003) * 1000003) ^ this.f8022b.hashCode()) * 1000003) ^ this.f8023c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f8021a);
        sb2.append(", libraryName=");
        sb2.append(this.f8022b);
        sb2.append(", buildId=");
        return a8.p0.s(sb2, this.f8023c, "}");
    }
}
