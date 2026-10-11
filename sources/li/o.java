package li;
public final class o {
    public final String f15631a;
    public final String f15632b;
    public final int f15633c;

    public o(String str, String str2) {
        this.f15631a = str;
        this.f15632b = str2;
        this.f15633c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f15631a.equals(oVar.f15631a) || !this.f15632b.equals(oVar.f15632b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15633c;
    }
}
