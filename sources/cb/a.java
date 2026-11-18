package cb;

import a8.p0;
public final class a {
    public final String f5145a;
    public final String f5146b;

    public a(String str, String str2) {
        this.f5145a = str;
        if (str2 != null) {
            this.f5146b = str2;
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
            if (this.f5145a.equals(aVar.f5145a) && this.f5146b.equals(aVar.f5146b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5145a.hashCode() ^ 1000003) * 1000003) ^ this.f5146b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f5145a);
        sb2.append(", version=");
        return p0.s(sb2, this.f5146b, "}");
    }
}
