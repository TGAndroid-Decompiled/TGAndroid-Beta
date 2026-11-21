package da;
public final class g0 extends t1 {
    public final String f8056a;
    public final String f8057b;
    public final String f8058c;

    public g0(String str, String str2, String str3) {
        this.f8056a = str;
        this.f8057b = str2;
        this.f8058c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            g0 g0Var = (g0) ((t1) obj);
            if (this.f8056a.equals(g0Var.f8056a) && this.f8057b.equals(g0Var.f8057b) && this.f8058c.equals(g0Var.f8058c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8056a.hashCode() ^ 1000003) * 1000003) ^ this.f8057b.hashCode()) * 1000003) ^ this.f8058c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f8056a);
        sb2.append(", libraryName=");
        sb2.append(this.f8057b);
        sb2.append(", buildId=");
        return a8.p0.s(sb2, this.f8058c, "}");
    }
}
