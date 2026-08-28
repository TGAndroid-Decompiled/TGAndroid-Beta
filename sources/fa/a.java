package fa;

import aa.d;
public final class a {
    public final String f6028a;
    public final String f6029b;

    public a(String str, String str2) {
        this.f6028a = str;
        if (str2 != null) {
            this.f6029b = str2;
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
            if (this.f6028a.equals(aVar.f6028a) && this.f6029b.equals(aVar.f6029b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6028a.hashCode() ^ 1000003) * 1000003) ^ this.f6029b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f6028a);
        sb2.append(", version=");
        return d.r(sb2, this.f6029b, "}");
    }
}
