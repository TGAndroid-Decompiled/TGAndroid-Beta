package li;
public final class c {
    public final String f14746a;
    public final String f14747b;

    public c(String str, String str2) {
        this.f14746a = str;
        this.f14747b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f14746a.equals(cVar.f14746a) || !this.f14747b.equals(cVar.f14747b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14747b.hashCode() + (this.f14746a.hashCode() * 31);
    }
}
