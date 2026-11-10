package cb;

import a8.p0;
public final class a {
    public final String f6037a;
    public final String f6038b;

    public a(String str, String str2) {
        this.f6037a = str;
        if (str2 != null) {
            this.f6038b = str2;
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
            if (this.f6037a.equals(aVar.f6037a) && this.f6038b.equals(aVar.f6038b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6037a.hashCode() ^ 1000003) * 1000003) ^ this.f6038b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f6037a);
        sb2.append(", version=");
        return p0.s(sb2, this.f6038b, "}");
    }
}
