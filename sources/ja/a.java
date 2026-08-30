package ja;
public final class a {
    public final String f9348a;
    public final String f9349b;

    public a(String str, String str2) {
        this.f9348a = str;
        if (str2 != null) {
            this.f9349b = str2;
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
            if (this.f9348a.equals(aVar.f9348a) && this.f9349b.equals(aVar.f9349b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9348a.hashCode() ^ 1000003) * 1000003) ^ this.f9349b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f9348a);
        sb.append(", version=");
        return android.support.v4.media.a.r(sb, this.f9349b, "}");
    }
}
