package mi;
public final class c {
    public final String f16940a;
    public final String f16941b;

    public c(String str, String str2) {
        this.f16940a = str;
        this.f16941b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f16940a.equals(cVar.f16940a) || !this.f16941b.equals(cVar.f16941b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16941b.hashCode() + (this.f16940a.hashCode() * 31);
    }
}
