package da;
public final class g0 extends t1 {
    public final String f7748a;
    public final String f7749b;
    public final String f7750c;

    public g0(String str, String str2, String str3) {
        this.f7748a = str;
        this.f7749b = str2;
        this.f7750c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            g0 g0Var = (g0) ((t1) obj);
            if (this.f7748a.equals(g0Var.f7748a) && this.f7749b.equals(g0Var.f7749b) && this.f7750c.equals(g0Var.f7750c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7748a.hashCode() ^ 1000003) * 1000003) ^ this.f7749b.hashCode()) * 1000003) ^ this.f7750c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f7748a);
        sb2.append(", libraryName=");
        sb2.append(this.f7749b);
        sb2.append(", buildId=");
        return a8.p0.s(sb2, this.f7750c, "}");
    }
}
