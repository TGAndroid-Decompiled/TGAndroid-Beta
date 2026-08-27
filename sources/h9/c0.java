package h9;

public final class c0 extends f1 {

    public final String f8651a;

    public final String f8652b;

    public final String f8653c;

    public c0(String str, String str2, String str3) {
        this.f8651a = str;
        this.f8652b = str2;
        this.f8653c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f8651a.equals(c0Var.f8651a) && this.f8652b.equals(c0Var.f8652b) && this.f8653c.equals(c0Var.f8653c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f8651a.hashCode() ^ 1000003) * 1000003) ^ this.f8652b.hashCode()) * 1000003) ^ this.f8653c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f8651a);
        sb2.append(", libraryName=");
        sb2.append(this.f8652b);
        sb2.append(", buildId=");
        return a9.p.p(sb2, this.f8653c, "}");
    }
}
