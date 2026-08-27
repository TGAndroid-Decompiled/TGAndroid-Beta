package ga;

import a9.p;

public final class a {

    public final String f6828a;

    public final String f6829b;

    public a(String str, String str2) {
        this.f6828a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f6829b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f6828a.equals(aVar.f6828a) && this.f6829b.equals(aVar.f6829b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6828a.hashCode() ^ 1000003) * 1000003) ^ this.f6829b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f6828a);
        sb2.append(", version=");
        return p.p(sb2, this.f6829b, "}");
    }
}
