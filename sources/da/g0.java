package da;
public final class g0 extends t1 {
    public final String f7745a;
    public final String f7746b;
    public final String f7747c;

    public g0(String str, String str2, String str3) {
        this.f7745a = str;
        this.f7746b = str2;
        this.f7747c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            g0 g0Var = (g0) ((t1) obj);
            if (this.f7745a.equals(g0Var.f7745a) && this.f7746b.equals(g0Var.f7746b) && this.f7747c.equals(g0Var.f7747c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7745a.hashCode() ^ 1000003) * 1000003) ^ this.f7746b.hashCode()) * 1000003) ^ this.f7747c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f7745a);
        sb2.append(", libraryName=");
        sb2.append(this.f7746b);
        sb2.append(", buildId=");
        return a8.p0.s(sb2, this.f7747c, "}");
    }
}
