package ja;
public final class a {
    public final String f9983a;
    public final String f9984b;

    public a(String str, String str2) {
        this.f9983a = str;
        if (str2 != null) {
            this.f9984b = str2;
            return;
        }
        throw new NullPointerException("Null version");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f9983a.equals(aVar.f9983a) && this.f9984b.equals(aVar.f9984b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9983a.hashCode() ^ 1000003) * 1000003) ^ this.f9984b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f9983a);
        sb.append(", version=");
        return android.support.v4.media.a.r(sb, this.f9984b, "}");
    }
}
