package li;
public final class c {
    public final String f15608a;
    public final String f15609b;

    public c(String str, String str2) {
        this.f15608a = str;
        this.f15609b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f15608a.equals(cVar.f15608a) || !this.f15609b.equals(cVar.f15609b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15609b.hashCode() + (this.f15608a.hashCode() * 31);
    }
}
