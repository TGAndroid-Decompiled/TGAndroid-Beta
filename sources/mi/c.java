package mi;
public final class c {
    public final String f16948a;
    public final String f16949b;

    public c(String str, String str2) {
        this.f16948a = str;
        this.f16949b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f16948a.equals(cVar.f16948a) || !this.f16949b.equals(cVar.f16949b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16949b.hashCode() + (this.f16948a.hashCode() * 31);
    }
}
