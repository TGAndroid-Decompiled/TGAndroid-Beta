package cb;

import a8.p0;
public final class a {
    public final String f4862a;
    public final String f4863b;

    public a(String str, String str2) {
        this.f4862a = str;
        if (str2 != null) {
            this.f4863b = str2;
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
            if (this.f4862a.equals(aVar.f4862a) && this.f4863b.equals(aVar.f4863b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4862a.hashCode() ^ 1000003) * 1000003) ^ this.f4863b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f4862a);
        sb2.append(", version=");
        return p0.s(sb2, this.f4863b, "}");
    }
}
