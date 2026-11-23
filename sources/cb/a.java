package cb;

import a8.p0;
public final class a {
    public final String f5140a;
    public final String f5141b;

    public a(String str, String str2) {
        this.f5140a = str;
        if (str2 != null) {
            this.f5141b = str2;
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
            if (this.f5140a.equals(aVar.f5140a) && this.f5141b.equals(aVar.f5141b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5140a.hashCode() ^ 1000003) * 1000003) ^ this.f5141b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f5140a);
        sb2.append(", version=");
        return p0.s(sb2, this.f5141b, "}");
    }
}
