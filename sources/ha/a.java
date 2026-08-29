package ha;

import a4.w;
public final class a {
    public final String f7975a;
    public final String f7976b;

    public a(String str, String str2) {
        this.f7975a = str;
        if (str2 != null) {
            this.f7976b = str2;
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
            if (this.f7975a.equals(aVar.f7975a) && this.f7976b.equals(aVar.f7976b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7975a.hashCode() ^ 1000003) * 1000003) ^ this.f7976b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f7975a);
        sb2.append(", version=");
        return w.q(sb2, this.f7976b, "}");
    }
}
