package ni;
public final class e {
    public final String f20617a;
    public final String f20618b;

    public e(String str, String str2) {
        this.f20617a = str;
        this.f20618b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f20617a.equals(eVar.f20617a) || !this.f20618b.equals(eVar.f20618b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f20618b.hashCode() + (this.f20617a.hashCode() * 31);
    }
}
