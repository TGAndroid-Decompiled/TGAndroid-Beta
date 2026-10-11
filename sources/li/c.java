package li;
public final class c {
    public final String f15644a;
    public final String f15645b;

    public c(String str, String str2) {
        this.f15644a = str;
        this.f15645b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f15644a.equals(cVar.f15644a) || !this.f15645b.equals(cVar.f15645b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15645b.hashCode() + (this.f15644a.hashCode() * 31);
    }
}
