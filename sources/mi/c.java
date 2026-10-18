package mi;
public final class c {
    public final String f16945a;
    public final String f16946b;

    public c(String str, String str2) {
        this.f16945a = str;
        this.f16946b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f16945a.equals(cVar.f16945a) || !this.f16946b.equals(cVar.f16946b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16946b.hashCode() + (this.f16945a.hashCode() * 31);
    }
}
