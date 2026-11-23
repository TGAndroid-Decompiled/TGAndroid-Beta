package da;
public final class g0 extends t1 {
    public final String f8059a;
    public final String f8060b;
    public final String f8061c;

    public g0(String str, String str2, String str3) {
        this.f8059a = str;
        this.f8060b = str2;
        this.f8061c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            g0 g0Var = (g0) ((t1) obj);
            if (this.f8059a.equals(g0Var.f8059a) && this.f8060b.equals(g0Var.f8060b) && this.f8061c.equals(g0Var.f8061c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8059a.hashCode() ^ 1000003) * 1000003) ^ this.f8060b.hashCode()) * 1000003) ^ this.f8061c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f8059a);
        sb2.append(", libraryName=");
        sb2.append(this.f8060b);
        sb2.append(", buildId=");
        return a8.p0.s(sb2, this.f8061c, "}");
    }
}
