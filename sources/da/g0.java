package da;
public final class g0 extends t1 {
    public final String f8027a;
    public final String f8028b;
    public final String f8029c;

    public g0(String str, String str2, String str3) {
        this.f8027a = str;
        this.f8028b = str2;
        this.f8029c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            g0 g0Var = (g0) ((t1) obj);
            if (this.f8027a.equals(g0Var.f8027a) && this.f8028b.equals(g0Var.f8028b) && this.f8029c.equals(g0Var.f8029c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8027a.hashCode() ^ 1000003) * 1000003) ^ this.f8028b.hashCode()) * 1000003) ^ this.f8029c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f8027a);
        sb2.append(", libraryName=");
        sb2.append(this.f8028b);
        sb2.append(", buildId=");
        return a8.p0.s(sb2, this.f8029c, "}");
    }
}
