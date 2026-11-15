package cb;

import a8.p0;
public final class a {
    public final String f4859a;
    public final String f4860b;

    public a(String str, String str2) {
        this.f4859a = str;
        if (str2 != null) {
            this.f4860b = str2;
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
            if (this.f4859a.equals(aVar.f4859a) && this.f4860b.equals(aVar.f4860b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4859a.hashCode() ^ 1000003) * 1000003) ^ this.f4860b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f4859a);
        sb2.append(", version=");
        return p0.s(sb2, this.f4860b, "}");
    }
}
