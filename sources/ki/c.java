package ki;
public final class c {
    public final String f14878a;
    public final String f14879b;

    public c(String str, String str2) {
        this.f14878a = str;
        this.f14879b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f14878a.equals(cVar.f14878a) || !this.f14879b.equals(cVar.f14879b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14879b.hashCode() + (this.f14878a.hashCode() * 31);
    }
}
