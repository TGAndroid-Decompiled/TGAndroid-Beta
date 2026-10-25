package ni;
public final class c {
    public final String f18872a;
    public final String f18873b;

    public c(String str, String str2) {
        this.f18872a = str;
        this.f18873b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f18872a.equals(cVar.f18872a) || !this.f18873b.equals(cVar.f18873b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18873b.hashCode() + (this.f18872a.hashCode() * 31);
    }
}
