package da;
public final class g0 extends t1 {
    public final String f8030a;
    public final String f8031b;
    public final String f8032c;

    public g0(String str, String str2, String str3) {
        this.f8030a = str;
        this.f8031b = str2;
        this.f8032c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            g0 g0Var = (g0) ((t1) obj);
            if (this.f8030a.equals(g0Var.f8030a) && this.f8031b.equals(g0Var.f8031b) && this.f8032c.equals(g0Var.f8032c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8030a.hashCode() ^ 1000003) * 1000003) ^ this.f8031b.hashCode()) * 1000003) ^ this.f8032c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f8030a);
        sb2.append(", libraryName=");
        sb2.append(this.f8031b);
        sb2.append(", buildId=");
        return a8.p0.s(sb2, this.f8032c, "}");
    }
}
