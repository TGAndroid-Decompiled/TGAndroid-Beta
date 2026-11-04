package bb;

import a1.g;
public final class a {
    public final String f3205a;
    public final String f3206b;

    public a(String str, String str2) {
        this.f3205a = str;
        if (str2 != null) {
            this.f3206b = str2;
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
            if (this.f3205a.equals(aVar.f3205a) && this.f3206b.equals(aVar.f3206b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3205a.hashCode() ^ 1000003) * 1000003) ^ this.f3206b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f3205a);
        sb2.append(", version=");
        return g.s(sb2, this.f3206b, "}");
    }
}
