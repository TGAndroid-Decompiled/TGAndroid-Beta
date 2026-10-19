package mi;
public final class c {
    public final String f16946a;
    public final String f16947b;

    public c(String str, String str2) {
        this.f16946a = str;
        this.f16947b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f16946a.equals(cVar.f16946a) || !this.f16947b.equals(cVar.f16947b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16947b.hashCode() + (this.f16946a.hashCode() * 31);
    }
}
