package k9;
public final class c0 extends f1 {
    public final String f10096a;
    public final String f10097b;
    public final String f10098c;

    public c0(String str, String str2, String str3) {
        this.f10096a = str;
        this.f10097b = str2;
        this.f10098c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            c0 c0Var = (c0) ((f1) obj);
            if (this.f10096a.equals(c0Var.f10096a) && this.f10097b.equals(c0Var.f10097b) && this.f10098c.equals(c0Var.f10098c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f10096a.hashCode() ^ 1000003) * 1000003) ^ this.f10097b.hashCode()) * 1000003) ^ this.f10098c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f10096a);
        sb.append(", libraryName=");
        sb.append(this.f10097b);
        sb.append(", buildId=");
        return android.support.v4.media.a.r(sb, this.f10098c, "}");
    }
}
