package di;
public final class d {
    public final String f5958a;
    public final String f5959b;

    public d(String str, String str2) {
        this.f5958a = str;
        this.f5959b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f5958a.equals(dVar.f5958a) || !this.f5959b.equals(dVar.f5959b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5959b.hashCode() + (this.f5958a.hashCode() * 31);
    }
}
