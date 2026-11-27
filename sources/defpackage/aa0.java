package defpackage;
public final class aa0 {
    public final String a;
    public final String b;

    public aa0(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            p3d.h("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof aa0) {
                aa0 aa0Var = (aa0) obj;
                if (this.a.equals(aa0Var.a) && this.b.equals(aa0Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return c00.k(sb, this.b, "}");
    }
}
