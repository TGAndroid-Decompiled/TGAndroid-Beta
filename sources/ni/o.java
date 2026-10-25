package ni;
public final class o {
    public final String f18894a;
    public final String f18895b;
    public final int f18896c;

    public o(String str, String str2) {
        this.f18894a = str;
        this.f18895b = str2;
        this.f18896c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f18894a.equals(oVar.f18894a) || !this.f18895b.equals(oVar.f18895b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18896c;
    }
}
