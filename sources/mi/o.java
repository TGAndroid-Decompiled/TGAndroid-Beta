package mi;
public final class o {
    public final String f15875a;
    public final String f15876b;
    public final int f15877c;

    public o(String str, String str2) {
        this.f15875a = str;
        this.f15876b = str2;
        this.f15877c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f15875a.equals(oVar.f15875a) || !this.f15876b.equals(oVar.f15876b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15877c;
    }
}
