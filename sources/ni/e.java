package ni;
public final class e {
    public final String f20620a;
    public final String f20621b;

    public e(String str, String str2) {
        this.f20620a = str;
        this.f20621b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f20620a.equals(eVar.f20620a) || !this.f20621b.equals(eVar.f20621b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f20621b.hashCode() + (this.f20620a.hashCode() * 31);
    }
}
