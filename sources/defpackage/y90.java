package defpackage;
public final class y90 {
    public final String a;
    public final String b;

    public y90(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            fvc.f("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof y90) {
                y90 y90Var = (y90) obj;
                if (this.a.equals(y90Var.a) && this.b.equals(y90Var.b)) {
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
        return b00.j(sb, this.b, "}");
    }
}
