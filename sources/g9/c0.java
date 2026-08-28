package g9;
public final class c0 extends f1 {
    public final String f7480a;
    public final String f7481b;
    public final String f7482c;

    public c0(String str, String str2, String str3) {
        this.f7480a = str;
        this.f7481b = str2;
        this.f7482c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f7480a.equals(c0Var.f7480a) && this.f7481b.equals(c0Var.f7481b) && this.f7482c.equals(c0Var.f7482c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7480a.hashCode() ^ 1000003) * 1000003) ^ this.f7481b.hashCode()) * 1000003) ^ this.f7482c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f7480a);
        sb2.append(", libraryName=");
        sb2.append(this.f7481b);
        sb2.append(", buildId=");
        return aa.d.r(sb2, this.f7482c, "}");
    }
}
