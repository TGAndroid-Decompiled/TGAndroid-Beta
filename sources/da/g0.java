package da;
public final class g0 extends t1 {
    public final String f8022a;
    public final String f8023b;
    public final String f8024c;

    public g0(String str, String str2, String str3) {
        this.f8022a = str;
        this.f8023b = str2;
        this.f8024c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            g0 g0Var = (g0) ((t1) obj);
            if (this.f8022a.equals(g0Var.f8022a) && this.f8023b.equals(g0Var.f8023b) && this.f8024c.equals(g0Var.f8024c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8022a.hashCode() ^ 1000003) * 1000003) ^ this.f8023b.hashCode()) * 1000003) ^ this.f8024c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f8022a);
        sb2.append(", libraryName=");
        sb2.append(this.f8023b);
        sb2.append(", buildId=");
        return a8.p0.s(sb2, this.f8024c, "}");
    }
}
