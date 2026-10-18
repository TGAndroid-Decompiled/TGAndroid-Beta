package mi;
public final class c {
    public final String f16947a;
    public final String f16948b;

    public c(String str, String str2) {
        this.f16947a = str;
        this.f16948b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f16947a.equals(cVar.f16947a) || !this.f16948b.equals(cVar.f16948b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16948b.hashCode() + (this.f16947a.hashCode() * 31);
    }
}
