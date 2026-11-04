package ca;
public final class g0 extends t1 {
    public final String f4384a;
    public final String f4385b;
    public final String f4386c;

    public g0(String str, String str2, String str3) {
        this.f4384a = str;
        this.f4385b = str2;
        this.f4386c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            g0 g0Var = (g0) ((t1) obj);
            if (this.f4384a.equals(g0Var.f4384a) && this.f4385b.equals(g0Var.f4385b) && this.f4386c.equals(g0Var.f4386c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f4384a.hashCode() ^ 1000003) * 1000003) ^ this.f4385b.hashCode()) * 1000003) ^ this.f4386c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f4384a);
        sb2.append(", libraryName=");
        sb2.append(this.f4385b);
        sb2.append(", buildId=");
        return a1.g.s(sb2, this.f4386c, "}");
    }
}
