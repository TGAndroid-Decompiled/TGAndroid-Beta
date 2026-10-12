package ki;
public final class c {
    public final String f14877a;
    public final String f14878b;

    public c(String str, String str2) {
        this.f14877a = str;
        this.f14878b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f14877a.equals(cVar.f14877a) || !this.f14878b.equals(cVar.f14878b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14878b.hashCode() + (this.f14877a.hashCode() * 31);
    }
}
