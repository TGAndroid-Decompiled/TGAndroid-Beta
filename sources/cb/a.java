package cb;

import a8.p0;
public final class a {
    public final String f6032a;
    public final String f6033b;

    public a(String str, String str2) {
        this.f6032a = str;
        if (str2 != null) {
            this.f6033b = str2;
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
            if (this.f6032a.equals(aVar.f6032a) && this.f6033b.equals(aVar.f6033b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f6032a.hashCode() ^ 1000003) * 1000003) ^ this.f6033b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f6032a);
        sb2.append(", version=");
        return p0.s(sb2, this.f6033b, "}");
    }
}
