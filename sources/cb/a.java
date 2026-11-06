package cb;

import a8.p0;
public final class a {
    public final String f6034a;
    public final String f6035b;

    public a(String str, String str2) {
        this.f6034a = str;
        if (str2 != null) {
            this.f6035b = str2;
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
            if (this.f6034a.equals(aVar.f6034a) && this.f6035b.equals(aVar.f6035b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6034a.hashCode() ^ 1000003) * 1000003) ^ this.f6035b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f6034a);
        sb2.append(", version=");
        return p0.s(sb2, this.f6035b, "}");
    }
}
