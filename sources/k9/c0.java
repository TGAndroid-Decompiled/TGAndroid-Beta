package k9;
public final class c0 extends f1 {
    public final String f10835a;
    public final String f10836b;
    public final String f10837c;

    public c0(String str, String str2, String str3) {
        this.f10835a = str;
        this.f10836b = str2;
        this.f10837c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f10835a.equals(c0Var.f10835a) && this.f10836b.equals(c0Var.f10836b) && this.f10837c.equals(c0Var.f10837c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10835a.hashCode() ^ 1000003) * 1000003) ^ this.f10836b.hashCode()) * 1000003) ^ this.f10837c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f10835a);
        sb.append(", libraryName=");
        sb.append(this.f10836b);
        sb.append(", buildId=");
        return android.support.v4.media.a.r(sb, this.f10837c, "}");
    }
}
