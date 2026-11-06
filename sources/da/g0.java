package da;
public final class g0 extends t1 {
    public final String f8358a;
    public final String f8359b;
    public final String f8360c;

    public g0(String str, String str2, String str3) {
        this.f8358a = str;
        this.f8359b = str2;
        this.f8360c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            g0 g0Var = (g0) ((t1) obj);
            if (this.f8358a.equals(g0Var.f8358a) && this.f8359b.equals(g0Var.f8359b) && this.f8360c.equals(g0Var.f8360c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8358a.hashCode() ^ 1000003) * 1000003) ^ this.f8359b.hashCode()) * 1000003) ^ this.f8360c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f8358a);
        sb2.append(", libraryName=");
        sb2.append(this.f8359b);
        sb2.append(", buildId=");
        return a8.p0.s(sb2, this.f8360c, "}");
    }
}
