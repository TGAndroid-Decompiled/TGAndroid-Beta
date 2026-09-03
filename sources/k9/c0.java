package k9;
public final class c0 extends f1 {
    public final String f10076a;
    public final String f10077b;
    public final String f10078c;

    public c0(String str, String str2, String str3) {
        this.f10076a = str;
        this.f10077b = str2;
        this.f10078c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f10076a.equals(c0Var.f10076a) && this.f10077b.equals(c0Var.f10077b) && this.f10078c.equals(c0Var.f10078c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10076a.hashCode() ^ 1000003) * 1000003) ^ this.f10077b.hashCode()) * 1000003) ^ this.f10078c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f10076a);
        sb.append(", libraryName=");
        sb.append(this.f10077b);
        sb.append(", buildId=");
        return android.support.v4.media.a.r(sb, this.f10078c, "}");
    }
}
