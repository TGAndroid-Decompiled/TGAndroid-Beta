package ni;
public final class e {
    public final String f20625a;
    public final String f20626b;

    public e(String str, String str2) {
        this.f20625a = str;
        this.f20626b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f20625a.equals(eVar.f20625a) || !this.f20626b.equals(eVar.f20626b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f20626b.hashCode() + (this.f20625a.hashCode() * 31);
    }
}
