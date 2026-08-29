package i9;
public final class c0 extends f1 {
    public final String f8615a;
    public final String f8616b;
    public final String f8617c;

    public c0(String str, String str2, String str3) {
        this.f8615a = str;
        this.f8616b = str2;
        this.f8617c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f8615a.equals(c0Var.f8615a) && this.f8616b.equals(c0Var.f8616b) && this.f8617c.equals(c0Var.f8617c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8615a.hashCode() ^ 1000003) * 1000003) ^ this.f8616b.hashCode()) * 1000003) ^ this.f8617c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f8615a);
        sb2.append(", libraryName=");
        sb2.append(this.f8616b);
        sb2.append(", buildId=");
        return a4.w.q(sb2, this.f8617c, "}");
    }
}
