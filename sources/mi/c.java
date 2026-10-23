package mi;
public final class c {
    public final String f17009a;
    public final String f17010b;

    public c(String str, String str2) {
        this.f17009a = str;
        this.f17010b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f17009a.equals(cVar.f17009a) || !this.f17010b.equals(cVar.f17010b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f17010b.hashCode() + (this.f17009a.hashCode() * 31);
    }
}
