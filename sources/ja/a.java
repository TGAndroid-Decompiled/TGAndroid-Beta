package ja;
public final class a {
    public final String f9330a;
    public final String f9331b;

    public a(String str, String str2) {
        this.f9330a = str;
        if (str2 != null) {
            this.f9331b = str2;
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
            if (this.f9330a.equals(aVar.f9330a) && this.f9331b.equals(aVar.f9331b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9330a.hashCode() ^ 1000003) * 1000003) ^ this.f9331b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f9330a);
        sb.append(", version=");
        return android.support.v4.media.a.r(sb, this.f9331b, "}");
    }
}
