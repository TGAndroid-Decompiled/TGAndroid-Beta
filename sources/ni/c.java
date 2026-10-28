package ni;
public final class c {
    public final String f18871a;
    public final String f18872b;

    public c(String str, String str2) {
        this.f18871a = str;
        this.f18872b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f18871a.equals(cVar.f18871a) || !this.f18872b.equals(cVar.f18872b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18872b.hashCode() + (this.f18871a.hashCode() * 31);
    }
}
