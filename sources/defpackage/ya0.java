package defpackage;
public final class ya0 {
    public final String a;
    public final String b;

    public ya0(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            gxc.d("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ya0) {
                ya0 ya0Var = (ya0) obj;
                if (this.a.equals(ya0Var.a) && this.b.equals(ya0Var.b)) {
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
        return b10.j(sb, this.b, "}");
    }
}
