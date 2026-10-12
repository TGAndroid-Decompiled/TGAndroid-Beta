package mi;
public final class c {
    public final String f15853a;
    public final String f15854b;

    public c(String str, String str2) {
        this.f15853a = str;
        this.f15854b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f15853a.equals(cVar.f15853a) || !this.f15854b.equals(cVar.f15854b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15854b.hashCode() + (this.f15853a.hashCode() * 31);
    }
}
